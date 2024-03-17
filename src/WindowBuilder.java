import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;

public class WindowBuilder extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApPa;
	private JTextField textApMa;
	private JTextField textFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilder frame = new WindowBuilder();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowBuilder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblRegustroDeUsuarios = new JLabel("Registro de Usuarios");
		lblRegustroDeUsuarios.setForeground(new Color(255, 0, 0));
		lblRegustroDeUsuarios.setVerticalAlignment(SwingConstants.TOP);
		lblRegustroDeUsuarios.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		GridBagConstraints gbc_lblRegustroDeUsuarios = new GridBagConstraints();
		gbc_lblRegustroDeUsuarios.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegustroDeUsuarios.gridx = 1;
		gbc_lblRegustroDeUsuarios.gridy = 0;
		contentPane.add(lblRegustroDeUsuarios, gbc_lblRegustroDeUsuarios);
		
		//Primer panel
		JPanel panelArribaIzquierda = new JPanel();
		panelArribaIzquierda.setBackground(new Color(0, 250, 154));
		panelArribaIzquierda.setToolTipText("Peru\r\nMexico\r\nArgentina\r\nBrasil\r\nTurquia\r\nRusia");
		panelArribaIzquierda.setLayout(null);
		GridBagConstraints gbc_panelArribaIzquierda = new GridBagConstraints();
		gbc_panelArribaIzquierda.gridwidth = 3;
		gbc_panelArribaIzquierda.insets = new Insets(0, 0, 5, 5);
		gbc_panelArribaIzquierda.fill = GridBagConstraints.BOTH;
		gbc_panelArribaIzquierda.gridx = 0;
		gbc_panelArribaIzquierda.gridy = 1;
		contentPane.add(panelArribaIzquierda, gbc_panelArribaIzquierda);
		
		JLabel lblTituloPanel1 = new JLabel("Datos Generales");
		lblTituloPanel1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTituloPanel1.setBounds(10, 5, 122, 14);
		panelArribaIzquierda.add(lblTituloPanel1);
		
		JLabel lblNombre = new JLabel("Nombres:");
		lblNombre.setBounds(75, 25, 63, 14);
		panelArribaIzquierda.add(lblNombre);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno:");
		lblApellidoPaterno.setBounds(33, 50, 99, 14);
		panelArribaIzquierda.add(lblApellidoPaterno);
		
		JLabel lblApellidoMaterno = new JLabel("Apellido Materno:");
		lblApellidoMaterno.setBounds(31, 75, 101, 14);
		panelArribaIzquierda.add(lblApellidoMaterno);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaDeNacimiento.setBounds(10, 100, 122, 14);
		panelArribaIzquierda.add(lblFechaDeNacimiento);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 125, 47, 14);
		panelArribaIzquierda.add(lblSexo);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBackground(new Color(0, 250, 154));
		rdbtnMasculino.setBounds(186, 125, 109, 23);
		panelArribaIzquierda.add(rdbtnMasculino);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBackground(new Color(0, 250, 154));
		rdbtnFemenino.setBounds(186, 149, 109, 23);
		panelArribaIzquierda.add(rdbtnFemenino);
		
		ButtonGroup sexos = new ButtonGroup();
		sexos.add(rdbtnFemenino);
		sexos.add(rdbtnMasculino);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setBounds(10, 183, 82, 14);
		panelArribaIzquierda.add(lblNacionalidad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Perú", "Mexico", "Brasil", "Rusia", "Panama"}));
		comboBox.setBounds(173, 179, 122, 22);
		panelArribaIzquierda.add(comboBox);
		
		textNombre = new JTextField();
		textNombre.setBounds(173, 22, 122, 20);
		panelArribaIzquierda.add(textNombre);
		textNombre.setColumns(10);
		
		textApPa = new JTextField();
		textApPa.setColumns(10);
		textApPa.setBounds(173, 47, 122, 20);
		panelArribaIzquierda.add(textApPa);
		
		textApMa = new JTextField();
		textApMa.setColumns(10);
		textApMa.setBounds(173, 72, 122, 20);
		panelArribaIzquierda.add(textApMa);
		
		textFecha = new JTextField();
		textFecha.setColumns(10);
		textFecha.setBounds(173, 97, 82, 20);
		panelArribaIzquierda.add(textFecha);
		
		JButton btnFecha = new JButton("");
		btnFecha.setBounds(256, 98, 39, 18);
		panelArribaIzquierda.add(btnFecha);
		
		
		//Segundo Panel
		JPanel panelArribaDerecha = new JPanel();
		panelArribaDerecha.setBackground(new Color(240, 128, 128));
		panelArribaDerecha.setLayout(null);
		GridBagConstraints gbc_panelArribaDerecha = new GridBagConstraints();
		gbc_panelArribaDerecha.insets = new Insets(0, 0, 5, 0);
		gbc_panelArribaDerecha.fill = GridBagConstraints.BOTH;
		gbc_panelArribaDerecha.gridx = 3;
		gbc_panelArribaDerecha.gridy = 1;
		contentPane.add(panelArribaDerecha, gbc_panelArribaDerecha);
		
		JLabel lblTituloPanel2 = new JLabel("Perfil de Usuario");
		lblTituloPanel2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTituloPanel2.setBounds(10, 5, 112, 14);
		panelArribaDerecha.add(lblTituloPanel2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("empleado.png")));
		lblNewLabel.setBounds(33, 25, 134, 128);
		panelArribaDerecha.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox.setBackground(new Color(240, 128, 128));
		chckbxNewCheckBox.setBounds(29, 160, 185, 23);
		panelArribaDerecha.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMostrarFechaDe = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxMostrarFechaDe.setBackground(new Color(240, 128, 128));
		chckbxMostrarFechaDe.setBounds(6, 180, 214, 23);
		panelArribaDerecha.add(chckbxMostrarFechaDe);
		
		//Tercer Panel
		JPanel panelAbajoIzquierda = new JPanel();
		panelAbajoIzquierda.setBackground(new Color(205, 92, 92));
		panelAbajoIzquierda.setLayout(null);
		GridBagConstraints gbc_panelAbajoIzquierda = new GridBagConstraints();
		gbc_panelAbajoIzquierda.gridwidth = 3;
		gbc_panelAbajoIzquierda.insets = new Insets(0, 0, 0, 5);
		gbc_panelAbajoIzquierda.fill = GridBagConstraints.BOTH;
		gbc_panelAbajoIzquierda.gridx = 0;
		gbc_panelAbajoIzquierda.gridy = 2;
		contentPane.add(panelAbajoIzquierda, gbc_panelAbajoIzquierda);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setMaximum(0);
		scrollBar.setBounds(164, 66, 17, 116);
		panelAbajoIzquierda.add(scrollBar);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setMaximum(11);
		scrollBar_1.setOrientation(JScrollBar.HORIZONTAL);
		scrollBar_1.setBounds(20, 182, 144, 17);
		panelAbajoIzquierda.add(scrollBar_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(205, 92, 92));
		btnNewButton.setBounds(164, 182, 17, 17);
		panelAbajoIzquierda.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 66, 144, 116);
		panelAbajoIzquierda.add(textArea);
		
		JLabel lblTituloPanel1_1 = new JLabel("Datos Opcionales");
		lblTituloPanel1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTituloPanel1_1.setBounds(10, 5, 122, 14);
		panelAbajoIzquierda.add(lblTituloPanel1_1);
		
		JLabel lblDescripcion = new JLabel("Descripción");
		lblDescripcion.setBounds(20, 30, 81, 14);
		panelAbajoIzquierda.add(lblDescripcion);
		
		JScrollBar scrollBar_2 = new JScrollBar();
		scrollBar_2.setMaximum(5);
		scrollBar_2.setBounds(329, 66, 17, 133);
		panelAbajoIzquierda.add(scrollBar_2);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Cantar", "Escuchar Muscia", "Leer", "Jugar", "Deportes", "Comer ñam ñam", "Otros"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(215, 66, 115, 133);
		panelAbajoIzquierda.add(list);
		
		JLabel lblPreferencias = new JLabel("Preferencias");
		lblPreferencias.setBounds(215, 30, 81, 14);
		panelAbajoIzquierda.add(lblPreferencias);
		
		
		//Cuarto Panel
		JPanel panelAbajoDerecha = new JPanel();
		panelAbajoDerecha.setBackground(new Color(127, 255, 212));
		panelAbajoDerecha.setLayout(null);
		GridBagConstraints gbc_panelAbajoDerecha = new GridBagConstraints();
		gbc_panelAbajoDerecha.fill = GridBagConstraints.BOTH;
		gbc_panelAbajoDerecha.gridx = 3;
		gbc_panelAbajoDerecha.gridy = 2;
		contentPane.add(panelAbajoDerecha, gbc_panelAbajoDerecha);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setIcon(new ImageIcon(getClass().getResource("cancelar.png")));
		btnNuevo.setBackground(Color.DARK_GRAY);
		btnNuevo.setForeground(Color.WHITE);
		btnNuevo.setBounds(30, 30, 122, 23);
		panelAbajoDerecha.add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon(getClass().getResource("disco-flexible.png")));
		btnGuardar.setBackground(Color.DARK_GRAY);
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setBounds(30, 90, 122, 23);
		panelAbajoDerecha.add(btnGuardar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("home.png")));
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setBackground(Color.DARK_GRAY);
		btnSalir.setBounds(30, 150, 122, 23);
		panelAbajoDerecha.add(btnSalir);
	}
}
