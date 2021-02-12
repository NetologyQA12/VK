package ru.netology.domain;

public class Likes {
    private int count; //— число пользователей, которым понравилась запись;
    private int userLikes; //[0,1] — наличие отметки «Мне нравится» от текущего пользователя (1 — есть, 0 — нет);
    private boolean canLike;  //[0,1] — информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — может, 0 — не может);
    private boolean canPublish;  //[0,1] — информация о том, может ли текущий пользователь сделать репост записи (1 — может, 0 — не может).

    public Likes(int count, int userLikes, boolean canLike, boolean canPublish) {
        this.count = count;
        this.userLikes = userLikes;
        this.canLike = canLike;
        this.canPublish = canPublish;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public boolean getCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
