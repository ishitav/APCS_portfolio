package console;

public class Month {

	//Create inner class of type Month
	private int numberOfDays; //
	private String name;
	private String season;
	
	public Month(int days, String n, String szn) {
		numberOfDays = days;
		name = n;
		season = szn;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
}