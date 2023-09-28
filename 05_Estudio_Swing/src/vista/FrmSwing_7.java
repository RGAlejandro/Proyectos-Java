package vista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrmSwing_7 extends JFrame {

	private JPanel panel,panel_1;
	private JTextField textDescuento,textTotal,textImporte;
	private JButton btnCalcular;
	private int importe;
	private JLabel lblInformacion,lblTeclado,lblPropiedades,lblFormateo,lblImporte,lblIva,lblTotal;
	private JFormattedTextField formattedTextField;
	/**
	 * Create the frame.
	 */
	public FrmSwing_7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBounds(10, 37, 83, 93);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		definirVentana();
		definirEventos();
		setContentPane(panel);
		
		
		setVisible(true);
	}

	private void definirEventos() {
		// TODO Auto-generated method stub
		textImporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblInformacion.setText(e.getActionCommand());
				
				try {
					Integer x=0;
					importe=x.parseInt(e.getActionCommand());
					textDescuento.requestFocus();
				}catch (Exception e2) {
					// TODO: handle exception
					lblInformacion.setText("Introduzca un valor correcto");
					textImporte.setText("");
				}
			}
		});
		textDescuento.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
			@Override
			public void keyReleased(KeyEvent e) {
				lblTeclado.setText("Caracter: "+e.getKeyChar()+" Codigo :"+ e.getKeyCode());
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter=e.getKeyChar();
				if((caracter < '0') || caracter > '9' && (caracter != KeyEvent.VK_BACK_SPACE)&&(caracter!=44))  {
					e.consume();
				}
			}
		});
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblInformacion.setText("");
				double importe;double iva;
				double total;
				try {
					importe=Double.parseDouble(textImporte.getText());
					iva=Integer.parseInt(textDescuento.getText());
					double iv=importe*iva/100;
					total=importe+iv;
					textTotal.setText(Double.toString(total));
					lblPropiedades.setText(formattedTextField.getText());
				}catch (Exception e) {
					// TODO: handle exception
					for(int x=0;x<textImporte.getText().length();x++) {
						char c=textImporte.getText().charAt(x);
						if(!Character.isDigit(c)) {
							textImporte.setBackground(Color.RED);
						}
					}
					lblInformacion.setText("Introduzca un valor correcto");
				}
			}
		});
	}

	private void definirVentana() {
		// TODO Auto-generated method stub
		btnCalcular = new JButton("Calcular");
		
		btnCalcular.setBounds(52, 144, 89, 23);
		panel.add(btnCalcular);
		
		lblInformacion = new JLabel("************");
		lblInformacion.setBounds(278, 40, 83, 14);
		panel.add(lblInformacion);
		
		textDescuento = new JTextField();
		
		textDescuento.setBounds(103, 72, 96, 20);
		panel.add(textDescuento);
		textDescuento.setColumns(10);
		
		textTotal = new JTextField();
		textTotal.setEditable(false);
		textTotal.setBounds(103, 113, 96, 20);
		panel.add(textTotal);
		textTotal.setColumns(10);
		
		textImporte = new JTextField();
		textImporte.setBounds(103, 37, 96, 20);
		panel.add(textImporte);
		textImporte.setColumns(10);
		
		lblTeclado = new JLabel("Evento de teclado");
		lblTeclado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTeclado.setBounds(250, 73, 163, 14);
		panel.add(lblTeclado);
		
		lblPropiedades = new JLabel("Dni");
		lblPropiedades.setBounds(278, 195, 49, 14);
		panel.add(lblPropiedades);
		
		lblFormateo = new JLabel("Formateo");
		lblFormateo.setBounds(278, 226, 49, 14);
		panel.add(lblFormateo);
		
		
		
		lblImporte = new JLabel("Importe:");
		lblImporte.setBounds(10, 11, 63, 14);
		panel_1.add(lblImporte);
		
		lblIva = new JLabel("Iva:");
		lblIva.setBounds(10, 36, 49, 14);
		panel_1.add(lblIva);
		
		lblTotal = new JLabel("Total:");
		lblTotal.setBounds(10, 79, 49, 14);
		panel_1.add(lblTotal);
		
		formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(337, 223, 76, 20);
		panel.add(formattedTextField);
	}
}
