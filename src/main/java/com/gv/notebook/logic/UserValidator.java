package com.gv.notebook.logic;

import com.gv.notebook.dao.UserDao;
import com.gv.notebook.dao.UserDaoSimple;
import com.gv.notebook.models.Note;
import com.gv.notebook.models.User;

import java.sql.SQLException;
import java.util.List;

public class UserValidator {

    public boolean checkLogin(String login, String password){
        boolean isValid = false;
        UserDao userDao = new UserDaoSimple();
        try {
            User user = userDao.getUser(login, password);
            if(user != null){
                isValid = true;
                List<Note> notes = user.getAllNotes();
                // TODO: сохранить в виде глобального объекта (bean?)
            }
        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } finally {
            return isValid;
        }
    }
}
