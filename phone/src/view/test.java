package view;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class test extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		JTable product = new JTable();
		setContentPane(contentPane);
		JLabel picture_navbar = new JLabel("PICTURE");
		picture_navbar.setBounds(10, 10, 359, 208);
		Image my_email=Toolkit.getDefaultToolkit().createImage(Menu.class.getResource("/Assets/planet.jpg"));//
		Image email_pic=my_email.getScaledInstance(359, 208, Image.SCALE_SMOOTH);
		picture_navbar.setIcon(new ImageIcon(email_pic));
		contentPane.add(picture_navbar);
	}

}
