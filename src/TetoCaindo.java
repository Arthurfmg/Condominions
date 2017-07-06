import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TetoCaindo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TetoCaindo frame = new TetoCaindo();
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
	public TetoCaindo() {
		setTitle("Teto Caindo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 444, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeArthur = new JLabel("De: Arthur, 616");
		lblDeArthur.setBounds(10, 26, 93, 14);
		contentPane.add(lblDeArthur);
		
		JLabel lblMotivoTetoCaindo = new JLabel("Motivo: Teto Caindo");
		lblMotivoTetoCaindo.setBounds(10, 51, 118, 14);
		contentPane.add(lblMotivoTetoCaindo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 76, 246, 246);
		contentPane.add(scrollPane);
		
		JTextPane txtLorem = new JTextPane();
		txtLorem.setEditable(false);
		scrollPane.setViewportView(txtLorem);
		txtLorem.setText("Vivamus feugiat malesuada sem, ut venenatis urna lacinia id. Interdum et malesuada fames ac ante ipsum primis in faucibus. Maecenas fermentum tempus lorem in dignissim. Ut sit amet porta libero. Curabitur sit amet massa maximus, molestie nisl sed, tempus dui. Vestibulum nec faucibus urna, sed aliquam eros. Duis rutrum erat libero, ac semper dui blandit quis. Vivamus ut libero maximus mi tincidunt luctus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Suspendisse interdum orci risus, eget mattis mauris cursus eget. Donec in felis magna. Aliquam vitae velit euismod ligula molestie volutpat sit amet quis purus. Duis metus dui, congue nec fringilla a, pretium in sem.");
		
		JButton btnSolucionado = new JButton("Solucionado");
		btnSolucionado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSolucionado.setBounds(314, 347, 104, 23);
		contentPane.add(btnSolucionado);
	}
}
