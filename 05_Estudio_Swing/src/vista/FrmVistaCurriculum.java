package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class FrmVistaCurriculum extends JFrame {

	private JPanel panel;
	private JTextArea textAreaFinal;
	
	public FrmVistaCurriculum(String curriculum) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel);
		panel.setLayout(null);
		
		DefinirVentana(curriculum);
		DefinirEventos(curriculum);
		setVisible(true);
	}

	private void DefinirVentana(String curriculum) {
		textAreaFinal = new JTextArea();
		textAreaFinal.setBounds(41, 25, 366, 211);
		panel.add(textAreaFinal);
		
	}
	
	private void DefinirEventos(String curriculum) {
		textAreaFinal.setText(curriculum);
		
	}
}