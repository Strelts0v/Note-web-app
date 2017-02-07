package com.gv.notebook.controllers;

import com.gv.notebook.logic.UserValidator;
import com.gv.notebook.settings.ConfigurationManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {

    private final static String LOGIN_PARAMETER = "login";
    private final static String PASSWORD_PARAMETER = "password";
    private final static String MAIN_PAGE = "path.page.main";
    private final static String ERROR_PAGE = "path.page.error";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String pagePath = processRequest(request, response);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagePath);
        dispatcher.forward(request, response);
    }

    private String processRequest(HttpServletRequest request, HttpServletResponse response){
        String pagePath = ConfigurationManager.getProperty(ERROR_PAGE);
        String login = request.getParameter(LOGIN_PARAMETER);
        String password = request.getParameter(PASSWORD_PARAMETER);
        UserValidator validator = new UserValidator();
        if(validator.checkLogin(login, password)){
            pagePath = ConfigurationManager.getProperty(MAIN_PAGE);
        }
        return pagePath;
    }
}
