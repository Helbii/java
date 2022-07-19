package com.example.homework;

public class Transac {
    private int valeur;
    private Creancier creancier;
    private int annee;

    public Transac(int value, Creancier creancier, int year)
    {
        this.creancier = creancier;
        this.annee = year;
        this.valeur = value;
    }

    public int getValeur() {return this.valeur;}

    public Creancier getTrader() {return creancier;}
    public int getYear() {return this.annee; }
    @Override
    public String toString() {return "{ " + this.creancier + ", " + "year: " + this.annee + ", " + "value: " + this.valeur + "}"; }
}
