package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class FrmSwing_4 extends JFrame {

	private JPanel panel;

	/**
	 * Create the frame.
	 */
	public FrmSwing_4() {
		//setResizable(false); //sirve para que no se redimensione la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(new BorderLayout(0,0));
		setContentPane(panel);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2, BorderLayout.EAST);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel.add(btnNewButton_3, BorderLayout.NORTH);
		
		JButton btnNewButton_4 = new JButton("New button");
		panel.add(btnNewButton_4, BorderLayout.SOUTH);
		setVisible(true);
	}

}
