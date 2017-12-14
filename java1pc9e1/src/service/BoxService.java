/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.BoxDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import manager.DBManager;
import model.Box;
import model.User;

/**
 *
 * @author student
 */
public class BoxService {
    
    public void addBox(Box box) {
        try (Connection con = DBManager.getInstance().getConnection()) {
            BoxDao boxDao = new BoxDao(con);
            boxDao.addBox(box);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Box> getAll() {
        try (Connection con = DBManager.getInstance().getConnection()) {
            BoxDao boxDao = new BoxDao(con);
            return boxDao.getAllBoxes();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
    
    public List<Box> getForUser(User user) {
        try (Connection con = DBManager.getInstance().getConnection()) {
            BoxDao boxDao = new BoxDao(con);
            return boxDao.getUserBoxes(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
