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
        
        Integer [] vector = {1,1,1,1,4,4,2,2,2,100};
        String[] vector1 = {"Ana", "Juan", "Pedro", "Ana", "Juan", "Ana"};
        
        Histogram <Integer> mihisto = CalculaHistograma.calcHisto(vector);
        Histogram <String> mihisto2 = CalculaHistograma.calcHisto(vector1);
        
        
        for (Object key : mihisto.keySet()) {
            System.out.println(key + "->" + mihisto.get(key));
            
        }
        
        for (Object key : mihisto2.keySet()) {
            System.out.println(key + "->" + mihisto2.get(key));
            
        }
        
    }
}