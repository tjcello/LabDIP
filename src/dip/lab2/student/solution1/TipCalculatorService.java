package dip.lab2.student.solution1;

/**
 * @author Thomas
 */
public class TipCalculatorService {

    private TipCalculator tipCalc;

    public TipCalculatorService() {
    }

    public TipCalculatorService(TipCalculator tipCalc) {
        this.tipCalc = tipCalc;
    }

    public final TipCalculator getTipCalc() {
        return tipCalc;
    }

    public final void setTipCalc(TipCalculator tipCalc) {
        this.tipCalc = tipCalc;
    }

    public final double getTip() {
        return tipCalc.getTip();
    }
    
    
}
