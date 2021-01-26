package ru.netology.domain;

public class Header {
    private String id;
    private String head;
    private String imageID;
    private String text;

    public Header(String id, String head, String imageID, String text) {
        this.id = id;
        this.head = head;
        this.imageID = imageID;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
