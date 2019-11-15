import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.DropMode;

public class algoMiniLab {

    private JFrame frame;
    private JTextField textField;
    private final Action Search = new SwingAction_2();
    private ArrayList<String> languages = new ArrayList<String>();
    JTextArea textArea = new JTextArea();

    /**
     * Create the application.
     */
    public static void run() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    algoMiniLab window = new algoMiniLab();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public algoMiniLab() {
        File input = new File("./languages.txt");
        
        try {
            Scanner scan = new Scanner(input);
            
            while(scan.hasNextLine()) { // essentially for line in file
                languages.add(scan.nextLine());
            }
        } catch (Exception e) {
            System.out.println("AN ERROR HAS OCCURRED");
        }
        
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JButton btnNewButton = new JButton("Search");
        btnNewButton.setAction(Search);
        btnNewButton.setBounds(335, 11, 89, 23);
        frame.getContentPane().add(btnNewButton);
        
        textField = new JTextField();
        textField.setBounds(10, 11, 315, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        textArea.setEditable(false);
        textArea.setBounds(10, 42, 414, 208);
        frame.getContentPane().add(textArea);
    }

    private class SwingAction_2 extends AbstractAction {
        public SwingAction_2() {
            putValue(NAME, "Search");
            putValue(SHORT_DESCRIPTION, "Search for element");
        }
        public void actionPerformed(ActionEvent e) {
        	//get String search from what user enters in text field and set an empty String to represent the display
            String searchInput = textField.getText();
            String output = "";
            
        	//write nested for loops to split languages ArrayList into Strings and then the Strings (representing lines) into Strings for each attribute (seperated by a tab, or \\t)
        	int x = 0;
            for(String a: languages) {
        		for(String individual: a.split("\\t")) {
        			if(individual.toLowerCase().contains(searchInput.toLowerCase())) {
        				
        			output += ("Line #:"+x+" - "+individual+"\n");
        			break;
        			}
        			
        		}
        		x++;
        		
        	}
            
        	//write if statement to compare search to each attribute, and add the language to the display string if it matches, along with a new line character
            
        	//clear text area and set it to the display String with .setText()
            textArea.setText("");
            textArea.append(output);
        }
    }
}