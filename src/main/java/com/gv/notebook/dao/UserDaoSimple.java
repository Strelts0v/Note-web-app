package com.gv.notebook.dao;

import com.gv.notebook.models.User;
import com.gv.notebook.settings.DatabaseConnectionManager;
import java.sql.*;

public class UserDaoSimple implements UserDao {

    private static final String USER_ID_COLUMN = "id_user";

    public User getUser(String login, String password) throws ClassNotFoundException, SQLException {
        User user = null;
        Connection connection = DatabaseConnectionManager.getDatabaseConnection();
        PreparedStatement statement = connection.prepareStatement("select " + USER_ID_COLUMN +
                        " from users where login = ? and password = ?");
        statement.setString(1, login);
        statement.setString(2, password);
        ResultSet rS =  statement.executeQuery();
        if(rS.next()){
            user = new User(rS.getInt(USER_ID_COLUMN), login);
        }
        return user;
    }
}
