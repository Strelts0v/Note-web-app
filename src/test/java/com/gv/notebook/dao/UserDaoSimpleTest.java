package com.gv.notebook.dao;

import com.gv.notebook.models.User;
import org.junit.Assert;
import org.junit.Test;

public class UserDaoSimpleTest {
    @Test
    public void getUser() throws Exception {
        UserDao userDao = new UserDaoSimple();
        Assert.assertEquals("vi@gmail.com", userDao.getUser("vi@gmail.com", "44447777").getLogin());
        Assert.assertNull(userDao.getUser("xxx", "1111"));
    }

}