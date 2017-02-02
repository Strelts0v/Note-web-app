package com.gv.notebook.models;

import com.gv.notebook.dao.NoteDao;
import com.gv.notebook.dao.NoteDaoSimple;

import java.util.List;

public class User {

    private int userId;
    private String email;

    public User(int userId, String email){
        this.userId = userId;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Note> getAllNotes(){
        NoteDao noteDao = new NoteDaoSimple();
        return noteDao.getAllUserNotes(userId);
    }
}
