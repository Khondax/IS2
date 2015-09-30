package Pruebasclase;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khondax
 */
public class Main {
    public static void main(String[] args) {
   
        System.out.println("Resolución de ecuaciones de 2º grado");
        System.out.println("Introducir el valor de 'a': ");
        Scanner input = new Scanner (System.in);
        double a = input.nextDouble();
        
        System.out.println("Introducir el valor de 'b': ");
        double b = input.nextDouble();
       
        System.out.println("Introducir el valor de 'c': ");
        double c = input.nextDouble();
        
        double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / ( 2 * a);
        double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / ( 2 * a);
        
        System.out.println("La solucion a la ecuacion es: ");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        
    }
    
}
