package util;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.File;
import java.util.List;

public class PDFGenerator {
    public static void generatePDF(String dest, List<String[]> data) {
        try {
            File file = new File(dest);
            file.getParentFile().mkdirs();
            PdfWriter writer = new PdfWriter(file);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            Table table = new Table(data.get(0).length);
            for (String[] row : data) {
                for (String cell : row) {
                    table.addCell(cell);
                }
            }

            document.add(new Paragraph("QA Data"));
            document.add(table);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
