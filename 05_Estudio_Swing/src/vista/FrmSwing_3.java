package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmSwing_3 extends JFrame implements ActionListener{

	private JPanel panel;
	private JButton btnAceptar, btnCancelar;
	private JLabel lblEvent;
	/**
	 * Create the frame.
	 */
	public FrmSwing_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		setContentPane(panel);
		
		
		
		
		definirVentana();
		definirEventos();
		setVisible(true);
	}


	private void definirEventos() {
		// TODO Auto-generated method stub
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblEvent.setText("ACEPTAR");
				
			}
		});
		
		btnCancelar.addActionListener(this);
	}


	private void definirVentana() {
		// TODO Auto-generated method stub
		btnAceptar = new JButton("Aceptar");
		
		btnAceptar.setBounds(37, 58, 89, 23);
		panel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(213, 58, 89, 23);
		panel.add(btnCancelar);
		
		lblEvent = new JLabel("Eventos");
		lblEvent.setBounds(101, 130, 181, 14);
		panel.add(lblEvent);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		lblEvent.setText("CANCELAR");
	}
}
