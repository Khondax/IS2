/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

/**
 *
 * @author Khondax
 */
public class CalculaHistograma {
    
    public static <T> Histogram <T> calcHisto (T [] vector){
        
        Histogram <T> histo = new Histogram <>();
        
        for (T key : vector) {
            histo.incrementa(key);
        }
        
        return histo;
    }
    
}
