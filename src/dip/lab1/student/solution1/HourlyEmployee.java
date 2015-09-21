package dip.lab1.student.solution1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {
    private double hourlyRate;
    private double totalHrsForYear;
    
    /** default constructor. Is this the best way to go? */
    public HourlyEmployee() {}

    /**
     * Convenience constructor. Is this the best way to go?
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }
    
    @Override
     public double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0 || hourlyRate > 500){
            throw new IllegalArgumentException();
    }
    }
    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    
    public final void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear > 2080) {
            System.out.println("You have overtime, good job");
        } else if (totalHrsForYear < 1) {
            System.out.println("You have not worked slacker");
            
        }
        this.totalHrsForYear = totalHrsForYear;
    }    

}
