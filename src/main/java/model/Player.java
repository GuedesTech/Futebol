package model;

public class Player extends Team {
    private int id;
    private String name; // nome
    private String position; // posicao
    private int jerseyNumber; // numeroCamisa
    private int age; // idade
    private int teamId; // idTime (FK for Team)

    // Default Constructor
    public Player() {}

    // Full Constructor
    public Player(int id, String name, String position, int jerseyNumber, int age, int teamId) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.age = age;
        this.teamId = teamId;
    }

    // Constructor without ID (for insertion)
    public Player(String name, String position, int jerseyNumber, int age, int teamId) {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.age = age;
        this.teamId = teamId;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNamePlayer() { return name; }
    public void setNamePlayer(String name) { this.name = name; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public int getJerseyNumber() { return jerseyNumber; }
    public void setJerseyNumber(int jerseyNumber) { this.jerseyNumber = jerseyNumber; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getTeamId() { return teamId; }
    public void setTeamId(int teamId) { this.teamId = teamId; }

    public String toString() {
        String teamName = (this.teamId <= 0) ? super.getNameTeam() : "No team";
        return "Id: " + this.id +
                "\nName: " + this.name +
                "\nAge: " + this.age +
                "\nPosition: " + this.position +
                "\nTeam: " + teamName;
    }
}