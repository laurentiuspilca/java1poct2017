/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Box;
import model.User;

/**
 *
 * @author student
 */
public class BoxDao {

    private Connection con;

    public BoxDao(Connection con) {
        this.con = con;
    }

    public void addBox(Box box) throws SQLException {
        String sql = "INSERT INTO boxes VALUES (NULL,?,?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, box.getCode());
            stmt.setDouble(2, box.getKg());
            stmt.setInt(3, box.getUser().getId());
            stmt.executeUpdate();
        }
    }

    public List<Box> getAllBoxes() throws SQLException {
        String sql = "SELECT * FROM boxes";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            return getBoxListFromResultSet(stmt);
        }
    }

    public List<Box> getUserBoxes(User user) throws SQLException {
        String sql = "SELECT * FROM boxes WHERE user = ?";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, user.getId());
            return getBoxListFromResultSet(stmt);
        }
    }

    private List<Box> getBoxListFromResultSet(final PreparedStatement stmt) throws SQLException {
        List<Box> boxes = new ArrayList<>();

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Box box = new Box();
            box.setId(rs.getInt("id"));
            box.setCode(rs.getString("code"));
            box.setKg(rs.getDouble("kg"));
            box.setUser(new User());
            box.getUser().setId(rs.getInt("user"));
            boxes.add(box);
        }

        return boxes;
    }
}
