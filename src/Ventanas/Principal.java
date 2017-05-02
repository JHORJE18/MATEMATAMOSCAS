
package Ventanas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("COMPARTIR");
		panel.add(lblNewLabel);
		
		JSeparator separator_3 = new JSeparator();
		panel.add(separator_3);
		
		JSeparator separator = new JSeparator();
		panel.add(separator);
		
		JLabel lblPuntuaciones = new JLabel("PUNTUACIONES");
		panel.add(lblPuntuaciones);
		
		JSeparator separator_2 = new JSeparator();
		panel.add(separator_2);
		
		JSeparator separator_4 = new JSeparator();
		panel.add(separator_4);
		
		JButton btnJugar = new JButton("JUGAR");
		panel.add(btnJugar);
		
		JSeparator separator_5 = new JSeparator();
		panel.add(separator_5);
		
		JSeparator separator_1 = new JSeparator();
		panel.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("AJUSTES");
		panel.add(lblNewLabel_1);
	}

}
