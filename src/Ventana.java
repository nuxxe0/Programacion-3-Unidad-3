import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame implements KeyListener,MouseListener{
    
	
	JPanel btn_panel = new  JPanel();
	//JButton otroBotton = new JButton();
	//JButton otroBotton = new JButton();
    public Ventana(){

      //permite que la ventana sea visible uwu
      this.setVisible(true);
      this.setSize(1000, 700);//darle un tamaño a la ventana
      //this.setLocation(500, 500);//ubicacion en la pantalla
      this.setLocationRelativeTo(null);//centrar la ventana en la pantalla
      this.setResizable(true);//no deja cambiar el tamaño de la ventana
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar el programa por defecto
      this.setMinimumSize(new Dimension(500,500));//tamaño minimo
      this.setMaximumSize(new Dimension(800,600));//maño maximo

      this.setLayout(null);//quitar molde
      addKeyListener(this);
      addMouseListener(this);
      this.iniciarComponentes();//iniciar los componentes
      }
    
    
    /*
    //casita con la libreria Graphics
    @Override
    public void paint(Graphics g) { //la funcion paint se invoca sola uwu
    	super.paint(g);
    	Graphics g2d = (Graphics)g;
//    	//g2d.setColor(Color.blue);//asigma el color del pincel
//    	//fill para rellenar dibuju y draw para solo trazar
//    	//g2d.drawLine(30, 70, 770, 70);//dibuja una linea
//    	//g2d.fillRect(50, 50, 200, 100);//dibuja rectangulo relleno
//    	//g2d.clearRect(100, 100, 100, 100);//borra un area 
//    	
//    	//g2d.drawArc(300, 300, 100, 100, 40, 180);//dibuja un arco
//    	//g2d.fillArc(400, 400, 100, 100, 45, 180);
//    	
//    	//g2d.setColor(Color.black);
//    	//g2d.drawLine(0, 0, 500, 500);
//    	
//    	
//    	//g2d.fillOval(600, 400, 50, 200);//dibuja un ovalo
//    	//g2d.fillOval(500, 400, 50, 50);
//    	
//    	//int xPoints[] = {100,250,300};
//    	//int yPoints[] = {100,100,300};
//    	
//    	
//    	//INTERFAZ CASA
//    	//fondo
//    	//cielo de la casa
//    	g2d.setColor(Color.decode("#53FAFF"));
//    	g2d.fillRect(1, 1, 1000, 700);
//    	
//    	//pasto de la casa
//    	g2d.setColor(Color.decode("#67EA4A"));
//    	g2d.fillRect(1, 350, 1000, 400);
//    	
//    	
//    	
//    	
//    	//Sol
//    	g2d.setColor(Color.decode("#DFEC2E"));
//    	g2d.fillRect(50, 50, 150, 150);
//    	g2d.setColor(Color.decode("#F6FF80"));
//    	g2d.fillRect(60, 60, 130, 130);
//    	g2d.setColor(Color.decode("#FBFFC9"));
//    	g2d.fillRect(70, 70, 110, 110);
//    	
//    	//sus
//    	g2d.setColor(Color.red);
//    	g2d.fillRect(50, 600, 10, 10);
//    	g2d.fillRect(50, 610, 4, 5);
//    	g2d.fillRect(56, 610, 4, 5);
//    	g2d.setColor(Color.decode("#71FFF8"));
//    	g2d.fillRect(53, 603, 4, 4);
//    	
//    	//cerca
//    	g2d.setColor(Color.decode("#9E843C"));
//    	int xCerca =15 ;
//    	for(int i=0;i<=21;i++) 
//    	{
//        	g2d.fillRect(xCerca, 380, 20, 60);
//        	xCerca += 50;
//    	}
//    	//cercaLinea
//    	g2d.fillRect(1, 400, 1000, 20);
//    	
//    	//casa///////////////////
//    	g2d.setColor(Color.decode("#C8D84A"));
//    	g2d.fillRect(250, 300, 500, 200);
//    	
//    	//parte de abajo de la caja raya oscura de la puerta
//    	g2d.setColor(Color.decode("#5E6428"));
//    	g2d.fillRect(240, 500, 500, 10);
//    	
//    	//parte de abajo de la caja raya oscura de la ventana
//    	g2d.setColor(Color.decode("#4E5321"));
//    	g2d.fillRect(450, 500, 310, 10);
//    	
//    	//casa puerta
//    	g2d.setColor(Color.decode("#5E6428"));
//    	g2d.fillRect(300, 350, 100, 150);
//    	
//    	//puerta
//    	g2d.setColor(Color.decode("#7C833B"));
//    	g2d.fillRect(310, 360, 80, 150);
//    	
//    	//manija de la puerta
//    	g2d.setColor(Color.decode("#5E6428"));
//    	g2d.fillArc(370, 425, 10, 10, 40, 360);//dibuja un arco
//    	
//    	
//    	//casa ventana
//    	g2d.setColor(Color.decode("#BBCA45"));
//    	g2d.fillRect(450, 300, 300, 200);
//    	
//    	g2d.setColor(Color.decode("#6F6751"));
//    	g2d.fillRect(450, 310, 300, 10);
//    	
//    	
//    	//ventana
//    	g2d.setColor(Color.decode("#5E6428"));
//    	g2d.fillRect(550, 350, 100, 100);
//    	
//    	//vidrio de la ventana
//    	g2d.setColor(Color.decode("#ABFFF6"));
//    	g2d.fillRect(560, 360, 35, 80);
//    	g2d.fillRect(605, 360, 35, 80);
//    	
//    	//techo casa ventana
//    	int xTechoVentana[] = {450,780,730,360};
//    	int yTechoVentana[] = {310,310,220,220};
//    	g2d.setColor(Color.decode("#B12626"));
//    	g2d.fillPolygon(xTechoVentana, yTechoVentana, 4);
//    	
//    	//techo casa puerta
//    	int xTechoPuerta[] = {240,350,460,450,350,250};
//    	int yTechoPuerta[] = {310,200,310,320,220,320};
//    	g2d.setColor(Color.decode("#DD2E2E"));
//    	g2d.fillPolygon(xTechoPuerta, yTechoPuerta, 6);
//    	
//    	int xTechoPuertaTriangulo[] = {450,350,250};
//    	int yTechoPuertaTriangulo[] = {320,220,320};
//    	g2d.setColor(Color.decode("#C8D84A"));
//    	g2d.fillPolygon(xTechoPuertaTriangulo, yTechoPuertaTriangulo, 3);
//    	
//    	//chimenea
//    	g2d.setColor(Color.decode("#BBCA45"));
//    	g2d.fillRect(480, 180, 50, 80);
//    	
//    	g2d.setColor(Color.decode("#5E6428"));
//    	g2d.fillRect(475, 180, 60, 10);
//    	
//    	g2d.fillRect(500, 240, 20, 10);
//    	g2d.setColor(Color.decode("#7C833B"));
//    	g2d.fillRect(485, 200, 20, 10);
//    	g2d.fillRect(490, 210, 20, 10);
//    	
//    	
//    	
//    	
//    	
//    	
//    	
//    	
//    	
//    	
//    	
//    	
    	
    	//g2d.drawPolyline(xPoints, yPoints, 3);
    	//g2d.fillPolygon(xPoints, yPoints, 3);
    	
    	//g2d.setFont(new Font("Arial", Font.BOLD, 30));
    	//g2d.drawString("Hola amigos de yutub", 300, 200);
    	
    	//g2d.Stroke ( no me funciiona :,v ))
    	
    	//g2d.drawRoundRect(700, 150, 200, 150, 0, 0);//darle bordes al rectangulo
    	
    	/*
    	try {

        	BufferedImage img = ImageIO.read(new File("src/vaca2.png"));
        	g2d.drawImage(img, 0, 0, null);
    	}catch (IOException e)
    	{
    		e.printStackTrace();
    	}
    	*/
    	
    	//INTERFAZ MARIO BROS
    	//cielo
    	/*
    	g2d.setColor(Color.decode("#A2FFFF"));
    	g2d.fillRect(1, 1, 1000, 700);
    	

    	//arbusto

    	g2d.setColor(Color.decode("#000000"));
    	g2d.fillArc(35, 550, 50, 90, 50, 360);
    	g2d.fillArc(55, 550, 80, 90, 50, 360);
    	g2d.setColor(Color.decode("#42E33A"));
    	g2d.fillArc(40, 560, 40, 70, 40, 360);
    	g2d.fillArc(60, 560, 70, 70, 40, 360);
    
    	
    	//suelo
    	g2d.setColor(Color.decode("#FFF0B4"));
    	g2d.fillRect(1, 600, 1000, 700);
    	
    	g2d.setColor(Color.decode("#CDBF85"));
    	g2d.fillRect(1, 630, 1000, 700);
    	
    	
    	
    	//linea del suelo
    	g2d.setColor(Color.black);
    	g2d.fillRect(1, 600, 1000, 4);
    	g2d.fillRect(1, 630, 1000, 4);
    	
    	//bloques de fondo
    	//bloque azul
    	g2d.setColor(Color.decode("#000000"));
    	g2d.fillRect(320, 300, 200, 300);
    	g2d.fillRect(520, 330, 30, 270);
    	g2d.setColor(Color.decode("#53C9FF"));
    	g2d.fillRect(325, 305, 190, 290);
    	
    			//tornillos caja azul
    	g2d.setColor(Color.decode("#000000"));
    	g2d.fillArc(330, 310, 20, 20, 40, 360);
    	g2d.fillArc(490, 310, 20, 20, 40, 360);
    	g2d.fillArc(490, 570, 20, 20, 40, 360);
    	
    	
    	
    	//bloque crema
    	g2d.setColor(Color.decode("#000000"));
    	g2d.fillRect(200, 400, 200, 200);
    	g2d.fillRect(400, 430, 30, 170);
    	g2d.setColor(Color.decode("#FFE6C4"));
    	g2d.fillRect(205, 405, 190, 190);
    	
    	//tornillos caja creama
    	g2d.setColor(Color.decode("#000000"));
    	g2d.fillArc(210, 410, 20, 20, 40, 360);
    	g2d.fillArc(370, 410, 20, 20, 40, 360);
    	g2d.fillArc(210, 570, 20, 20, 40, 360);
    	g2d.fillArc(370, 570, 20, 20, 40, 360);
    	
    	
    	//bloque verde
    	g2d.setColor(Color.decode("#000000"));
    	g2d.fillRect(850, 400, 200, 200);
    	g2d.setColor(Color.decode("#42E33A"));
    	g2d.fillRect(855, 405, 190, 190);
    	//tornillo caja verde
    	g2d.setColor(Color.decode("#000000"));
    	g2d.fillArc(860, 410, 20, 20, 40, 360);
    	g2d.fillArc(860, 570, 20, 20, 40, 360);
    	
    	
    	//bloques de monedas
    	g2d.setColor(Color.decode("#000000"));
    	g2d.fillRect(150, 200, 50, 50);
    	g2d.setColor(Color.decode("#D8C357"));
    	g2d.fillRect(155, 205, 40, 40);
    	
    	g2d.setColor(Color.decode("#000000"));
    	g2d.fillRect(200, 200, 50, 50);
    	g2d.setColor(Color.decode("#D8C357"));
    	g2d.fillRect(205, 205, 40, 40);
    	
    	g2d.setColor(Color.decode("#000000"));
    	g2d.fillRect(50, 350, 50, 50);
    	g2d.setColor(Color.decode("#D8C357"));
    	g2d.fillRect(55, 355, 40, 40);
    	
    	g2d.setColor(Color.decode("#000000"));
    	g2d.fillRect(900, 250, 50, 50);
    	g2d.setColor(Color.decode("#D8C357"));
    	g2d.fillRect(905, 255, 40, 40);
    	
    	//tornillos cajitas
    	g2d.setColor(Color.decode("#000000"));
    	g2d.fillArc(160, 210, 5, 5, 40, 360);
    	g2d.fillArc(185, 210, 5, 5, 40, 360);
    	g2d.fillArc(160, 235, 5, 5, 40, 360);
    	g2d.fillArc(185, 235, 5, 5, 40, 360);
    	
    	g2d.fillArc(210, 210, 5, 5, 40, 360);
    	g2d.fillArc(235, 210, 5, 5, 40, 360);
    	g2d.fillArc(210, 235, 5, 5, 40, 360);
    	g2d.fillArc(235, 235, 5, 5, 40, 360);
    	
    	g2d.fillArc(60, 360, 5, 5, 40, 360);
    	g2d.fillArc(85, 360, 5, 5, 40, 360);
    	g2d.fillArc(60, 385, 5, 5, 40, 360);
    	g2d.fillArc(85, 385, 5, 5, 40, 360);
    	
    	g2d.fillArc(910, 260, 5, 5, 40, 360);
    	g2d.fillArc(935, 260, 5, 5, 40, 360);
    	g2d.fillArc(910, 285, 5, 5, 40, 360);
    	g2d.fillArc(935, 285, 5, 5, 40, 360);
    	
    	
    	
    	
    	
    	
    	//tuberia
    	g2d.setColor(Color.decode("#000000"));
    	g2d.fillRect(650, 400, 100, 200);
    	g2d.setColor(Color.decode("#3FAB39"));
    	g2d.fillRect(655, 405, 90, 190);
    
    	g2d.setColor(Color.decode("#000000"));
    	g2d.fillRect(645, 400, 110, 50);
    	g2d.setColor(Color.decode("#3FAB39"));
    	g2d.fillRect(650, 405, 100, 40);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
    */
    
    public void iniciarComponentes()
    {
    	//this.login();
    	
    	//this.registro();
    
    	//this.admin();
    	
    	//this.calculadora(); 
    	
    	//this.calcuInteres();
    	
    	this.botones();

    	this.repaint();
    	this.validate();
        
    }
    
    
    public void calcuInteres() {
    	this.setSize(600, 600);
    	
    	JPanel calcuInteres = new JPanel();
    	calcuInteres.setSize(this.getWidth(),this.getHeight());
    	calcuInteres.setBackground(Color.white);
    	calcuInteres.setLayout(null);
    	calcuInteres.setOpaque(true);
    	
    	
    	JLabel texto = new JLabel("Interés");
    	texto.setSize(100, 40);
        texto.setFont(new Font("Bell MT", Font.BOLD, 30));
    	texto.setLocation(10, 10);
    	texto.setForeground(Color.red);
    	calcuInteres.add(texto);
    	
    	
    	//primer panel (verde)
    	JLabel panelVerde = new JLabel();
    	panelVerde.setSize(550, 300);
    	panelVerde.setLocation(10, 50);
    	panelVerde.setBackground(Color.decode("#A0F883"));
    	panelVerde.setLayout(null);
    	panelVerde.setOpaque(true);
    	calcuInteres.add(panelVerde, BorderLayout.NORTH);
    	
    	JLabel login_tag = new JLabel("Calculadora Interes");
        login_tag.setSize(200, 20);
        login_tag.setFont(new Font("Arial", Font.BOLD, 15));
        login_tag.setForeground(Color.black);//color a la letra
        login_tag.setLocation(10,10);
        panelVerde.add(login_tag);
        
        
        //capital
        JLabel capitalTexto = new JLabel("Capital");
        capitalTexto.setSize(200, 50);
        capitalTexto.setFont(new Font("Arial", Font.BOLD, 15));
        capitalTexto.setForeground(Color.black);//color a la letra
        capitalTexto.setLocation(80,50);
        panelVerde.add(capitalTexto);
    	
        JTextField capitalCaja = new JTextField();
        capitalCaja.setBounds(200, 60, 250, 30);
        capitalCaja.setFont(new Font("Bell MT", Font.BOLD, 20));
        panelVerde.add(capitalCaja);
        
      //tiempo
        JLabel tiempoTexto = new JLabel("Tiempo");
        tiempoTexto.setSize(200, 50);
        tiempoTexto.setFont(new Font("Arial", Font.BOLD, 15));
        tiempoTexto.setForeground(Color.black);//color a la letra
        tiempoTexto.setLocation(80,100);
        panelVerde.add(tiempoTexto);
    	
        JTextField tiempoCaja = new JTextField();
        tiempoCaja.setBounds(200, 110, 250, 30);
        tiempoCaja.setFont(new Font("Bell MT", Font.BOLD, 20));
        panelVerde.add(tiempoCaja);
        
      //tasa interes
        JLabel tasaTexto = new JLabel("Tasa Interes");
        tasaTexto.setSize(200, 50);
        tasaTexto.setFont(new Font("Arial", Font.BOLD, 15));
        tasaTexto.setForeground(Color.black);//color a la letra
        tasaTexto.setLocation(80,150);
        panelVerde.add(tasaTexto);
    	
        JTextField tasaCaja = new JTextField();
        tasaCaja.setBounds(200, 160, 250, 30);
        tasaCaja.setFont(new Font("Bell MT", Font.BOLD, 20));
        panelVerde.add(tasaCaja);
    	
      
        
      //boton calcular
        JButton calcularBoton = new JButton("  Calcular");
        calcularBoton.setBounds(100, 230, 140, 30);
        calcularBoton.setFont(new Font("Arial", Font.BOLD, 15));
        calcularBoton.setForeground(Color.white);
        calcularBoton.setBackground(Color.black);
        panelVerde.add(calcularBoton);
        
      //imagen calcular boton
        JLabel imgCalcularBoton = new JLabel();
        imgCalcularBoton.setIcon(new ImageIcon(getClass().getResource("disco-flexible.png")));
        calcularBoton.add(imgCalcularBoton);

      //boton cancelar
        JButton cancelarBoton = new JButton("  Cancelar");
        cancelarBoton.setBounds(340, 230, 140, 30);
        cancelarBoton.setFont(new Font("Arial", Font.BOLD, 15));
        cancelarBoton.setForeground(Color.white);
        cancelarBoton.setBackground(Color.black);
        panelVerde.add(cancelarBoton);
        
      //imagen calcular boton
        JLabel imgCancelarBoton = new JLabel();
        imgCancelarBoton.setIcon(new ImageIcon(getClass().getResource("cancelar.png")));
        cancelarBoton.add(imgCancelarBoton);
        
        //fondo rojo
        JLabel panelRojo = new JLabel("");
        panelRojo.setSize(550,130);
        panelRojo.setBackground(Color.decode("#F88A83"));
        panelRojo.setLocation(10, 390);
        panelRojo.setOpaque(true);
        calcuInteres.add(panelRojo, BorderLayout.SOUTH);
        
      //tiempo
        JLabel interesTexto = new JLabel("Interes");
        interesTexto.setSize(800, 50);
        interesTexto.setFont(new Font("Arial", Font.BOLD, 15));
        interesTexto.setForeground(Color.black);//color a la letra
        interesTexto.setLocation(80,10);
        panelRojo.add(interesTexto);
    	
        JTextField interesCaja = new JTextField();
        interesCaja.setBounds(200, 20, 250, 30);
        interesCaja.setFont(new Font("Bell MT", Font.BOLD, 20));
        panelRojo.add(interesCaja);
        
      //tasa interes
        JLabel montoTexto = new JLabel("Monto");
        montoTexto.setSize(200, 50);
        montoTexto.setFont(new Font("Arial", Font.BOLD, 15));
        montoTexto.setForeground(Color.black);//color a la letra
        montoTexto.setLocation(80,70);
        panelRojo.add(montoTexto);
    	
        JTextField montoCaja = new JTextField();
        montoCaja.setBounds(200, 80, 250, 30);
        montoCaja.setFont(new Font("Bell MT", Font.BOLD, 20));
        panelRojo.add(montoCaja);
        

    	this.add(calcuInteres);
    }
    
    public void calculadora(){
    	this.setSize(480, 650);
    	
    	JPanel panel = new JPanel();
    	panel.setSize(this.getWidth(),this.getHeight());
    	panel.setBackground(Color.decode("#DC8DEC"));
    	panel.setLayout(new BorderLayout());
    	
    	
    	JLabel text = new JLabel("100.00",0);
    	text.setOpaque(true);
    	text.setBackground(Color.white);
    	text.setFont(new Font("Arial", Font.BOLD, 40));
    	panel.add(text, BorderLayout.NORTH);
    	
    	JPanel centro = new JPanel();
    	centro.setBackground(Color.decode("#B978C6"));
    	centro.setLayout(new GridLayout(4, 3, 10, 10));
    	panel.add(centro);
    	
    	String btns[] = {"7","8","9",
		    			"4","5","6",
		    			"1","2","3",
		    			".","0","/",};
    	for (int i=0; i<12; i++)
    	{
    		JButton boton = new JButton(btns[i]);
        	boton.setFont(new Font("Arial", Font.BOLD, 30));
    		centro.add(boton);
    	}
    	
    	JPanel east = new JPanel();
    	east.setBackground(Color.decode("#A943BD"));
    	east.setLayout(new GridLayout(3, 1));
    	panel.add(east,BorderLayout.EAST);
    	
    	String btns2[] = {"+","-","="};
    	for (int i=0; i<3; i++)
    	{
    		JButton boton = new JButton(btns2[i]);
        	boton.setFont(new Font("Arial", Font.BOLD, 30));
    		east.add(boton);
    	}
    	
    	
    	JPanel west = new JPanel();
    	west.setBackground(Color.DARK_GRAY);
    	west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
    	panel.add(west,BorderLayout.WEST);
    	
    	String btns3[] = {"+","-","="};
    	for (int i=0; i<3; i++)
    	{
    		JButton boton = new JButton(btns2[i]);
    		west.add(boton);
    	}
    	
    	
    	this.add(panel);
    	
    }
    
    public void login(){
    	JPanel login = new JPanel();
        login.setSize(this.getWidth()/2,this.getHeight());
        login.setBackground(Color.decode("#5F70DF"));
        login.setLayout(null);//quitamos el molde
        
        /* REGLAS GENERAELS
         * size
         * location
         * background = opaque
         * string constructor
         */
        
        
        
        JLabel login_tag = new JLabel("User Login",0);
        login_tag.setSize(300, 80);
        login_tag.setFont(new Font("Arial", Font.BOLD, 30));
        login_tag.setForeground(Color.white);//color a la letra
        login_tag.setLocation(100,20);
        //login_tag.setOpaque(true);
        //login_tag.setBackground(Color.gray);
        login.add(login_tag);
        
        //img
        //JLabel logo = new JLabel();
        //logo.setIcon(new ImageIcon(getClass().getResource("vaca2.png")));
        //logo.setBounds(100, 50, 256, 256);
        //login.add(logo);
        
        JLabel account_tag = new JLabel("My Account",0);
        account_tag.setSize(300, 80);
        account_tag.setFont(new Font("Arial", Font.BOLD, 35));
        account_tag.setForeground(Color.yellow);//color a la letra
        account_tag.setLocation(100,80);
        login.add(account_tag);
        
        //texto de nombre de usuario
        JLabel usr_tag = new JLabel("Enter your username");
        usr_tag.setBounds(100, 150, 230, 40);
        usr_tag.setFont(new Font("Arial", Font.BOLD, 18));
        usr_tag.setForeground(Color.white);
        login.add(usr_tag);
        
        //caja de texto de usuarioi
        JTextField usr_field = new JTextField();
        usr_field.setBounds(100, 190, 300, 40);
        usr_field.setFont(new Font("Bell MT", Font.BOLD, 20));
        login.add(usr_field);
        
        //imagen usuario
        JLabel logo_usuario = new JLabel();
        logo_usuario.setIcon(new ImageIcon(getClass().getResource("usuario.png")));
        logo_usuario.setBounds(70, 200, 16, 16);
        login.add(logo_usuario);
        
        JLabel borde_usuario = new JLabel();
        borde_usuario.setBounds(63, 194, 30, 30);
        borde_usuario.setBackground(Color.decode("#E8D55F"));
        borde_usuario.setOpaque(true);
        login.add(borde_usuario);
        
        
        //texto de contrasena
        JLabel pwd_tag = new JLabel("Enter Your Password");
        pwd_tag.setBounds(100, 250, 250, 40);
        pwd_tag.setFont(new Font("Arial", Font.BOLD, 18));
        pwd_tag.setForeground(Color.white);
        login.add(pwd_tag);
        
        //Caja de texto contrasena
        JPasswordField pwd_field = new JPasswordField();
        pwd_field.setBounds(100, 290, 300, 40);
        pwd_field.setFont(new Font("Bell MT", Font.BOLD, 20));
        login.add(pwd_field);
        
        
      //imagen contraseña
        JLabel logo_passw = new JLabel();
        logo_passw.setIcon(new ImageIcon(getClass().getResource("cerrar.png")));
        logo_passw.setBounds(70, 300, 16, 16);
        login.add(logo_passw);
        
        JLabel borde_passw = new JLabel();
        borde_passw.setBounds(63, 294, 30, 30);
        borde_passw.setBackground(Color.decode("#E8D55F"));
        borde_passw.setOpaque(true);
        login.add(borde_passw);
        
        
        //boton login
        JButton login_btn = new JButton("Login");
        login_btn.setBounds(180, 350, 140, 60);
        login_btn.setFont(new Font("Arial", Font.BOLD, 23));
        login_btn.setBackground(Color.decode("#E8D55F"));
        login.add(login_btn);
        
        login_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("hola uwu");
				
				String usr = usr_field.getText();
				String pwd = new String(pwd_field.getPassword());
				
				
					if(usr.equals("")){
						System.out.println("falta usuario");
						usr_field.setBorder(BorderFactory.createLineBorder(Color.red,2));
					}else {
						usr_field.setBorder(BorderFactory.createLineBorder(Color.green,2));
					}
					if(pwd.equals("")){
						System.out.println("falta contra");
						pwd_field.setBorder(BorderFactory.createLineBorder(Color.red,2));
					}else {
						pwd_field.setBorder(BorderFactory.createLineBorder(Color.green,2));
						
					}
					
					if(usr.equals("SuperUser")) {
						if(pwd.equals("SuperUser")){
							System.out.println("Bienvenido");
						}
					}else {
						System.out.println("no encontrado");
					}
				
			}});
        
      //texto no  tiene contraseña?
        JLabel forgot_tag = new JLabel("Don´t have an account?");
        forgot_tag.setBounds(180, 430, 150, 40);
        forgot_tag.setFont(new Font("Arial", Font.BOLD, 12));
        forgot_tag.setForeground(Color.white);
        login.add(forgot_tag);
        
      //boton sing up
        JButton sing_btn = new JButton("Sing up");
        sing_btn.setBounds(210, 470, 80, 30);
        sing_btn.setFont(new Font("Arial", Font.BOLD, 12));
        sing_btn.setBackground(Color.decode("#E8D55F"));
        login.add(sing_btn);
        
        
        
        JLabel fondo_insano = new JLabel("");
        fondo_insano.setSize(430, 340);
        fondo_insano.setBackground(Color.decode("#515FBA"));
        fondo_insano.setLocation(30, 90);
        fondo_insano.setOpaque(true);
        login.add(fondo_insano);

       
        
       
        this.add(login);
    }
    
    public void registro() {
    	JPanel registro = new JPanel();
        registro.setSize(this.getWidth()/2,this.getHeight());
       registro.setLocation(500,0);
        registro.setBackground(Color.pink);
        registro.setLayout(null);//quitar molde
        
        JLabel regis_tag = new JLabel("REGISTRO",0);
        regis_tag.setSize(300, 80);
        regis_tag.setFont(new Font("Bell MT", Font.BOLD, 24));
        regis_tag.setForeground(Color.white);//color a la letra
        regis_tag.setLocation(100,20);
        regis_tag.setOpaque(true);
        regis_tag.setBackground(Color.gray);
        registro.add(regis_tag);
        

        //texto usuario
        JLabel usr_tag = new JLabel("Nombre de usuario: ");
        usr_tag.setBounds(10, 120, 250, 40);
        usr_tag.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(usr_tag);
        

        //caja de texto usuario
        JTextField usr_field = new JTextField();
        usr_field.setBounds(10, 150, 300, 40);
        usr_field.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(usr_field);
        
        //texto bio
        JLabel bio_tag = new JLabel("bio");
        bio_tag.setBounds(10,200, 250, 40);
        bio_tag.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(bio_tag);
        
        
        //caja de texto text area bio
        JTextArea bio_area = new JTextArea();
        bio_area.setBounds(10, 240, 290, 100);
        bio_area.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(bio_area);
        
        //texto preferencia
        JLabel pre_tag = new JLabel("preferencias");
        pre_tag.setBounds(10,340, 250, 40);
        pre_tag.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(pre_tag);
        
        //checkbox 1
        JCheckBox itemBox1 = new JCheckBox("Papas");
        itemBox1.setBounds(10, 380, 100, 40);
        itemBox1.setFont(new Font("Bell MT", Font.BOLD, 20));
        itemBox1.setOpaque(false);
        registro.add(itemBox1);
        
        //checkbox 2
        JCheckBox itemBox2 = new JCheckBox("Dulces");
        itemBox2.setBounds(110, 380, 100, 40);
        itemBox2.setFont(new Font("Bell MT", Font.BOLD, 20));
        itemBox2.setOpaque(false);
        registro.add(itemBox2);
        
        //checkbox 3
        JCheckBox itemBox3 = new JCheckBox("Papas");
        itemBox3.setBounds(220, 380, 100, 40);
        itemBox3.setFont(new Font("Bell MT", Font.BOLD, 20));
        itemBox3.setOpaque(false);
        registro.add(itemBox3);
        
        //texto terminos
        JLabel term_tag = new JLabel("Terminos");
        term_tag.setBounds(10, 420, 100, 40);
        term_tag.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(term_tag);

        //radioButtom si Acepto terminos 
        JRadioButton siAceptRadio = new JRadioButton ("Acepto terminos");
        siAceptRadio.setBounds(10, 460, 180, 40);
        siAceptRadio.setFont(new Font("Bell MT", Font.BOLD, 20));
        siAceptRadio.setOpaque(false);
        registro.add(siAceptRadio);
        
        //radioButtom no Acepto terminos 
        JRadioButton noAceptRadio = new JRadioButton ("No acepto terminos");
        noAceptRadio.setBounds(200, 460, 200, 40);
        noAceptRadio.setFont(new Font("Bell MT", Font.BOLD, 20));
        noAceptRadio.setOpaque(false);
        registro.add(noAceptRadio);
        
        //juntar los radiobutton de terminos
        ButtonGroup term = new ButtonGroup();
        term.add(siAceptRadio);
        term.add(noAceptRadio);
        
        
	    String colonias[]= {"Centro","Camino real","Conchalito", "Ayuntamiento"};
	    
	    JComboBox locations = new JComboBox(colonias);
        locations.setBounds(10, 500, 300, 40);
        locations.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(locations);
	      
	    JButton registroButton = new JButton("Crear cuenta");
	    registroButton.setBounds(10, 550, 150, 40);
	    registroButton.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(registroButton);
        
        registroButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String usr = usr_field.getText();
				String bio = bio_area.getText();
				

				if(usr.length()<=0){
					usr_field.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}else {
					usr_field.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				
				if(bio.length()<=0){
					bio_area.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}else {
					bio_area.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				
				if(!siAceptRadio.isSelected())
				{
					siAceptRadio.setBorderPainted(true);
					siAceptRadio.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}else{
					noAceptRadio.setBorderPainted(true);
					siAceptRadio.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				if(!noAceptRadio.isSelected())
				{
					noAceptRadio.setBorderPainted(true);
					noAceptRadio.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}else{
					noAceptRadio.setBorderPainted(true);
					noAceptRadio.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				
				
			}
		});
	      
        
        
        this.add(registro);
    }
    
    public void admin() {
    	
    	//añadir panel
    	JPanel admin_panel = new JPanel();
    	admin_panel.setSize(this.getWidth(),this.getHeight());
    	admin_panel.setLocation(0,0);
    	admin_panel.setBackground(Color.decode("#57FFD4"));
    	admin_panel.setLayout(null);//quitar molde
    	
    	//añadir un menu
    	JMenuBar barra = new JMenuBar();
    	JMenu menu_file = new JMenu("Archivo");
    	JMenuItem open_item = new JMenuItem("Abrir archivo ...");
    	JMenuItem crate_item = new JMenuItem("Crear archivo ...");
    	
    	barra.add(menu_file);
    	menu_file.add(open_item);
    	menu_file.add(crate_item);
    	
    	
    	//contendio del panel
        JLabel users_tag = new JLabel("Usuarios",0);
        users_tag.setSize(300, 80);
        users_tag.setFont(new Font("Bell MT", Font.BOLD, 24));
        users_tag.setForeground(Color.white);//color a la letra
        users_tag.setLocation(350,20);
        users_tag.setOpaque(true);
        users_tag.setBackground(Color.gray);
        admin_panel.add(users_tag);
        
        
        JLabel title_widget = new JLabel("Total de usuarios",0);
        title_widget.setFont(new Font("Bell MT", Font.BOLD, 24));
        title_widget.setBounds(40,120,300,40);
        title_widget.setForeground(Color.white);
        admin_panel.add(title_widget);
        
        JLabel num_widget = new JLabel("100",0);
        num_widget.setFont(new Font("Bell MT", Font.BOLD, 24));
        num_widget.setBounds(40,160,300,40);
        num_widget.setForeground(Color.white);
        admin_panel.add(num_widget);
        
        JLabel widget = new JLabel("");
        widget.setBounds(40, 120, 300, 100);  
        widget.setOpaque(true);
        widget.setBackground(Color.gray);
        admin_panel.add(widget);
        
        
        //botones
        JButton donwload = new JButton("Exportar");
        donwload.setFont(new Font("Bell MT", Font.BOLD, 15));
        donwload.setBounds(720, 230, 100, 30);  
        admin_panel.add(donwload);
        
        JButton add_user = new JButton("Añadir");
        add_user.setFont(new Font("Bell MT", Font.BOLD, 15));
        add_user.setBounds(840, 230, 100, 30);  
        admin_panel.add(add_user);
        
        ///////////////////tabla imaginaria
        //JLabel tabla = new JLabel("");
        //tabla.setBounds(40, 280, 900, 300);
        //tabla.setOpaque(true);
        //tabla.setBackground(Color.gray);
        //admin_panel.add(tabla);
        
        String tabla_titles [] = {"no. control" , 
        					"nombre" , 
        					"apellidos" , 
        					"semestre" , 
        					"promedio"};
        
        String table_data [][]= {{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,	
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,	
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,	
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,	
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,	
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,	
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	 		};
        
        JTable table_users = new JTable(table_data,tabla_titles);
        JScrollPane table_scroll = new JScrollPane(table_users);
        table_scroll.setBounds(40, 280, 900, 300);
        
        admin_panel.add(table_scroll);
    	
    	//para añadir el menu a la ventana 
    	this.setJMenuBar(barra);
    
    	//añadir una tabla
    	
    	this.add(admin_panel);
    	
    }

    public void botones () {

    	btn_panel.setSize(this.getWidth(),this.getHeight());
    	btn_panel.setLocation(0,0);
    	btn_panel.setBackground(Color.decode("#57FFD4"));
    	btn_panel.setLayout(null);//quitar molde
    	this.add(btn_panel);
    	
	    JButton superButton = new JButton("Crear cuenta");
	    superButton.setBounds(150, 550, 200, 40);
	    superButton.setFont(new Font("Bell MT", Font.BOLD, 20));
		superButton.setFocusable(false);
	    btn_panel.add(superButton);

	    superButton.addActionListener(new ActionListener() 
	    {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//cordenadas y tamaño para el boton de manera random
				
				int x = (int)Math.floor(Math.random()*450+1);
				int y = (int)Math.floor(Math.random()*650+1);
				int w = (int)Math.floor(Math.random()*120+1);
				int h = (int)Math.floor(Math.random()*120+1);

				//color aleatorio para el boton
				Random rand = new Random();
				float r = rand.nextFloat();
				float g = rand.nextFloat();
				float b = rand.nextFloat();
				Color randomColor = new Color(r, g, b);
				
				//se genera un boton random
				JButton otroBotton = new JButton(r+","+g+","+b);
				otroBotton.setBounds(x,y,w,h);
				otroBotton.setOpaque(true);
				otroBotton.setBorder(BorderFactory.createLineBorder(randomColor,5));
				
				//al presionar el boton aparece el texto que tiene dentro
				otroBotton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						//eliminar los botones que hayan aparecido presionando el boton que aparece botonoes random
						JButton yo = ((JButton)e.getSource());
						btn_panel.remove(yo);
						getContentPane().repaint();
						getContentPane().revalidate();
						//JOptionPane.showMessageDialog(null, otroBotton.getText());	
					}
				});
				//repintar uwu

				superButton.setFocusable(false);
				btn_panel.add(otroBotton);
				getContentPane().repaint();
                getContentPane().revalidate();
				}
			
	    });


 }


 //KEY LISTENER//////////////
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub

}


