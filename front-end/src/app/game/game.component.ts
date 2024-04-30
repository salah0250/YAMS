import { Component, OnInit } from '@angular/core';
import { AssignmentService } from '../services/assignmentService';

@Component({
  selector: 'app-game',
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.css']
})
export class GameComponent implements OnInit {
  players: { nom: string, score: number }[] = [];

  constructor(private gameService: AssignmentService) { }

  ngOnInit(): void {
    this.fetchPlayers();
  }

  fetchPlayers() {
    this.gameService.getPlayersWithScores().subscribe(
      (playersWithScores: { nom: string, score: number }[]) => {
        // Assigner les joueurs récupérés avec leurs scores à la propriété players
        this.players = playersWithScores;
      },
      (error) => {
        console.error('Error fetching players:', error);
      }
    );
  }


  rollDice() {
    this.gameService.rollDice().subscribe(
      (message: string) => {
        console.log(message); // Afficher le message de réussite dans la console
        // Rafraîchir les scores des joueurs
        this.fetchPlayers();
      },
      (error) => {
        console.error('Error rolling dice:', error);
      }
    );
  }
}
