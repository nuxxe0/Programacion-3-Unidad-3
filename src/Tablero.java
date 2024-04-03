import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.Collections;
import java.awt.Color;
import java.awt.Font;

public class Tablero extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablero frame = new Tablero();
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
	public Tablero() {
		
		String [] numeros =  {"","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"} ;
		for (int i = 0; i <= 15; i++)
		{
			Collections.shuffle(Arrays.asList(numeros));
		}
		for (String elemento : numeros) {
            System.out.println(elemento);
        }
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 130, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotonReset = new JPanel();
		panelBotonReset.setBackground(new Color(238, 130, 238));
		contentPane.add(panelBotonReset, BorderLayout.SOUTH);
		
		JButton btnReset = new JButton("Reiniciar");
		btnReset.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnReset.setBackground(Color.WHITE);
		panelBotonReset.add(btnReset);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(new Color(238, 130, 238));
		contentPane.add(panelBotones, BorderLayout.CENTER);
		panelBotones.setLayout(new GridLayout(4, 4, 5, 5));
		
		JButton btnCaja1 = new JButton(numeros[0]);
		btnCaja1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnCaja1.setBackground(Color.WHITE);
		panelBotones.add(btnCaja1);
		
		JButton btnCaja2 = new JButton(numeros[1]);
		btnCaja2.setBackground(Color.WHITE);
		btnCaja2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja2);
		
		JButton btnCaja3 = new JButton(numeros[2]);
		btnCaja3.setBackground(Color.WHITE);
		btnCaja3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja3);
		
		JButton btnCaja4 = new JButton(numeros[3]);
		btnCaja4.setBackground(Color.WHITE);
		btnCaja4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja4);
		
		JButton btnCaja5 = new JButton(numeros[4]);
		btnCaja5.setBackground(Color.WHITE);
		btnCaja5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja5);
		
		JButton btnCaja6 = new JButton(numeros[5]);
		btnCaja6.setBackground(Color.WHITE);
		btnCaja6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja6);
		
		JButton btnCaja7 = new JButton(numeros[6]);
		btnCaja7.setBackground(Color.WHITE);
		btnCaja7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja7);
		
		JButton btnCaja8 = new JButton(numeros[7]);
		btnCaja8.setBackground(Color.WHITE);
		btnCaja8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja8);
		
		JButton btnCaja9 = new JButton(numeros[8]);
		btnCaja9.setBackground(Color.WHITE);
		btnCaja9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja9);
		
		JButton btnCaja10 = new JButton(numeros[9]);
		btnCaja10.setBackground(Color.WHITE);
		btnCaja10.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja10);
		
		JButton btnCaja11 = new JButton(numeros[10]);
		btnCaja11.setBackground(Color.WHITE);
		btnCaja11.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja11);
		
		JButton btnCaja12 = new JButton(numeros[11]);
		btnCaja12.setBackground(Color.WHITE);
		btnCaja12.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja12);
		
		JButton btnCaja13 = new JButton(numeros[12]);
		btnCaja13.setBackground(Color.WHITE);
		btnCaja13.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja13);
		
		JButton btnCaja14 = new JButton(numeros[13]);
		btnCaja14.setBackground(Color.WHITE);
		btnCaja14.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja14);
		
		JButton btnCaja15 = new JButton(numeros[14]);
		btnCaja15.setBackground(Color.WHITE);
		btnCaja15.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja15);
		
		JButton btnCaja16 = new JButton(numeros[15]);
		btnCaja16.setBackground(Color.WHITE);
		btnCaja16.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja16);
		
		
		JPanel panelArriba = new JPanel();
		panelArriba.setBackground(new Color(238, 130, 238));
		contentPane.add(panelArriba, BorderLayout.NORTH);
		
		JPanel panelIzquierda = new JPanel();
		panelIzquierda.setBackground(new Color(238, 130, 238));
		contentPane.add(panelIzquierda, BorderLayout.WEST);
		
		JPanel panelDerecha = new JPanel();
		panelDerecha.setBackground(new Color(238, 130, 238));
		contentPane.add(panelDerecha, BorderLayout.EAST);
		
		
	}

}
