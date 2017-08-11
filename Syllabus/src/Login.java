<<<<<<< HEAD
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 330);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 51));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setBounds(22, 24, 69, 30);
		contentPane.add(lblLogin);

		JLabel lblEnterCredentialsBelow = new JLabel("Enter credentials below to Login");
		lblEnterCredentialsBelow.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		lblEnterCredentialsBelow.setForeground(new Color(255, 255, 255));
		lblEnterCredentialsBelow.setBounds(22, 67, 201, 14);
		contentPane.add(lblEnterCredentialsBelow);

		JSeparator separator = new JSeparator();
		separator.setBounds(166, 135, 186, 2);
		contentPane.add(separator);

		txtUsername = new JTextField();
		txtUsername.setCaretColor(Color.WHITE);
		txtUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsername.setBackground(new Color(0, 51, 51));
		txtUsername.setForeground(new Color(255, 255, 255));
		txtUsername.setBounds(166, 104, 186, 20);

		txtUsername.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
				separator.setBackground(new Color(255, 255, 255));
			}

			public void mouseEntered(MouseEvent e) {
				separator.setBackground(new Color(57, 167, 165));
			}

			public void mouseClicked(MouseEvent e) {
			}
		});

		contentPane.add(txtUsername);
		txtUsername.setColumns(10);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(166, 194, 186, 2);
		contentPane.add(separator_1);
		
		
		JPasswordField lblPassword = new JPasswordField();
		lblPassword.setBackground(new Color(0, 51, 51));
		lblPassword.setCaretColor(Color.WHITE);
		lblPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setBounds(166, 165, 186, 18);
		lblPassword.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
				separator_1.setBackground(new Color(255, 255, 255));
			}

			public void mouseEntered(MouseEvent e) {
				separator_1.setBackground(new Color(57, 167, 165));
			}

			public void mouseClicked(MouseEvent e) {
			}
		});
		contentPane.add(lblPassword);

		

		JButton btnNewButton = new JButton("Login");

		btnNewButton.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent arg0) {
			}

			public void mousePressed(MouseEvent arg0) {
			}

			public void mouseExited(MouseEvent arg0) {
				btnNewButton.setForeground(new Color(255, 255, 255));
				btnNewButton.setBackground(new Color(57, 167, 165));
				btnNewButton.setBorder(new LineBorder(new Color(57, 167, 165)));
			}

			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setForeground(new Color(57, 167, 165));
				btnNewButton.setBackground(new Color(255, 255, 255));
				btnNewButton.setBorder(new LineBorder(new Color(255, 255, 255)));
			}

			public void mouseClicked(MouseEvent arg0) {
			}
		});

		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(57, 167, 165));
		btnNewButton.setBounds(107, 230, 180, 30);
		contentPane.add(btnNewButton);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(70, 123, 86, 14);
		contentPane.add(lblUsername);

		JLabel lblPassword_1 = new JLabel("Password:");
		lblPassword_1.setForeground(Color.WHITE);
		lblPassword_1.setBounds(70, 182, 86, 14);
		contentPane.add(lblPassword_1);
	}
}
=======
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
>>>>>>> e4e664ade3782d8f2bcafca82b25a1dc42f46b45
