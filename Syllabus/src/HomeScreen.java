import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class HomeScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public HomeScreen() {
		super("Home Screen");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0,88,86));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel imageLabel = new JLabel("");
		imageLabel.setBounds(32, 5, 130, 125);
		contentPane.add(imageLabel);
		Image img = new ImageIcon(this.getClass().getResource("img/uop_logo.jpg")).getImage();
		Image newimg = img.getScaledInstance(130, 125, java.awt.Image.SCALE_SMOOTH);
		imageLabel.setIcon(new ImageIcon(newimg));
		
		JLabel lblSavitribaiPhule = new JLabel("SAVITRIBAI PHULE");
		lblSavitribaiPhule.setForeground(Color.WHITE);
		lblSavitribaiPhule.setFont(new Font("Arial Unicode MS", Font.PLAIN, 42));
		lblSavitribaiPhule.setBounds(179, 11, 395, 53);
		contentPane.add(lblSavitribaiPhule);
		
		JLabel lblPuneUniversity = new JLabel("PUNE UNIVERSITY");
		lblPuneUniversity.setForeground(Color.WHITE);
		lblPuneUniversity.setFont(new Font("Arial Unicode MS", Font.PLAIN, 42));
		lblPuneUniversity.setBounds(179, 75, 395, 53);
		contentPane.add(lblPuneUniversity);
		
		setIconImage(new ImageIcon("src/img/sppu-desktop-logo-white2.png").getImage());
		setLocationRelativeTo(null);
	}
}
