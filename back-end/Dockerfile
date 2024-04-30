# Définition de l'image de base
FROM openjdk:11-jre-slim

# Répertoire de travail dans le conteneur
WORKDIR /app

# Copie des fichiers des modules appareiment, gestionnaire et joueur
COPY backend/appareiment/target/appareiment-0.0.1-SNAPSHOT.jar appareiment.jar
COPY backend/gestionnaire/target/gestionnaire-0.0.1-SNAPSHOT.jar gestionnaire.jar
COPY backend/joueur/target/joueur-0.0.1-SNAPSHOT.jar joueur.jar

# Exposition du port
EXPOSE 8080

# Commande pour exécuter l'application au démarrage du conteneur
CMD ["java", "-jar", "appareiment.jar"]