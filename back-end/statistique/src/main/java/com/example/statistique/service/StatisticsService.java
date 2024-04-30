package com.example.statistique.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StatisticsService {

    // Méthode exemple pour calculer des probabilités
    public List<Double> calculateProbabilities(List<Integer> diceValues) {
        // Implémentez votre logique de calcul ici et retournez la liste des probabilités
        return List.of(0.1, 0.2, 0.3, 0.4, 0.5);
    }
}