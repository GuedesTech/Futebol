package model;

public class Team {
    private int id;
    private String name; // nome
    private String state; // estado
    private String city; // cidade
    private String stadium; // estadio


    // Default Constructor
    public Team(){}

    // Full Constructor
    public Team(int id, String name, String state, String city, String stadium){
        this.id = id;
        this.name = name;
        this.state = state;
        this.city = city;
        this.stadium = stadium;
    }

    // Constructor without ID (for database insertion)
    public Team(String name, String state, String city, String stadium) {
        this.name = name;
        this.state = state;
        this.city = city;
        this.stadium = stadium;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNameTeam() { return name; }
    public void setNameTeam(String name) { this.name = name; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getStadium() { return stadium; }
    public void setStadium(String stadium) { this.stadium = stadium; }

    public String toString() {
        return "Id: " + this.id
                + "\nName: " + this.name
                + "\nState: " + this.state
                + "\nCity: " + this.city
                + "\nStadium: " + this.stadium;
    }
}