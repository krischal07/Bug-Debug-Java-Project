/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author kr
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QADatabase {
    public static void insertQA(String teacherName, String question, String answer) {
        String sql = "INSERT INTO qa (teacher_name, question, answer) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, teacherName);
            pstmt.setString(2, question);
            pstmt.setString(3, answer);
           
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
