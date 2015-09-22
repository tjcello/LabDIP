package dip.lab2.student.solution1;

// An useful import if you need it.
import java.text.NumberFormat;


/*
 * 
 * @author Thomas
 */
public class Startup {
     
    public static void main(String[] args) {
        
        Service tipService = new Service(new FoodServiceTipCalculator(ServiceQuality.GOOD, 100));
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(tipService.getTip()));
        
    }

}
