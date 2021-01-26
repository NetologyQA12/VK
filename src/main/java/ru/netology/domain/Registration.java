package ru.netology.domain;

public class Registration {
    private String id;
    private String imageID;
    private String login;
    private String password;
    private Boolean buttonIn;
    private Boolean buttonRegistration;
    private Boolean checkAlienComputer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getButtonIn() {
        return buttonIn;
    }

    public void setButtonIn(Boolean buttonIn) {
        this.buttonIn = buttonIn;
    }

    public Boolean getButtonRegistration() {
        return buttonRegistration;
    }

    public void setButtonRegistration(Boolean buttonRegistration) {
        this.buttonRegistration = buttonRegistration;
    }

    public Boolean getCheckAlienComputer() {
        return checkAlienComputer;
    }

    public void setCheckAlienComputer(Boolean checkAlienComputer) {
        this.checkAlienComputer = checkAlienComputer;
    }
}
