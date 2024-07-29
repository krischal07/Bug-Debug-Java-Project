package util;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLPDFGenerator {
    public static void generatePDF(String dest) {
        String url = "jdbc:mysql://localhost:3306/teacherreview"; // Update with your database name
        String user = "root"; // Update with your username
        String password = "root"; // Update with your password

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, teacher_name, question, answer FROM qa")) {

            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(dest));
            document.open();

            PdfPTable table = new PdfPTable(4);
            String[] headers = {"ID", "Teacher Name", "Question", "Answer"};

            for (String header : headers) {
                PdfPCell cell = new PdfPCell();
                cell.addElement(new com.itextpdf.text.Paragraph(header));
                table.addCell(cell);
            }

            while (rs.next()) {
                table.addCell(rs.getString("id"));
                table.addCell(rs.getString("teacher_name"));
                table.addCell(rs.getString("question"));
                table.addCell(rs.getString("answer"));
            }

            document.add(table);
            document.close();

        } catch (SQLException | DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
