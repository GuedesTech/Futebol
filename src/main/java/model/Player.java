package model;

import lombok.*;

@Data // Getters and Setters
@AllArgsConstructor // Constructor
@NoArgsConstructor // Constructor
@ToString // toString

public class Player extends Team {
    private int id;
    private String name; // nome
    private String position; // posicao
    private int jerseyNumber; // numeroCamisa
    private int age; // idade
    private int teamId; // idTime (FK for Team)
}