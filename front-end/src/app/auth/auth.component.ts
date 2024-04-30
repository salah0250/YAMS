import { Component } from '@angular/core';
import { AssignmentService } from '../services/assignmentService';
import { Router } from '@angular/router'; // Importer le service Router

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: ['./auth.component.css']
})
export class AuthComponent {

  constructor(private assignmentService: AssignmentService, private router: Router ) { }

  createGame() {
    this.assignmentService.createGame().subscribe(
      response => {
        console.log("Game created successfully:", response);
        // Handle success response if needed
        this.router.navigateByUrl('game');
      },
      error => {
        console.error("Error creating game:", error);
        // Handle error response if needed

      }
    );
  }
}
