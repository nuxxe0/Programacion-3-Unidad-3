import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gato extends JFrame {

	//public static JButton = new btnCaja1 ("");
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	public static boolean turno = true;
	public static JButton btnCaja1;
	public static JButton btnCaja2;
	public static JButton btnCaja3;
	public static JButton btnCaja4;
	public static JButton btnCaja5;
	public static JButton btnCaja6;
	public static JButton btnCaja7;
	public static JButton btnCaja8;
	public static JButton btnCaja9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gato frame = new Gato();
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
	public Gato() {
		

		//btnCaja1= new JButton("");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnCaja1 = new JButton("");
		JButton btnCaja2 = new JButton("");
		JButton btnCaja3 = new JButton("");
		JButton btnCaja4 = new JButton("");
		JButton btnCaja5 = new JButton("");
		JButton btnCaja6 = new JButton("");
		JButton btnCaja7 = new JButton("");
		JButton btnCaja8 = new JButton("");
		JButton btnCaja9 = new JButton("");
		
		
		//Turno
		//BOTON 1
		btnCaja1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton btn=((JButton)e.getSource());
				click( btn);
				if(btnCaja1.getText().equals(btnCaja2.getText()) &&
						btnCaja1.getText().equals(btnCaja3.getText())&&
						btnCaja3.getText().equals(btnCaja1.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				if(btnCaja1.getText().equals(btnCaja4.getText()) &&
						btnCaja1.getText().equals(btnCaja7.getText())&&
						btnCaja7.getText().equals(btnCaja1.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				if(btnCaja1.getText().equals(btnCaja5.getText()) &&
						btnCaja1.getText().equals(btnCaja9.getText())&&
						btnCaja9.getText().equals(btnCaja1.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				
			}
		});
		contentPane.add(btnCaja1);
		
		//BOTON 2
		btnCaja2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JButton btn=((JButton)e.getSource());
				click( btn);
				if(btnCaja1.getText().equals(btnCaja2.getText()) &&
						btnCaja1.getText().equals(btnCaja3.getText())&&
						btnCaja3.getText().equals(btnCaja1.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				if(btnCaja2.getText().equals(btnCaja5.getText()) &&
						btnCaja2.getText().equals(btnCaja8.getText())&&
						btnCaja8.getText().equals(btnCaja2.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
			}
		});
		contentPane.add(btnCaja2);
		
		//BOTON 3
		btnCaja3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JButton btn=((JButton)e.getSource());
				click( btn);
				if(btnCaja1.getText().equals(btnCaja2.getText()) &&
						btnCaja1.getText().equals(btnCaja3.getText())&&
						btnCaja3.getText().equals(btnCaja1.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				if(btnCaja3.getText().equals(btnCaja6.getText()) &&
						btnCaja3.getText().equals(btnCaja9.getText())&&
						btnCaja9.getText().equals(btnCaja3.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				if(btnCaja3.getText().equals(btnCaja5.getText()) &&
						btnCaja3.getText().equals(btnCaja7.getText())&&
						btnCaja7.getText().equals(btnCaja3.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				
			}
		});
		contentPane.add(btnCaja3);
		
		//BOTON 4
		btnCaja4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JButton btn=((JButton)e.getSource());
				click( btn);
				
				if(btnCaja1.getText().equals(btnCaja4.getText()) &&
						btnCaja1.getText().equals(btnCaja7.getText())&&
						btnCaja7.getText().equals(btnCaja1.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				if(btnCaja4.getText().equals(btnCaja5.getText()) &&
						btnCaja4.getText().equals(btnCaja6.getText())&&
						btnCaja6.getText().equals(btnCaja4.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
			}
		});
		contentPane.add(btnCaja4);
		
		//BOTON 5
		btnCaja5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JButton btn=((JButton)e.getSource());
				click( btn);
				if(btnCaja1.getText().equals(btnCaja5.getText()) &&
						btnCaja1.getText().equals(btnCaja9.getText())&&
						btnCaja9.getText().equals(btnCaja1.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				if(btnCaja2.getText().equals(btnCaja5.getText()) &&
						btnCaja2.getText().equals(btnCaja8.getText())&&
						btnCaja8.getText().equals(btnCaja2.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				if(btnCaja3.getText().equals(btnCaja5.getText()) &&
						btnCaja3.getText().equals(btnCaja7.getText())&&
						btnCaja7.getText().equals(btnCaja3.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				if(btnCaja4.getText().equals(btnCaja5.getText()) &&
						btnCaja4.getText().equals(btnCaja6.getText())&&
						btnCaja6.getText().equals(btnCaja4.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
			}
		});
		contentPane.add(btnCaja5);
		
		//BOTON 6
		btnCaja6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JButton btn=((JButton)e.getSource());
				click( btn);
				if(btnCaja3.getText().equals(btnCaja6.getText()) &&
						btnCaja3.getText().equals(btnCaja9.getText())&&
						btnCaja9.getText().equals(btnCaja3.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				if(btnCaja4.getText().equals(btnCaja5.getText()) &&
						btnCaja4.getText().equals(btnCaja6.getText())&&
						btnCaja6.getText().equals(btnCaja4.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
			}
		});
		contentPane.add(btnCaja6);
		
		//BOTON 7
		btnCaja7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JButton btn=((JButton)e.getSource());
				click( btn);
				if(btnCaja1.getText().equals(btnCaja4.getText()) &&
						btnCaja1.getText().equals(btnCaja7.getText())&&
						btnCaja7.getText().equals(btnCaja1.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				if(btnCaja3.getText().equals(btnCaja5.getText()) &&
						btnCaja3.getText().equals(btnCaja7.getText())&&
						btnCaja7.getText().equals(btnCaja3.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				if(btnCaja7.getText().equals(btnCaja8.getText()) &&
						btnCaja7.getText().equals(btnCaja9.getText())&&
						btnCaja9.getText().equals(btnCaja7.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
			}
		});
		contentPane.add(btnCaja7);
		
		//BOTON 8
		btnCaja8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JButton btn=((JButton)e.getSource());
				click( btn);
				if(btnCaja2.getText().equals(btnCaja5.getText()) &&
						btnCaja2.getText().equals(btnCaja8.getText())&&
						btnCaja8.getText().equals(btnCaja2.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				if(btnCaja7.getText().equals(btnCaja8.getText()) &&
						btnCaja7.getText().equals(btnCaja9.getText())&&
						btnCaja9.getText().equals(btnCaja7.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
			}
		});
		contentPane.add(btnCaja8);
		
		//BOTON 9
		btnCaja9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JButton btn=((JButton)e.getSource());
				click( btn);
				if(btnCaja1.getText().equals(btnCaja5.getText()) &&
						btnCaja1.getText().equals(btnCaja9.getText())&&
						btnCaja9.getText().equals(btnCaja1.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				if(btnCaja3.getText().equals(btnCaja6.getText()) &&
						btnCaja3.getText().equals(btnCaja9.getText())&&
						btnCaja9.getText().equals(btnCaja3.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				if(btnCaja7.getText().equals(btnCaja8.getText()) &&
						btnCaja7.getText().equals(btnCaja9.getText())&&
						btnCaja9.getText().equals(btnCaja7.getText())) {
					
					JOptionPane.showMessageDialog(null, "GANO");
				}
				
			}
		});
		contentPane.add(btnCaja9);
		
		
	}
	public void click(JButton btn) {
		
		if(btn.getText().equals("") ) {
			
			if(turno) {
				btn.setText("X");
				turno = false;
			}else {
				btn.setText("O");
				turno = true;
			}
			btn.setEnabled(false);
			
			

			/*
			if(btnCaja1.getText().equals(btnCaja2.getText()) &&
					btnCaja1.getText().equals(btnCaja3.getText())&&
					btnCaja3.getText().equals(btnCaja1.getText())) {
				
				System.out.println("gano uwu");
			}
			
			
			*/
			
		}
		
	}

}
