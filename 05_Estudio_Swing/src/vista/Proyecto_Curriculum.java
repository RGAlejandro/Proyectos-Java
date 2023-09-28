package vista;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Proyecto_Curriculum extends JFrame {

	private JPanel panel;
	private JPanel panel_1;

	private JTextField textNombre, textApellidos, textDireccion,textTelefono;
	private JLabel lblEtiquetaCurriculum,lblNombre,lblApellidos,lblDireccion ,lblTelefono ,lblPoblacion;
	private JComboBox cbxPoblacion;
	private JPanel panel_2;
	
	private JRadioButton rdbtnSoltero,rdbtnCasado,rdbtnSeparado;
	private JCheckBox chckbxJava,chckbxDelphin,chckbxAndroid;
	private JPanel panel_3;
	
	private JPanel panel_4;
	
	private ButtonGroup buttonGroup;
	private JPanel panel_5;
	private JLabel lblExperiencia;
	private JEditorPane editorEstudios;
	private JList list;
	private List <JRadioButton> radio;
	private List <JCheckBox> cajas;
	private JButton btnAceptar ;
	/**
	 * Create the frame.
	 */
	public Proyecto_Curriculum() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 882, 495);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 53, 339, 217);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Sistemas Operativos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(445, 53, 191, 71);
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		
		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Estado Civil", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 281, 237, 126);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		
		
		panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Lenguajes Programacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(257, 281, 175, 126);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Windows 7", "Windows Server", "Linux", "Android", "Mac"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		mostrarVentanas();
		mostrarEventos();
		setVisible(true);
		
		
		
		
		
	}

	private void mostrarEventos() {
		// TODO Auto-generated method stub
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre="Nombre: "+textNombre.getText();
				String apellidos="Apellidos: "+textApellidos.getText();
				String direccion="Direccion: "+textDireccion.getText();
				String telefono= "Telefono: "+textTelefono.getText();
				String poblacion="Poblacion: "+cbxPoblacion.getSelectedItem();
				String so="Sistema Operativo: "+list.getSelectedValue();
				String estadoCivil="";
				for(JRadioButton radio: radio) {
					if(radio.isSelected()) {
						estadoCivil="Estado Civil: "+radio.getText();
					}
				}
				String lenguajes="Lenguajes Programacion: ";
				JCheckBox check=new JCheckBox();
				check=null;
				for(int x=0;x<cajas.size();x++) {
					check=cajas.get(x);
					if(check.isSelected()) {
						lenguajes=lenguajes+check.getText()+"--";
					}
				}
				String curriculum=nombre+"\n"+apellidos+"\n"+direccion+"\n"+telefono+"\n"+poblacion+"\n"+so+"\n"+estadoCivil+"\n"+lenguajes+"\n";
				FrmVistaCurriculum vista=new FrmVistaCurriculum(curriculum);
			}
		});
	}

	private void mostrarVentanas() {
		// TODO Auto-generated method stub
		radio=new ArrayList<JRadioButton>();
		cajas=new ArrayList<JCheckBox>();
		
		buttonGroup = new ButtonGroup();
		
		lblEtiquetaCurriculum = new JLabel("Curriculum Vitae");
		lblEtiquetaCurriculum.setBounds(10, 28, 101, 14);
		panel.add(lblEtiquetaCurriculum);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 27, 83, 14);
		panel_1.add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(10, 65, 56, 14);
		panel_1.add(lblApellidos);
		
		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(10, 106, 83, 14);
		panel_1.add(lblDireccion);
		
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(10, 144, 90, 14);
		panel_1.add(lblTelefono);
		
		lblPoblacion = new JLabel("Poblacion:");
		lblPoblacion.setBounds(10, 182, 56, 14);
		panel_1.add(lblPoblacion);
		
		textNombre = new JTextField();
		textNombre.setBounds(110, 24, 136, 20);
		panel_1.add(textNombre);
		textNombre.setColumns(10);
		
		textApellidos = new JTextField();
		textApellidos.setBounds(73, 62, 240, 20);
		panel_1.add(textApellidos);
		textApellidos.setColumns(10);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(110, 103, 203, 20);
		panel_1.add(textDireccion);
		textDireccion.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(110, 141, 203, 20);
		panel_1.add(textTelefono);
		textTelefono.setColumns(10);
		
		cbxPoblacion = new JComboBox();
		cbxPoblacion.setModel(new DefaultComboBoxModel(new String[] {"Sanlucar", "Trebujena", "Cadiz", "Lebrija"}));
		cbxPoblacion.setBounds(76, 178, 170, 22);
		panel_1.add(cbxPoblacion);
		
		rdbtnSoltero = new JRadioButton("Soltero");
		buttonGroup.add(rdbtnSoltero);
		rdbtnSoltero.setBounds(6, 19, 69, 23);
		panel_3.add(rdbtnSoltero);
		radio.add(rdbtnSoltero);
		
		rdbtnCasado = new JRadioButton("Casado");
		buttonGroup.add(rdbtnCasado);
		rdbtnCasado.setBounds(6, 50, 109, 23);
		panel_3.add(rdbtnCasado);
		radio.add(rdbtnCasado);

		
		rdbtnSeparado = new JRadioButton("Separado");
		buttonGroup.add(rdbtnSeparado);
		rdbtnSeparado.setBounds(6, 85, 109, 23);
		panel_3.add(rdbtnSeparado);
		radio.add(rdbtnSeparado);

		
		
		chckbxJava = new JCheckBox("Java");
		chckbxJava.setBounds(6, 19, 97, 23);
		panel_4.add(chckbxJava);
		cajas.add(chckbxJava);
		
		chckbxDelphin = new JCheckBox("Delphin");
		chckbxDelphin.setBounds(6, 52, 97, 23);
		panel_4.add(chckbxDelphin);
		cajas.add(chckbxDelphin);

		
		chckbxAndroid = new JCheckBox("Android");
		chckbxAndroid.setBounds(6, 96, 97, 23);
		panel_4.add(chckbxAndroid);
		cajas.add(chckbxAndroid);

		
		panel_5 = new JPanel();
		panel_5.setBounds(542, 239, 300, 164);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		lblExperiencia = new JLabel("Experiencia Profesional");
		lblExperiencia.setBounds(10, 11, 144, 14);
		panel_5.add(lblExperiencia);
		
		editorEstudios = new JEditorPane();
		editorEstudios.setBounds(10, 36, 280, 117);
		panel_5.add(editorEstudios);
		
		btnAceptar = new JButton("Aceptar");
		
		btnAceptar.setBounds(10, 422, 89, 23);
		panel.add(btnAceptar);
	}
}
