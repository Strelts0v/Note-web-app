package com.gv.notebook.settings;

import org.junit.Assert;
import org.junit.Test;

public class ConfigurationManagerTest {

    private final static String LOGIN_PARAMETER = "login";
    private final static String PASSWORD_PARAMETER = "password";
    private final static String MAIN_PAGE = "path.page.main";
    private final static String ERROR_PAGE = "path.page.error";

    @Test
    public void getProperty() throws Exception {
        Assert.assertEquals("/views/jsp/main.jsp", ConfigurationManager.getProperty(MAIN_PAGE));
    }

}