/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Holamundo;

import java.util.Date;

/**
 *
 * @author Khondax
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        
        Person p1;
        p1 = new Person ("Miguel", "Gonzalez Villa", new Date (94, 10, 16));
        System.out.println(p1.getBirthday());
        System.out.println(p1.getFullName());
        System.out.println(p1.getAge());
                
    }
            
    
}
