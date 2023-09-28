package vista;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class FrmSwing_5 extends JFrame {

	private JPanel panel;
	private JLabel lblEtiq1,lblEtiq2,lblEtiq3,lblEtiq4;

	/**
	 * Create the frame.
	 */
	public FrmSwing_5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(panel);
		panel.setLayout(new GridLayout(2,2,0,0));
		
		lblEtiq1 = new JLabel("Etiqueta 1");
		panel.add(lblEtiq1);
		
		lblEtiq2 = new JLabel("Etiqueta 2");
		lblEtiq2.setFont(new Font("SansSerif", Font.BOLD, 18));
		panel.add(lblEtiq2);
		
		// Icon imagen =new ImageIcon("furbo.jpg");
		lblEtiq3 = new JLabel(new ImageIcon("C:\\Users\\AlejandroGR\\Documents\\workspace\\05_Estudio_Swing\\furbo.jpg"), SwingConstants.CENTER);
		lblEtiq3.setVerticalTextPosition(SwingConstants.TOP);
		panel.add(lblEtiq3);
		
		lblEtiq4 = new JLabel("Etiqueta 4");
		lblEtiq4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblEtiq4);
		definirVentana();
		setVisible(true);
		
	}
	private void definirVentana() {
		// TODO Auto-generated method stub
		
	}

}
