package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrmSwing_1 extends JFrame {

	private JPanel panel;
	

	/**
	 * Create the frame.
	 */
	public FrmSwing_1() {
		setTitle("Hola Mundo Alejandro en Swing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(new BorderLayout(0, 0));
		setContentPane(panel);
		this.setVisible(true);//esto se añade manualmente para poder verlo
	}

}
