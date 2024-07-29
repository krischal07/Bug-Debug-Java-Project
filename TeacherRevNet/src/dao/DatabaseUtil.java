package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseUtil {
    public static List<String[]> getQAData() {
        List<String[]> data = new ArrayList<>();
        String query = "SELECT * FROM qa";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String[] row = new String[3];
                row[0] = rs.getString("id");
                row[1] = rs.getString("question");
                row[2] = rs.getString("answer");
                data.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }
}
