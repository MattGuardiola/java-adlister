package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile
        String newFirstName = request.getParameter("newfirstname");
        String newLastName = request.getParameter("newlastname");
        String newUsername = request.getParameter("newusername");
        String newPassword = request.getParameter("newpassword");
        String newEmail = request.getParameter("newemail");
        User newUser = new User(newFirstName, newLastName, newUsername, newEmail, newPassword);
        DaoFactory.getUsersDao().insert(newUser);
        request.getSession().setAttribute("user", newUsername);
        response.sendRedirect("/profile");
    }
}
