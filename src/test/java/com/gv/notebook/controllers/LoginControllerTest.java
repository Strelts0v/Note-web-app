package com.gv.notebook.controllers;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginControllerTest extends Mockito{

    private final static String LOGIN_PARAMETER = "login";
    private final static String PASSWORD_PARAMETER = "password";

    @Test
    public void execute() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        when(request.getParameter(LOGIN_PARAMETER)).thenReturn("vi@gmail.com");
        when(request.getParameter(PASSWORD_PARAMETER)).thenReturn("44447777");

        new LoginController().doGet(request, response);

        verify(request, atLeast(1)).getParameter(LOGIN_PARAMETER);
        verify(request, atLeast(1)).getParameter(PASSWORD_PARAMETER);
    }

}