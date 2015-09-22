
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;


public class ConsoleWriter implements Writer {
	
	
        @Override
	public void writeln( String line ) {
            System.out.println("Here is the stuff you entered");
            System.out.println(line);
            JOptionPane.showMessageDialog(null, line);
	}
}
