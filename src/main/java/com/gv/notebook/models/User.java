package com.gv.notebook.models;

import java.util.List;

public class User {

    private int userId;
    private String login;

    public User(int userId, String login){
        this.userId = userId;
        this.login = login;
    }

    public int getUserId() {
        return userId;
    }

    public String getLogin() {
        return login;
    }

}
