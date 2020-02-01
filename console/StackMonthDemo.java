package console;

import java.util.ArrayList;

public class StackMonthDemo {
	//this class will actually be the "stack" that is being created of type Month
	ArrayList<Month> alM = new ArrayList<Month>();
	

	public StackMonthDemo() {
		
	}
	
	public void push(Month month) {
		//this method will add a month to the top of the stack
		alM.add(0, month);
	}
	
	public void pop() {
		//this method will remove the move from the top of the stack 
		alM.remove(0);
	}

	public void displayAll() {
		int l = alM.size();
		ConsoleIO.print("[ ");
		for(int x = 0; x < l; x ++) {
			String yay = alM.get(x).toString();
			
			ConsoleIO.print(yay);
			ConsoleIO.print(", ");
		}
		ConsoleIO.println(" ]");
	}

	public void empty() {
		alM.clear();
		
	}
	
	
}
	
	
	

