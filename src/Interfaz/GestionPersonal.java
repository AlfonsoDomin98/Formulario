package Interfaz;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class GestionPersonal  {
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	private JTextField textNombre;
	private JTextField textField_1;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionPersonal window = new GestionPersonal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GestionPersonal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 678, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		
		JLabel Nombre = new JLabel("Nombre:  ");
		Nombre.setBounds(88, 99, 73, 16);

		frame.getContentPane().add(Nombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(183, 94, 130, 26);
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(183, 132, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel Apellido = new JLabel("Apellido: ");
		Apellido.setBounds(88, 137, 61, 16);
		frame.getContentPane().add(Apellido);
		
		JLabel lblGestionDePersonal = new JLabel("Gestion de Personal - Modo Crear");
		lblGestionDePersonal.setBounds(17, 20, 366, 38);
		lblGestionDePersonal.setFont(new Font("KufiStandardGK", Font.BOLD, 22));
		frame.getContentPane().add(lblGestionDePersonal);
		
		JRadioButton SeleccionHombre = new JRadioButton("Hombre");
		SeleccionHombre.setBounds(88, 182, 141, 23);
		frame.getContentPane().add(SeleccionHombre);
		
		JRadioButton SeleccionMujer = new JRadioButton("Mujer");
		SeleccionMujer.setBounds(183, 182, 141, 23);
		frame.getContentPane().add(SeleccionMujer);
		
		JList list = new JList();
		list.setBounds(172, 230, 141, 101);
		list.setToolTipText("");
		frame.getContentPane().add(list);
		
		JLabel lblPuestoEnLa = new JLabel("Puesto en la empresa:");
		lblPuestoEnLa.setBounds(17, 230, 144, 16);
		frame.getContentPane().add(lblPuestoEnLa);
		
		JButton btnNewButton = new JButton("Esta de Vacaciones");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(407, 99, 242, 71);
		frame.getContentPane().add(btnNewButton);
		
		JLabel Sueldo = new JLabel("Sueldo(0 - 10000)");
		Sueldo.setBounds(349, 186, 114, 16);
		frame.getContentPane().add(Sueldo);
		
		JSlider slider = new JSlider();
		slider.setBounds(475, 182, 190, 29);
		frame.getContentPane().add(slider);
		
		
	
	}

}
