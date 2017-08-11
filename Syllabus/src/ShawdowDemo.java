import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdesktop.swingx.border.DropShadowBorder;

public class ShawdowDemo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShawdowDemo frame = new ShawdowDemo();
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
	public ShawdowDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		DropShadowBorder shadowBorder = new DropShadowBorder();
		shadowBorder.setShadowColor(Color.black);
		shadowBorder.setShowLeftShadow(true);
		shadowBorder.setShowRightShadow(true);
		shadowBorder.setShowBottomShadow(true);
		shadowBorder.setShowTopShadow(true);
		panel.setBorder(shadowBorder);
		
		panel.setBackground(Color.WHITE);
		panel.setBounds(155, 71, 120, 120);
		contentPane.add(panel);
	}
}
