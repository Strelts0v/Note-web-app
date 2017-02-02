package com.gv.notebook.models;

public class Note {

    private int noteId;
    private int userId;
    private String name;
    private String email;

    public Note(int noteId, int userId, String name, String email){
        this.noteId = noteId;
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
