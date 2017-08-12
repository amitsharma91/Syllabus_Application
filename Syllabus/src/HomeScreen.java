import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdesktop.swingx.border.DropShadowBorder;

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
		contentPane.setBackground(new Color(57, 167, 165));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		FrameDragListener frame = new FrameDragListener(this);
		addMouseListener(frame);
		addMouseMotionListener(frame);
		

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 88, 86));
		panel.setBounds(0, 0, 770, 169);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(new ImageIcon(HomeScreen.class.getResource("/img/Univ_New_Logo.JPG")).getImage()
				.getScaledInstance(130, 130, java.awt.Image.SCALE_SMOOTH)));

		lblIcon.setBounds(542, 39, 130, 130);
		panel.add(lblIcon);

		JLabel lblSavitribaiPhulePune = new JLabel("Savitribai Phule");
		lblSavitribaiPhulePune.setForeground(Color.WHITE);
		lblSavitribaiPhulePune.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		lblSavitribaiPhulePune.setBounds(107, 52, 194, 44);
		panel.add(lblSavitribaiPhulePune);

		JLabel lblPuneUniversity = new JLabel("Pune University");
		lblPuneUniversity.setForeground(Color.WHITE);
		lblPuneUniversity.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblPuneUniversity.setBounds(107, 92, 154, 24);
		panel.add(lblPuneUniversity);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 204));
		panel_1.setBounds(0, 0, 770, 39);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblUser = new JLabel("");
		lblUser.setIcon(new ImageIcon(new ImageIcon(HomeScreen.class.getResource("/img/icons8-User-48.png")).getImage()
				.getScaledInstance(18, 18, java.awt.Image.SCALE_SMOOTH)));
		lblUser.setBounds(598, 12, 18, 18);
		panel_1.add(lblUser);

		JLabel lblUser_1 = new JLabel("admin");
		lblUser_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUser_1.setBounds(629, 12, 69, 17);
		panel_1.add(lblUser_1);
		
		JLabel lblC = new JLabel("");
		lblC.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblC.setIcon(new ImageIcon(new ImageIcon(HomeScreen.class.getResource("/img/icons8-Close Window-48.png")).getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH)));
		lblC.setBounds(742, 11, 18, 18);
		panel_1.add(lblC);
		
		JLabel lblTheFacuultyWise = new JLabel("The Facuulty wise Syllabus");
		lblTheFacuultyWise.setBounds(107, 145, 187, 24);
		panel.add(lblTheFacuultyWise);
		lblTheFacuultyWise.setForeground(new Color(255, 255, 51));
		lblTheFacuultyWise.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));

		DropShadowBorder shadowBorder = new DropShadowBorder();
		shadowBorder.setShadowColor(Color.WHITE);
		shadowBorder.setShowLeftShadow(true);
		shadowBorder.setShowRightShadow(true);
		shadowBorder.setShowBottomShadow(true);
		shadowBorder.setShowTopShadow(true);
		shadowBorder.setShadowSize(10);

		JLabel lblScience = new JLabel("Science");
		lblScience.setForeground(Color.WHITE);
		lblScience.setBounds(65, 146, 46, 14);

		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
				lblScience.setForeground(Color.WHITE);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblScience.setForeground(Color.YELLOW);
			}

			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_2.setBackground(new Color(57, 167, 165));
		panel_2.setBorder(shadowBorder);
		panel_2.setBounds(35, 205, 193, 203);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		panel_2.add(lblScience);
		
		JLabel lblS = new JLabel("s");
		lblS.setIcon(new ImageIcon(HomeScreen.class.getResource("/img/icons8-Science Application-100.png")));
		lblS.setBounds(42, 39, 100, 100);
		panel_2.add(lblS);

		DropShadowBorder shadowBorder2 = new DropShadowBorder();
		shadowBorder2.setShadowColor(Color.gray);
		shadowBorder2.setShowLeftShadow(true);
		shadowBorder2.setShowRightShadow(true);
		shadowBorder2.setShowBottomShadow(true);
		shadowBorder2.setShowTopShadow(true);
		shadowBorder2.setShadowSize(10);

		
		JLabel lblCommerce = new JLabel("Commerce");
		lblCommerce.setForeground(Color.WHITE);
		lblCommerce.setBounds(58, 146, 82, 14);
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
				lblCommerce.setForeground(Color.WHITE);
			}

			public void mouseEntered(MouseEvent e) {
				lblCommerce.setForeground(Color.YELLOW);
			}

			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_3.setBackground(new Color(57, 167, 165));
		panel_3.setBorder(shadowBorder);
		panel_3.setBounds(283, 205, 193, 203);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		panel_3.add(lblCommerce);
		
		JLabel label_1 = new JLabel("s");
		label_1.setIcon(new ImageIcon(HomeScreen.class.getResource("/img/icons8-Brief-100.png")));
		label_1.setBounds(41, 35, 100, 100);
		panel_3.add(label_1);

		
		JLabel lblArts = new JLabel("Arts");
		lblArts.setForeground(Color.WHITE);
		lblArts.setBounds(72, 147, 46, 14);
		
		JPanel panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
				lblArts.setForeground(Color.WHITE);
			}

			public void mouseEntered(MouseEvent e) {
				lblArts.setForeground(Color.YELLOW);
			}

			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_4.setBackground(new Color(57, 167, 165));
		panel_4.setBorder(shadowBorder);
		panel_4.setBounds(534, 205, 193, 203);
		contentPane.add(panel_4);
		panel_4.setLayout(null);

		
		panel_4.add(lblArts);
		
		JLabel label_2 = new JLabel("s");
		label_2.setIcon(new ImageIcon(HomeScreen.class.getResource("/img/icons8-Easel-100.png")));
		label_2.setBounds(43, 36, 100, 100);
		panel_4.add(label_2);

		JLabel lblVersion = new JLabel("version 0.1");
		lblVersion.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblVersion.setForeground(new Color(255, 255, 255));
		lblVersion.setBounds(473, 455, 70, 14);
		contentPane.add(lblVersion);
		
		JLabel lblDesignedBy = new JLabel("| Designed By: ");
		lblDesignedBy.setForeground(Color.WHITE);
		lblDesignedBy.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblDesignedBy.setBounds(544, 455, 93, 14);
		contentPane.add(lblDesignedBy);
		
		JLabel label = new JLabel("| Designed By: ");
		label.setIcon(new ImageIcon(new ImageIcon(HomeScreen.class.getResource("/img/icons8-Text Color-48.png")).getImage().getScaledInstance(40, 30, Image.SCALE_SMOOTH)));
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Verdana", Font.PLAIN, 11));
		label.setBounds(629, 447, 40, 30);
		contentPane.add(label);

		 setUndecorated(true);
		setIconImage(new ImageIcon("src/img/sppu-desktop-logo-white2.png").getImage());
		setLocationRelativeTo(null);
	}
}