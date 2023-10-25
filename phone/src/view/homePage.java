package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.Box;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
public class homePage extends JFrame {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private JLabel homePage_staff_pic;
		private JLabel homepage_staff_pic;

		public homePage() {
			this.setTitle("Trang chủ");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(1450,900);
			
			this.setVisible(true);
			
			this.setLocationRelativeTo(null);	
			getContentPane().setLayout(null);
			this.setResizable(false);
			
			JPanel navbar_panel = new JPanel();
			navbar_panel.setBounds(0, 0, 379, 856);
			getContentPane().add(navbar_panel);
			navbar_panel.setLayout(null);

		    
			
			 Color woodColor = new Color(210, 180, 140);
	        Color darkGreen = new Color(0, 100, 0);
	        Color buttonGreen = new Color(0, 150, 0);
	        Color purple_light=new Color(202,207,255);
			navbar_panel.setBackground(Color.WHITE);
	        
			JLabel picture_navbar = new JLabel("");
			picture_navbar.setBounds(10, 10, 359, 208);
			Image my_email=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/planet.jpg"));//
			Image email_pic=my_email.getScaledInstance(359, 208, Image.SCALE_SMOOTH);
			picture_navbar.setIcon(new ImageIcon(email_pic));
			navbar_panel.add(picture_navbar);
			
			
			Image my_homePage=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/home.png"));//
			Image homePage_pic=my_homePage.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon homePage_icon=new ImageIcon(homePage_pic);
			
			JButton homePage_button = new JButton("homePage",homePage_icon);	
			homePage_button.setBackground(purple_light);
			homePage_button.setFont(new Font("Verdana", Font.BOLD, 12));
			homePage_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
		    homePage_button.setVerticalTextPosition(SwingConstants.CENTER); // Set text position to the center vertically
			homePage_button.setBounds(10, 249, 359, 41);
			navbar_panel.add(homePage_button);
			
			Image my_invoice=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/invoice.png"));//
			Image invoice_pic=my_invoice.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon invoice_icon=new ImageIcon(invoice_pic);
			
			JButton Invoice_button = new JButton("Invoice",invoice_icon);
			Invoice_button.setBackground(purple_light);
			Invoice_button.setFont(new Font("Verdana", Font.BOLD, 12));
			Invoice_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
			Invoice_button.setVerticalTextPosition(SwingConstants.CENTER); // Set text position to the center vertically
			Invoice_button.setBounds(10, 310, 359, 41);
			navbar_panel.add(Invoice_button);
		
			Image my_counterParty=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/counterParty.png"));//
			Image counterParty_pic=my_counterParty.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon counterParty_icon=new ImageIcon(counterParty_pic);
			
			JButton counterParty_button = new JButton("Counter Party",counterParty_icon);
			counterParty_button.setBackground(purple_light);
			counterParty_button.setFont(new Font("Verdana", Font.BOLD, 12));
			counterParty_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
			counterParty_button.setVerticalTextPosition(SwingConstants.CENTER); // Set text position to the center vertically
			counterParty_button.setBounds(10, 373, 359, 41);
			navbar_panel.add(counterParty_button);
					
			Image my_staff=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/staff.png"));//
			Image staff_pic=my_staff.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon staff_icon=new ImageIcon(staff_pic);
			
			JButton staff_button = new JButton("Staff",staff_icon);
			staff_button.setBackground(purple_light);
			staff_button.setFont(new Font("Verdana", Font.BOLD, 12));
			staff_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
			staff_button.setVerticalTextPosition(SwingConstants.CENTER); // Set text position to the center vertically
			staff_button.setBounds(10, 436, 359, 41);
			navbar_panel.add(staff_button);
			
			Image my_salary=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/salary.png"));//
			Image salary_pic=my_salary.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon salary_icon=new ImageIcon(salary_pic);
			
			JButton salary_button = new JButton("Salary",salary_icon);
			salary_button.setBackground(purple_light);
			salary_button.setFont(new Font("Verdana", Font.BOLD, 12));
			salary_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
			salary_button.setVerticalTextPosition(SwingConstants.CENTER); // Set text position to the center vertically
			salary_button.setBounds(10, 499, 359, 41);
			navbar_panel.add(salary_button);
			
			Image my_warantty=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/warrenty.png"));//
			Image warantty_pic=my_warantty.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon warranty_icon=new ImageIcon(warantty_pic);
			
			JButton warantty_button = new JButton("Warranty",warranty_icon);
			warantty_button.setBackground(purple_light);
			warantty_button.setFont(new Font("Verdana", Font.BOLD, 12));
			salary_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
			salary_button.setVerticalTextPosition(SwingConstants.CENTER);
			warantty_button.setBounds(10, 565, 359, 41);
			navbar_panel.add(warantty_button);
			
			Image my_products=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/phone.jpeg"));//
			Image products_pic=my_products.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon products_icon=new ImageIcon(products_pic);
			
			JButton products_button = new JButton("Products",products_icon);
			products_button.setBackground(purple_light);
			products_button.setFont(new Font("Tahoma", Font.BOLD, 12));
			products_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
			products_button.setVerticalTextPosition(SwingConstants.CENTER);
			products_button.setBounds(10, 627, 359, 41);
			navbar_panel.add(products_button);
			
			Image my_statistics=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/Statistics.png"));//
			Image statistics_pic=my_statistics.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon statistics_icon=new ImageIcon(statistics_pic);
			
			JButton statistics_button = new JButton("Statistics", statistics_icon);
			statistics_button.setBackground(purple_light);
			statistics_button.setFont(new Font("Tahoma", Font.BOLD, 12));
			statistics_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
			statistics_button.setVerticalTextPosition(SwingConstants.CENTER);
			statistics_button.setBounds(10, 693, 359, 41);
			navbar_panel.add(statistics_button);
			
			Image my_director=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/director.png"));//
			Image director_pic=my_director.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon director_icon=new ImageIcon(director_pic);

			
			JButton director_button = new JButton("Director",director_icon);
			director_button.setBackground(purple_light);
			director_button.setFont(new Font("Verdana", Font.BOLD, 12));
			director_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
			director_button.setVerticalTextPosition(SwingConstants.CENTER);
			director_button.setBounds(10, 760, 359, 41);
			navbar_panel.add(director_button);
			
			JPanel panel = new JPanel();
			panel.setBounds(381, 31, 1055, 804);
			getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel homePage_title = new JLabel("                               CHÀO MỪNG BẠN ĐĂNG NHẬP");
			homePage_title.setBackground(Color.DARK_GRAY);
			homePage_title.setForeground(Color.WHITE);
			homePage_title.setFont(new Font("Times New Roman", Font.BOLD, 26));
			homePage_title.setBounds(65, 0, 807, 154);
			homePage_title.setOpaque(true);
			panel.add(homePage_title);
			
			ImageIcon icon = new ImageIcon("D:/Esclipse/phone/Assets/wuju.jpg");
			Image image = icon.getImage();
			Image scaledImage = image.getScaledInstance(271, 167, Image.SCALE_SMOOTH); // Set desired width and height
			ImageIcon scaledIcon = new ImageIcon(scaledImage);
			
			JLabel homepage_staff = new JLabel(scaledIcon);
			homepage_staff.setBounds(378, 217, 271, 167);
			
			panel.add(homepage_staff);
			
			JLabel name_label = new JLabel("Tên :");
			name_label.setFont(new Font("Times New Roman", Font.BOLD, 16));
			name_label.setBounds(280, 469, 69, 28);
			panel.add(name_label);
			
			JLabel gender_label = new JLabel("Giới tính :");
			gender_label.setFont(new Font("Times New Roman", Font.BOLD, 16));
			gender_label.setBounds(280, 546, 69, 28);
			panel.add(gender_label);
			
			JLabel dayOfBirth_label = new JLabel("Ngày sinh:");
			dayOfBirth_label.setFont(new Font("Times New Roman", Font.BOLD, 16));
			dayOfBirth_label.setBounds(280, 636, 88, 28);
			panel.add(dayOfBirth_label);
			
			JLabel name_label_long = new JLabel("Quốc Hưng");
			name_label_long.setFont(new Font("Times New Roman", Font.BOLD, 15));
			name_label_long.setBackground(Color.LIGHT_GRAY);
			name_label_long.setOpaque(true);
			name_label_long.setBounds(378, 462, 271, 44);
			panel.add(name_label_long);
			
			JLabel gender_label_long = new JLabel("Name");
			gender_label_long.setFont(new Font("Tahoma", Font.BOLD, 15));
			gender_label_long.setBackground(Color.LIGHT_GRAY);
			gender_label_long.setOpaque(true);
			gender_label_long.setBounds(378, 539, 271, 44);
			panel.add(gender_label_long);
			
			JLabel dayOfbirth_label = new JLabel("14/02/2003");
			dayOfbirth_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
			dayOfbirth_label.setBackground(Color.LIGHT_GRAY);
			dayOfbirth_label.setOpaque(true);
			dayOfbirth_label.setBounds(378, 629, 271, 44);
			panel.add(dayOfbirth_label);
			
			Image my_account_button=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/staff.png"));//
			Image account_button_pic=my_account_button.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon account_button_icon=new ImageIcon(account_button_pic); 
			
			
			
			JButton account_button = new JButton("Tài khoản",account_button_icon);
			account_button.setBackground(SystemColor.inactiveCaption);
			account_button.setFont(new Font("Tahoma", Font.BOLD, 12));
			account_button.setBounds(742, 509, 157, 51);
			panel.add(account_button);
			
			
			Image my_change_password=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/changepassword.png"));//
			Image change_password_pic=my_change_password.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon change_password_icon=new ImageIcon(change_password_pic); 
			
			JButton changpass_button = new JButton("đổi mật khẩu",change_password_icon);
			changpass_button.setBackground(SystemColor.inactiveCaption);
			changpass_button.setFont(new Font("Tahoma", Font.BOLD, 12));
			changpass_button.setBounds(742, 597, 157, 51);
			panel.add(changpass_button);
			
			Image my_log_off=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/log_off.png"));//
			Image log_off_pic=my_log_off.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon log_off_icon=new ImageIcon(log_off_pic);
			
			JButton logOff_button = new JButton("Đăng xuất",log_off_icon);
			logOff_button.setBackground(SystemColor.inactiveCaption);
			logOff_button.setFont(new Font("Tahoma", Font.BOLD, 12));
			logOff_button.setBounds(742, 684, 157, 51);
			panel.add(logOff_button);
			
			JLabel duty_label = new JLabel("Chức vụ :");
			duty_label.setFont(new Font("Times New Roman", Font.BOLD, 16));
			duty_label.setBounds(276, 707, 69, 28);
			panel.add(duty_label);
			
			JLabel duty_lable_long = new JLabel("Lính Bắn tỉa");
			duty_lable_long.setFont(new Font("Times New Roman", Font.BOLD, 15));
			duty_lable_long.setBackground(Color.LIGHT_GRAY);
			duty_lable_long.setOpaque(true);
			duty_lable_long.setBounds(378, 700, 271, 44);
			panel.add(duty_lable_long);
			
			Image my_homePage_header=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/home.png"));//
			Image homePage_header_pic=my_homePage_header.getScaledInstance(25, 20, Image.SCALE_SMOOTH);
			ImageIcon homePage_header_icon=new ImageIcon(homePage_header_pic);
			JLabel homePage_header_title = new JLabel("Home");
			homePage_header_title.setFont(new Font("Tahoma", Font.BOLD, 12));
			 homePage_header_title.setIcon(homePage_header_icon);
			homePage_header_title.setBounds(381, 0, 94, 33);
			getContentPane().add(homePage_header_title);
			
			
		//Test
			
			
			
			
		}
	
		public static void main(String[] args) {
			System.setProperty("sun.java2d.uiScale", "1.0");
		try {
			homePage c=new homePage();
			c.setVisible(true);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}