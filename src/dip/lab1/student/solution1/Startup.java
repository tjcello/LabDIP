package dip.lab1.student.solution1;

import java.text.NumberFormat;

/**
import java.text.NumberFormat;

/**
 * Just a start and test class for this program. You may modify this class
 * in any way you see fit.
 *
 * @author jlombardo
 */
public class Startup {

    public static void main(String[] args) {
        /*
         * We'll just use this class for testing our ccde.
         * We'll provide input and get some output...
         */

        //Low-level modules
        Employee emp1 = new HourlyEmployee(10.50, 2081);
        Employee emp2 = new SalariedEmployee(55000, 1250);
        Employee emp3 = new SalariedEmployee(90000,0);
        
        
        HRService hr = new HRService();
        Employee employees[] = {emp1, emp2, emp3};

        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(emp1.getAnnualWages());
        
        for(int i=0; i < employees.length; i++) {
            System.out.println("Employee " + (i+1) + " compensation:" +
            nf.format(hr.getAnnualCompensationForEmployee(employees[i])));
        }
       
    }

}
