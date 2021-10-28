package com.GregV2.demo.model;

public class Car {

    //-------------------------------- ATTRIBUTS ----------------------------------
    private int id;
    private String marque;
    private String modele;
    private String couleur;
    private int prix;

    //-------------------------------- CONSTRUCTOR ----------------------------------
    public Car() {
    }

    public Car(int id, String marque, String modele, String couleur, int prix) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.prix = prix;
    }

    //-------------------------------- GETTER & SETTER ----------------------------------


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    //-------------------------------- METHOD ----------------------------------


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", couleur='" + couleur + '\'' +
                ", prix=" + prix +
                '}';
    }
}
