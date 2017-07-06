import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Regulamento extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Regulamento frame = new Regulamento();
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
	public Regulamento() {
		setTitle("Regulamento");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(71, 11, 294, 303);
		contentPane.add(scrollPane);
		
		JTextPane txtRegulamento = new JTextPane();
		scrollPane.setViewportView(txtRegulamento);
		txtRegulamento.setEditable(false);
		txtRegulamento.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam risus urna, vestibulum ac lobortis pulvinar, commodo tincidunt tellus. Duis a mi volutpat, condimentum tellus ac, porta tellus. Vivamus dapibus magna metus. Morbi semper quis erat id sagittis. Proin hendrerit augue mauris, eu convallis diam viverra non. Vivamus sed dolor felis. Fusce mattis felis eget urna rhoncus, ac porta est volutpat. Vestibulum et posuere arcu. Ut commodo leo quis diam volutpat scelerisque. Morbi ornare leo tristique elit tristique, vel ullamcorper ante ornare.\r\n\r\nVivamus feugiat malesuada sem, ut venenatis urna lacinia id. Interdum et malesuada fames ac ante ipsum primis in faucibus. Maecenas fermentum tempus lorem in dignissim. Ut sit amet porta libero. Curabitur sit amet massa maximus, molestie nisl sed, tempus dui. Vestibulum nec faucibus urna, sed aliquam eros. Duis rutrum erat libero, ac semper dui blandit quis. Vivamus ut libero maximus mi tincidunt luctus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. ");
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOk.setBounds(335, 335, 89, 23);
		contentPane.add(btnOk);
	}
}
