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
public class Histogram <T> {
    
    private final T[] array;

    public Histogram(T[] array) {
        this.array = array;
    }
    
    public HashMap<T, Integer> getHisto (){
        
        HashMap<T, Integer> histogram = new HashMap<>();
        
        for (int i = 0; i < array.length; i++) {
            if (!histogram.containsKey(array[i])){
                histogram.put(array[i], 0);
            }
            
            histogram.put(array[i], histogram.get(array[i]) + 1);
        }
        
        return histogram;
    }
    
}
