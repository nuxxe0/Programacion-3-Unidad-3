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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Tablero extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public static JButton btnCaja1;
	public static JButton btnCaja2;
	public static JButton btnCaja3;
	public static JButton btnCaja4;
	public static JButton btnCaja5;
	public static JButton btnCaja6;
	public static JButton btnCaja7;
	public static JButton btnCaja8;
	public static JButton btnCaja9;
	public static JButton btnCaja10;
	public static JButton btnCaja11;
	public static JButton btnCaja12;
	public static JButton btnCaja13;
	public static JButton btnCaja14;
	public static JButton btnCaja15;
	
	public static JButton btnRevolver;
	public static JButton btnPausar;
	public static JButton btnReaundar;
	public static JButton btnReiniciar;
	
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
		
		int[][] espacio = new int [4][4];
		
		String [] numeros =  {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",""} ;
		for (int i = 0; i <= 15; i++)
		{
			//revuelve el arreglo
			Collections.shuffle(Arrays.asList(numeros));
		}
		for (String elemento : numeros) {
            System.out.print(elemento + " ,");
        }
		System.out.println();
		
		JButton btnCaja1 = new JButton(numeros[0]);
		JButton btnCaja2 = new JButton(numeros[1]);
		JButton btnCaja3 = new JButton(numeros[2]);
		JButton btnCaja4 = new JButton(numeros[3]);
		JButton btnCaja5 = new JButton(numeros[4]);
		JButton btnCaja6 = new JButton(numeros[5]);
		JButton btnCaja7 = new JButton(numeros[6]);
		JButton btnCaja8 = new JButton(numeros[7]);
		JButton btnCaja9 = new JButton(numeros[8]);
		JButton btnCaja10 = new JButton(numeros[9]);
		JButton btnCaja11 = new JButton(numeros[10]);
		JButton btnCaja12 = new JButton(numeros[11]);
		JButton btnCaja13 = new JButton(numeros[12]);
		JButton btnCaja14 = new JButton(numeros[13]);
		JButton btnCaja15 = new JButton(numeros[14]);
		JButton btnCaja16 = new JButton(numeros[15]);
		
		JButton btnRevolver = new JButton("Revolver");
		JButton btnPausar = new JButton("Pausar");
		JButton btnReaundar = new JButton("Reanudar");
		btnReaundar.setEnabled(false);
		JButton btnReiniciar = new JButton("Reiniciar");
		
		for(int i=1; i<=16;i++)
		{
			switch(i)
			{
				case 1:
					if(btnCaja1.getText().equals(""))
					{
						espacio [0][0]=0;
					}else {
						espacio [0][0]=1;
					}
				case 2:
					if(btnCaja2.getText().equals(""))
					{
						espacio [0][1]=0;
					}else {
						espacio [0][1]=1;
					}
				case 3:
					if(btnCaja3.getText().equals(""))
					{
						espacio [0][2]=0;
					}else {
						espacio [0][2]=1;
					}
				case 4:
					if(btnCaja4.getText().equals(""))
					{
						espacio [0][3]=0;
					}else {
						espacio [0][3]=1;
					}
				case 5:
					if(btnCaja5.getText().equals(""))
					{
						espacio [1][0]=0;
					}else {
						espacio [1][0]=1;
					}
				case 6:
					if(btnCaja6.getText().equals(""))
					{
						espacio [1][1]=0;
					}else {
						espacio [1][1]=1;
					}
				case 7:
					if(btnCaja7.getText().equals(""))
					{
						espacio [1][2]=0;
					}else {
						espacio [1][2]=1;
					}
				case 8:
					if(btnCaja8.getText().equals(""))
					{
						espacio [1][3]=0;
					}else {
						espacio [1][3]=1;
					}
				case 9:
					if(btnCaja9.getText().equals(""))
					{
						espacio [2][0]=0;
					}else {
						espacio [2][0]=1;
					}
				case 10:
					if(btnCaja10.getText().equals(""))
					{
						espacio [2][1]=0;
					}else {
						espacio [2][1]=1;
					}
				case 11:
					if(btnCaja11.getText().equals(""))
					{
						espacio [2][2]=0;
					}else {
						espacio [2][2]=1;
					}
				case 12:
					if(btnCaja12.getText().equals(""))
					{
						espacio [2][3]=0;
					}else {
						espacio [2][3]=1;
					}
				case 13:
					if(btnCaja13.getText().equals(""))
					{
						espacio [3][0]=0;
					}else {
						espacio [3][0]=1;
					}
				case 14:
					if(btnCaja14.getText().equals(""))
					{
						espacio [3][1]=0;
					}else {
						espacio [3][1]=1;
					}
				case 15:
					if(btnCaja15.getText().equals(""))
					{
						espacio [3][2]=0;
					}else {
						espacio [3][2]=1;
					}
				case 16:
					if(btnCaja16.getText().equals(""))
					{
						espacio [3][3]=0;
					}else {
						espacio [3][3]=1;
					}
					
			}
			
		}

		for(int f=0; f<4;f++)
		{
			for(int c=0; c<4;c++)
			{
				System.out.print(espacio[f][c] + "");
			}
			System.out.println();
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
		
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(new Color(238, 130, 238));
		contentPane.add(panelBotones, BorderLayout.CENTER);
		panelBotones.setLayout(new GridLayout(4, 4, 5, 5));
		
		//BOTON 1
		btnCaja1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(espacio[0][1]==0)
				{
					btnCaja2.setText(btnCaja1.getText());
					btnCaja1.setText("");
					espacio[0][1]=1;
					espacio[0][0]=0;
				}else if(espacio[1][0]==0)
				{
					btnCaja5.setText(btnCaja1.getText());
					btnCaja1.setText("");
					espacio[1][0]=1;
					espacio[0][0]=0;
				}
				
				if(btnCaja1.getText().equals("1")) {
					System.out.println("pepe");
				}
				
				
			}
			
		});
		btnCaja1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnCaja1.setBackground(new Color(255, 255, 224));
		panelBotones.add(btnCaja1);
		
		
		//BOTON 2
		btnCaja2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(espacio[0][0]==0)
				{
					btnCaja1.setText(btnCaja2.getText());
					btnCaja2.setText("");
					espacio[0][0]=1;
					espacio[0][1]=0;
				}else if(espacio[0][2]==0)
				{
					btnCaja3.setText(btnCaja2.getText());
					btnCaja2.setText("");
					espacio[0][2]=1;
					espacio[0][1]=0;
				}else if(espacio[1][1]==0)
				{
					btnCaja6.setText(btnCaja2.getText());
					btnCaja2.setText("");
					espacio[1][1]=1;
					espacio[0][1]=0;
				}
			}
		});
		btnCaja2.setBackground(new Color(255, 255, 224));
		btnCaja2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja2);


		//BOTON 3
		btnCaja3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(espacio[0][1]==0)
				{
					btnCaja2.setText(btnCaja3.getText());
					btnCaja3.setText("");
					espacio[0][1]=1;
					espacio[0][2]=0;
				}else if(espacio[0][3]==0)
				{
					btnCaja4.setText(btnCaja3.getText());
					btnCaja3.setText("");
					espacio[0][3]=1;
					espacio[0][2]=0;
				}else if(espacio[1][2]==0)
				{
					btnCaja7.setText(btnCaja3.getText());
					btnCaja3.setText("");
					espacio[1][2]=1;
					espacio[0][2]=0;
				}
			}
		});
		btnCaja3.setBackground(new Color(255, 255, 224));
		btnCaja3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja3);


		//BOTON 4
		btnCaja4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(espacio[0][2]==0)
				{
					btnCaja3.setText(btnCaja4.getText());
					btnCaja4.setText("");
					espacio[0][2]=1;
					espacio[0][3]=0;
				}else if(espacio[1][3]==0)
				{
					btnCaja8.setText(btnCaja4.getText());
					btnCaja4.setText("");
					espacio[1][3]=1;
					espacio[0][3]=0;
				}
			}
		});
		btnCaja4.setBackground(new Color(255, 255, 224));
		btnCaja4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja4);


		//BOTON 5
		btnCaja5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(espacio[0][0]==0)
				{
					btnCaja1.setText(btnCaja5.getText());
					btnCaja5.setText("");
					espacio[0][0]=1;
					espacio[1][0]=0;
				}else if(espacio[2][0]==0)
				{
					btnCaja9.setText(btnCaja5.getText());
					btnCaja5.setText("");
					espacio[2][0]=1;
					espacio[1][0]=0;
				}else if(espacio[1][1]==0)
				{
					btnCaja6.setText(btnCaja5.getText());
					btnCaja5.setText("");
					espacio[1][1]=1;
					espacio[1][0]=0;
				}
			}
		});
		btnCaja5.setBackground(new Color(255, 255, 224));
		btnCaja5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja5);


		//BOTON 6
		btnCaja6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(espacio[1][0]==0)
				{
					btnCaja5.setText(btnCaja6.getText());
					btnCaja6.setText("");
					espacio[1][0]=1;
					espacio[1][1]=0;
				}else if(espacio[0][1]==0)
				{
					btnCaja2.setText(btnCaja6.getText());
					btnCaja6.setText("");
					espacio[0][1]=1;
					espacio[1][1]=0;
				}else if(espacio[1][2]==0)
				{
					btnCaja7.setText(btnCaja6.getText());
					btnCaja6.setText("");
					espacio[1][2]=1;
					espacio[1][1]=0;
				}else if(espacio[2][1]==0)
				{
					btnCaja10.setText(btnCaja6.getText());
					btnCaja6.setText("");
					espacio[2][1]=1;
					espacio[1][1]=0;
				}
				
			}
		});
		btnCaja6.setBackground(new Color(255, 255, 224));
		btnCaja6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja6);


		//BOTON 7
		btnCaja7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(espacio[1][1]==0)
				{
					btnCaja6.setText(btnCaja7.getText());
					btnCaja7.setText("");
					espacio[1][1]=1;
					espacio[1][2]=0;
				}else if(espacio[0][2]==0)
				{
					btnCaja3.setText(btnCaja7.getText());
					btnCaja7.setText("");
					espacio[0][2]=1;
					espacio[1][2]=0;
				}else if(espacio[1][3]==0)
				{
					btnCaja8.setText(btnCaja7.getText());
					btnCaja7.setText("");
					espacio[1][3]=1;
					espacio[1][2]=0;
				}else if(espacio[2][2]==0)
				{
					btnCaja11.setText(btnCaja7.getText());
					btnCaja7.setText("");
					espacio[2][2]=1;
					espacio[1][2]=0;
				}
			}
		});
		btnCaja7.setBackground(new Color(255, 255, 224));
		btnCaja7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja7);


		//BOTON 8
		btnCaja8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(espacio[1][2]==0)
				{
					btnCaja7.setText(btnCaja8.getText());
					btnCaja8.setText("");
					espacio[1][2]=1;
					espacio[1][3]=0;
				}else if(espacio[0][3]==0)
				{
					btnCaja4.setText(btnCaja8.getText());
					btnCaja8.setText("");
					espacio[0][3]=1;
					espacio[1][3]=0;
				}else if(espacio[2][3]==0)
				{
					btnCaja12.setText(btnCaja8.getText());
					btnCaja8.setText("");
					espacio[2][3]=1;
					espacio[1][3]=0;
				}
			}
		});
		btnCaja8.setBackground(new Color(255, 255, 224));
		btnCaja8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja8);


		//BOTON 9
		btnCaja9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(espacio[1][0]==0)
				{
					btnCaja5.setText(btnCaja9.getText());
					btnCaja9.setText("");
					espacio[1][0]=1;
					espacio[2][0]=0;
				}else if(espacio[2][1]==0)
				{
					btnCaja10.setText(btnCaja9.getText());
					btnCaja9.setText("");
					espacio[2][1]=1;
					espacio[2][0]=0;
				}else if(espacio[3][0]==0)
				{
					btnCaja13.setText(btnCaja9.getText());
					btnCaja9.setText("");
					espacio[3][0]=1;
					espacio[2][0]=0;
				}
			}
		});
		btnCaja9.setBackground(new Color(255, 255, 224));
		btnCaja9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja9);


		//BOTON 10
		btnCaja10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(espacio[1][1]==0)
				{
					btnCaja6.setText(btnCaja10.getText());
					btnCaja10.setText("");
					espacio[1][1]=1;
					espacio[2][1]=0;
				}else if(espacio[2][0]==0)
				{
					btnCaja9.setText(btnCaja10.getText());
					btnCaja10.setText("");
					espacio[2][0]=1;
					espacio[2][1]=0;
				}else if(espacio[2][2]==0)
				{
					btnCaja11.setText(btnCaja10.getText());
					btnCaja10.setText("");
					espacio[2][2]=1;
					espacio[2][1]=0;
				}else if(espacio[3][1]==0)
				{
					btnCaja14.setText(btnCaja10.getText());
					btnCaja10.setText("");
					espacio[3][1]=1;
					espacio[2][1]=0;
				}
			}
		});
		btnCaja10.setBackground(new Color(255, 255, 224));
		btnCaja10.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja10);


		//BOTON 11
		btnCaja11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(espacio[1][2]==0)
				{
					btnCaja7.setText(btnCaja11.getText());
					btnCaja11.setText("");
					espacio[1][2]=1;
					espacio[2][2]=0;
				}else if(espacio[2][1]==0)
				{
					btnCaja10.setText(btnCaja11.getText());
					btnCaja11.setText("");
					espacio[2][1]=1;
					espacio[2][2]=0;
				}else if(espacio[2][3]==0)
				{
					btnCaja12.setText(btnCaja11.getText());
					btnCaja11.setText("");
					espacio[2][3]=1;
					espacio[2][2]=0;
				}else if(espacio[3][2]==0)
				{
					btnCaja15.setText(btnCaja11.getText());
					btnCaja11.setText("");
					espacio[3][2]=1;
					espacio[2][2]=0;
				}
			}
		});
		btnCaja11.setBackground(new Color(255, 255, 224));
		btnCaja11.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja11);


		//BOTON 12
		btnCaja12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(espacio[1][3]==0)
				{
					btnCaja8.setText(btnCaja12.getText());
					btnCaja12.setText("");
					espacio[1][3]=1;
					espacio[2][3]=0;
				}else if(espacio[2][2]==0)
				{
					btnCaja11.setText(btnCaja12.getText());
					btnCaja12.setText("");
					espacio[2][2]=1;
					espacio[2][3]=0;
				}else if(espacio[3][3]==0)
				{
					btnCaja16.setText(btnCaja12.getText());
					btnCaja12.setText("");
					espacio[3][3]=1;
					espacio[2][3]=0;
				}
			}
		});
		btnCaja12.setBackground(new Color(255, 255, 224));
		btnCaja12.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja12);


		//BOTON 13
		btnCaja13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(espacio[2][0]==0)
				{
					btnCaja9.setText(btnCaja13.getText());
					btnCaja13.setText("");
					espacio[2][0]=1;
					espacio[3][0]=0;
				}else if(espacio[3][1]==0)
				{
					btnCaja14.setText(btnCaja13.getText());
					btnCaja13.setText("");
					espacio[3][1]=1;
					espacio[3][0]=0;
				}
			}
		});
		btnCaja13.setBackground(new Color(255, 255, 224));
		btnCaja13.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja13);


		//BOTON 14
		btnCaja14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(espacio[2][1]==0)
				{
					btnCaja10.setText(btnCaja14.getText());
					btnCaja14.setText("");
					espacio[2][1]=1;
					espacio[3][1]=0;
				}else if(espacio[3][0]==0)
				{
					btnCaja13.setText(btnCaja14.getText());
					btnCaja14.setText("");
					espacio[3][0]=1;
					espacio[3][1]=0;
				}else if(espacio[3][2]==0)
				{
					btnCaja15.setText(btnCaja14.getText());
					btnCaja14.setText("");
					espacio[3][2]=1;
					espacio[3][1]=0;
				}
			}
		});
		btnCaja14.setBackground(new Color(255, 255, 224));
		btnCaja14.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja14);


		//BOTON 15
		btnCaja15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(espacio[2][2]==0)
				{
					btnCaja11.setText(btnCaja15.getText());
					btnCaja15.setText("");
					espacio[2][2]=1;
					espacio[3][2]=0;
				}else if(espacio[3][1]==0)
				{
					btnCaja14.setText(btnCaja15.getText());
					btnCaja15.setText("");
					espacio[3][1]=1;
					espacio[3][2]=0;
				}else if(espacio[3][3]==0)
				{
					btnCaja16.setText(btnCaja15.getText());
					btnCaja15.setText("");
					espacio[3][3]=1;
					espacio[3][2]=0;
				}
			}
		});
		btnCaja15.setBackground(new Color(255, 255, 224));
		btnCaja15.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja15);


		//BOTON 16
		btnCaja16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(espacio[2][3]==0)
				{
					btnCaja12.setText(btnCaja16.getText());
					btnCaja16.setText("");
					espacio[2][3]=1;
					espacio[3][3]=0;
				}else if(espacio[3][2]==0)
				{
					btnCaja15.setText(btnCaja16.getText());
					btnCaja16.setText("");
					espacio[3][2]=1;
					espacio[3][3]=0;
				}
			}
		});
		btnCaja16.setBackground(new Color(255, 255, 224));
		btnCaja16.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotones.add(btnCaja16);
		
		
		JPanel panelArriba = new JPanel();
		panelArriba.setBackground(new Color(238, 130, 238));
		contentPane.add(panelArriba, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("PUZZLE NUMERICO");
		lblNewLabel.setForeground(new Color(72, 61, 139));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		panelArriba.add(lblNewLabel);
		
		JPanel panelIzquierda = new JPanel();
		panelIzquierda.setBackground(new Color(238, 130, 238));
		contentPane.add(panelIzquierda, BorderLayout.WEST);
		
		JPanel panelDerecha = new JPanel();
		panelDerecha.setBackground(new Color(238, 130, 238));
		contentPane.add(panelDerecha, BorderLayout.EAST);
		panelDerecha.setLayout(new BorderLayout(0, 0));
		
		
		btnRevolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				for (int i = 0; i <= 15; i++)
				{
					//revuelve el arreglo
					Collections.shuffle(Arrays.asList(numeros));
				}
				btnCaja1.setText(numeros[0]);
				btnCaja2.setText(numeros[1]);
				btnCaja3.setText(numeros[2]);
				btnCaja4.setText(numeros[3]);
				btnCaja5.setText(numeros[4]);
				btnCaja6.setText(numeros[5]);
				btnCaja7.setText(numeros[6]);
				btnCaja8.setText(numeros[7]);
				btnCaja9.setText(numeros[8]);
				btnCaja10.setText(numeros[9]);
				btnCaja11.setText(numeros[10]);
				btnCaja12.setText(numeros[11]);
				btnCaja13.setText(numeros[12]);
				btnCaja14.setText(numeros[13]);
				btnCaja15.setText(numeros[14]);
				btnCaja16.setText(numeros[15]);

	            System.out.println();
	            
				for (String elemento : numeros) 
				{
		            System.out.print(elemento + " ,");
		        }
				
				System.out.println();
				
				for(int i=1; i<=16;i++)
				{
					switch(i)
					{
						case 1:
							if(btnCaja1.getText().equals(""))
							{
								espacio [0][0]=0;
							}else {
								espacio [0][0]=1;
							}
						case 2:
							if(btnCaja2.getText().equals(""))
							{
								espacio [0][1]=0;
							}else {
								espacio [0][1]=1;
							}
						case 3:
							if(btnCaja3.getText().equals(""))
							{
								espacio [0][2]=0;
							}else {
								espacio [0][2]=1;
							}
						case 4:
							if(btnCaja4.getText().equals(""))
							{
								espacio [0][3]=0;
							}else {
								espacio [0][3]=1;
							}
						case 5:
							if(btnCaja5.getText().equals(""))
							{
								espacio [1][0]=0;
							}else {
								espacio [1][0]=1;
							}
						case 6:
							if(btnCaja6.getText().equals(""))
							{
								espacio [1][1]=0;
							}else {
								espacio [1][1]=1;
							}
						case 7:
							if(btnCaja7.getText().equals(""))
							{
								espacio [1][2]=0;
							}else {
								espacio [1][2]=1;
							}
						case 8:
							if(btnCaja8.getText().equals(""))
							{
								espacio [1][3]=0;
							}else {
								espacio [1][3]=1;
							}
						case 9:
							if(btnCaja9.getText().equals(""))
							{
								espacio [2][0]=0;
							}else {
								espacio [2][0]=1;
							}
						case 10:
							if(btnCaja10.getText().equals(""))
							{
								espacio [2][1]=0;
							}else {
								espacio [2][1]=1;
							}
						case 11:
							if(btnCaja11.getText().equals(""))
							{
								espacio [2][2]=0;
							}else {
								espacio [2][2]=1;
							}
						case 12:
							if(btnCaja12.getText().equals(""))
							{
								espacio [2][3]=0;
							}else {
								espacio [2][3]=1;
							}
						case 13:
							if(btnCaja13.getText().equals(""))
							{
								espacio [3][0]=0;
							}else {
								espacio [3][0]=1;
							}
						case 14:
							if(btnCaja14.getText().equals(""))
							{
								espacio [3][1]=0;
							}else {
								espacio [3][1]=1;
							}
						case 15:
							if(btnCaja15.getText().equals(""))
							{
								espacio [3][2]=0;
							}else {
								espacio [3][2]=1;
							}
						case 16:
							if(btnCaja16.getText().equals(""))
							{
								espacio [3][3]=0;
							}else {
								espacio [3][3]=1;
							}
							
					}
					
				}

				for(int f=0; f<4;f++)
				{
					for(int c=0; c<4;c++)
					{
						System.out.print(espacio[f][c] + "");
					}
					System.out.println();
				}
			}
		});
		btnRevolver.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnRevolver.setBackground(new Color(240, 128, 128));
		panelBotonReset.add(btnRevolver);
		
		
		btnPausar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCaja1.setEnabled(false);
				btnCaja2.setEnabled(false);
				btnCaja3.setEnabled(false);
				btnCaja4.setEnabled(false);
				btnCaja5.setEnabled(false);
				btnCaja6.setEnabled(false);
				btnCaja7.setEnabled(false);
				btnCaja8.setEnabled(false);
				btnCaja9.setEnabled(false);
				btnCaja10.setEnabled(false);
				btnCaja11.setEnabled(false);
				btnCaja12.setEnabled(false);
				btnCaja13.setEnabled(false);
				btnCaja14.setEnabled(false);
				btnCaja15.setEnabled(false);
				btnCaja16.setEnabled(false);
				
				btnRevolver.setEnabled(false);
				btnReiniciar.setEnabled(false);
				btnPausar.setEnabled(false);
				btnReaundar.setEnabled(true);
			}
		});
		btnPausar.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnPausar.setBackground(new Color(192, 192, 192));
		panelBotonReset.add(btnPausar);
		
		
		btnReaundar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnCaja1.setEnabled(true);
				btnCaja2.setEnabled(true);
				btnCaja3.setEnabled(true);
				btnCaja4.setEnabled(true);
				btnCaja5.setEnabled(true);
				btnCaja6.setEnabled(true);
				btnCaja7.setEnabled(true);
				btnCaja8.setEnabled(true);
				btnCaja9.setEnabled(true);
				btnCaja10.setEnabled(true);
				btnCaja11.setEnabled(true);
				btnCaja12.setEnabled(true);
				btnCaja13.setEnabled(true);
				btnCaja14.setEnabled(true);
				btnCaja15.setEnabled(true);
				btnCaja16.setEnabled(true);
				
				btnRevolver.setEnabled(true);
				btnReiniciar.setEnabled(true);
				btnPausar.setEnabled(true);
				btnReaundar.setEnabled(false);
				
			}
		});
		btnReaundar.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnReaundar.setBackground(new Color(152, 251, 152));
		panelBotonReset.add(btnReaundar);
		
		
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCaja1.setText(numeros[0]);
				btnCaja2.setText(numeros[1]);
				btnCaja3.setText(numeros[2]);
				btnCaja4.setText(numeros[3]);
				btnCaja5.setText(numeros[4]);
				btnCaja6.setText(numeros[5]);
				btnCaja7.setText(numeros[6]);
				btnCaja8.setText(numeros[7]);
				btnCaja9.setText(numeros[8]);
				btnCaja10.setText(numeros[9]);
				btnCaja11.setText(numeros[10]);
				btnCaja12.setText(numeros[11]);
				btnCaja13.setText(numeros[12]);
				btnCaja14.setText(numeros[13]);
				btnCaja15.setText(numeros[14]);
				btnCaja16.setText(numeros[15]);
				
				for(int i=1; i<=16;i++)
				{
					switch(i)
					{
						case 1:
							if(btnCaja1.getText().equals(""))
							{
								espacio [0][0]=0;
							}else {
								espacio [0][0]=1;
							}
						case 2:
							if(btnCaja2.getText().equals(""))
							{
								espacio [0][1]=0;
							}else {
								espacio [0][1]=1;
							}
						case 3:
							if(btnCaja3.getText().equals(""))
							{
								espacio [0][2]=0;
							}else {
								espacio [0][2]=1;
							}
						case 4:
							if(btnCaja4.getText().equals(""))
							{
								espacio [0][3]=0;
							}else {
								espacio [0][3]=1;
							}
						case 5:
							if(btnCaja5.getText().equals(""))
							{
								espacio [1][0]=0;
							}else {
								espacio [1][0]=1;
							}
						case 6:
							if(btnCaja6.getText().equals(""))
							{
								espacio [1][1]=0;
							}else {
								espacio [1][1]=1;
							}
						case 7:
							if(btnCaja7.getText().equals(""))
							{
								espacio [1][2]=0;
							}else {
								espacio [1][2]=1;
							}
						case 8:
							if(btnCaja8.getText().equals(""))
							{
								espacio [1][3]=0;
							}else {
								espacio [1][3]=1;
							}
						case 9:
							if(btnCaja9.getText().equals(""))
							{
								espacio [2][0]=0;
							}else {
								espacio [2][0]=1;
							}
						case 10:
							if(btnCaja10.getText().equals(""))
							{
								espacio [2][1]=0;
							}else {
								espacio [2][1]=1;
							}
						case 11:
							if(btnCaja11.getText().equals(""))
							{
								espacio [2][2]=0;
							}else {
								espacio [2][2]=1;
							}
						case 12:
							if(btnCaja12.getText().equals(""))
							{
								espacio [2][3]=0;
							}else {
								espacio [2][3]=1;
							}
						case 13:
							if(btnCaja13.getText().equals(""))
							{
								espacio [3][0]=0;
							}else {
								espacio [3][0]=1;
							}
						case 14:
							if(btnCaja14.getText().equals(""))
							{
								espacio [3][1]=0;
							}else {
								espacio [3][1]=1;
							}
						case 15:
							if(btnCaja15.getText().equals(""))
							{
								espacio [3][2]=0;
							}else {
								espacio [3][2]=1;
							}
						case 16:
							if(btnCaja16.getText().equals(""))
							{
								espacio [3][3]=0;
							}else {
								espacio [3][3]=1;
							}
							
					}
					
				}
			}
		});
		btnReiniciar.setBackground(new Color(135, 206, 235));
		btnReiniciar.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		panelBotonReset.add(btnReiniciar);
		
		
		
	}
	

}
