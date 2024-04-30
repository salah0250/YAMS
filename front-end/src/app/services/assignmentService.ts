import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AssignmentService {
  constructor(private http: HttpClient) { }

  createGame() {
    return this.http.post('http://localhost:8080/api/create-game', {}, { responseType: 'text' }).pipe(
      catchError(this.handleError)
    );
  }

  getPlayers() {
    return this.http.get<string[]>('http://localhost:8080/api/players').pipe(
      catchError(this.handleError)
    );
  }

  rollDice() {
    return this.http.post('http://localhost:8080/api/roll-dice', {}, { responseType: 'text' }).pipe(
      catchError(this.handleError)
    );
  }
  getPlayersWithScores() {
    return this.http.get<{ nom: string, score: number }[]>('http://localhost:8080/api/players').pipe(
      catchError(this.handleError)
    );
  }



  private handleError(error: any) {
    console.error('Error:', error);
    return throwError('Something went wrong.');
  }
}
