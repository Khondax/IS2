package Kata6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;


public class Kata6 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        System.out.println("Inicio");
        
        String nameFile = "E:\\Mis documentos\\Miguel\\Universidad\\Asignaturas\\IS2\\DATA\\emaildata.txt";
        
        ArrayList<Person> mailArray = MailListReader.reader(nameFile);
        
        //Histogram<String> histo = MailHistogramBuilder.build(mailArray);
        
        //new HistogramDisplay(histo).execute();
        
        System.out.println("Fin");
    }

}
