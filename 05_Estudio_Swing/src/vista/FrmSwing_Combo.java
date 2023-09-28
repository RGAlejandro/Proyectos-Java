package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class FrmSwing_Combo extends JFrame {

	private JPanel panel;
	private JTextField textDias;
	private JLabel lblDia;
	DefaultComboBoxModel dc;
	private JComboBox cmbDiasSemana;
	private JButton btnAgregar,btnAceptar;
	private JLabel lblMes;
	private JComboBox cmbMes;
	private JButton btnMes;
	private String [] meses= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	private JComboBox cmbPueblos;
	
	/**
	 * Create the frame.
	 */
	public FrmSwing_Combo() {
		setTitle("Estudio Combo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		definirVentanas();
		definirEventos();
		setVisible(true);
	}

	private void definirEventos() {
		// TODO Auto-generated method stub
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dc.addElement(textDias.getText());
			}
		});
		cmbDiasSemana.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblDia.setText(cmbDiasSemana.getSelectedItem().toString());
			}
		});
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDia.setText(cmbDiasSemana.getSelectedItem().toString()+"...");
			}
		});
		btnMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMes.setText(cmbMes.getSelectedItem().toString());
			}
		});
	}

	private void definirVentanas() {
		// TODO Auto-generated method stub
		dc=new DefaultComboBoxModel();
		dc.addElement("Lunes");
		dc.addElement("Martes");
		dc.addElement("Miercoles");
		dc.addElement("Jueves");
		dc.addElement("Viernes");
		dc.addElement("Sabado");
		dc.addElement("Domingo");
		
		lblDia = new JLabel("Dia");
		lblDia.setBounds(30, 26, 195, 14);
		panel.add(lblDia);
		
		cmbDiasSemana = new JComboBox(dc);
		
		cmbDiasSemana.setBounds(30, 58, 131, 22);
		panel.add(cmbDiasSemana);
		
		textDias = new JTextField();
		textDias.setBounds(30, 102, 96, 20);
		panel.add(textDias);
		textDias.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		
		btnAgregar.setBounds(136, 101, 89, 23);
		panel.add(btnAgregar);
		

		btnAceptar = new JButton("Aceptar");
		
		btnAceptar.setBounds(30, 148, 89, 23);
		panel.add(btnAceptar);
		
		lblMes = new JLabel("Mes");
		lblMes.setBounds(235, 26, 191, 14);
		panel.add(lblMes);
		
		cmbMes = new JComboBox(meses);
		cmbMes.setBounds(235, 58, 191, 22);
		panel.add(cmbMes);
		
		btnMes = new JButton("Aceptar");
		
		btnMes.setBounds(235, 101, 89, 23);
		panel.add(btnMes);
		
		cmbPueblos = new JComboBox();
		cmbPueblos.setModel(new DefaultComboBoxModel(new String[] {"Jerez", "Trebujena", "Cadiz", "Sanlucar", "Lebrija"}));
		cmbPueblos.setBounds(30, 200, 131, 22);
		panel.add(cmbPueblos);
	}
}
