package APMiniLab;
import java.util.Random;

import console.*;

public class Main {

	public static void main(String[]args) {
		int[] a = Main.initialize();
		
		boolean cont = true;
		while(cont) {
		ConsoleIO.println("Which sort method would you like to try out on the set?\n(1)Bubble Sort \n(2)Selection Sort\n(3) Insertion Sort\n(4)Exit\nPlease write just the number below and hit enter.");
		int input = ConsoleIO.getIntInput();
		switch(input) {
		case 1: 
			Sort.bubbleSort(a);
			ConsoleIO.println("Hit enter to return to the main menu. ");
			ConsoleIO.getStringInput();
			ConsoleIO.getStringInput();
			
			break;
		case 2:
			Sort.selectionSort(a);
			ConsoleIO.println("Hit enter to return to the main menu. ");
			ConsoleIO.getStringInput();
			ConsoleIO.getStringInput();
			
			break;
		case 3: 
			Sort.insertionSort(a);
			ConsoleIO.println("Hit enter to return to the main menu. ");
			ConsoleIO.getStringInput();
			ConsoleIO.getStringInput();
			break;
		case 4:
			cont = false;
			break;
		default:
			ConsoleIO.println("The number you entered was not valid. Please try again.");
		}
		
		}
	}
	
	private static int[] initialize() { // This will initialize an array of 10 digits with random numbers from 0-99
	Random r = new Random();
	int[] a = new int[10];
      for (int i = 0; i < a.length; i++) {
         a[i] = r.nextInt(100); 
      }
      return a;
	}
}
