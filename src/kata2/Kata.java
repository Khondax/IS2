/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;

/**
 *
 * @author Khondax
 */
public class Kata {
    
    public static void main(String[] args) {
        int [] vector = {1,1,1,1,4,4,2,2,2,100};
        
        Histogram mihisto = new Histogram (vector);
        
        System.out.println(mihisto.getHisto());
        
    }
}