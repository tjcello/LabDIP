/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author tduwe
 */
public class ReadingWritingService {
    
    private Reader read;
    private Writer write;
    
    ReadingWritingService( Reader read, Writer write ) {
		this.read = read;
		this.write = write;
	}
    
    public void copy() {
            String line = read.ReadOut();
            write.Message( line );
	}
    
}
