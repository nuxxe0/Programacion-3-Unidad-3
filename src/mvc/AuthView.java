/**
 * 
 */
package mvc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class AuthView {

	JPanel panel;
	AuthModel modelo;
	
	
	public AuthView() {
		
		modelo = new AuthModel();
		panel = new JPanel(); 
	}
	
	public JPanel Login() {

		panel.setBackground(Color.red);
		JButton login_btn = new JButton("Login");
        login_btn.setBounds(180, 350, 140, 60);
        login_btn.setFont(new Font("Arial", Font.BOLD, 23));
        login_btn.setBackground(Color.decode("#E8D55F"));
        panel.add(login_btn);
        
        login_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Bienvenido");

			}});
        
		return panel;
	}
	
	public JPanel Registro() {

		panel.setBackground(Color.green);
		return panel;
	}
}
