import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Grafik extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	Timer tiempo;
	Timer movimiento;
	
	public int x=60,y=70,segundo=0,minuto=0;
	public String color;
	public int xJugadorPosisionAnterior, yJugadorPosisionAnterior;
	public boolean colision = false;
	
	public static JButton btnReiniciar;
	

	MusicaLaberinto musica = new MusicaLaberinto();
	
	Player jugador = new Player(x,y,10,10,"#0E90D3");//jugador
	
	Player meta = new Player(630,430,20,20,"#CD0618");//meta
	
	Player obstaculos [] = {new Player(50,60,600,10,"#495A63"),//techo del laberinto
							new Player(50,450,600,10,"#495A63"),//suelo del laberinto
							new Player(50,60,10,400,"#495A63"),//parede izquierda laberinto
							new Player(650,60,10,400,"#495A63"),//parede derecha laberinto
							
							//paredes x
							new Player(60,90,30,10,"#495A63"),new Player(120,90,30,10,"#495A63"),new Player(180,90,30,10,"#495A63"),new Player(280,90,80,10,"#495A63"),new Player(400,90,150,10,"#495A63"),
							new Player(80,120,90,10,"#495A63"),new Player(200,120,90,10,"#495A63"),new Player(400,120,90,10,"#495A63"),new Player(530,120,90,10,"#495A63"),
							new Player(100,150,200,10,"#495A63"),new Player(350,150,150,10,"#495A63"),new Player(570,150,60,10,"#495A63"),
							new Player(90,180,50,10,"#495A63"),new Player(170,180,180,10,"#495A63"),new Player(380,180,20,10,"#495A63"),new Player(430,180,30,10,"#495A63"),new Player(600,180,50,10,"#495A63"),
							new Player(60,210,50,10,"#495A63"),new Player(130,210,30,10,"#495A63"),new Player(190,210,50,10,"#495A63"),new Player(300,210,240,10,"#495A63"),new Player(420,240,50,10,"#495A63"),
							new Player(90,240,50,10,"#495A63"),new Player(170,240,30,10,"#495A63"),new Player(250,240,50,10,"#495A63"),new Player(340,240,20,10,"#495A63"),new Player(420,240,50,10,"#495A63"),new Player(300,240,50,10,"#495A63"),new Player(360,240,20,10,"#495A63"),new Player(500,240,120,10,"#495A63"),
							new Player(120,270,50,10,"#495A63"),new Player(200,270,70,10,"#495A63"),new Player(320,270,50,10,"#495A63"),new Player(420,270,50,10,"#495A63"),new Player(520,270,50,10,"#495A63"),new Player(300,270,50,10,"#495A63"),new Player(630,270,20,10,"#495A63"),
							new Player(150,300,50,10,"#495A63"),new Player(250,300,90,10,"#495A63"),new Player(470,300,160,10,"#495A63"),
							new Player(90,330,100,10,"#495A63"),new Player(220,330,90,10,"#495A63"),new Player(350,330,130,10,"#495A63"),new Player(520,330,50,10,"#495A63"),new Player(600,330,50,10,"#495A63"),
							new Player(90,360,100,10,"#495A63"),new Player(220,360,90,10,"#495A63"),new Player(380,360,150,10,"#495A63"),new Player(580,360,50,10,"#495A63"),
							new Player(190,390,30,10,"#495A63"),new Player(290,390,60,10,"#495A63"),new Player(380,390,90,10,"#495A63"),new Player(510,390,140,10,"#495A63"),
							new Player(90,420,100,10,"#495A63"),new Player(220,420,90,10,"#495A63"),new Player(380,420,150,10,"#495A63"),new Player(580,420,70,10,"#495A63"),
							
							//paredes y
							new Player(90,120,10,40,"#495A63"),new Player(90,270,10,130,"#495A63"),new Player(90,440,10,10,"#495A63"),
							new Player(120,70,10,60,"#495A63"),new Player(120,180,10,90,"#495A63"),new Player(120,300,10,30,"#495A63"),new Player(120,360,10,30,"#495A63"),new Player(120,410,10,30,"#495A63"),
							new Player(150,150,10,40,"#495A63"),new Player(150,270,10,40,"#495A63"),new Player(150,370,10,30,"#495A63"),new Player(150,440,10,10,"#495A63"),
							new Player(180,70,10,60,"#495A63"),new Player(180,180,10,90,"#495A63"),new Player(180,300,10,30,"#495A63"),new Player(180,360,10,40,"#495A63"),new Player(180,410,10,30,"#495A63"),
							new Player(210,270,10,40,"#495A63"),new Player(210,360,10,50,"#495A63"),new Player(210,440,10,10,"#495A63"),
							new Player(240,70,10,60,"#495A63"),new Player(240,200,10,60,"#495A63"),new Player(240,300,10,30,"#495A63"),new Player(240,360,10,40,"#495A63"),new Player(240,410,10,30,"#495A63"),
							new Player(270,180,10,40,"#495A63"),new Player(270,270,10,40,"#495A63"),new Player(270,360,10,50,"#495A63"),new Player(270,440,10,10,"#495A63"),
							new Player(300,70,10,60,"#495A63"),new Player(300,200,10,60,"#495A63"),new Player(300,360,10,40,"#495A63"),new Player(300,410,10,30,"#495A63"),
					
							new Player(330,120,10,60,"#495A63"),new Player(330,360,10,40,"#495A63"),new Player(330,420,10,30,"#495A63"),
							new Player(360,90,10,40,"#495A63"),new Player(360,180,10,40,"#495A63"),new Player(360,270,10,40,"#495A63"),new Player(360,290,10,130,"#495A63"),new Player(360,440,10,10,"#495A63"),
							new Player(390,90,10,60,"#495A63"),new Player(390,180,10,60,"#495A63"),new Player(390,250,10,80,"#495A63"),new Player(390,360,10,40,"#495A63"),new Player(390,410,10,30,"#495A63"),
							new Player(420,140,10,200,"#495A63"),new Player(420,180,10,40,"#495A63"),new Player(420,270,10,40,"#495A63"),new Player(420,440,10,10,"#495A63"),
							new Player(450,300,10,40,"#495A63"),new Player(450,410,10,30,"#495A63"),
							new Player(480,180,10,40,"#495A63"),new Player(480,270,10,40,"#495A63"),new Player(480,440,10,10,"#495A63"),
							new Player(510,100,10,40,"#495A63"),new Player(510,220,10,30,"#495A63"),new Player(510,300,10,40,"#495A63"),new Player(510,410,10,40,"#495A63"),
							new Player(540,120,10,40,"#495A63"),new Player(540,180,10,40,"#495A63"),new Player(540,270,10,40,"#495A63"),new Player(540,400,10,30,"#495A63"),
							new Player(570,70,10,40,"#495A63"),new Player(570,160,10,80,"#495A63"),new Player(570,330,10,40,"#495A63"),
							new Player(600,80,10,40,"#495A63"),new Player(600,210,10,70,"#495A63"),new Player(600,330,10,40,"#495A63"),
							
							};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafik frame = new Grafik();
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
	public Grafik() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 700, 510);
		contentPane = new JPanel();
		this.setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		this.setFocusable(true);
		this.setResizable(false);//no deja cambiar el tamaño de la ventana
		this.addKeyListener(this);

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton btnReiniciar = new JButton("Reiniciar");
		
		JPanel panelLaberinto = new JPanel();
		panelLaberinto.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panelLaberinto, BorderLayout.CENTER);
		
		
		JPanel panelReinicio = new JPanel();
		panelReinicio.setBackground(new Color(109, 194, 107));
		contentPane.add(panelReinicio, BorderLayout.SOUTH);


		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jugador.setX(60);
				jugador.setY(70);
				segundo=0;
				minuto=0;
				repaint();
			}
		});
		btnReiniciar.setBackground(Color.WHITE);
		btnReiniciar.setFocusable(false);
		btnReiniciar.setFont(new Font("Tahoma", Font.BOLD, 18));
		panelReinicio.add(btnReiniciar);
		
		JPanel panelTiempo = new JPanel();
		panelTiempo.setBackground(new Color(109, 194, 107));
		contentPane.add(panelTiempo, BorderLayout.NORTH);
		
		JLabel lblTiempo = new JLabel("0:0");
		lblTiempo.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelTiempo.add(lblTiempo);
		
		
		tiempo = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				segundo++;
				if(segundo==60)
				{
					segundo=0;
					minuto++;
				}
				lblTiempo.setText(minuto + ":" + segundo);
			}
		});
		tiempo.start();
	}
	
	public void paint (Graphics g)
	{
		super.paint(g);
    	Graphics g2d = (Graphics)g;
    	//inicio 
    	g2d.setColor(Color.green);
    	g2d.fillRect(60,70, 20 , 20 );
    	
    	//meta
    	g2d.setColor(Color.decode(meta.getColor()));
    	g2d.fillRect(meta.getX(), meta.getY(), meta.getLargo(), meta.getAlto());
    	
    	//Jugador
    	g2d.setColor(Color.decode(jugador.getColor()));
    	g2d.fillRect(jugador.getX(), jugador.getY(), jugador.getLargo(), jugador.getAlto());
    	
    	//Obstucalo
    	for (Player obstaculo : obstaculos) {
    		g2d.setColor(Color.decode(obstaculo.getColor()));
        	g2d.fillRect(obstaculo.getX(), obstaculo.getY(), obstaculo.getLargo(), obstaculo.getAlto());
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Codigo te la tecla: " + e.getKeyCode() + " Tecla Presioanda: " + e.getKeyChar());
		xJugadorPosisionAnterior = jugador.getX();
		yJugadorPosisionAnterior = jugador.getY();
			switch(e.getKeyCode())
			{
				case 87://w arriba
					jugador.setY(jugador.getY()-10);
					break;
				case 65://a izquierda
					jugador.setX(jugador.getX()-10);
					break;
				case 83://s abajo
					jugador.setY(jugador.getY()+10);
					break;
				case 68://d derecha
					jugador.setX(jugador.getX()+10);
					break;
				default:
					break;
			}
			for (Player obstaculo : obstaculos) {
				if(jugador.getX()+jugador.getLargo() > obstaculo.getX() && jugador.getX() < obstaculo.getX()+obstaculo.getLargo()  &&
						jugador.getY()+jugador.getAlto() > obstaculo.getY() && jugador.getY() < obstaculo.getY()+obstaculo.getAlto())
				{
					System.out.println("colision");
					jugador.setX(xJugadorPosisionAnterior);
					jugador.setY(yJugadorPosisionAnterior);
				}
			}
			this.update(getGraphics());
			//metodo para ver si se llegó a la meta
			if(jugador.getX()+jugador.getLargo() > meta.getX() && jugador.getX() < meta.getX()+meta.getLargo()  &&
					jugador.getY()+jugador.getAlto() > meta.getY() && jugador.getY() < meta.getY()+meta.getAlto())
			{
				JOptionPane.showMessageDialog(null, "El tiempo en llegar a la meta fue de " + minuto + ":" + segundo);
				jugador.setX(60);
				jugador.setY(70);
				segundo=0;
				minuto=0;
				this.update(getGraphics());
			}
	}
}
