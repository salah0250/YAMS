package com.example.joueur;
import java.util.ArrayList;
import java.util.List;

public class GestionnaireJoueurs {
    private List<Joueur> joueurs;

    public GestionnaireJoueurs() {
        this.joueurs = new ArrayList<>();
    }

    public void ajouterJoueur(Joueur joueur) {
        joueurs.add(joueur);
    }
}
