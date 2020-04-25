package APMiniLab;

import console.ConsoleIO;
 
public class Sort {

	public static int[] insertionSort(int[] x) { // Used Mr.Ms code
		ConsoleIO.println("Insertion Sort - ");
		ConsoleIO.println("This is the original set: ");
		ConsoleIO.println(x);
		ConsoleIO.println("This is the sorted set: ");
		 for (int i = 0; i < x.length - 1; i++) {
	            int k = i + 1;
	            int swap = x[k];            
	            while( k > 0 && swap < x[k-1]) {
	                x[k] = x[k-1];
	                k--;	               
	            }
	            x[k] = swap;
	            
	        }	      
		 ConsoleIO.println(x);
		return x;
	}
	
	public static int[] bubbleSort(int[] x) { //Used Mr.Ms code
		ConsoleIO.println("Bubble Sort - ");
		ConsoleIO.println("This is the original set: ");
		ConsoleIO.println(x);
		ConsoleIO.println("This is the sorted set: ");
		
		  for (int i = 0; i < x.length - 1; i++) {
	          
	            for (int k = 1; k < x.length - i; k++) {
	                
	                if (x[k-1] > x[k]) {
	                    int swap = x[k];
	                    x[k] = x[k-1];
	                    x[k-1] = swap;
	               
	                }
	            
	            }
	            
	        }
		  
		  ConsoleIO.println(x);
	        return x;
		
	}
	
	public static int[] selectionSort(int[] x) { 
		ConsoleIO.println("Selection Sort - ");
		ConsoleIO.println("This is the original set: ");
		ConsoleIO.println(x);
		ConsoleIO.println("This is the sorted set: ");
		
		int i, j, min, temp;
    	
    	for(i = 0; i<x.length-1; i++) //traverse through whole list (except the last number)
    	{
    		min = i;
    		
    		for(j = i+1; j<x.length; j++) //j is always one ahead of i
    		{
    			if(x[j] < x[min])
    			{
    				min = j;
    			}
    		}
    		
    		temp =  x[i];
    		x[i]= x[min];
    		x[min] = temp;
    		
    		
    	}
    	ConsoleIO.println(x);
		return x;
	}
	
}
