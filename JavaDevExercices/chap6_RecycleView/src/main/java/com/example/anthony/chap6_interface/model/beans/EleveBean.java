package com.example.anthony.chap6_interface.model.beans;

import java.util.Random;

/**
 * Created by booth09-mgr2 on 16/03/2017.
 */

public class EleveBean extends PersonneBean {

    //Final pour constante
    public static final int AGE_ADULTE = 18;
    private static final Random random = new Random();

    //Attributs
    private String classe;

    //--------------------
    // Constructeurs
    //--------------------
    public EleveBean(String nom, String prenom) {
        this(nom, prenom, null);
    }

    public EleveBean(String nom, String prenom, int age) {
        this(nom, prenom, null, age);
    }

    public EleveBean(String nom, String prenom, String classe) {
        this(nom, prenom, classe, random.nextInt(100));
    }

    public EleveBean(String nom, String prenom, String classe, int age) {
        super(nom, prenom);
        this.classe = classe;
        this.age = age;
    }

    //--------------------
    // Méthodes
    //--------------------

    public boolean isAdulte() {
        return age >= AGE_ADULTE;
    }

    @Override
    public String afficher() {
        return "Élève : " + nom + " " + prenom + " (" + classe + ")";
    }

    //--------------------
    // Getter / Setter
    //--------------------

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
