package com.example.votingapplication;

public  class Candidate {
    String canNameTitle;
    String canNationality;
    int canAge;
    String canTheme;
    String canDescription;
    String canTitle;
    int imageResourceId;

    public Candidate(String canNameTitle, 
    String canNationality, 
    int canAge,
    String canTheme, 
    String canDescription, 
    String canTitle,
    int imageResourceId
    ) {
        this.canNameTitle = canNameTitle;
        this.canNationality = canNationality;
        this.canAge = canAge;
        this.canTheme = canTheme;
        this.canDescription = canDescription;
        this.canTitle = canTitle;
        this.imageResourceId = imageResourceId;
    }
}
