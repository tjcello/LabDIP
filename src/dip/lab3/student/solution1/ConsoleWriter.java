
package dip.lab3.student.solution1;


public class ConsoleWriter implements Writer {
	
	
	public void writeln( String line ) {
            System.out.println("Here is the stuff you entered");
            System.out.println( line );
	}
}
