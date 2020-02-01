package PalindromeThreeWays;
import java.util.ArrayList;

import console.ConsoleIO;

public class PalindromeThreeWay {

	private ArrayList<Character> pal = new ArrayList();
	private int size; 
	private int firstIndex = 0;
	private int lastIndex; 
	String palindrome = null; 
	
	public boolean loopPalindrome(String p) {
		palindrome = p; 
		pal.clear();
		p = p.toLowerCase();
        p = p.replaceAll("[^a-z]", ""); 
        
		this.storeReverse(p);
        boolean test = this.isPalindrome(p); 
		return test; 
	}
	
	public boolean recursivePalindrome(String p) {

		p = p.toLowerCase();
        p = p.replaceAll("[^a-z]", ""); 
        
		
		palindrome = p; 
		pal.clear();
	     //ConsoleIO.println("This is your simplified text: " + p); 
	     size = p.length(); 
	     lastIndex = (size -1); 
	     if(size == 0 || size == 1) 
	     return true; 
	     else {
	    	    //ConsoleIO.println(" Index First then last"+ firstIndex + " "+ lastIndex);
	         boolean s = test2(); 
	         return s;  } 
	}
	
	public boolean lazyPalindrome(String p) {
		
		palindrome = p; 
		pal.clear();
		

		p = p.toLowerCase();
        p = p.replaceAll("[^a-z]", ""); 
        
        String reverse = "";
		
		
    	for(int i = p.length() - 1; i >= 0; i--)
    	{
    	reverse = reverse + p.charAt(i);
    	}
    	
    	boolean palindrome = p.equals(reverse); 
    	if(palindrome) {
    	   return true;
    	   } else {
    	   
    	       return false;
    	   }
    	
            
           
        }
		//return true; 
		
	
	
	private void storeReverse(String pa) {
        char c = ' ';
        boolean doOnce = true;
        for(int x = pa.length(); x>=0; x--) {
        if(doOnce) {
        x= x-1;
        doOnce = false; 
        }
           c= pa.charAt(x);
           if(Character.isLetter(c)) {
           pal.add(c); 
        }
        }
	}
	
	private boolean isPalindrome(String a) {
        //System.out.println("Inside isPalindrome");
        int stringLength = a.length() -1; 
        //System.out.println("This is stringLength " + stringLength);
        for(int x=0;x<=stringLength;x++) {
            //System.out.println("inside for loop " + a.charAt(x) + " " + pal.indexOf(x)); 
            if(a.charAt(x) == pal.get(x)) {
            
            return true; 
            } else {
                return false; 
            }
        }
        
        return true; 
    }
	
	private boolean  test2() {
        
	     if(firstIndex > lastIndex || lastIndex == firstIndex) 
	        return true;
	     else {

	            //ConsoleIO.println("New Index First then last"+ firstIndex + " "+ lastIndex);
	         char a = palindrome.charAt(firstIndex);
	         char b = palindrome.charAt(lastIndex); 
	         ConsoleIO.println("Char A: " + a + " CharB: " + b);
	        if(a != b) {
	        return false;
	        } else {
	            firstIndex++;
	            lastIndex--;
	            //ConsoleIO.println("New Index First then last"+ firstIndex + " "+ lastIndex);
	            return test2(); 
	        }
	        
	        
	        }   
	     
	    
	    
	    }
}