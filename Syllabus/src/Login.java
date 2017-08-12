import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		super("Login Screen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 330);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 51));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setBounds(22, 24, 69, 30);
		contentPane.add(lblLogin);
		
		JLabel lblEnterCredentialsBelow = new JLabel("Enter credentials below to Login");
		lblEnterCredentialsBelow.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEnterCredentialsBelow.setForeground(new Color(255, 255, 255));
		lblEnterCredentialsBelow.setBounds(22, 55, 186, 14);
		contentPane.add(lblEnterCredentialsBelow);
		
		txtUsername = new JTextField();
		txtUsername.setCaretColor(Color.WHITE);
		txtUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsername.setBackground(new Color(0, 51, 51));
		txtUsername.setForeground(new Color(255, 255, 255));
		txtUsername.setText("Username");
		txtUsername.setBounds(69, 104, 283, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(69, 135, 283, 2);
		contentPane.add(separator);
		
		JTextField lblPassword = new JTextField();
		lblPassword.setText("Password");
		lblPassword.setBackground(new Color(0, 51, 51));
		lblPassword.setCaretColor(Color.WHITE);
		lblPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setBounds(69, 165, 283, 18);
		contentPane.add(lblPassword);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(69, 194, 283, 2);
		contentPane.add(separator_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(57,167,165));
		btnNewButton.setBounds(110, 216, 180, 30);
		contentPane.add(btnNewButton);
	}
}
