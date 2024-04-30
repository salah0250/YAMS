package com.example.joueur;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Joueur {
    private int id;
    private String nom;
    private boolean humain; // Pour distinguer les joueurs humains des IA
    private int score;

    public Joueur(String nom){
        this.nom = nom;
    }
}