@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	//dice el codigo de las teclas
	System.out.println(e.getKeyCode());
	System.out.println(e.getKeyChar());
	//el 8 es el codigo de la tecla borrar
	if(e.getKeyCode() == 8) {
		btn_panel.removeAll();
		getContentPane().repaint();
		getContentPane().revalidate();
		System.out.println("Se pre");
	}
	
	//el 87 es la tecla Q
	//Aumenta el tamaño
	if(e.getKeyCode() == 81){
		Component[] elementos = btn_panel.getComponents();
		for (int i = 0; i < elementos.length; i++){
			if(elementos[i].getClass().toString().equals("class javax.swing.JButton")){
				JButton btn = ((JButton) elementos[i]);
				btn.setSize(btn.getHeight()+10, btn.getWidth()+10);
				getContentPane().repaint();
				getContentPane().revalidate();
			}
		}
	}
	
	//tecla W
	//Se mueve para arriba
	if(e.getKeyCode() == 87) {
		Component[] elementos = btn_panel.getComponents();
		for(int i = 0; i <elementos.length; i++) {
			if(elementos[i].getClass().toString().equals("class javax.swing.JButton")) {
				JButton btn = ((JButton) elementos[i]);
				btn.setSize(btn.getWidth(), btn.getHeight());
				btn.setLocation(btn.getX(), btn.getY() - 10);
				getContentPane().repaint();
				getContentPane().revalidate();
			}
		}
	}

	//tecla A
	//se mueve hacia la izquierda
		if(e.getKeyCode() == 65) {
			Component[] elementos = btn_panel.getComponents();
			for(int i = 0; i <elementos.length; i++) {
				if(elementos[i].getClass().toString().equals("class javax.swing.JButton")) {
					JButton btn = ((JButton) elementos[i]);
					btn.setSize(btn.getWidth(), btn.getHeight());
					btn.setLocation(btn.getX() - 10, btn.getY());
					getContentPane().repaint();
					getContentPane().revalidate();
				}
			}
		}
	
	//tecla S
	//se mueve hacia abajo
	if(e.getKeyCode() == 83) {
		Component[] elementos = btn_panel.getComponents();
		for(int i = 0; i <elementos.length; i++) {
			if(elementos[i].getClass().toString().equals("class javax.swing.JButton")) {
				JButton btn = ((JButton) elementos[i]);
				btn.setSize(btn.getWidth(), btn.getHeight());
				btn.setLocation(btn.getX(), btn.getY() + 10);
				getContentPane().repaint();
				getContentPane().revalidate();
			}
		}
	}

	//tecla D
	//se mueve hacia la derecha
	if(e.getKeyCode() == 68) {
		Component[] elementos = btn_panel.getComponents();
		for(int i = 0; i <elementos.length; i++) {
			if(elementos[i].getClass().toString().equals("class javax.swing.JButton")) {
				JButton btn = ((JButton) elementos[i]);

				btn.setSize(btn.getWidth(), btn.getHeight());
				btn.setLocation(btn.getX() + 10, btn.getY());
				getContentPane().repaint();
				getContentPane().revalidate();
			}
		}
	}

}
	



