package com.example.anthony.chap5_heritage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anthony.chap5_heritage.beans.EleveBean;
import com.example.anthony.chap5_heritage.beans.EnseignantBean;
import com.example.anthony.chap5_heritage.beans.PersonneBean;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Composants graphiques
    TextView tv_console;
    Button bt_ajouter, bt_supp_dernier;
    Button bt_ajouter_plusieurs;
    EditText et_nom, et_prenom;
    SeekBar sb;
    RadioButton rb_eleve, rb_enseignant;

    //Données
    ArrayList<PersonneBean> personnes;

    @Override
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
        rb_eleve = (RadioButton) findViewById(R.id.rb_eleve);
        rb_enseignant = (RadioButton) findViewById(R.id.rb_enseignant);

        //Redirige le clic sur le bouton sur la méthode OnClick
        bt_ajouter.setOnClickListener(this);
        bt_supp_dernier.setOnClickListener(this);
        bt_ajouter_plusieurs.setOnClickListener(this);

        //Création d'une collection d'élèves
        personnes = new ArrayList<>();

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
            rafraichirEcran();


        } else if (v == bt_supp_dernier) {
            supprimerDernier();
            rafraichirEcran();


        } else if (v == bt_ajouter_plusieurs) {
            int nb = sb.getProgress();
            String nom = et_nom.getText().toString();
            String prenom = et_prenom.getText().toString();

            ajouter(nom, prenom, nb);
            rafraichirEcran();

        }

    }

    /**
     * Ajoute un ensemble d'élèves ou d'enseignant
     */
    public void ajouter(String nom, String prenom, int nb) {

        if (nom.length() == 0) {
            Toast.makeText(this, "Le nom est vide", Toast.LENGTH_SHORT).show();
            return;
        }
        if (prenom.length() == 0) {
            Toast.makeText(this, "Le prénom est vide", Toast.LENGTH_SHORT).show();
            return;
        }


        for (int i = 0; i < nb; i++) {
            if (rb_eleve.isChecked()) {
                //Création d'un élève
                //Je lui donne un nom et un prénom
                EleveBean eleve = new EleveBean(nom, prenom, "6ème");
                //Je l'ajoute à la liste
                personnes.add(eleve);
            } else {
                EnseignantBean enseignantBean = new EnseignantBean(nom, prenom, "Français");
                personnes.add(enseignantBean);
            }
        }

    }


    /**
     * Met à jour l'écran à partir des données
     */
    public void rafraichirEcran() {
        String resultat = "Élèves : \n";

        for (PersonneBean personneBean : personnes) {
            if (personneBean instanceof EleveBean) {
                resultat += personneBean.afficher() + "\n";
            }
        }

        resultat += "\nEnseignants : \n";

        for (PersonneBean personneBean : personnes) {
            if (personneBean instanceof EnseignantBean) {
                resultat += personneBean.afficher() + "\n";
            }
        }

        tv_console.setText(resultat);
    }

    public void rafraichirEcranUneListe() {
        String resultat = "";
        for (PersonneBean personneBean : personnes) {
            resultat += personneBean.afficher() + "\n";
        }

        tv_console.setText(resultat);
    }

    public void supprimerDernier() {

        PersonneBean dernier = null;

        for (PersonneBean personneBean : personnes) {
            if (rb_eleve.isChecked() && personneBean instanceof EleveBean) {
                dernier = personneBean;
            } else if (rb_enseignant.isChecked() && personneBean instanceof EnseignantBean) {
                dernier = personneBean;
            }
        }

        if (dernier != null) {
            personnes.remove(dernier);
        } else if (rb_eleve.isChecked()) {
            Toast.makeText(this, "Il n'y a plus d'élève dans la liste", Toast.LENGTH_SHORT).show();
        } else if (rb_enseignant.isChecked()) {
            Toast.makeText(this, "Il n'y a plus d'enseignant dans la liste", Toast.LENGTH_SHORT).show();
        }
    }
}
