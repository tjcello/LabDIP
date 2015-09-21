package dip.lab1.student.solution1;


public class Startup {

    public static void main(String[] args) {
    
        Employee emp1 = new HourlyEmployee(10.50, 2081);
        Employee emp2 = new SalariedEmployee(55000, 1250);
        Employee emp3 = new SalariedEmployee(90000,0);
        
        
        HRService humanResources = new HRService();
        Employee employees[] = {emp1, emp2, emp3};

        
        
        System.out.println(emp1.getAnnualWages());
        
        
        for(int i=0; i < employees.length; i++) {
            System.out.println("Employee " + (i+1) + " compensation:" + 
                    (humanResources.getAnnualCompensationForEmployee(employees[i])));
        }
       
    }

}
