package mvc;

import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class AuthController {

	private JFrame frame;
	private AuthView view;
	
	public AuthController() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().setLayout(new GridBagLayout(0,1));
		view = new AuthView();
	}
	
	public void login() {
		frame.add(view.Login());
		
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}
	
}
