import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class menuControl extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuControl frame = new menuControl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public menuControl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Labs = new JMenu("Labs");
		menuBar.add(Labs);
		
	
		JMenuItem test = new JMenuItem("AP Test Encapsulation");
		test.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Test t = new Test();
				t.setVisible(true);
			}
		});
		Labs.add(test);
		
		JMenuItem ThreeWayPalindrome = new JMenuItem("Three Way Palindrome");
		ThreeWayPalindrome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PalindromeDisplay frame = new PalindromeDisplay();
				frame.setVisible(true);		
				
				frame.run();
			}
		});
		Labs.add(ThreeWayPalindrome);
		
		JMenuItem Permutations = new JMenuItem("Permutations");
		Permutations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Permutations frame = new Permutations();
				frame.setVisible(true);		
				
				frame.run();
			}
		});
		Labs.add(Permutations);
		
		JMenu NewMiniLabs = new JMenu("New Mini Labs");
		menuBar.add(NewMiniLabs);
		
		JMenuItem UILab = new JMenuItem("FileIO Lab");
		UILab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> al = new ArrayList();
				al.add("hasVow");
				al.add("begHasVow");
				al.add("remove1st");
				GUI guii = new GUI();
				guii.gui(al);
				//frame.setVisible(true);		
				
			}
		});
		NewMiniLabs.add(UILab);
		
		JMenuItem ListLab = new JMenuItem("SearchAlgo Lab");
		ListLab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoMiniLab frame = new algoMiniLab();
				//frame.setVisible(true);		
				
				algoMiniLab.run();
			}
		});
		NewMiniLabs.add(ListLab);
		
		JMenu Calculator = new JMenu("Calculator");
		menuBar.add(Calculator);
		
		JMenuItem mntmCalculator = new JMenuItem("Calculator");
		mntmCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator frame = new calculator();
				frame.setVisible(true);			
			}
		});
		Calculator.add(mntmCalculator);
		
	}
	
}