package miniLabs;
/**
 *
 * 
 * @author 
 * @version 
 */ 
import java.util.ArrayList;

import menuControl.Menu;

import java.util.*;
import java.io.*;

public class MethodSearch
{   public static void main (String[] args)
    {
        //tip: call the scan method and pass in method name to be searched
        
    }   
    
    public static void scan (String method)
    {	//declare scanner "sc"
    	Scanner sc;
        //declare an ArrayList (called lines) in which each element contains a line from file
    	ArrayList<String> lines = new ArrayList<String>();
        //declare an ArrayList (called methods) where methods matched will be added to 
    	ArrayList<String> methods = new ArrayList<String>();
        
        try 
        {	//instantiate scanner and add java file to be scanned (file already in project)
        	sc = new Scanner(new File("PigLatinator.java"));
        	while(sc.hasNextLine())
        	{
        	     lines.add(sc.nextLine());
        	}
            //Use a while loop in which Scanner reads line by line and adds to the ArrayList Lines

            
            //Every word in each line is compared to passed in method
           for (int j=0; j<lines.size(); j++) 
           {
                //splitting array list by spaces. splitted[] contains words from each line
                String[] splitted = lines.get(j).split(" |\\(");
                
                int length = splitted.length;
                for(int i = 0 ; i<length; i++)
                {	/* using if statements and ".contains("")", add all matched methods to 
                	   the array list methods.
                	   
                	   take into consideration the case (upper or lower), but you are not 
                	   required to check for curly brackets, parenthesis, or dots, unless 
                	   you want to :) 
                	*/
                    
                }
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File Not found");
        }
        
        Menu.main();
        //GUI.gui(methods);

        //sc.close(); 
    }
}