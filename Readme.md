# README - Livraison 1
## Introduction
Ce document décrit la première livraison du projet, mettant en évidence l'architecture, les fonctionnalités implémentées, ainsi que l'intégration de Docker et les tests avec Postman.

## Technologies Utilisées
Java avec Spring Boot
Maven
Angular
Docker
Postman
Git

## Architecture
L'architecture du projet est construite sur une base solide utilisant Maven, avec deux modules back-end, un module front-end et des liaisons RESTful entre eux.

## Modules back-end
### Module Appariement : 
Gère la liaison entre le back-end et le front-end, permettant de faire correspondre les joueurs.
#### Classe principale
GameController : Gère les requêtes HTTP liées au jeu, telles que la création de parties et le lancement des dés.
### Module Gestionnaire : 
Gère la création et la gestion des parties, des joueurs et des statistiques.
#### Classes principales :
Gestion des Parties : Responsable de la création, de l'ajout de joueurs et du démarrage des parties, ainsi que du suivi des parties en cours.

Gestion des Joueurs : Fournit une liste de joueurs disponibles pour participer au jeu.

Gestion des Hébergeurs : Gère les hébergeurs disponibles et leur capacité à accueillir des joueurs.

Gestion des Tours de Jeu : Gère le déroulement des tours de jeu, incluant le lancement des dés et le calcul des scores.
## Module Front-end
Le module front-end est responsable de l'interface utilisateur du jeu.

## API REST
Trois API ont été implémentées pour interagir avec le jeu :

#### POST /api/create-game : Crée une nouvelle partie.
#### GET /api/players : Récupère la liste des joueurs.
#### POST /api/roll-dice : Lance les dés pour les joueurs.
## Fonctionnalités implémentées
Création de partie avec gestion de la disponibilité des joueurs et des hébergeurs.
Lancement du jeu avec lancé de dés pour chaque joueur.
Interface utilisateur simple avec composants pour la création de partie et déroulement du jeu.
## Docker
Une configuration Docker a été ajoutée pour faciliter le déploiement de l'application. L'image Docker est configurée pour exposer le port 8080 et lancer l'application.
## Tests avec Postman
Des tests d'automatisation ont été implémentés à l'aide de Postman pour tester toutes les requêtes HTTP et assurer le bon fonctionnement de l'API.
# Prochaine Livraison - Livraison 2
Pour la prochaine livraison, les améliorations suivantes sont prévues :

#### Résolution du problème de génération des fichiers Snapshot pour le module Gestionnaire.
#### Implémentation de tests d'intégration et de tests unitaires pour garantir la robustesse de l'application.
#### Ajout d'une IA pour jouer contre les joueurs humains, avec une logique de jeu basée sur des compositions simples.
#### Intégration de probabilités pour aider les joueurs à prendre des décisions stratégiques.
#### Amélioration de l'interface utilisateur pour une meilleure expérience de jeu.