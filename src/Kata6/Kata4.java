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


public class Kata4 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String path = "E:\\Mis documentos\\Miguel\\Universidad\\Asignaturas";
        File file = new File (path);
        
        String from = "E:\\Descargas\\6005794.pdf";
        String to = "E:\\Descargas\\6005794(copia).pdf";
        
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(new File (from)));
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(new File(to)));
        
        Date date =  new Date();
        
        byte [] buffer = new byte[1024];
        
        while (true){
            int read = input.read(buffer);
            if (read < 0) break;
            output.write(buffer);
            
        }
        
        System.out.println(new Date().getTime() - date.getTime() + "msg" );
        
        input.close();
        output.flush();
        output.close();
        
    }

}
