package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JToggleButton;

public class FrmSwing_6 extends JFrame implements ActionListener{

	private JPanel panel;
	private JPanel panel_1;
	private JButton btnRojo,btnAmarillo,btnVerde,btnAzul,btnLeft,btnRight,btnMiddle,btnPeli;
	private JToggleButton tglbtnHabilitar;
	private JLabel lblHabilitar;
	private JFrame frame;
	/**
	 * Create the frame.
	 */
	public FrmSwing_6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		setContentPane(panel);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setBounds(158, 85, 119, 75);
		panel.add(panel_1);
		
		definirVentana();
		definirEvento();
		setVisible(true);
	}

	private void definirEvento() {
		// TODO Auto-generated method stub
		btnRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			panel_1.setBackground(Color.RED);	
				
			}
		});
		btnAmarillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setBackground(Color.YELLOW);	
			}
		});
		btnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setBackground(Color.BLUE);
			}
		});
		btnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setBackground(Color.GREEN);
				JOptionPane.showMessageDialog(frame,"Vaya color mas feo ", "A T E N C I O N",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		tglbtnHabilitar.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(tglbtnHabilitar.isSelected()) {
					tglbtnHabilitar.setText("Deshabilitado");
					boolean sw = false;
					habilitar(sw);
				}
				else {
					tglbtnHabilitar.setText("Habilitado");
					boolean sw = true;
					habilitar(sw);
				}
			}

			private void habilitar(boolean sw) {
				// TODO Auto-generated method stub
				btnRojo.setEnabled(sw);
				btnAmarillo.setEnabled(sw);
				btnAzul.setEnabled(sw);
				btnVerde.setEnabled(sw);

			}
		});
		btnLeft.addActionListener(this);
		btnRight.addActionListener(this);

	}

	private void definirVentana() {
		
		btnRojo = new JButton("Rojo");
		
		btnRojo.setBounds(12, 23, 89, 23);
		panel.add(btnRojo);
		
		btnAmarillo = new JButton("Amarillo");
		
		btnAmarillo.setBounds(335, 23, 89, 23);
		panel.add(btnAmarillo);
		
		lblHabilitar = new JLabel("..................");
		lblHabilitar.setBounds(111, 177, 80, 18);
		panel.add(lblHabilitar);
		
		btnVerde = new JButton("Verde");
		
		btnVerde.setBounds(12, 188, 89, 23);
		panel.add(btnVerde);
		
		btnAzul = new JButton("Azul");
		
		btnAzul.setBounds(335, 188, 89, 23);
		panel.add(btnAzul);
		
		Icon leftButtomIcon = new ImageIcon("imagenes/windows1.png");
		Icon middleButtomIcon = new ImageIcon("imagenes/cr7.png");
		Icon rightButtomIcon = new ImageIcon("imagenes/windows2.png");
		Icon peli = new ImageIcon("imagenes/kili.png");
		Icon pelicr = new ImageIcon("imagenes/cr777.png");

		
		btnLeft = new JButton("Desactivar boton central");
		btnLeft.setBounds(12, 227, 151, 23);
		btnLeft.setMnemonic(KeyEvent.VK_D);
		btnLeft.setActionCommand("disable");
		btnLeft.setToolTipText("Desactivar boton central.");
		btnLeft.setIcon(leftButtomIcon);
		panel.add(btnLeft);
		
		btnRight = new JButton("Activar boton central");
		btnRight.setBounds(291, 227, 133, 23);
		btnRight.setMnemonic(KeyEvent.VK_E);
		btnRight.setToolTipText("Activar boton central.");
		btnRight.setActionCommand("enable");
		btnRight.setEnabled(false);
		btnRight.setIcon(rightButtomIcon);
		panel.add(btnRight);
		
		btnMiddle = new JButton("Boton Central");
		btnMiddle.setBounds(173, 206, 104, 44);
		btnMiddle.setMnemonic(KeyEvent.VK_C);
		btnMiddle.setToolTipText("Boton Central.");
		btnMiddle.setIcon(middleButtomIcon);
		panel.add(btnMiddle);
		
		btnPeli = new JButton(peli);
		btnPeli.setPressedIcon(pelicr);
		btnPeli.setBounds(12, 69, 89, 103);
		
		panel.add(btnPeli);
		
		
		
		tglbtnHabilitar = new JToggleButton("Habilitado");
		
		tglbtnHabilitar.setBounds(156, 51, 121, 23);
		panel.add(tglbtnHabilitar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("enable")) {
			lblHabilitar.setText("Habilitado");
			btnMiddle.setEnabled(true);
			btnLeft.setEnabled(true);
			btnRight.setEnabled(false);
		}
		else if (e.getActionCommand().equals("disable")){
			lblHabilitar.setText("Deshabilitado");
			btnMiddle.setEnabled(false);
			btnLeft.setEnabled(false);
			btnRight.setEnabled(true);
		}
		else {
			lblHabilitar.setText(".......");
		}
	}
}
