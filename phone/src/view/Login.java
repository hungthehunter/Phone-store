package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login loginFrame = new Login();
					loginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		this.setTitle("Đăng nhập");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1350,700);
		
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);		
		Color lightOrangeColor = new Color(255, 204, 153);
		Color woodColor = new Color(210, 180, 140);
		Color beigeColor = new Color(245, 245, 220);
		Color darkBrown=new Color(139, 69, 19);

		Color oalkColor=new Color(	139, 106, 80);
		Image myPicture=Toolkit.getDefaultToolkit().createImage(Customer.class.getResource("/phone.jpg"));
		Image nvidia_pic=myPicture.getScaledInstance(1000,670,Image.SCALE_SMOOTH);
	
		getContentPane().setLayout(null);
		JLabel nvidia_label=new JLabel(new ImageIcon(nvidia_pic));
		
		
		JPanel panel_login_picture = new JPanel();
		panel_login_picture.setBounds(0, -11, 898, 674);
		panel_login_picture.add(nvidia_label);

		getContentPane().add(panel_login_picture);
		
		JPanel panel_login = new JPanel();
	   
		panel_login.setBackground(woodColor);
		panel_login.setBounds(899, -11, 437, 674);
		getContentPane().add(panel_login);
		panel_login.setLayout(null);

		textField = new JTextField();
		textField.setBackground(beigeColor);
		textField.setBounds(82, 141, 313, 55);
		panel_login.add(textField);
		
		textField.setColumns(10);
		Image my_email=Toolkit.getDefaultToolkit().createImage(Customer.class.getResource("/email.png"));//
		Image email_pic=my_email.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		
		
		textField_1 = new JTextField();
		textField_1.setBackground(beigeColor);
		textField_1.setBounds(82, 241, 313, 55);
		panel_login.add(textField_1);
		textField_1.setColumns(10);
		Image my_password=Toolkit.getDefaultToolkit().createImage(Customer.class.getResource("/key.png"));
	
		Image password_pic=my_password.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton btnNewButton_1 = new JButton("Đăng nhập");
		btnNewButton_1.setBackground(lightOrangeColor);
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 16));
		btnNewButton_1.setBounds(115, 399, 262, 68);
		panel_login.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Quên mật khẩu?");
		btnNewButton_2.setForeground(darkBrown);
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton_2.setBounds(62, 590, 365, 47);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setContentAreaFilled(false);
		panel_login.add(btnNewButton_2);
		
		
		JLabel account_label = new JLabel();
		account_label.setBounds(27, 149, 45, 36);
		panel_login.add(account_label);
		account_label.setIcon(new ImageIcon(email_pic));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(27, 230, 45, 66);
		panel_login.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(password_pic));
		
		JLabel lblNewLabel = new JLabel("Login Account");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(136, 43, 225, 36);
		panel_login.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("    Ghi nhớ mật khẩu");
		chckbxNewCheckBox.setForeground(darkBrown);
	
		chckbxNewCheckBox.setBackground(lightOrangeColor);
		chckbxNewCheckBox.setFont(new Font("Verdana", Font.BOLD, 14));
		chckbxNewCheckBox.setBounds(150, 321, 187, 47);
		panel_login.add(chckbxNewCheckBox);


		
	}
	

}
