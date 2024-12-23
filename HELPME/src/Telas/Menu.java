package Telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import Controller.Criptografia;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("HELP-ME");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\HELPME\\IMAGENS\\help-me.png"));
		setFont(new Font("Arial", Font.BOLD, 12));
		setForeground(Color.RED);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 502);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuário");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(253, 280, 61, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_1.setBounds(253, 343, 61, 19);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(203, 298, 161, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(203, 367, 161, 19);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Criptografia criptografia=new Criptografia("123",Criptografia.MD5);
				System.out.println(criptografia.criptografar());
				
			if (textField.getText().equals("admin") && passwordField.getText().equals("123"))
			{
			
				TelaPrincipal telaPrincipal = new TelaPrincipal(); telaPrincipal.setVisible(true);
				telaPrincipal.setLocationRelativeTo(null);
				telaPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
				
				
			}
				
			else {JOptionPane.showMessageDialog(btnNewButton, "Usuário ou senha inválidos","Aviso",JOptionPane.WARNING_MESSAGE);};	
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(241, 416, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\HELPME\\IMAGENS\\help-me.png"));
		lblNewLabel_2.setBounds(147, 22, 242, 226);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Versão 1.0.0");
		lblNewLabel_3.setBounds(450, 442, 72, 13);
		contentPane.add(lblNewLabel_3);
	}
}
