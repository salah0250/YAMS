package com.example.gestionnaire;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class GestionnaireHebergeurs {

    private Map<String, Integer> hebergeursDisponibles;

    public GestionnaireHebergeurs() {
        // Initialiser la liste des hébergeurs disponibles avec leur nombre de joueurs nécessaires
        this.hebergeursDisponibles = new HashMap<>();
        // Ajouter des hébergeurs à la liste (à remplacer par la logique réelle)
        this.hebergeursDisponibles.put("Hebergeur1", 6); // Exemple d'hébergeur avec 4 joueurs nécessaires
        this.hebergeursDisponibles.put("Hebergeur2", 4); // Exemple d'hébergeur avec 6 joueurs nécessaires
    }

    public Map<String, Integer> getHebergeursDisponibles() {
        return hebergeursDisponibles;
    }
}
