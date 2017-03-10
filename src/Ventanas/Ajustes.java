package Ventanas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import Datos.DatoAjustes;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ajustes extends JFrame {

	private JPanel contentPane;

	//Importamos configuracion guardada
	DatoAjustes config = new DatoAjustes();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//Crea una ventana
		Ajustes frame = new Ajustes();
		//La hace visible
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Ajustes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, config.getrAncho(), config.getrAlto());
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel Cabezera = new JPanel();
		Cabezera.setBackground(Color.BLACK);
		contentPane.add(Cabezera, BorderLayout.NORTH);
		
		JLabel titulo = new JLabel("Ajustes");
		titulo.setForeground(Color.WHITE);
		Cabezera.add(titulo);
		
		JPanel Izquierda = new JPanel();
		Izquierda.setBackground(Color.BLACK);
		contentPane.add(Izquierda, BorderLayout.WEST);
		
		JPanel Derecha = new JPanel();
		Derecha.setBackground(Color.BLACK);
		contentPane.add(Derecha, BorderLayout.EAST);
		
		JPanel Central = new JPanel();
		Central.setBackground(new Color(255, 255, 255));
		contentPane.add(Central, BorderLayout.CENTER);
		Central.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelMusica = new JPanel();
		panelMusica.setBackground(Color.WHITE);
		Central.add(panelMusica);
		
		JLabel labelMusica = new JLabel("Musica");
		panelMusica.add(labelMusica);
		
		JSlider sliderMusica = new JSlider();
		sliderMusica.setBackground(Color.WHITE);
		labelMusica.setLabelFor(sliderMusica);
		sliderMusica.setFont(new Font("Tekton Pro", Font.PLAIN, 12));
		panelMusica.add(sliderMusica);
		
		JButton muteMusica = new JButton("Silenciar");
		panelMusica.add(muteMusica);
		
		JPanel panelSonido = new JPanel();
		panelSonido.setBackground(Color.WHITE);
		Central.add(panelSonido);
		
		JLabel labelSonidos = new JLabel("Sonidos");
		labelSonidos.setBackground(Color.WHITE);
		panelSonido.add(labelSonidos);
		
		JSlider sliderSonidos = new JSlider();
		sliderSonidos.setBackground(Color.WHITE);
		labelSonidos.setLabelFor(sliderSonidos);
		panelSonido.add(sliderSonidos);
		
		JButton muteSonidos = new JButton("Silenciar");
		panelSonido.add(muteSonidos);
		
		JPanel panelVacio = new JPanel();
		panelVacio.setBackground(Color.WHITE);
		Central.add(panelVacio);
		
		JPanel panelDificultad = new JPanel();
		panelDificultad.setBackground(Color.WHITE);
		Central.add(panelDificultad);
		
		JLabel labelDificultad = new JLabel("Nivel de Mates");
		panelDificultad.add(labelDificultad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1\u00BA Primaria", "2\u00BA Primaria", "3\u00BA Primaria", "4\u00BA Primaria", "5\u00BA Primaria", "6\u00BA Primaria", "1\u00BA E.S.O"}));
		labelDificultad.setLabelFor(comboBox);
		panelDificultad.add(comboBox);
		
		JPanel panelVacio2 = new JPanel();
		panelVacio2.setBackground(Color.WHITE);
		Central.add(panelVacio2);
		
		JPanel pieBotones = new JPanel();
		pieBotones.setBackground(Color.WHITE);
		Central.add(pieBotones);
		
		JButton aplicarAjustes = new JButton("Aplicar cambios");
		aplicarAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Envia nuevas configuraciones al archivo de DatosAjustes
				config.setnNivel();
				config.setvMusica();
				config.setvSonido();
			}
		});
		pieBotones.add(aplicarAjustes);
		aplicarAjustes.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton defectoAjustes = new JButton("Valores predeteminados");
		pieBotones.add(defectoAjustes);
		defectoAjustes.setHorizontalAlignment(SwingConstants.LEFT);
	}

}
