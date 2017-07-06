import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class RegistrarReclamacao extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarReclamacao frame = new RegistrarReclamacao();
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
	public RegistrarReclamacao() {
		setTitle("Registrar Reclama\u00E7\u00E3o");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 414, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(36, 40, 36, 14);
		contentPane.add(lblNome);
		
		JLabel lblApt = new JLabel("Apt:");
		lblApt.setBounds(45, 68, 27, 14);
		contentPane.add(lblApt);
		
		JLabel lblReclamao = new JLabel("Reclama\u00E7\u00E3o:");
		lblReclamao.setBounds(10, 126, 74, 14);
		contentPane.add(lblReclamao);
		
		textField_1 = new JTextField();
		textField_1.setBounds(94, 65, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(94, 37, 205, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnReclamar = new JButton("Reclamar");
		btnReclamar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnReclamar.setBounds(283, 320, 89, 23);
		contentPane.add(btnReclamar);
		
		JLabel lblMotivo = new JLabel("Motivo:");
		lblMotivo.setBounds(35, 93, 49, 14);
		contentPane.add(lblMotivo);
		
		textField = new JTextField();
		textField.setBounds(94, 90, 205, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(94, 120, 205, 189);
		contentPane.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
	}
}
