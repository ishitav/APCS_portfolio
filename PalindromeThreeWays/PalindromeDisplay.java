package PalindromeThreeWays;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import menuControl.menuControl;

public class PalindromeDisplay extends menuControl {

	private static final long serialVersionUID = 1L;
	JPanel contentPane;
	JTextField pinput;
	JTextField loop;
	JTextField recursive;
	JTextField lazy;
	PalindromeThreeWay ptw = new PalindromeThreeWay();
	
	
	public void run() {
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fp = new JLabel("Test your input: ");
		fp.setBounds(6, 0, 184, 26);
		contentPane.add(fp);
		
		pinput = new JTextField();
		pinput.setBounds(6, 21, 410, 26);
		contentPane.add(pinput);
		pinput.setColumns(10);
		
		JButton tp = new JButton("Test Palindrome");
		tp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				String palin = pinput.getText();
				if(palin.isEmpty())
				{
					loop.setText("No Input");
					recursive.setText("No Input");
					lazy.setText("No Input");
				}else {
					boolean isPalindrome = testString(palin, 1);
					//loop = new JTextField();
					loop.setText(printPalindrome(isPalindrome));
					
					 isPalindrome = testString(palin, 2);
					 //recursive = new JTextField();
					 recursive.setText(printPalindrome(isPalindrome));
						
					 
					 isPalindrome = testString(palin, 3);
					 //lazy = new JTextField();
					 lazy.setText(printPalindrome(isPalindrome));
				}
			}
		});
		
		tp.setBounds(152, 49, 145, 29);
		contentPane.add(tp);

		JLabel tp1 = new JLabel("Loop Palindrome: ");
		tp1.setBounds(6, 80, 184, 26);
		contentPane.add(tp1);

		
		//loop.setBounds(6, 82, 438, 47);'
		loop = new JTextField();
		loop.setEditable(false);
		loop.setBounds(6, 100, 410, 26);
		contentPane.add(loop);
		loop.setColumns(10);
		
		
		JLabel tp2 = new JLabel("Recursive Palindrome: ");
		tp2.setBounds(6, 130, 184, 26);
		contentPane.add(tp2);
		
		recursive = new JTextField();
		recursive.setEditable(false);
		recursive.setColumns(10);
		recursive.setBounds(6, 150, 410, 26);
		contentPane.add(recursive);

		JLabel tp3 = new JLabel("Lazy Palindrome: ");
		tp3.setBounds(6, 180, 184, 26);
		contentPane.add(tp3);
		
		lazy = new JTextField();
		lazy.setEditable(false);
		lazy.setColumns(10);
		lazy.setBounds(6, 200, 410, 26);
		contentPane.add(lazy);
		
	}
	
	private boolean testString(String a, int c) {
		switch(c) {
		case 1: 
			return ptw.loopPalindrome(a);
		case 2:
			return ptw.recursivePalindrome(a);
		case 3:
			return ptw.lazyPalindrome(a);
		default:
			return false;
		
		}
	}
		
	
	private String printPalindrome(boolean b) {
		if(b) {
			
		return "This is a palindrome";
		} else {
			return "This is not a palindrome";
			
		}
		
	}
} 