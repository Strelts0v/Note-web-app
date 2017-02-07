package com.gv.notebook.dao;

import com.gv.notebook.models.Note;
import java.util.List;

public interface NoteDao {

    List<Note> getAllUserNotes(int userId);

    void addNote(Note note);

    void deleteNote(int noteId);
}
