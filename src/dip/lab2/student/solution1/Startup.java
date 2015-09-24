package dip.lab2.student.solution1;


import java.text.NumberFormat;


/*
 * 
 * @author Thomas
 */
public class Startup {
     
    public static void main(String[] args) {
        
        TipCalculatorService tipService = new TipCalculatorService(new FoodServiceTipCalculator(ServiceQuality.FAIR, 60));
        TipCalculator tips = new FoodServiceTipCalculator(ServiceQuality.GOOD, 90);
        TipCalculator baggage = new BaggageServiceTipCalculator(ServiceQuality.POOR, 60);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("Your tip was " + nf.format(tipService.getTip()));
//        System.out.println("Your second tip was " + nf.format(tips.getTip()));
//        System.out.println("You got " + nf.format(baggage.getTip()) + " for your baggage service " );
        
    }

}
