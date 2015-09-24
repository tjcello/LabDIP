
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;


public class ConsoleWriter implements Writer {
	
	
     
@Override 
    public void Message( String line ) {
            JOptionPane.showMessageDialog(null, line);
	}
}
