/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Holamundo;

import java.util.Calendar;
//import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Khondax
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        
        Person p1;
        
        Calendar f1;
        f1 = GregorianCalendar.getInstance();
        f1.set(1994, 10, 16);
        
        p1 = new Person ("Miguel", "Gonzalez Villa", f1);
        System.out.println(p1.getBirthday());
        System.out.println(p1.getFullName());
        System.out.println(p1.getAge());
                
    }
            
    
}
