package admin;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.Paragraph;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RatingPDFGenerator {
    public static void generatePDF(String dest) {
        String url = "jdbc:mysql://localhost:3306/teacherreview"; // Update with your database name
        String user = "root"; // Update with your username
        String password = "root"; // Update with your password

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT rid, teachername, star FROM ratings")) {

            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(dest));
            document.open();

            PdfPTable table = new PdfPTable(3); // Correct column count
            String[] headers = {"ID", "Teacher Name", "Rating"};

            for (String header : headers) {
                PdfPCell cell = new PdfPCell(new Paragraph(header));
                table.addCell(cell);
            }

            while (rs.next()) {
                table.addCell(rs.getString("rid"));
                table.addCell(rs.getString("teachername"));
                table.addCell(String.valueOf(rs.getInt("star"))); 
            }

            document.add(table);
            document.close();

        } catch (SQLException | DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
