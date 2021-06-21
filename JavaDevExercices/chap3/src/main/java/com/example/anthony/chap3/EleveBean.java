package com.example.anthony.chap3;

import java.util.Random;

/**
 * Created by booth09-mgr2 on 16/03/2017.
 */

public class EleveBean {

    //Final pour constante
    public static final int AGE_ADULTE = 18;
    private static final Random random = new Random();

    //Attributs
    private String nom, prenom;
    private final int age;

    //Constructeur
    public EleveBean() {
        this(random.nextInt(100));
    }

    public EleveBean(int age) {
        this.age = age;
    }


    public boolean isAdulte() {
        return age >= AGE_ADULTE;
    }

    //--------------------
    // GETTER / SETTER
    //--------------------


    public int getAge() {
        return age;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
