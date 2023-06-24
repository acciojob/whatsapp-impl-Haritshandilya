package com.driver;

public class Group {
    public Group(String name, int i) {
        this.name = name;
        this.numberOfParticipants = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    private String name;
    private int numberOfParticipants;


}
