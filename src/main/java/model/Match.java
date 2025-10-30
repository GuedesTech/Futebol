package model;

import java.util.Date;

public class Match {
    private int id;
    private int homeTeamId; // idTimeCasa
    private int visitorTeamId; // idTimeVisitante
    private int homeGoals; // golsCasa
    private int visitorGoals; // golsVisitante
    private Date matchDate; // dataPartida
    private String matchLocation; // localPartida

    // Default Constructor
    public Match() {}

    // Full Constructor
    public Match(int id, int homeTeamId, int visitorTeamId, int homeGoals, int visitorGoals, Date matchDate, String matchLocation) {
        this.id = id;
        this.homeTeamId = homeTeamId;
        this.visitorTeamId = visitorTeamId;
        this.homeGoals = homeGoals;
        this.visitorGoals = visitorGoals;
        this.matchDate = matchDate;
        this.matchLocation = matchLocation;
    }

    // Constructor without ID (for insertion)
    public Match(int homeTeamId, int visitorTeamId, int homeGoals, int visitorGoals, Date matchDate, String matchLocation) {
        this.homeTeamId = homeTeamId;
        this.visitorTeamId = visitorTeamId;
        this.homeGoals = homeGoals;
        this.visitorGoals = visitorGoals;
        this.matchDate = matchDate;
        this.matchLocation = matchLocation;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getHomeTeamId() { return homeTeamId; }
    public void setHomeTeamId(int homeTeamId) { this.homeTeamId = homeTeamId; }

    public int getVisitorTeamId() { return visitorTeamId; }
    public void setVisitorTeamId(int visitorTeamId) { this.visitorTeamId = visitorTeamId; }

    public int getHomeGoals() { return homeGoals; }
    public void setHomeGoals(int homeGoals) { this.homeGoals = homeGoals; }

    public int getVisitorGoals() { return visitorGoals; }
    public void setVisitorGoals(int visitorGoals) { this.visitorGoals = visitorGoals; }

    public Date getMatchDate() { return matchDate; }
    public void setMatchDate(Date matchDate) { this.matchDate = matchDate; }

    public String getMatchLocation() { return matchLocation; }
    public void setMatchLocation(String matchLocation) { this.matchLocation = matchLocation; }

    public String toString() {
        return "Match ID: " + this.id +
                "\nHome Team ID: " + this.homeTeamId +
                "\nVisitor Team ID: " + this.visitorTeamId +
                "\nResult: " + this.homeGoals + " - " + this.visitorGoals +
                "\nDate: " + this.matchDate +
                "\nLocation: " + this.matchLocation;
    }
}