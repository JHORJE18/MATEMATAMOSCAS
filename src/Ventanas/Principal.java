
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
import java.awt.Component;
import javax.swing.Box;

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
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_3);
		
		JLabel lblPuntuaciones = new JLabel("PUNTUACIONES");
		panel.add(lblPuntuaciones);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(40);
		panel.add(horizontalStrut_1);
		
		JButton btnJugar = new JButton("JUGAR");
		panel.add(btnJugar);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut);
		
		JLabel lblNewLabel_1 = new JLabel("AJUSTES");
		panel.add(lblNewLabel_1);
	}

}
