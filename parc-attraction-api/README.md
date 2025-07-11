# Parc Attraction API

## Description

Le projet `parc-attraction-api` est une API RESTful développée avec Spring Boot, permettant de gérer un parc d'attractions. Il inclut des fonctionnalités pour gérer les utilisateurs, les tickets, les attractions, les restaurants et le personnel.

## Technologies

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Validation

## Structure du projet

```
parc-attraction-api
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── parc
│   │   │           ├── ParcAttractionApiApplication.java
│   │   │           ├── model
│   │   │           │   ├── User.java
│   │   │           │   ├── Ticket.java
│   │   │           │   ├── Attraction.java
│   │   │           │   ├── Restaurant.java
│   │   │           │   └── Personnel.java
│   │   │           ├── repository
│   │   │           │   ├── UserRepository.java
│   │   │           │   ├── TicketRepository.java
│   │   │           │   ├── AttractionRepository.java
│   │   │           │   ├── RestaurantRepository.java
│   │   │           │   └── PersonnelRepository.java
│   │   │           ├── service
│   │   │           │   ├── TicketService.java
│   │   │           │   ├── UserService.java
│   │   │           │   ├── AttractionService.java
│   │   │           │   ├── RestaurantService.java
│   │   │           │   └── PersonnelService.java
│   │   │           ├── controller
│   │   │           │   ├── UserController.java
│   │   │           │   ├── TicketController.java
│   │   │           │   ├── AttractionController.java
│   │   │           │   ├── RestaurantController.java
│   │   │           │   └── PersonnelController.java
│   │   │           └── dto
│   │   │               ├── UserDto.java
│   │   │               ├── TicketDto.java
│   │   │               ├── AttractionDto.java
│   │   │               ├── RestaurantDto.java
│   │   │               └── PersonnelDto.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── data.sql
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## Installation

1. Clonez le dépôt :
   ```
   git clone <url-du-dépôt>
   cd parc-attraction-api
   ```

2. Exécutez le projet avec Maven :
   ```
   ./mvnw spring-boot:run
   ```

## Endpoints

### Utilisateurs

- `GET /api/users` : Récupérer tous les utilisateurs
- `POST /api/users` : Créer un nouvel utilisateur
- `PATCH /api/users/{id}/ban` : Bannir un utilisateur
- `GET /api/users/{id}/tickets` : Récupérer les tickets d'un utilisateur

### Tickets

- `POST /api/tickets` : Acheter un ticket

### Attractions

- `GET /api/attractions` : Récupérer toutes les attractions
- `POST /api/attractions` : Créer une nouvelle attraction
- `PATCH /api/attractions/{id}/close` : Fermer une attraction
- `PATCH /api/attractions/{id}/open` : Ouvrir une attraction

### Restaurants

- CRUD complet pour les restaurants

### Personnel

- CRUD complet pour le personnel

## Configuration

Le fichier `application.properties` contient les configurations pour la base de données H2, JPA, et le port du serveur.

## Validation et Gestion des Erreurs

Le projet utilise des annotations de validation pour les DTOs et gère les erreurs avec des exceptions appropriées.