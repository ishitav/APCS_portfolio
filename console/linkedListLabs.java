package console;

public class linkedListLabs {
	
	private StackMonthDemo md = new StackMonthDemo();
	
	public void run(){
		
		this.create();
		this.display();
		this.empty();
		
	}

	private void empty() {
		ConsoleIO.println("EmptyStack. ");
	
		for(int i = 0; i < 10; i++) {
		md.pop();
		ConsoleIO.print("Pop#" + i + ": "); 
		md.displayAll();
		}
		
	}

	private void display() {
	
		ConsoleIO.println("Print every member of the Stack. ");
		md.displayAll();
		
		
	}

	private void create() {
		ConsoleIO.println("Create the Stack and initialize it.");
	for(int i = 0; i <10; i++) {
		int days = 30;
		String month = "Month " + i;
		String season = "Spring";
		md.push(new Month(days, month, season));
		
	}
	
	
		
	}
	
}

