package com.example.anthony.chap3;

/**
 * Created by booth09-mgr2 on 17/03/2017.
 */

public class EnseignantBean {

    private String nom, prenom;
    private int age;

    public EnseignantBean() {
    }

    public EnseignantBean(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public EnseignantBean(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    //--------------------
    // GETTER / SETTER
    //--------------------

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
