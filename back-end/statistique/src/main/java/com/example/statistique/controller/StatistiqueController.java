package com.example.statistique.controller;

import com.example.statistique.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/api/statistique")
public class StatistiqueController {
/*
    // Ajoutez vos méthodes de gestion des requêtes ici, par exemple :
    @Autowired
    private StatisticsService statisticsService;

    @GetMapping("/probabilities")
    public ResponseEntity<List<Double>> getProbabilities(@RequestParam List<Integer> diceValues) {
        // Utilisez l'instance de StatisticsService pour appeler la méthode
        List<Double> probabilities = statisticsService.calculateProbabilities(diceValues);
        return ResponseEntity.ok(probabilities);
    }

 */
}
