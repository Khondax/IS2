package Kata4;

import java.util.ArrayList;

/**
 *
 * @author Khondax
 */
public class MailHistogramBuilder {
    
    public static Histogram <String> build (ArrayList <String> mailList){
        Histogram<String> histogram =  new Histogram<>();
        
        for (String mail : mailList) {
            histogram.increment(new Mail(mail).getDominio());
        }
        return histogram;
    }
    
    
    
}
