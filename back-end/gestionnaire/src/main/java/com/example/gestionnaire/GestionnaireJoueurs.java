package com.example.gestionnaire;

import com.example.joueur.Joueur;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GestionnaireJoueurs {

    private List<Joueur> joueursDisponibles;

    public GestionnaireJoueurs() {
        // Initialiser la liste des joueurs disponibles
        this.joueursDisponibles = new ArrayList<>();
        // Ajouter des joueurs à la liste (à remplacer par la logique réelle)
        this.joueursDisponibles.add(new Joueur("Salah"));
        this.joueursDisponibles.add(new Joueur("Momo"));
        this.joueursDisponibles.add(new Joueur("Anas"));
        this.joueursDisponibles.add(new Joueur("Zouhair"));
        this.joueursDisponibles.add(new Joueur("ayoub"));

        // Ajouter autant de joueurs que nécessaire pour les différents hébergeurs
    }

    public List<Joueur> getJoueursDisponibles() {
        return joueursDisponibles;
    }
}
