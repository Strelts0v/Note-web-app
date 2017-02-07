package com.gv.notebook.dao;

import com.gv.notebook.models.User;
import java.sql.SQLException;

public interface UserDao {

    User getUser(String login, String password) throws ClassNotFoundException, SQLException;

}
