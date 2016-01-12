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
