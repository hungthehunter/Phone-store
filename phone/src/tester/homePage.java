package tester;

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
	        
			JLabel picture_navbar = new JLabel("PICTURE");
			picture_navbar.setBounds(10, 10, 359, 208);
			Image my_email=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/planet.jpg"));//
			Image email_pic=my_email.getScaledInstance(359, 208, Image.SCALE_SMOOTH);
			picture_navbar.setIcon(new ImageIcon(email_pic));
			navbar_panel.add(picture_navbar);
			
			
			Image my_customer=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/customer_picture.png"));//
			Image customer_pic=my_customer.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon customer_icon=new ImageIcon(customer_pic);
			
			JButton Customer_button = new JButton("Customer",customer_icon);	
			Customer_button.setBackground(purple_light);
			Customer_button.setFont(new Font("Verdana", Font.BOLD, 12));
			Customer_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
		    Customer_button.setVerticalTextPosition(SwingConstants.CENTER); // Set text position to the center vertically
			Customer_button.setBounds(10, 249, 359, 41);
			navbar_panel.add(Customer_button);
			
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
			
			String []number_list=new String[] {"1","2","3","4","5","6","7","8","9"};
			
			String[] customer_type_list=new String[] {"VIP","NORMAL"};
			
			String []day_list=new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
			String []month_list=new String[] {"1","2","3","4","5","6","7","8","9","10","11","12"};
			String []year_list=new String[]{"2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
			
			Image my_add=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/add.png"));//
			Image add_pic=my_add.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon add_icon=new ImageIcon(add_pic);
			
			Image my_accept=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/accept.png"));//
			Image accept_pic=my_accept.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon accept_icon=new ImageIcon(accept_pic);
			
			Image my_delete=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/delete.png"));//
			Image delete_pic=my_delete.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon delete_icon=new ImageIcon(delete_pic);
			
			Image my_clear=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/clear.png"));//
			Image clear_pic=my_clear.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon clear_icon=new ImageIcon(clear_pic);
			
			Image my_customer_header=Toolkit.getDefaultToolkit().createImage(homePage.class.getResource("/Icon/customer_picture.png"));//
			Image customer_header_pic=my_customer_header.getScaledInstance(20, 15, Image.SCALE_SMOOTH);
			ImageIcon customer_header_icon=new ImageIcon(customer_header_pic);
			
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