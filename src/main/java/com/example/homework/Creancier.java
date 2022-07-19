package com.example.homework;

public class Creancier {
    private String nom;
    private String ville;
    private boolean estVegetarien;

    public Creancier(String n, String c, boolean isVegetarian)
    {

        this.nom = n;
        this.ville = c;
        this.estVegetarien = isVegetarian;
    }

    public String getNom() {return this.nom;}
    public String getVille() {return this.ville;}
    public boolean getIsVegetarian() {return this.estVegetarien;}
    @Override
    public String toString() {return "Trader " + this.nom + " in " + this.ville + " is " + this.estVegetarien + " vegetarian";}
}
