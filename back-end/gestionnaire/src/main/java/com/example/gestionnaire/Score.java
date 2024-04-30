package com.example.gestionnaire;
import com.example.joueur.Joueur;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Score {
    private Joueur joueur;
    private int score;

    public Score(Joueur joueur, int score) {
        this.joueur = joueur;
        this.score = score;
    }

}
