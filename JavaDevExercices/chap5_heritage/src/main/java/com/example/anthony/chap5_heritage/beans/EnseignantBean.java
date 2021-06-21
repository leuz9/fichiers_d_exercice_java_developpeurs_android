package com.example.anthony.chap5_heritage.beans;

/**
 * Created by booth09-mgr2 on 17/03/2017.
 */

public class EnseignantBean extends PersonneBean {


    private String matiere;


    //--------------------
    // Constructeurs
    //--------------------
    public EnseignantBean(String nom, String prenom) {
        super(nom, prenom);
    }


    public EnseignantBean(String nom, String prenom, String matiere) {
        super(nom, prenom);
        this.matiere = matiere;
    }

    //--------------------
    // Méthodes
    //--------------------

    @Override
    public String afficher() {
        return "Enseignant : " + nom + " " + prenom + " (" + matiere + ")";
    }

    //--------------------
    // Getter / Setter
    //--------------------


    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
}
