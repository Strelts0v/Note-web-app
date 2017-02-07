package com.gv.notebook.models;

import com.gv.notebook.dao.NoteDao;
import com.gv.notebook.dao.NoteDaoSimple;

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

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public List<Note> getAllNotes(){
        NoteDao noteDao = new NoteDaoSimple();
        return noteDao.getAllUserNotes(userId);
    }
}
