package com.gv.notebook.logic;

import com.gv.notebook.dao.UserDao;
import com.gv.notebook.dao.UserDaoSimple;
import com.gv.notebook.models.User;
import java.sql.SQLException;

public class UserValidator {

    public User checkLogin(String login, String password){
        User user = null;
        UserDao userDao = new UserDaoSimple();
        try {
            user = userDao.getUser(login, password);
        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } finally {
            return user;
        }
    }
}
