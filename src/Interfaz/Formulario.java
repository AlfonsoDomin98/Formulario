package Interfaz;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Formulario  {

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario window = new Formulario();
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
	public Formulario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
private void initialize() {
		/**
		 * ATRIBUTOS
		 */
		frame = new JFrame();
		frame.setBounds(500, 300, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Login");
		
		JTextField Usuario1 = new JTextField(10);
		Usuario1.setBounds(203, 43, 130, 26);
			
		
		/**
		 * USUARIO
		 */
		
		JLabel Usuario = new JLabel("Usuario:  ");
		Usuario.setBounds(94, 48, 60, 16);
		frame.getContentPane().setLayout(null);

		
		frame.getContentPane().add(Usuario1);
		frame.getContentPane().add(Usuario);
		
		/**
		 *  CONTRASEÑA
		 */
		
		JLabel Password = new JLabel("Password : ");
		Password.setBounds(93, 99, 71, 16);
		frame.getContentPane().add(Password);
		
		JPasswordField Password1;
		Password1 = new JPasswordField();
		Password1.setBounds(203, 94, 130, 26);
		frame.getContentPane().add(Password1);
		
		JButton Iniciar = new JButton("Iniciar Sesion");
		Iniciar.setBounds(147, 154, 117, 29);
		frame.getContentPane().add(Iniciar);
		Iniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				if(Usuario1.getText().equals("admin") && Password1.getText().equals("admin") ){
					GestionPersonal Ventana = new GestionPersonal();
					Ventana.getFrame().setVisible(true);
					frame.dispose();
				}
				else{
					JOptionPane.showMessageDialog(frame, "[ERROR]: Datos Erroneos!");
				}
				
			}
		});
		
		
		
		
	}
	
}


