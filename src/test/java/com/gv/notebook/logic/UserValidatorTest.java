package com.gv.notebook.logic;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

    @Test
    public void checkLogin() throws Exception {
        UserValidator validator = new UserValidator();
        Assert.assertEquals(validator.checkLogin("vi@gmail.com", "44447777").getLogin(), "vi@gmail.com");
        Assert.assertNull(validator.checkLogin("t", "35"));
    }
}