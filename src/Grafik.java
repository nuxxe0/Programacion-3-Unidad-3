import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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

public class Grafik extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public int x =270,y=170;
	
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
		setBounds(50, 50, 600, 400);
		contentPane = new JPanel();
		this.setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setFocusable(true);
		this.addKeyListener(this);

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelArriba = new JPanel();
		panelArriba.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panelArriba, BorderLayout.CENTER);
		
		
		JPanel panelAbajo = new JPanel();
		panelAbajo.setBackground(Color.GRAY);
		contentPane.add(panelAbajo, BorderLayout.SOUTH);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setBackground(Color.WHITE);
		btnReiniciar.setFocusable(false);
		btnReiniciar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelAbajo.add(btnReiniciar);
	}
	
	
	@Override
	public void paint (Graphics g)
	{
		super.paint(g);
    	Graphics g2d = (Graphics)g;
    	g2d.setColor(Color.white);
    	//g2d.drawLine(30, 0, 770, 450);//linea
    	g2d.fillRect(x, y, 50, 50);//cuadraro
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Codigo te la tecla: " + e.getKeyCode() + " Tecla Presioanda: " + e.getKeyChar());
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode())
		{
			case 87://w arriba
				y-=10;
				break;
				
			case 65://a izquierda
				x-=10;
				break;
				
			case 83://s abajo
				y+=10;
				break;
				
			case 68://d derecha
				x+=10;
				break;
				
			default:
				break;
		}
		this.update(getGraphics());
		
	}
	

}
