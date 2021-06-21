package com.example.anthony.chap7_opendata.controller;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.anthony.chap7_opendata.R;
import com.example.anthony.chap7_opendata.model.beans.Fields;
import com.example.anthony.chap7_opendata.model.webservice.OpenDataWS;
import com.example.anthony.chap7_opendata.view.FieldAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, FieldAdapter.OnFieldsListener {

    //Composants graphiques
    private TextView tv_info;
    private RecyclerView rv;
    private Button bt_charger;

    //Données
    private ArrayList<Fields> fields;

    //Outil
    private FieldAdapter fieldAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.rv);
        tv_info = (TextView) findViewById(R.id.tv_info);
        bt_charger = (Button) findViewById(R.id.bt_charger);

        bt_charger.setOnClickListener(this);

        fields = new ArrayList<>();

        fieldAdapter = new FieldAdapter(fields, this);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(fieldAdapter);


    }

    @Override
    public void onClick(View v) {

        try {
            MonAT monAt = new MonAT();
            monAt.execute();
        } catch (Exception e) {
            e.printStackTrace();
            tv_info.setText(e.getMessage());
        }

    }

    /**
     * Méthode appelée lors d'un clic sur une ligne et en paramètre le fields en question
     */
    @Override
    public void onClick(Fields fields) {

        //Je lance un nouvel écran et je lui transmets l'évènement à afficher
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.FIELDS_KEY, fields);

        startActivity(intent);


    }

    public class MonAT extends AsyncTask {

        private ArrayList<Fields> resultat = null;
        private Exception exception = null;

        /**
         * Appel asynchrone : exécuté sur un thread à part
         * On ne peut pas toucher aux éléments graphiques mais on peut y faire des traitements longs
         */
        @Override
        protected Object doInBackground(Object[] params) {

            try {
                resultat = OpenDataWS.getFieldsDuServeur();
            } catch (Exception e) {
                exception = e;
            }

            return null;
        }

        /**
         * Appelée sur le thread principal, on peut toucher aux éléments graphiques
         * mais on ne peut pas y faire de traitements longs
         */
        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);

            if (exception != null) {
                //Échec
                exception.printStackTrace();
                tv_info.setText("Une erreur s'est produite : " + exception.getMessage());
                tv_info.setTextColor(Color.RED);
            } else {
                //Réussi
                fields.clear();
                fields.addAll(resultat);
                fieldAdapter.notifyDataSetChanged();
                tv_info.setText("Chargement réussi");
                tv_info.setTextColor(Color.GREEN);
            }
        }
    }
}
