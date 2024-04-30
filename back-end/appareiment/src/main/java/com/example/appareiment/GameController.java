package com.example.appareiment;

import com.example.gestionnaire.*;
import com.example.joueur.Joueur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class GameController {

    @Autowired
    private GestionnaireParties gestionnaireParties;

    @Autowired
    private GestionnaireHebergeurs gestionnaireHebergeurs;

    @Autowired
    private GestionnaireJoueurs gestionnaireJoueurs;

    @Autowired
    private GestionnaireTours gestionnaireTours; // Ajout du gestionnaire des tours

    @PostMapping("/create-game")
    public ResponseEntity<String> createGame() {
        // Récupérer la liste des hébergeurs disponibles
        Map<String, Integer> hebergeursDisponibles = gestionnaireHebergeurs.getHebergeursDisponibles();

        // Si aucun hébergeur n'est disponible, retourner une réponse indiquant l'indisponibilité
        if (hebergeursDisponibles.isEmpty()) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Aucun hébergeur disponible.");
        }

        // Sélectionner un hébergeur parmi ceux disponibles (pour l'exemple, nous en choisissons le premier)
        String hebergeurSelectionne = hebergeursDisponibles.keySet().iterator().next();

        // Valider la disponibilité des joueurs
        List<Joueur> joueursDisponibles = gestionnaireJoueurs.getJoueursDisponibles();
        int nbJoueursNecessaires = hebergeursDisponibles.get(hebergeurSelectionne);
        if (joueursDisponibles.size() < nbJoueursNecessaires) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Nombre de joueurs insuffisant.");
        }

        // Créer une nouvelle partie en passant le nom de l'hébergeur
        Partie nouvellePartie = gestionnaireParties.creerNouvellePartie(1, hebergeurSelectionne);

        // Ajouter les joueurs à la partie
        for (int i = 0; i < nbJoueursNecessaires && i < joueursDisponibles.size(); i++) {
            gestionnaireParties.ajouterJoueurAPartie(nouvellePartie, joueursDisponibles.get(i));
        }

        // Démarrer la partie
        gestionnaireParties.demarrerPartie(nouvellePartie);

        // Retourner une réponse indiquant que la partie a été créée et démarrée avec succès
        return ResponseEntity.ok("Partie créée et démarrée avec succès.");
    }

    @GetMapping("/players")
    public List<Joueur> getPlayers() {
        List<Joueur> joueurs = gestionnaireParties.getJoueursParticipatingInCurrentGame();
        return joueurs;
    }


    @PostMapping("/roll-dice")
    public ResponseEntity<String> rollDice() {
        // Récupérer la partie en cours (pour l'exemple, nous supposons qu'il y a une seule partie en cours)
        Partie partieEnCours = gestionnaireParties.getPartieEnCours();

        // Récupérer les joueurs de la partie en cours
        List<Joueur> joueurs = partieEnCours.getJoueurs();

        // Pour chaque joueur, générer un lancer de dés et calculer son score
        for (Joueur joueur : joueurs) {
            System.out.println(joueur.getNom());
            int[] des = gestionnaireTours.lancerDes(5); // Supposons que chaque joueur lance 5 dés
            int score = gestionnaireTours.calculerScore(des); // Calcul du score
            System.out.println(score);

            // Mettre à jour le score du joueur dans la partie en cours
            partieEnCours.ajouterScore(joueur, score);
        }

        // Terminer la partie si nécessaire (à implémenter)

        return ResponseEntity.ok("Les dés ont été lancés et les scores ont été enregistrés.");
    }


}
