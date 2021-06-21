package com.example.anthony.chap2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Déclaration des attributs
    TextView tv_console;
    Button bt_ajouter, bt_supp_dernier;
    Button bt_ajouter_plusieurs;
    EditText et_nom, et_prenom;
    SeekBar sb;


    @Override
    /**
     * void : Méthode qui ne retourne pas de valeur
     * onCreate : Nom de la méthode
     * Bundle : Typage
     * savedInstanceState : Nom de la variable en paramètre
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Indique le fichier XML à charger
        setContentView(R.layout.activity_main);

        //Récupère les éléments définis dant le fichier XML transmis à setContentView
        tv_console = (TextView) findViewById(R.id.tv_console);
        bt_ajouter = (Button) findViewById(R.id.bt_ajouter);
        bt_supp_dernier = (Button) findViewById(R.id.bt_supp_dernier);
        bt_ajouter_plusieurs = (Button) findViewById(R.id.bt_ajouter_plusieurs);
        et_nom = (EditText) findViewById(R.id.et_nom);
        et_prenom = (EditText) findViewById(R.id.et_prenom);
        sb = (SeekBar) findViewById(R.id.sb);

        //Redirige le clic sur le bouton sur la méthode OnClick
        bt_ajouter.setOnClickListener(this);
        bt_supp_dernier.setOnClickListener(this);
        bt_ajouter_plusieurs.setOnClickListener(this);

        tv_console.setText("");

    }


    @Override
    /**
     * Méthode qui sera appelée lors d'un clic sur le bouton
     */
    public void onClick(View v) {

        if (v == bt_ajouter) {
            String nom = et_nom.getText().toString();
            String prenom = et_prenom.getText().toString();

            ajouter(nom, prenom, 1);


        } else if (v == bt_supp_dernier) {
            //TODO
        } else if (v == bt_ajouter_plusieurs) {
            //TODO
            int nb = sb.getProgress();
            String nom = et_nom.getText().toString();
            String prenom = et_prenom.getText().toString();

            ajouter(nom, prenom, nb);

        }

    }

    public void ajouter(String nom, String prenom, int nb) {

        if (nom.length() == 0) {
            Toast.makeText(this, "Le nom est vide", Toast.LENGTH_SHORT).show();
            return;
        }
        if (prenom.length() == 0) {
            Toast.makeText(this, "Le prénom est vide", Toast.LENGTH_SHORT).show();
            return;
        }


        //VERSION WHILE
//        int i = 0;
//        while(i< nb) {
//            tv_console.append(nom + " " + prenom + i +  "\n");
//            i++;
//        }

        //VERSION FOR
        for (int i = 0; i < nb; i++) {
            tv_console.append(nom + " " + prenom + i + "\n");
        }


    }
}
