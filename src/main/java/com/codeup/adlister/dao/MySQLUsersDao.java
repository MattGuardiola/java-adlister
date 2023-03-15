package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users{

    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }


    @Override
    public User findByUsername(String username) {
        try {
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM ymir_matt.users WHERE username = ?");
            pstmt.setString(1,username);
            pstmt.executeQuery();
            ResultSet rs = pstmt.getResultSet();
            rs.next();
            User user = new User(rs.getLong("id"), rs.getString("username"), rs.getString("email"), rs.getString("password"));
            return user;
        } catch (SQLException e) {
            throw new RuntimeException("THEY FLY NOW.", e);
        }
    }

    @Override
    public Long insert(User user) {
        String insertQuery = "INSERT INTO ymir_matt.users(first_name, last_name, username, email, password) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, user.getFirstname());
            pstmt.setString(2, user.getLastname());
            pstmt.setString(3, user.getUsername());
            pstmt.setString(4, user.getEmail());
            pstmt.setString(5, user.getPassword());
            pstmt.executeUpdate();

            ResultSet rs = pstmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user.", e);
        }
    }
}
