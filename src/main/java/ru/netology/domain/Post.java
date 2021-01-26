package ru.netology.domain;

public class Post {
    private int ownerId; //идентификатор пользователя или сообщества.
    private String domain; // короткий адрес пользователя или сообщества
    private String query; //поисковой запрос. Для точного результата запрос необходимо передавать в двойных кавычках.
    private boolean ownersOnly;  //1 — возвращать только записи от имени владельца стены.
    private int count = 20; //количество записей, которые необходимо вернуть. по умолчанию 20, максимальное значение 100
    private int offset; //смещение, необходимо для получения определенного подмножества результатов. по умолчанию 0
    private int postId; //идентификатор записи на стене. положительное число

    private Likes[] likes;

    public Likes[] likes() {
        // TODO: add logic
        return null;
    }

    private Articles[] articles;

    public Articles[] articles() {
        // TODO: add logic
        return null;
    }

    private Header[] headers;

    public Header[] headers() {
        // TODO: add logic
        return null;
    }

    private Information[] information;

    public Information[] information() {
        // TODO: add logic
        return null;
    }

    private Registration[] registrations;

    public Registration[] registrations() {
        // TODO: add logic
        return null;
    }

    private Subscribers[] subscribers;

    public Subscribers[] subscribers() {
        // TODO: add logic
        return null;
    }

    private WritingOnTheWall[] writingOnTheWalls;

    public WritingOnTheWall[] writingOnTheWalls() {
        // TODO: add logic
        return null;
    }


    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public boolean isOwnersOnly() {
        return ownersOnly;
    }

    public void setOwnersOnly(boolean ownersOnly) {
        this.ownersOnly = ownersOnly;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
