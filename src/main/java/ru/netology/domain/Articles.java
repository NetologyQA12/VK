package ru.netology.domain;

public class Articles {
    private String id;
    private String[] imageID;
    private String[] nameURL;
    private String allArticles;
    private int numberOfArticles;

    public Articles(String id, String[] imageID, String[] nameURL, String allArticles, int numberOfArticles) {
        this.id = id;
        this.imageID = imageID;
        this.nameURL = nameURL;
        this.allArticles = allArticles;
        this.numberOfArticles = numberOfArticles;
    }
}
