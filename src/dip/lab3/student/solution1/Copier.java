
package dip.lab3.student.solution1;


public class Copier {
	
	private Reader reader;
	private Writer writer;
	

	public Copier( Reader reader, Writer writer ) {
		this.reader = reader;
		this.writer = writer;
	}

	public void copy() {
            String line = reader.readln();
            writer.writeln( line );
	}
}
