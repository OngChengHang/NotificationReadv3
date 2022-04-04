package com.example.notificationreadv3;

public class ComModel {
    private int UserID;
    private String competitionResult;
    private String competitionDescription;

    // Constructor
    public ComModel(int UserID, String competitionResult, String competitionDescription ) {
        this.UserID = UserID;
        this.competitionResult = competitionResult;
        this.competitionDescription = competitionDescription;
    }

    // Getter and Setter
    public int getUSERID() {
        return UserID;
    }

    public void setUSERID(int UserID) {
        this.UserID = UserID;
    }

    public String getCompetitionResult() {
        return competitionResult;
    }

    public void setCompetitionResult(String competitionResult) {
        this.competitionResult = competitionResult;
    }

    public String getCompetitionDescription() {
        return competitionDescription;
    }

    public void setCompetitionDescription(String competitionDescription) {
        this.competitionDescription = competitionDescription;
    }
}
