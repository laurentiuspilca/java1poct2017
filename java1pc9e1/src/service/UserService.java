/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.UserDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;
import manager.DBManager;
import model.User;

/**
 *
 * @author student
 */
public class UserService {

    public boolean register(User user) {
        try (Connection con = DBManager.getInstance().getConnection()) {
            UserDao userDao = new UserDao(con);
            Optional<User> dbUser = userDao.findUser(user.getUsername());

            if (!dbUser.isPresent()) {
                userDao.addUser(user);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Optional<User> login(User user) {
        try (Connection con = DBManager.getInstance().getConnection()) {
            UserDao userDao = new UserDao(con);
            Optional<User> dbUser = userDao.findUser(user.getUsername());
        
            if (dbUser.isPresent()) {
                String password = dbUser
                        .map(u -> u.getPassword())
                        .orElseThrow(RuntimeException::new);
                if (password.equals(user.getPassword())) {
                    return dbUser;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return Optional.empty();
    }
}
