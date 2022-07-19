package com.example.homework;

import java.time.LocalDateTime;

public class Voiture {
    public enum Color{WHITE,
    RED,
    YELLOW,
    BLACK,
    BLUE,
    PURPLE,
    GREEN,
    ORANGE,
    PINK,
    GRAY,
    BROWN};
    private Roues[] roues;
    private int anneeFait;
    private LocalDateTime tempsCreation;
    private Voiture.Color color;

    public Voiture(int anneeFait, int nbWheels, int diametter, Voiture.Color color)
    {
        this.roues = new Roues[nbWheels];
        this.anneeFait = anneeFait;
        this.color = color;
        this.tempsCreation = LocalDateTime.now();
        for(int index = 0; index < nbWheels; index++)
        {
            this.roues[index] = new Roues(diametter);
        }
    }

    @Override
    public String toString()
    {
        return String.format("NbWheels : %d, average : %d, years of manufacturing : %d, color : %s, creation date : %s",
                this.roues.length, this.roues[0].getDiameter(), this.anneeFait, this.color.toString(), this.tempsCreation.toString());
    }

    public int getAnneeFait() {return this.anneeFait;}
    public Voiture.Color getColor() {return this.color;}
    public int getNbWheels() {return this.roues.length;}

}
