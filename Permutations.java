import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Permutations extends menuControl {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel contentPane;
	JTextField list1;
	JTextField list2;
	JTextField list3;
	JTextField list4;
	JTextField list5;
	JTextField list6;
	JTextField list7;
	JTextField list8;
	JTextField list9;
	JTextField list10;
	JLabel title; 
	private String n;
	
	public void run() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		/*
		JLabel l1 = new JLabel(nextPermutation());
		l1.setBounds(5, 100, 500, 50);
		contentPane.add(l1);
		*/
		title = new JLabel("Here are 10 random Permutations: ");
		title.setBounds(6, 0, 284, 26);
		contentPane.add(title);
		
		setList();
		contentPane.add(list1);
		contentPane.add(list2);
		contentPane.add(list3);
		contentPane.add(list4);
		contentPane.add(list5);
		contentPane.add(list6);
		contentPane.add(list7);
		contentPane.add(list8);
		contentPane.add(list9);
		contentPane.add(list10); 
	}
	
	private String nextPermutation() {
        int max = 9; 
        int min = 0; 
        int randomNumber = 0; 
        int a = 0; 
        ArrayList<Integer> x = new ArrayList(); 
        ArrayList<Integer> preset = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9,10)); 
        
        for(int i = 0;  i<10 ; i++) {
        a = (int)(Math.random()*((max-min)+1))+min;
        randomNumber = preset.get(a);
        x.add(randomNumber); 
    }
        String s = (" " + x.get(0) + ", " + x.get(1) +", " + x.get(2) +", " + x.get(3) +", " + x.get(4) +", " + x.get(5) +", " + x.get(6) +", " + x.get(7) +", " + x.get(8) +", " + x.get(9) +" ");
        return s; 
	}
	
	private void setList() {
		
		list1 = new JTextField(); 
		list1.setText(nextPermutation());
		list1.setEditable(false);
		list1.setColumns(10);
		list1.setBounds(5, 100, 200, 20);
		
		list2 = new JTextField(); 
		list2.setText(nextPermutation());
		list2.setEditable(false);
		list2.setColumns(10);
		list2.setBounds(5, 130, 200, 20);
		
		list3 = new JTextField(); 
		list3.setText(nextPermutation());
		list3.setEditable(false);
		list3.setColumns(10);
		list3.setBounds(5, 160, 200, 20);
		
		list4 = new JTextField(); 
		list4.setText(nextPermutation());
		list4.setEditable(false);
		list4.setColumns(10);
		list4.setBounds(5, 190, 200, 20);
		
		list5 = new JTextField(); 
		list5.setText(nextPermutation());
		list5.setEditable(false);
		list5.setColumns(10);
		list5.setBounds(5, 220, 200, 20);
		
		list6 = new JTextField(); 
		list6.setText(nextPermutation());
		list6.setEditable(false);
		list6.setColumns(10);
		list6.setBounds(5, 250, 200, 20);
		
		list7 = new JTextField(); 
		list7.setText(nextPermutation());
		list7.setEditable(false);
		list7.setColumns(10);
		list7.setBounds(5, 280, 200, 20);
		
		list8 = new JTextField(); 
		list8.setText(nextPermutation());
		list8.setEditable(false);
		list8.setColumns(10);
		list8.setBounds(5, 310, 200, 20);
		
		list9 = new JTextField(); 
		list9.setText(nextPermutation());
		list9.setEditable(false);
		list9.setColumns(10);
		list9.setBounds(5, 340, 200, 20);
		
		list10 = new JTextField(); 
		list10.setText(nextPermutation());
		list10.setEditable(false);
		list10.setColumns(10);
		list10.setBounds(5, 370, 200, 20);
		
		
	}
}