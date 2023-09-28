package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmSwing_2 extends JFrame {

	private JPanel panel;
	private JLabel lblNombre;
	private JLabel lblSaludo;

	private JTextField textNombre;
	private JButton btnAceptar; 

	/**
	 * Create the frame.
	 */
	public FrmSwing_2() {
		setTitle("Hola Mundo desde Swing 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //permite que cuando le de a la x roja se cierre
		setBounds(100, 100, 450, 300); //orden de parametros: x,y, tamaño formulario
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		definirVentana();
		definirEventos();
		this.setVisible(true);
	}

	private void definirEventos() {
		// TODO Auto-generated method stub
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre=textNombre.getText();
				lblSaludo.setText("Bienvenido "+nombre);
			}
		});
	}

	private void definirVentana() {
		// TODO Auto-generated method stub
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(23, 37, 39, 14);
		panel.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(72, 34, 96, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		
		btnAceptar.setBounds(192, 33, 89, 23);
		panel.add(btnAceptar);
		
		lblSaludo = new JLabel("");
		lblSaludo.setBounds(65, 96, 216, 14);
		panel.add(lblSaludo);
	}
}
