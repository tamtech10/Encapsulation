package com.tamaris.exercices.ex3;

public class Dépot implements Transaction{

    public Compte compte;

    public Dépot(Compte compte) {
        this.compte = compte;
    }

    public void effectuer(double montant) {
        compte.depot(montant);

    }

}

