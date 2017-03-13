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
import javax.swing.JSpinner;

public class Ajustes extends JFrame {

	private JPanel contentPane;

	//Importamos configuracion guardada
	DatoAjustes config = new DatoAjustes();
	JSlider sliderSonidos;
	JSlider sliderMusica;
	JComboBox nivelMates;
	JSpinner spinAlto;
	JSpinner spinAncho;

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
		
		 sliderMusica = new JSlider();
		sliderMusica.setValue(25);
		sliderMusica.setBackground(Color.WHITE);
		labelMusica.setLabelFor(sliderMusica);
		sliderMusica.setFont(new Font("Tekton Pro", Font.PLAIN, 12));
		panelMusica.add(sliderMusica);
		
		JButton muteMusica = new JButton("Silenciar");
		muteMusica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Silenciar musica
				config.setvMusica(0);
				recargar();
			}
		});
		panelMusica.add(muteMusica);
		
		JPanel panelSonido = new JPanel();
		panelSonido.setBackground(Color.WHITE);
		Central.add(panelSonido);
		
		JLabel labelSonidos = new JLabel("Sonidos");
		labelSonidos.setBackground(Color.WHITE);
		panelSonido.add(labelSonidos);
		
		sliderSonidos = new JSlider();
		sliderSonidos.setValue(config.getvSonido());
		sliderSonidos.setBackground(Color.WHITE);
		labelSonidos.setLabelFor(sliderSonidos);
		panelSonido.add(sliderSonidos);
		
		JButton muteSonidos = new JButton("Silenciar");
		muteSonidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Silenciar Sonidos
				config.setvSonido(0);
				recargar();
			}
		});
		panelSonido.add(muteSonidos);
		
		JPanel panelResolucion = new JPanel();
		panelResolucion.setBackground(Color.WHITE);
		Central.add(panelResolucion);
		
		JLabel labelResolucion = new JLabel("Resolucion de pantalla");
		panelResolucion.add(labelResolucion);
		
		JPanel panelMedidas = new JPanel();
		panelResolucion.add(panelMedidas);
		
		JLabel labelAlto = new JLabel("Alto");
		panelMedidas.add(labelAlto);
		labelAlto.setLabelFor(spinAlto);
		
		spinAlto = new JSpinner();
		panelMedidas.add(spinAlto);
		
		JLabel labelAncho = new JLabel("Ancho");
		panelMedidas.add(labelAncho);
		labelAncho.setLabelFor(spinAncho);
		
		spinAncho = new JSpinner();
		panelMedidas.add(spinAncho);
		
		JPanel panelDificultad = new JPanel();
		panelDificultad.setBackground(Color.WHITE);
		Central.add(panelDificultad);
		
		JLabel labelDificultad = new JLabel("Nivel de Mates");
		panelDificultad.add(labelDificultad);
		
		nivelMates = new JComboBox();
		nivelMates.setModel(new DefaultComboBoxModel(new String[] {"1\u00BA Primaria", "2\u00BA Primaria", "3\u00BA Primaria", "4\u00BA Primaria", "5\u00BA Primaria", "6\u00BA Primaria", "1\u00BA E.S.O"}));
		labelDificultad.setLabelFor(nivelMates);
		panelDificultad.add(nivelMates);
		
		JPanel panelVacio2 = new JPanel();
		panelVacio2.setBackground(Color.WHITE);
		Central.add(panelVacio2);
		
		JButton volverAjustes = new JButton("Volver");
		panelVacio2.add(volverAjustes);
		volverAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				System.exit(0);
			}
		});
		
		JPanel pieBotones = new JPanel();
		pieBotones.setBackground(Color.WHITE);
		Central.add(pieBotones);
		
		JButton aplicarAjustes = new JButton("Aplicar cambios");
		aplicarAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Envia nuevas configuraciones al archivo de DatosAjustes
				config.setrAlto((Integer) spinAlto.getValue());
				config.setrAncho((Integer) spinAncho.getValue());
				config.setnNivel(nivelMates.getSelectedIndex());
				config.setvMusica(sliderMusica.getValue());
				config.setvSonido(sliderSonidos.getValue());
				recargar();
			}
		});
		pieBotones.add(aplicarAjustes);
		aplicarAjustes.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton defectoAjustes = new JButton("Valores predeteminados");
		defectoAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Pon todo valores originales
				config.setrAlto(320);
				config.setrAncho(500);
				config.setnNivel(0);
				config.setvMusica(50);
				config.setvSonido(50);
				recargar();
			}
		});
		pieBotones.add(defectoAjustes);
		defectoAjustes.setHorizontalAlignment(SwingConstants.LEFT);
		recargar();
	}

	void recargar(){
		spinAlto.setValue(config.getrAlto());
		spinAncho.setValue(config.getrAncho());
		nivelMates.setSelectedIndex(config.getnNivel());
		sliderMusica.setValue(config.getvMusica());
		sliderSonidos.setValue(config.getvSonido());
		setBounds(100, 100, config.getrAncho(), config.getrAlto());
	}
}
