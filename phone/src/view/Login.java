package view;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

public class Login extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	public Login() throws IOException{
	this.init();	
	}
	
	public void init() throws IOException {
		this.setTitle("Đăng nhập");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1350,700);
		
		this.setVisible(true);
		
		this.setLocationRelativeTo(null);		
		
		
		Image myPicture=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("planet.jpg"));
		Image nvidia_pic=myPicture.getScaledInstance(898,663,Image.SCALE_DEFAULT);
		getContentPane().setLayout(null);
		JLabel nvidia_label=new JLabel(new ImageIcon(nvidia_pic));
		
		
		JPanel panel_login_picture = new JPanel();
		panel_login_picture.setBounds(0, 0, 898, 663);
		panel_login_picture.add(nvidia_label);

		getContentPane().add(panel_login_picture);
		
		JPanel panel_login = new JPanel();
		panel_login.setBackground(new Color(255, 255, 255));
		panel_login.setBounds(898, 0, 438, 663);
		getContentPane().add(panel_login);
		panel_login.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(103, 149, 313, 55);
		panel_login.add(textField);
		textField.setColumns(10);
		Image my_email=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("email.png"));
		Image email_pic=my_email.getScaledInstance(45, 36, Image.SCALE_DEFAULT);
		
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(103, 251, 313, 55);
		panel_login.add(textField_1);
		textField_1.setColumns(10);
		Image my_password=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("key-icon.png"));
		Image password_pic=my_password.getScaledInstance(45, 36, Image.SCALE_DEFAULT);
		
		JButton btnNewButton_1 = new JButton("Đăng nhập");
		btnNewButton_1.setBackground(SystemColor.textInactiveText);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(125, 396, 240, 68);
		panel_login.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Bạn chưa có tài khoản? Đăng kí ngay");
		btnNewButton_2.setForeground(new Color(0, 204, 255));
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setBounds(60, 606, 365, 47);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setContentAreaFilled(false);
		panel_login.add(btnNewButton_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox(" Ghi nhớ mật khẩu");
		chckbxNewCheckBox.setBounds(172, 336, 147, 40);
		panel_login.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		
		JLabel account_label = new JLabel();
		account_label.setBounds(48, 157, 45, 36);
		panel_login.add(account_label);
		account_label.setIcon(new ImageIcon(email_pic));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(48, 245, 45, 66);
		panel_login.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(password_pic));
	



		
		
		

	}
}
