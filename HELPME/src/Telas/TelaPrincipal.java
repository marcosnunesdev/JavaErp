package Telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Model.Cliente;
import Model.ModeloTabela;
import java.awt.Font;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JScrollPane scrollPane;
	
	private ArrayList<Cliente> clientes;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
					
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		clientes=new ArrayList<>();
		clientes.add(new Cliente(1,11,"marcos"));
		clientes.add(new Cliente(2,22,"pedro"));
		clientes.add(new Cliente(3,33,"gabi"));
			
		setTitle("HELP-ME.Tela principal");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\HELPME\\IMAGENS\\engrenagem.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(117, 31, 224, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 60, 416, 193);
		contentPane.add(scrollPane);
		ModeloTabela modeloTabela=new ModeloTabela(clientes);
		table = new JTable();
		table.setModel(modeloTabela);
		scrollPane.setViewportView(table);
		
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(10, 30, 85, 21);
		contentPane.add(btnNewButton);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	}
}
