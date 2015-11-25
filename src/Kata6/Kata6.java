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
        
        ArrayList<Person> arrayMail = MailListReader.reader(nameFile);
        
        HistogramBuilder <Person> builder = new HistogramBuilder(arrayMail);
        
        Histogram <String> domains = builder.build(new Attribute<Person, String>() {

            @Override
            public String get(Person item) {
                return item.getMail().split("@")[1];
            }
        });
        
        Histogram <Character> letters = builder.build(new Attribute<Person, Character>() {

            @Override
            public Character get(Person item) {
                return item.getMail().charAt(0);
            }
        });
        
        //Histogram<String> histo = MailHistogramBuilder.build(mailArray);
        
        //new HistogramDisplay(histo).execute();
        
        new HistogramDisplay(domains, "DOMINIOS").execute();
        new HistogramDisplay(letters, "CARACTER").execute();
        
        System.out.println("Fin");
    }

}
