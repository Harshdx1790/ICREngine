/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imageConverter;


//We need the library below to write the final PDF file which has our image converted to PDF
import java.io.FileOutputStream;
//The image class which will hold the input image
import com.itextpdf.text.Image;
//PdfWriter object to write the PDF document
import com.itextpdf.text.pdf.PdfWriter;
//Document object to add logical image files to PDF
import com.itextpdf.text.Document;

/**
 *
 * @author harshvardhan.solanki
 */

public class imageConverter {
 public static void main(String[] args) {

		try{
    //Create Document Object
    Document convertJpgToPdf=new Document();
    //Create PdfWriter for Document to hold physical file
    PdfWriter.getInstance(convertJpgToPdf, new FileOutputStream("C:\\Users\\HARSHVARDHAN.SOLANKI\\Desktop\\ConvertImagetoPDF.pdf"));
    convertJpgToPdf.open();
    //Get the input image to Convert to PDF
    Image convertJpg=Image.getInstance("C:\\Users\\HARSHVARDHAN.SOLANKI\\Desktop\\text2.jpg");
    //Add image to Document
    convertJpgToPdf.add(convertJpg);
    //Close Document
    convertJpgToPdf.close();
    System.out.println("Successfully Converted JPG to PDF in iText");
}
catch (Exception i1){
    i1.printStackTrace();
}

	}   
}
