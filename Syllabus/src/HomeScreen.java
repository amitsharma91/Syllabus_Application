import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class HomeScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen frame = new HomeScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public HomeScreen() {
		super("Home Screen");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(0, 0, 770, 169);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(new ImageIcon(HomeScreen.class.getResource("/img/Pune_univ_logo.png")).getImage()
				.getScaledInstance(130, 130, java.awt.Image.SCALE_SMOOTH)));
		
		
		lblIcon.setBounds(542, 39, 130, 130);
		panel.add(lblIcon);

		JLabel lblSavitribaiPhulePune = new JLabel("Savitribai Phule");
		lblSavitribaiPhulePune.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		lblSavitribaiPhulePune.setBounds(107, 52, 194, 44);
		panel.add(lblSavitribaiPhulePune);

		JLabel lblPuneUniversity = new JLabel("Pune University");
		lblPuneUniversity.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblPuneUniversity.setBounds(107, 92, 154, 24);
		panel.add(lblPuneUniversity);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 770, 39);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblUser = new JLabel("");
		lblUser.setIcon(new ImageIcon(new ImageIcon(HomeScreen.class.getResource("/img/avatar.png")).getImage()
				.getScaledInstance(18, 18, java.awt.Image.SCALE_SMOOTH)));
		lblUser.setBounds(598, 12, 18, 18);
		panel_1.add(lblUser);

		JLabel lblUser_1 = new JLabel("User");
		lblUser_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUser_1.setBounds(629, 12, 69, 17);
		panel_1.add(lblUser_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(35, 205, 193, 203);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblScience = new JLabel("Science");
		lblScience.setBounds(64, 99, 46, 14);
		panel_2.add(lblScience);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(283, 205, 193, 203);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCommerce = new JLabel("Commerce");
		lblCommerce.setBounds(70, 95, 82, 14);
		panel_3.add(lblCommerce);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(534, 205, 193, 203);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblArts = new JLabel("Arts");
		lblArts.setBounds(70, 98, 46, 14);
		panel_4.add(lblArts);
		
		JLabel lblVersion = new JLabel("version 0.1");
		lblVersion.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblVersion.setForeground(new Color(255, 255, 255));
		lblVersion.setBounds(348, 427, 70, 14);
		contentPane.add(lblVersion);

//		setUndecorated(true);
		setIconImage(new ImageIcon("src/img/sppu-desktop-logo-white2.png").getImage());
		setLocationRelativeTo(null);
	}
}
