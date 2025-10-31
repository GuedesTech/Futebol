package model;

import lombok.*;

@Data // Getters and Setters
@AllArgsConstructor // Constructor
@NoArgsConstructor // Constructor
@ToString // toString

public class Player {
    private int id;
    private String name; // nome
    private String position; // posicao
    private int jerseyNumber; // numeroCamisa
    private int age; // idade
    private int teamId; // idTime (FK for Team)

    public Player (String name, String position, int jerseyNumber, int age, int teamId){
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.age = age;
        this.teamId = teamId;
    }
}