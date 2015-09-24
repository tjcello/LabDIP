
package dip.lab3.student.solution1;


public class Startup {

	public static void main(String[] args) {
		
		Reader read = new KeyboardReader();
		Writer write = new ConsoleWriter();
		Writer write2 = new ConsoleWriter();
		ReadingWritingService copier = new ReadingWritingService(read, write);
		copier.copy();
		ReadingWritingService copier2 = new ReadingWritingService(read, write2);
		copier2.copy();
		// Send end of program message
		System.out.println("Program ended. Line of reader input copied successfully to writer output.");
	}
		
		
		
	}

