
package dip.lab2.student.solution1;

/**
 *
 * @author Thomas
 */

    public class Service {
    private TipCalculator tipCalc;
    public Service() {
    }

    public Service(TipCalculator tipCalc) {
        this.tipCalc = tipCalc;
    }

    /**
     *
     * @return tipCalc
     */
    public final TipCalculator getTipCalc() {
        return tipCalc;
    }

    /**
     *sets tipCalc to what is passed in
     * @param tipCalc
     */
    public final void setTipCalc(TipCalculator tipCalc) {
        this.tipCalc = tipCalc;
    }
    
    /**
     *
     * @return tip using the set tipCalc
     */
    public final double getTip(){
        return tipCalc.getTip();
    }
}

