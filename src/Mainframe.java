import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Mainframe extends JFrame {
	
	private JTextArea textArea;
	private JButton btn;
	

	public Mainframe() {
		super("Swing 2");
		
		setLayout(new BorderLayout());
		
		textArea = new JTextArea();
		btn = new JButton("Click me");
		
		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		
		setSize(600,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}	
}
