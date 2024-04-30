package com.example.gestionnaire;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.example.joueur.Joueur;
import org.springframework.stereotype.Component;

@Component
public class GestionnaireParties{
    private List<Partie> parties;
    private Map<String, Integer> hebergeursDisponibles;
    public GestionnaireParties() {
        this.parties = new ArrayList<>();
    }

    public Partie creerNouvellePartie(int id, String nomHebergeur) {
        Partie nouvellePartie = new Partie(id, nomHebergeur); // Passer le nom de l'hébergeur lors de la création
        parties.add(nouvellePartie);
        return nouvellePartie;
    }

    public void ajouterJoueurAPartie(Partie partie, Joueur joueur) {
        partie.getJoueurs().add(joueur);
    }

    public void demarrerPartie(Partie partie) {
        partie.setEnCours(true);
        // Ajoutez ici la logique pour démarrer le premier tour de jeu, si nécessaire
    }
    public Partie getPartieEnCours() {
        for (Partie partie : parties) {
            if (partie.isEnCours()) {
                return partie;
            }
        }
        return null; // Retourne null si aucune partie en cours n'est trouvée
    }
    // Modifier la méthode getJoueursParticipatingInCurrentGame() dans GestionnaireParties
    public List<Joueur> getJoueursParticipatingInCurrentGame() {
        for (Partie partie : parties) {
            if (partie.isEnCours()) {
                return partie.getJoueurs(); // Retourne directement la liste des joueurs de la partie en cours
            }
        }
        return Collections.emptyList();
    }


    public void terminerPartie(Partie partie) {
        // Ajoutez ici la logique pour terminer la partie, par exemple :
        partie.setEnCours(false);

        // Récupérer le nom de l'hébergeur de la partie terminée
        String nomHebergeur = partie.getNomHebergeur();

        // Réintégrer l'hébergeur dans la liste des hébergeurs disponibles
        if (nomHebergeur != null) {
            Integer nbJoueursNecessaires = hebergeursDisponibles.get(nomHebergeur);
            if (nbJoueursNecessaires != null) {
                hebergeursDisponibles.put(nomHebergeur, nbJoueursNecessaires);
            }
        }
    }
}
