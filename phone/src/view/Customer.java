package view;


import java.awt.Image;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
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


public class Customer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	public Customer() {
		setBackground(SystemColor.window);
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
//		Image my_email=Toolkit.getDefaultToolkit().createImage(Customer.class.getResource("/planet.jpg"));
		Image my_email=new ImageIcon("Assets/planet.jpg").getImage();//
		my_email=my_email.getScaledInstance(359, 208, Image.SCALE_SMOOTH);
		picture_navbar.setIcon(new ImageIcon(my_email));
		navbar_panel.add(picture_navbar);
		
		
		Image my_customer=new ImageIcon("Assets/Icon/customer_picture.png").getImage();//
		my_customer=my_customer.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton Customer_button = new JButton("Customer",new ImageIcon(my_customer));	
		Customer_button.setBackground(purple_light);
		Customer_button.setFont(new Font("Verdana", Font.BOLD, 12));
		Customer_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
	    Customer_button.setVerticalTextPosition(SwingConstants.CENTER); // Set text position to the center vertically
		Customer_button.setBounds(10, 249, 359, 41);
		navbar_panel.add(Customer_button);
		
		Image my_invoice=new ImageIcon("Assets/Icon/invoice.png").getImage();//
		my_invoice=my_invoice.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton Invoice_button = new JButton("Invoice",new ImageIcon(my_invoice));
		Invoice_button.setBackground(purple_light);
		Invoice_button.setFont(new Font("Verdana", Font.BOLD, 12));
		Invoice_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
		Invoice_button.setVerticalTextPosition(SwingConstants.CENTER); // Set text position to the center vertically
		Invoice_button.setBounds(10, 310, 359, 41);
		navbar_panel.add(Invoice_button);
	
		Image my_counterParty=new ImageIcon("Assets/wuju.jpg").getImage();//
		my_counterParty=my_counterParty.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton counterParty_button = new JButton("Counter Party",new ImageIcon(my_counterParty));
		counterParty_button.setBackground(purple_light);
		counterParty_button.setFont(new Font("Verdana", Font.BOLD, 12));
		counterParty_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
		counterParty_button.setVerticalTextPosition(SwingConstants.CENTER); // Set text position to the center vertically
		counterParty_button.setBounds(10, 373, 359, 41);
		navbar_panel.add(counterParty_button);
				
		Image my_staff=new ImageIcon("Assets/Icon/staff.png").getImage();//
		my_staff=my_staff.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton staff_button = new JButton("Staff",new ImageIcon(my_staff));
		staff_button.setBackground(purple_light);
		staff_button.setFont(new Font("Verdana", Font.BOLD, 12));
		staff_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of 	the icon
		staff_button.setVerticalTextPosition(SwingConstants.CENTER); // Set text position to the center vertically
		staff_button.setBounds(10, 436, 359, 41);
		navbar_panel.add(staff_button);
		
		Image my_salary=new ImageIcon("Assets/Icon/salary.png").getImage();//
		my_salary=my_salary.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton salary_button = new JButton("Salary",new ImageIcon(my_salary));
		salary_button.setBackground(purple_light);
		salary_button.setFont(new Font("Verdana", Font.BOLD, 12));
		salary_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
		salary_button.setVerticalTextPosition(SwingConstants.CENTER); // Set text position to the center vertically
		salary_button.setBounds(10, 499, 359, 41);
		navbar_panel.add(salary_button);
		
		Image my_warantty=new ImageIcon("Assets/Icon/warrenty.png").getImage();//
		my_warantty=my_warantty.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton warantty_button = new JButton("Warranty",new ImageIcon(my_warantty));
		warantty_button.setBackground(purple_light);
		warantty_button.setFont(new Font("Verdana", Font.BOLD, 12));
		salary_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
		salary_button.setVerticalTextPosition(SwingConstants.CENTER);
		warantty_button.setBounds(10, 565, 359, 41);
		navbar_panel.add(warantty_button);
		
		Image my_products=new ImageIcon("Assets/phone.jpg").getImage();//
		my_products= my_products.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton products_button = new JButton("Products",new ImageIcon(my_products));
		products_button.setBackground(purple_light);
		products_button.setFont(new Font("Tahoma", Font.BOLD, 12));
		products_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
		products_button.setVerticalTextPosition(SwingConstants.CENTER);
		products_button.setBounds(10, 627, 359, 41);
		navbar_panel.add(products_button);
		
		Image my_statistics=new ImageIcon("Assets/Icon/Statistics.png").getImage();//
		my_statistics= my_statistics.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton statistics_button = new JButton("Statistics", new ImageIcon(my_statistics));
		statistics_button.setBackground(purple_light);
		statistics_button.setFont(new Font("Tahoma", Font.BOLD, 12));
		statistics_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
		statistics_button.setVerticalTextPosition(SwingConstants.CENTER);
		statistics_button.setBounds(10, 693, 359, 41);
		navbar_panel.add(statistics_button);
		
