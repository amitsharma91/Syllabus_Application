import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

public class CourseScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseScreen frame = new CourseScreen("");
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
	public CourseScreen(String stream) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 770, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(57, 167, 165));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 770, 100);
		panel.setBackground(new Color(0, 88, 86));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblLogo = new JLabel("logo");
		lblLogo.setIcon(new ImageIcon(new ImageIcon(CourseScreen.class.getResource("/img/uop_logo.jpg")).getImage()
				.getScaledInstance(80, 70, Image.SCALE_SMOOTH)));
		lblLogo.setBounds(627, 30, 80, 70);
		panel.add(lblLogo);

		JLabel lblFacultyOfScience = new JLabel("Faculty Of " + stream);
		lblFacultyOfScience.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		lblFacultyOfScience.setForeground(new Color(255, 255, 255));
		lblFacultyOfScience.setBounds(58, 41, 408, 48);
		panel.add(lblFacultyOfScience);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 204));
		panel_1.setBounds(0, 0, 770, 30);
		panel.add(panel_1);

		JLabel lblC = new JLabel("");
		lblC.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});

		panel_1.setLayout(null);
		lblC.setIcon(new ImageIcon(new ImageIcon(HomeScreen.class.getResource("/img/icons8-Close Window-48.png"))
				.getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH)));
		lblC.setBounds(742, 7, 18, 18);
		panel_1.add(lblC);

		JLabel lblPressescTo = new JLabel("Press 'Esc' to close");
		lblPressescTo.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		lblPressescTo.setBounds(10, 7, 134, 14);
		panel_1.add(lblPressescTo);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 111, 750, 358);
		contentPane.add(scrollPane);

		String[] listItems = { "MCA Semester I", "MCA Semester II", "MCA Semester III", "MCA Semester IV",
				"MCA Semester V", "MCA Semester VI" };
		JList<String> list = new JList<String>(listItems);
		scrollPane.setViewportView(list);

		// on ESC key close frame
		getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
				"Cancel"); //$NON-NLS-1$
		getRootPane().getActionMap().put("Cancel", new AbstractAction() {
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}
