package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class FrmSwing_9 extends JFrame {

	private JPanel panel;
	private JCheckBox chckbxJamon,chckbxPeperoni,chckbxBacon,chckbxDobleQueso;
	private JLabel lblJamon,lblPeperoni,lblBacon,lblQueso;
	private JScrollPane scrollPane;
	private JTextArea txtrIngredientes;
	private JButton btnNewButton;
	ArrayList <JCheckBox> listaIngredientes;
	String jamon,peperoni,bacon,queso;
	/**
	 * Create the frame.
	 */
	public FrmSwing_9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel);
		panel.setLayout(null);
		
		
		definirVentana();
		definirEventos();
		setVisible(true);
	}

	private void definirEventos() {
		// TODO Auto-generated method stub
		chckbxJamon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxJamon.isSelected()) {
					jamon=chckbxJamon.getText();
				}
				else {
					jamon=null;
				}
				lblJamon.setText(jamon);
			}
		});
		chckbxPeperoni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPeperoni.isSelected()) {
					peperoni=chckbxPeperoni.getText();
				}
				else {
					peperoni=null;
				}
				lblPeperoni.setText(peperoni);
			}
		});
		chckbxBacon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBacon.isSelected()) {
					bacon=chckbxBacon.getText();
				}
				else {
					bacon=null;
				}
				lblBacon.setText(bacon);
			}
		});
		chckbxDobleQueso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxDobleQueso.isSelected()) {
					queso=chckbxDobleQueso.getText();
				}
				else {
					queso=null;
				}
				lblQueso.setText(queso);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrIngredientes.setText("");
				String ingredientes="Ingredientes \n";
				for (JCheckBox jCheckBox : listaIngredientes) {
					if(jCheckBox.isSelected()) {
						ingredientes=ingredientes + jCheckBox.getText()+"\n";
					}
				}
				txtrIngredientes.setText(ingredientes);
			}
		});
	}

	private void definirVentana() {
		// TODO Auto-generated method stub
		
		listaIngredientes=new ArrayList<JCheckBox>();
		
		chckbxJamon = new JCheckBox("Jamon");
		
		chckbxJamon.setBounds(6, 27, 99, 23);
		panel.add(chckbxJamon);
		listaIngredientes.add(chckbxJamon);
		
		chckbxPeperoni = new JCheckBox("Peperoni");
		
		chckbxPeperoni.setBounds(6, 53, 99, 23);
		panel.add(chckbxPeperoni);
		listaIngredientes.add(chckbxPeperoni);

		chckbxBacon = new JCheckBox("Bacon");
		
		chckbxBacon.setBounds(6, 79, 99, 23);
		panel.add(chckbxBacon);
		listaIngredientes.add(chckbxBacon);

		chckbxDobleQueso = new JCheckBox("DobleQueso");
		
		chckbxDobleQueso.setBounds(6, 105, 99, 23);
		panel.add(chckbxDobleQueso);
		listaIngredientes.add(chckbxDobleQueso);

		lblJamon = new JLabel("ingrediente");
		lblJamon.setBounds(111, 31, 65, 14);
		panel.add(lblJamon);
		
		lblPeperoni = new JLabel("ingrediente");
		lblPeperoni.setBounds(111, 57, 65, 14);
		panel.add(lblPeperoni);
		
		lblBacon = new JLabel("ingrediente");
		lblBacon.setBounds(111, 83, 65, 14);
		panel.add(lblBacon);
		
		lblQueso = new JLabel("ingrediente");
		lblQueso.setBounds(111, 109, 81, 14);
		panel.add(lblQueso);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(270, 193, 99, -164);
		panel.add(scrollPane);
		
		txtrIngredientes = new JTextArea();
		txtrIngredientes.setText("Ingredientes");
		txtrIngredientes.setBounds(224, 26, 145, 226);
		panel.add(txtrIngredientes);
		
		btnNewButton = new JButton("Aceptar");
		
		btnNewButton.setBounds(43, 135, 89, 23);
		panel.add(btnNewButton);
	}
}