@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub

	
}


//MOUSE LISTENER//////////////////////////////////////////
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
}


@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println("se presiono uwu");
	//se ombienen la cordenada del mouse al presionar
	int x=e.getX();
    int y=e.getY();
	int w = (int)Math.floor(Math.random()*120+1);
	int h = (int)Math.floor(Math.random()*120+1);

	//color aleatorio para el boton
	Random rand = new Random();
	float r = rand.nextFloat();
	float g = rand.nextFloat();
	float b = rand.nextFloat();
	Color randomColor = new Color(r, g, b);
	
	//se genera un boton random
	JButton otroBotton = new JButton(r+","+g+","+b);
	otroBotton.setBounds(x,y,w,h);
	otroBotton.setOpaque(true);
	otroBotton.setBorder(BorderFactory.createLineBorder(randomColor,5));
	btn_panel.add(otroBotton);
	
	//al presionar el boton aparece el texto que tiene dentro
	otroBotton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			JOptionPane.showMessageDialog(null, otroBotton.getText());	
		}
	});
	//repintar uwu

	otroBotton.setFocusable(false);
	getContentPane().repaint();
}


@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	Random rand = new Random();
	float r = rand.nextFloat();
	float g = rand.nextFloat();
	float b = rand.nextFloat();
	
	Color randomColor = new Color(r, g, b);
	
	btn_panel.setBackground(randomColor);
}


@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

}