		Image my_director=new ImageIcon("Assets/Icon/director.png").getImage();//
		my_director= my_director.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
	
		
		JButton director_button = new JButton("Director",new ImageIcon(my_director));
		director_button.setBackground(purple_light);
		director_button.setFont(new Font("Verdana", Font.BOLD, 12));
		director_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
		director_button.setVerticalTextPosition(SwingConstants.CENTER);
		director_button.setBounds(10, 760, 359, 41);
		navbar_panel.add(director_button);
		
		JPanel panel_content = new JPanel();
		panel_content.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_content.setBackground(new Color(240, 240, 240));
		panel_content.setBounds(379, 31, 1057, 814);
		getContentPane().add(panel_content);
		panel_content.setLayout(null);
		
		JPanel personal_info_panel = new JPanel();
		personal_info_panel.setBorder(new LineBorder(Color.BLACK));
		personal_info_panel.setBounds(135, 10, 392, 233);
		panel_content.add(personal_info_panel);
		personal_info_panel.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Searching");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxNewCheckBox.setBounds(148, 6, 93, 21);
		personal_info_panel.add(chckbxNewCheckBox);
		
		JLabel name_label_1 = new JLabel("Name  :");
		name_label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		name_label_1.setBounds(73, 47, 50, 13);
		personal_info_panel.add(name_label_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(140, 33, 213, 44);
		personal_info_panel.add(textField_6);
		
		JLabel name_label_1_1 = new JLabel("Age  :");
		name_label_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		name_label_1_1.setBounds(74, 117, 50, 13);
		personal_info_panel.add(name_label_1_1);
		
		String []number_list=new String[] {"1","2","3","4","5","6","7","8","9"}; 
		JComboBox comboBox = new JComboBox(number_list);
		comboBox.setBounds(164, 108, 58, 32);
		personal_info_panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(number_list);
		comboBox_1.setBounds(276, 108, 58, 32);
		personal_info_panel.add(comboBox_1);
		
		JLabel Birth_label_1_1_1_1_2 = new JLabel("Customer type  :");
		Birth_label_1_1_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Birth_label_1_1_1_1_2.setBounds(10, 179, 114, 13);
		personal_info_panel.add(Birth_label_1_1_1_1_2);
		
		String[] customer_type_list=new String[] {"VIP","NORMAL"};
		
		JComboBox customer_type_jcomboBox_1 = new JComboBox(customer_type_list);
		customer_type_jcomboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		customer_type_jcomboBox_1.setBounds(140, 165, 227, 44);
		personal_info_panel.add(customer_type_jcomboBox_1);
		
		JPanel Searching_panel = new JPanel();
		Searching_panel.setBorder(new LineBorder(Color.BLACK));
		Searching_panel.setBounds(665, 10, 382, 704);
		panel_content.add(Searching_panel);
		Searching_panel.setLayout(null);
		
		JLabel ID_label = new JLabel("ID :");
		ID_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ID_label.setBounds(10, 39, 34, 13);
		Searching_panel.add(ID_label);
		
		textField = new JTextField();
		textField.setBounds(99, 25, 268, 44);
		Searching_panel.add(textField);
		textField.setColumns(10);
		
		JLabel name_label = new JLabel("Name  :");
		name_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		name_label.setBounds(10, 118, 50, 13);
		Searching_panel.add(name_label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(99, 104, 268, 44);
		Searching_panel.add(textField_1);
		
		JLabel Birth_label = new JLabel("Day of birth :");
		Birth_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Birth_label.setBounds(10, 197, 91, 13);
		Searching_panel.add(Birth_label);
		
		JLabel Birth_label_1 = new JLabel("Gender :");
		Birth_label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Birth_label_1.setBounds(10, 280, 91, 13);
		Searching_panel.add(Birth_label_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(103, 277, 103, 21);
		Searching_panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rdbtnNewRadioButton_1.setBounds(233, 277, 103, 21);
		Searching_panel.add(rdbtnNewRadioButton_1);
		
		JLabel Birth_label_1_1 = new JLabel("Address :");
		Birth_label_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Birth_label_1_1.setBounds(10, 345, 91, 13);
		Searching_panel.add(Birth_label_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(99, 327, 268, 44);
		Searching_panel.add(textField_3);
		
		JLabel Birth_label_1_1_1 = new JLabel("Phone  :");
		Birth_label_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Birth_label_1_1_1.setBounds(10, 428, 91, 13);
		Searching_panel.add(Birth_label_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(99, 409, 268, 44);
		Searching_panel.add(textField_4);
		
		JLabel Birth_label_1_1_1_1 = new JLabel("Customer type  :");
		Birth_label_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Birth_label_1_1_1_1.setBounds(10, 507, 114, 13);
		Searching_panel.add(Birth_label_1_1_1_1);
		
		
		JComboBox customer_type_jcomboBox = new JComboBox(customer_type_list);
		customer_type_jcomboBox.setFont(new Font("Times New Roman", Font.BOLD, 13));
		customer_type_jcomboBox.setBounds(140, 493, 227, 44);
		Searching_panel.add(customer_type_jcomboBox);
		
		JLabel Birth_label_1_1_1_1_1 = new JLabel("Customer type  :");
		Birth_label_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Birth_label_1_1_1_1_1.setBounds(10, 648, 114, 21);
		Searching_panel.add(Birth_label_1_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(140, 568, 227, 101);
		Searching_panel.add(textField_5);
		textField_5.setColumns(10);
		
		String []day_list=new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String []month_list=new String[] {"1","2","3","4","5","6","7","8","9","10","11","12"};
		String []year_list=new String[]{"2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
		JComboBox day_comboBox = new JComboBox(day_list);
		day_comboBox.setBounds(121, 181, 68, 34);
		Searching_panel.add(day_comboBox);
		
		JComboBox month_comboBox = new JComboBox(month_list);
		month_comboBox.setBounds(212, 181, 68, 34);
		Searching_panel.add(month_comboBox);
		
		JComboBox year_comboBox = new JComboBox(year_list);
		year_comboBox.setBounds(299, 181, 68, 34);
		Searching_panel.add(year_comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 274, 650, 540);
		panel_content.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.BOLD, 17));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"comment", "Customer Type", "Phone", "Address", "Gender", "Day of birth", "Name", "ID"
			}
		));
		
		JPanel function_panel = new JPanel();
		function_panel.setBorder(new LineBorder(Color.BLACK));
		function_panel.setBounds(671, 727, 376, 77);
		panel_content.add(function_panel);
		function_panel.setLayout(null);
		
		
		Image add_icon=new ImageIcon("Assets/Icon/add.png").getImage();//
		add_icon=add_icon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton add_button = new JButton("",new ImageIcon(add_icon));
		
		add_button.setBounds(27, 10, 72, 57);
		function_panel.add(add_button);
		
		Image accept_icon=new ImageIcon("Assets/Icon/edit.png").getImage();//
		accept_icon=accept_icon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton accept_button = new JButton("",new ImageIcon(accept_icon));
		accept_button.setBounds(109, 10, 72, 57);
		function_panel.add(accept_button);
		
		Image delete_icon=new ImageIcon("Assets/Icon/delete.png").getImage();//
		delete_icon=delete_icon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton delete_button = new JButton("",new ImageIcon(delete_icon));
		delete_button.setBounds(200, 10, 72, 57);
		function_panel.add(delete_button);
		
		Image clear_icon=new ImageIcon("Assets/Icon/clear.png").getImage();//
		clear_icon=clear_icon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton clear_button = new JButton("",new ImageIcon(clear_icon));
		clear_button.setBounds(282, 10, 72, 57);
		function_panel.add(clear_button);
		
		Image customer_header_icon=new ImageIcon("Assets/Icon/customer_picture.png").getImage();//
		customer_header_icon=customer_header_icon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JLabel customer_label = new JLabel("Customer");
		 Border border = new LineBorder(Color.BLACK, 1); // Red border with a thickness of 2 pixels
	        customer_label.setBorder(border);
		customer_label.setBackground(SystemColor.activeCaption);
		 customer_label.setOpaque(true);
		customer_label.setIcon(new ImageIcon(customer_header_icon));
		customer_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		customer_label.setBounds(379, 0, 142, 32);
		getContentPane().add(customer_label);
		
		
		Image homePage_header_icon=new ImageIcon("Assets/Icon/customer_picture.png").getImage();//
		homePage_header_icon=homePage_header_icon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JLabel my_homePage_header_title = new JLabel("Trang chủ");
		my_homePage_header_title.setBorder(border);
		my_homePage_header_title.setBackground(Color.WHITE);
		my_homePage_header_title.setOpaque(true);
		my_homePage_header_title.setIcon(new ImageIcon(homePage_header_icon));
		my_homePage_header_title.setBounds(520, 0, 142, 32);
		getContentPane().add(my_homePage_header_title);
		
		
		
	}
	
	
	public static void main(String[] args) {
		System.setProperty("sun.java2d.uiScale", "1.0");
	try {
		Customer c=new Customer();
		c.setVisible(true);
	} catch (Exception e) {
		// TODO: handle exception
	}

}
}
