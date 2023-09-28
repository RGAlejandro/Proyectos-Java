package vista;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;

public class FrmSwing_8 extends JFrame {

	private JPanel panel;
	private JPanel panel_1;
	private JRadioButton rdbtnSoltero,rdbtnCasado,rdbtnSeparado;
	private JButton btnAceptar;
	private JLabel lblInformativa;
	String estadoCivil;
	ArrayList<JRadioButton> listaRadio;
	private ButtonGroup buttonGroup;
	/**
	 * Create the frame.
	 */
	public FrmSwing_8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();

		setContentPane(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Estado Civil", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(51, 32, 229, 147);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		definirVentana();
		definirEventos();
		setVisible(true);
	}

	private void definirEventos() {
		// TODO Auto-generated method stub
		rdbtnSoltero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estadoCivil = rdbtnSoltero.getText();
				lblInformativa.setText(estadoCivil);
			}
		});
		rdbtnCasado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estadoCivil = rdbtnCasado.getText();
				lblInformativa.setText(estadoCivil);
			}
		});
		rdbtnSeparado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estadoCivil = rdbtnSeparado.getText();
				lblInformativa.setText(estadoCivil);
			}
		});
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (JRadioButton radio: listaRadio) {
					if(radio.isSelected()) {
						lblInformativa.setText(radio.getText()+" desde boton");
					}
				}
			}
		});
	}

	private void definirVentana() {
		// TODO Auto-generated method stub
		buttonGroup = new ButtonGroup();
		listaRadio=new ArrayList<JRadioButton>();
		
		rdbtnSoltero = new JRadioButton("Soltero");
		
		buttonGroup.add(rdbtnSoltero);
		listaRadio.add(rdbtnSoltero);

		rdbtnSoltero.setBounds(6, 27, 109, 23);
		panel_1.add(rdbtnSoltero);
		
		rdbtnCasado = new JRadioButton("Casado");
		
		buttonGroup.add(rdbtnCasado);
		listaRadio.add(rdbtnCasado);

		rdbtnCasado.setBounds(6, 53, 109, 23);
		panel_1.add(rdbtnCasado);
		
		rdbtnSeparado = new JRadioButton("Separado");
		
		buttonGroup.add(rdbtnSeparado);
		listaRadio.add(rdbtnSeparado);

		rdbtnSeparado.setBounds(6, 79, 109, 23);
		panel_1.add(rdbtnSeparado);
		
		lblInformativa = new JLabel("..........................");
		lblInformativa.setBounds(10, 122, 192, 14);
		panel_1.add(lblInformativa);
		
		btnAceptar = new JButton("Aceptar");
		
		btnAceptar.setBounds(115, 190, 89, 23);
		panel.add(btnAceptar);
	}
}
