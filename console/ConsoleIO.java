package console;

import java.util.Scanner; 
/**
 * Write a description of class ConsoleIO here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConsoleIO
{
  private static Scanner sc = new Scanner(System.in); 
  
  public static void println(String s) {
	  
      System.out.println(s); 
    
    }
    
  public static void println(char s ) {
   
      System.out.println(s); 
    
    }    
    
  public static void println() {
   
      System.out.println(); 
    
    }  
  
  public static void print(String s) {
   
      System.out.print(s); 
    
    }
    
  public static void print(char s) {
   
      System.out.print(s); 
    
    }
    
  public static String getStringInput() {
      
      String s = sc.nextLine(); 
      return s;
    
    }  
    
  public static int getIntInput() {
    
      int x = sc.nextInt(); 
      return x; 
    
    }  
    
  public static void clearScreen(){
     System.out.print('\u000C');
    }  
    
  public static void displayLine() {
       
        System.out.println("\n-----------------------------------------\n");
        
        
    }
    
    
}