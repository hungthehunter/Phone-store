package view;


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


public class Customer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	public Customer() {
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
		navbar_panel.setBackground(Color.WHITE);
        
		JLabel picture_navbar = new JLabel("PICTURE");
		picture_navbar.setBounds(10, 10, 359, 208);
		Image my_email=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("/planet.jpg"));//
		Image email_pic=my_email.getScaledInstance(359, 208, Image.SCALE_SMOOTH);
		picture_navbar.setIcon(new ImageIcon(email_pic));
		navbar_panel.add(picture_navbar);
		
		
		Image my_customer=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("/Icon/customer_picture.png"));//
		Image customer_pic=my_customer.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		ImageIcon customer_icon=new ImageIcon(customer_pic);
		
		JButton Customer_button = new JButton("Customer",customer_icon);	
		Customer_button.setBackground(new Color(135, 206, 235));
		Customer_button.setFont(new Font("Verdana", Font.BOLD, 12));
		Customer_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
	    Customer_button.setVerticalTextPosition(SwingConstants.CENTER); // Set text position to the center vertically
		Customer_button.setBounds(10, 249, 359, 41);
		navbar_panel.add(Customer_button);
		
		Image my_invoice=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("/Icon/invoice.png"));//
		Image invoice_pic=my_invoice.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		ImageIcon invoice_icon=new ImageIcon(invoice_pic);
		
		JButton Invoice_button = new JButton("Invoice",invoice_icon);
		Invoice_button.setBackground(new Color(154, 205, 50));
		Invoice_button.setFont(new Font("Verdana", Font.BOLD, 12));
		Invoice_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
		Invoice_button.setVerticalTextPosition(SwingConstants.CENTER); // Set text position to the center vertically
		Invoice_button.setBounds(10, 310, 359, 41);
		navbar_panel.add(Invoice_button);
	
		Image my_counterParty=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("/Icon/counterParty.png"));//
		Image counterParty_pic=my_counterParty.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		ImageIcon counterParty_icon=new ImageIcon(counterParty_pic);
		
		JButton counterParty_button = new JButton("Counter Party",counterParty_icon);
		counterParty_button.setBackground(new Color(154, 205, 50));
		counterParty_button.setFont(new Font("Verdana", Font.BOLD, 12));
		counterParty_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
		counterParty_button.setVerticalTextPosition(SwingConstants.CENTER); // Set text position to the center vertically
		counterParty_button.setBounds(10, 373, 359, 41);
		navbar_panel.add(counterParty_button);
				
		Image my_staff=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("/Icon/staff.png"));//
		Image staff_pic=my_staff.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		ImageIcon staff_icon=new ImageIcon(staff_pic);
		
		JButton staff_button = new JButton("Staff",staff_icon);
		staff_button.setBackground(new Color(154, 205, 50));
		staff_button.setFont(new Font("Verdana", Font.BOLD, 12));
		staff_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
		staff_button.setVerticalTextPosition(SwingConstants.CENTER); // Set text position to the center vertically
		staff_button.setBounds(10, 436, 359, 41);
		navbar_panel.add(staff_button);
		
		Image my_salary=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("/Icon/salary.png"));//
		Image salary_pic=my_salary.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		ImageIcon salary_icon=new ImageIcon(salary_pic);
		
		JButton salary_button = new JButton("Salary",salary_icon);
		salary_button.setBackground(new Color(154, 205, 50));
		salary_button.setFont(new Font("Verdana", Font.BOLD, 12));
		salary_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
		salary_button.setVerticalTextPosition(SwingConstants.CENTER); // Set text position to the center vertically
		salary_button.setBounds(10, 499, 359, 41);
		navbar_panel.add(salary_button);
		
		Image my_warantty=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("/Icon/warrenty.png"));//
		Image warantty_pic=my_warantty.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		ImageIcon warranty_icon=new ImageIcon(warantty_pic);
		
		JButton warantty_button = new JButton("Warranty",warranty_icon);
		warantty_button.setBackground(new Color(154, 205, 50));
		warantty_button.setFont(new Font("Verdana", Font.BOLD, 12));
		salary_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
		salary_button.setVerticalTextPosition(SwingConstants.CENTER);
		warantty_button.setBounds(10, 565, 359, 41);
		navbar_panel.add(warantty_button);
		
		Image my_products=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("/Icon/phone.jpeg"));//
		Image products_pic=my_products.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		ImageIcon products_icon=new ImageIcon(products_pic);
		
		JButton products_button = new JButton("Products",products_icon);
		products_button.setBackground(new Color(154, 205, 50));
		products_button.setFont(new Font("Tahoma", Font.BOLD, 12));
		products_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
		products_button.setVerticalTextPosition(SwingConstants.CENTER);
		products_button.setBounds(10, 627, 359, 41);
		navbar_panel.add(products_button);
		
		Image my_statistics=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("/Icon/Statistics.png"));//
		Image statistics_pic=my_statistics.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		ImageIcon statistics_icon=new ImageIcon(statistics_pic);
		
		JButton statistics_button = new JButton("Statistics", statistics_icon);
		statistics_button.setBackground(new Color(154, 205, 50));
		statistics_button.setFont(new Font("Tahoma", Font.BOLD, 12));
		statistics_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
		statistics_button.setVerticalTextPosition(SwingConstants.CENTER);
		statistics_button.setBounds(10, 693, 359, 41);
		navbar_panel.add(statistics_button);
		
		Image my_director=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("/Icon/director.png"));//
		Image director_pic=my_director.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		ImageIcon director_icon=new ImageIcon(director_pic);

		
		JButton director_button = new JButton("Director",director_icon);
		director_button.setBackground(new Color(154, 205, 50));
		director_button.setFont(new Font("Verdana", Font.BOLD, 12));
		director_button.setHorizontalTextPosition(SwingConstants.RIGHT); // Set text position to the right of the icon
		director_button.setVerticalTextPosition(SwingConstants.CENTER);
		director_button.setBounds(10, 760, 359, 41);
		navbar_panel.add(director_button);
		
		JPanel panel_content = new JPanel();
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
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(99, 181, 268, 44);
		Searching_panel.add(textField_2);
		
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
		
		Image my_add=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("/Icon/add.png"));//
		Image add_pic=my_add.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		ImageIcon add_icon=new ImageIcon(add_pic);
		
		JButton add_button = new JButton("",add_icon);
		
		add_button.setBounds(27, 10, 72, 57);
		function_panel.add(add_button);
		
		Image my_accept=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("/Icon/accept.png"));//
		Image accept_pic=my_accept.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		ImageIcon accept_icon=new ImageIcon(accept_pic);
		
		JButton accept_button = new JButton("",accept_icon);
		accept_button.setBounds(109, 10, 72, 57);
		function_panel.add(accept_button);
		
		Image my_delete=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("/Icon/delete.png"));//
		Image delete_pic=my_delete.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		ImageIcon delete_icon=new ImageIcon(delete_pic);
		
		JButton delete_button = new JButton("",delete_icon);
		delete_button.setBounds(200, 10, 72, 57);
		function_panel.add(delete_button);
		
		Image my_clear=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("/Icon/clear.png"));//
		Image clear_pic=my_clear.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		ImageIcon clear_icon=new ImageIcon(clear_pic);
		
		JButton clear_button = new JButton("",clear_icon);
		clear_button.setBounds(282, 10, 72, 57);
		function_panel.add(clear_button);
		
		Image my_customer_header=Toolkit.getDefaultToolkit().createImage(Login.class.getResource("/Icon/customer_picture.png"));//
		Image customer_header_pic=my_customer_header.getScaledInstance(20, 15, Image.SCALE_SMOOTH);
		ImageIcon customer_header_icon=new ImageIcon(customer_header_pic);
		
		JLabel customer_label = new JLabel("Customer");
		customer_label.setIcon(customer_header_icon);
		customer_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		customer_label.setBounds(383, 10, 142, 22);
		getContentPane().add(customer_label);
		
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
