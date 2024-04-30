package com.example.gestionnaire;

import com.example.joueur.Joueur;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class GestionnaireTours {
    private Random random = new Random();

    public int[] lancerDes(int nombreDes) {
        int[] des = new int[nombreDes];
        for (int i = 0; i < nombreDes; i++) {
            des[i] = random.nextInt(6) + 1; // Lancer un dé à 6 faces
        }
        return des;
    }

    public int calculerScore(int[] des) {
        int score = 0;
        for (int de : des) {
            score += de; // Le score est la somme de tous les dés
        }
        return score;
    }

    public void gererTour(Partie partie, Joueur joueurActuel) {

    }

    public boolean estPartieTerminee(Partie partie) {
        return false; // Placeholder, à remplacer par votre logique réelle
    }
}
