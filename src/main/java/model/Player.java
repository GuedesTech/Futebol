package model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data // Inclui: @Getter, @Setter, @ToString
@AllArgsConstructor // Adiciona Construtor com todos os campos
@NoArgsConstructor // Adiciona Construtor sem argumentos

public class Player {
    private int id;
    private String name; // nome
    private String position; // posicao
    private int jerseyNumber; // numeroCamisa
    private int age; // idade
    private int teamId; // idTime (FK for Team)

    // Constructor without ID (for insertion)
    public Player (String name, String position, int jerseyNumber, int age, int teamId){
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.age = age;
        this.teamId = teamId;
    }
}