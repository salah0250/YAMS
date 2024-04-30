package com.example.gestionnaire;

import com.example.joueur.Joueur;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Partie {
    private int id;
    private List<Joueur> joueurs;
    private boolean enCours;
    private String nomHebergeur;
    private List<Score> scores; // Ajouter une liste de scores

    public Partie(int id, String nomHebergeur) {
        this.id = id;
        joueurs = new ArrayList<>();
        enCours = false;
        this.nomHebergeur = nomHebergeur;
        scores = new ArrayList<>(); // Initialiser la liste de scores
    }

    // Ajouter une méthode pour ajouter un score à la partie
    public void ajouterScore(Joueur joueur, int score) {
        joueur.setScore(score);
    }
}
