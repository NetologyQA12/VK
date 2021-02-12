package ru.netology.domain;

public class Likes {
    private int likesCount; //— число пользователей, которым понравилась запись;
    private boolean userLikes; //[0,1] — наличие отметки «Мне нравится» от текущего пользователя (1 — есть, 0 — нет);
    private boolean canLike;  //[0,1] — информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — может, 0 — не может);
    private boolean canPublish;  //[0,1] — информация о том, может ли текущий пользователь сделать репост записи (1 — может, 0 — не может).

    public Likes(int likesCount, boolean userLikes, boolean canLike, boolean canPublish) {
        this.likesCount = likesCount;
        this.userLikes = userLikes;
        this.canLike = canLike;
        this.canPublish = canPublish;
    }

    public int getCount() {
        return likesCount;
    }

    public void setCount(int count) {
        this.likesCount = count;
    }

    public boolean getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean userLikes) {
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
