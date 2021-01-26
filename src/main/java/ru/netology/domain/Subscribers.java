package ru.netology.domain;

import javax.swing.*;

public class Subscribers {
    private String id;
    private String[] imageID;
    private String[] nameURL;
    private String allSubscribers;
    private int numberOfSubscribers;

    public Subscribers(String id, String[] imageID, String[] nameURL, String allSubscribers, int numberOfSubscribers) {
        this.id = id;
        this.imageID = imageID;
        this.nameURL = nameURL;
        this.allSubscribers = allSubscribers;
        this.numberOfSubscribers = numberOfSubscribers;
    }
}
