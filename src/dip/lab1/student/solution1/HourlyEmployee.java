package dip.lab1.student.solution1;

/*
 * @author Thomas Duwe
 */
public class HourlyEmployee implements Employee {
    private double hourlyRate;
    private double totalHrsForYear;
    
   
    public HourlyEmployee() {}

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
