import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaDeLogin implements ActionListener {
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;

	public static void main(String[] args) {
		
		 JFrame frame = new JFrame();
		 JPanel panel = new JPanel();
		frame.setSize(350, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		userLabel = new JLabel("Usuario");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Senha");
		passwordLabel.setBounds(10, 50, 85, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Logar");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new TelaDeLogin());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		success.setText(null);
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		
		if (user.equals("Adriano") && password.equals("chupacabra")) {
			success.setText("logado com sucesso!");
			
		}else {
			
			success.setText("Login Invalido!");
			
		}
		
	}
}
