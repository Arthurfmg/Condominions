import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Condominions");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegistrarReclamacao = new JButton("Registrar Reclama\u00E7\u00E3o");
		btnRegistrarReclamacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistrarReclamacao regRec = new RegistrarReclamacao();
				regRec.setVisible(true);
			}
		});
		btnRegistrarReclamacao.setBounds(36, 73, 167, 49);
		contentPane.add(btnRegistrarReclamacao);
		
		JButton btnDespesas = new JButton("Despesas");
		btnDespesas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Despesas despesas = new Despesas();
				despesas.setVisible(true);
			}
		});
		btnDespesas.setBounds(233, 73, 167, 49);
		contentPane.add(btnDespesas);
		
		JButton btnRegulamento = new JButton("Regulamento");
		btnRegulamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Regulamento regulamento = new Regulamento();
				regulamento.setVisible(true);
			}
		});
		btnRegulamento.setBounds(36, 173, 167, 49);
		contentPane.add(btnRegulamento);
		
		JButton btnRegistrarDespesas = new JButton("Registrar Despesas");
		btnRegistrarDespesas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarDespesa registrar = new RegistrarDespesa();
				registrar.setVisible(true);
			}
		});
		btnRegistrarDespesas.setBounds(233, 173, 167, 49);
		contentPane.add(btnRegistrarDespesas);
		
		JButton btnProblemas = new JButton("Problemas");
		btnProblemas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Problemas problemas = new Problemas();
				problemas.setVisible(true);
			}
		});
		btnProblemas.setBounds(138, 264, 167, 49);
		contentPane.add(btnProblemas);
	}
}
