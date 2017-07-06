import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problemas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problemas frame = new Problemas();
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
	public Problemas() {
		setTitle("Problemas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTetoCaindo = new JButton("Teto caindo");
		btnTetoCaindo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TetoCaindo teto = new TetoCaindo();
				teto.setVisible(true);
				dispose();
			}
		});
		btnTetoCaindo.setBounds(10, 11, 414, 55);
		contentPane.add(btnTetoCaindo);
		
		JButton btnGoteira = new JButton("Goteira");
		btnGoteira.setBounds(10, 77, 414, 55);
		contentPane.add(btnGoteira);
		
		JButton btnBuracoNoCho = new JButton("Buraco no Ch\u00E3o");
		btnBuracoNoCho.setBounds(10, 143, 414, 55);
		contentPane.add(btnBuracoNoCho);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnOk.setBounds(335, 339, 89, 23);
		contentPane.add(btnOk);
	}
}
