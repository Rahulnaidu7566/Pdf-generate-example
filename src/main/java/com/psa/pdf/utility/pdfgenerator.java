package com.psa.pdf.utility;

import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class pdfgenerator {
    private static final String FILE_NAME = "C:\\newcode 2\\pdf_generate_example\\pdfdocx\\sample2.pdf";

    public void writeUsingIText() {

        Document document = new Document();

        try {

            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

            //open
            document.open();

            Paragraph p = new Paragraph();
            p.add("Ticket1");
            p.setAlignment(Element.ALIGN_CENTER);

            document.add(p);


            Font f = new Font();
            f.setStyle(Font.BOLD);
            f.setSize(8);

            document.add(new Paragraph("Ticket details", f));
                PdfPTable table = new PdfPTable(2);
                
                PdfPCell cell1 = new PdfPCell (new Paragraph ("Cell 1"));
                PdfPCell cell2 = new PdfPCell (new Paragraph ("Cell 2"));
                cell1.setColspan(2);
                
                table.addCell(cell1);
                table.addCell(cell2);
           
                
                document.add(table);
            //close
            document.close();

            System.out.println("Done");
         
        } catch (Exception e) {
            e.printStackTrace();
       
    }
    }
}

