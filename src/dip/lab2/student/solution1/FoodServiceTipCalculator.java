package dip.lab2.student.solution1;

/**
 * @author Thomas Duwe
 */
public class FoodServiceTipCalculator implements TipCalculator {
    private final double minBill = 10.00;
    private final String billEntryErr =
            "Error: bill must be greater than or equal to " + minBill;
    private final double goodRate = 0.20;
    private final double fairRate = 0.15;
    private final double poorRate = 0.10;

    private double bill;
   
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    
    @Override
    public final double getTip() {
        double tip = 0.00; 

        switch(serviceQuality) {
            case GOOD:
                tip = bill * goodRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case POOR:
                tip = bill * poorRate;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < minBill) {
            throw new IllegalArgumentException(billEntryErr);
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        serviceQuality = q;
    }

    

}
