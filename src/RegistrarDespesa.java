import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrarDespesa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarDespesa frame = new RegistrarDespesa();
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
	public RegistrarDespesa() {
		setTitle("Registrar Despesa");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 404, 219);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMotivo = new JLabel("Motivo:");
		lblMotivo.setBounds(10, 31, 46, 14);
		contentPane.add(lblMotivo);
		
		textField = new JTextField();
		textField.setBounds(66, 28, 165, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblGasto = new JLabel("Gasto:");
		lblGasto.setBounds(10, 62, 46, 14);
		contentPane.add(lblGasto);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 59, 165, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMs = new JLabel("M\u00EAs:");
		lblMs.setBounds(10, 93, 46, 14);
		contentPane.add(lblMs);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Janeiro", "Fevereiro", "Mar\u00E7o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
		comboBox.setBounds(66, 90, 165, 20);
		contentPane.add(comboBox);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCadastrar.setBounds(10, 127, 98, 23);
		contentPane.add(btnCadastrar);
	}

}
