import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class linkedListLab extends menuControl {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel projTitle;
	JLabel projDescription;
	
	public linkedListLab() {
		
	}
	
	public void run() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		projTitle = new JLabel("Linked List Lab: ");
		projTitle.setBounds(15, 0, 250, 25);
		contentPane.add(projTitle);
		
		projDescription = new JLabel("Add project idea/description here");
		projDescription.setBounds(15, 0, 250, 60);
		contentPane.add(projDescription);
	}
}
