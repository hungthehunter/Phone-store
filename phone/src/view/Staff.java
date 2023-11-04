package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

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
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Customer extends JPanel {

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
	
		this.setSize(1110,856);
//		
		this.setVisible(true);
//		
       this.setLayout(null);
	

	    
		
		 Color woodColor = new Color(210, 180, 140);
        Color darkGreen = new Color(0, 100, 0);
        Color buttonGreen = new Color(0, 150, 0);
        Color purple_light=new Color(202,207,255);

		Image my_email=new ImageIcon("Assets/planet.jpg").getImage();//
		my_email=my_email.getScaledInstance(359, 208, Image.SCALE_SMOOTH);
		
		
		Image my_customer=new ImageIcon("Assets/Icon/customer_picture.png").getImage();//
		my_customer=my_customer.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		Image my_invoice=new ImageIcon("Assets/Icon/invoice.png").getImage();//
		my_invoice=my_invoice.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
	
		Image my_counterParty=new ImageIcon("Assets/wuju.jpg").getImage();//
		my_counterParty=my_counterParty.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
				
		Image my_staff=new ImageIcon("Assets/Icon/staff.png").getImage();//
		my_staff=my_staff.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		Image my_salary=new ImageIcon("Assets/Icon/salary.png").getImage();//
		my_salary=my_salary.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		Image my_warantty=new ImageIcon("Assets/Icon/warrenty.png").getImage();//
		my_warantty=my_warantty.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		Image my_products=new ImageIcon("Assets/phone.jpg").getImage();//
		my_products= my_products.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		Image my_statistics=new ImageIcon("Assets/Icon/Statistics.png").getImage();//
		my_statistics= my_statistics.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		Image my_director=new ImageIcon("Assets/Icon/director.png").getImage();//
		my_director= my_director.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JPanel panel_content = new JPanel();
		panel_content.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_content.setBackground(new Color(240, 240, 240));
		panel_content.setBounds(0, 31, 1034, 814);
		add(panel_content);
		panel_content.setLayout(null);
		
		JPanel personal_info_panel = new JPanel();
		personal_info_panel.setBorder(new LineBorder(Color.BLACK));
		personal_info_panel.setBounds(121, 10, 392, 233);
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
		
	
		
		/*===== Searching =====*/
		JPanel Searching_panel = new JPanel();
		Searching_panel.setBorder(new LineBorder(Color.BLACK));
		Searching_panel.setBounds(651, 10, 377, 705);
		panel_content.add(Searching_panel);
		Searching_panel.setLayout(null);
		
		JLabel ID_label = new JLabel("ID :");
		ID_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ID_label.setBounds(10, 39, 34, 13);
		Searching_panel.add(ID_label);
		
		textField = new JTextField();
		textField.setBounds(54, 25, 261, 44);
		Searching_panel.add(textField);
		textField.setColumns(10);
		
		JLabel name_label = new JLabel("Name  :");
		name_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		name_label.setBounds(10, 118, 50, 13);
		Searching_panel.add(name_label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(68, 104, 247, 44);
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
		textField_3.setBounds(83, 331, 238, 44);
		Searching_panel.add(textField_3);
		
		JLabel Birth_label_1_1_1 = new JLabel("Phone  :");
		Birth_label_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Birth_label_1_1_1.setBounds(10, 428, 91, 13);
		Searching_panel.add(Birth_label_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(83, 414, 238, 44);
		Searching_panel.add(textField_4);
		
		JLabel Birth_label_1_1_1_1 = new JLabel("Customer type  :");
		Birth_label_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Birth_label_1_1_1_1.setBounds(10, 523, 114, 13);
		Searching_panel.add(Birth_label_1_1_1_1);
		
		
		JComboBox customer_type_jcomboBox = new JComboBox(customer_type_list);
		customer_type_jcomboBox.setFont(new Font("Times New Roman", Font.BOLD, 13));
		customer_type_jcomboBox.setBounds(124, 508, 227, 44);
		Searching_panel.add(customer_type_jcomboBox);
		
		JLabel Birth_label_1_1_1_1_1 = new JLabel("Comments  :");
		Birth_label_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Birth_label_1_1_1_1_1.setBounds(10, 669, 114, 21);
		Searching_panel.add(Birth_label_1_1_1_1_1);
		/*===== Searching =====*/
		
		
		textField_5 = new JTextField();
		textField_5.setBounds(124, 589, 227, 101);
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
		
		JScrollPane Customer_table = new JScrollPane();
		Customer_table.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		Customer_table.setBounds(4, 277, 632, 526);
		panel_content.add(Customer_table);
		
		table = new JTable();
		table.setForeground(new Color(238, 130, 238));
		table.setFont(new Font("Times New Roman", Font.BOLD, 16));

	 
		Customer_table.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Comment", "Customer Type", "Phone", "Address", "Gender", "Day of birth", "Name", "ID"
			}
		));
		  table.getColumnModel().getColumn(1).setPreferredWidth(100);
		  table.getColumnModel().getColumn(5).setPreferredWidth(100);
		JPanel function_panel = new JPanel();
		function_panel.setBorder(new LineBorder(Color.BLACK));
		function_panel.setBounds(651, 725, 377, 78);
		panel_content.add(function_panel);
		function_panel.setLayout(null);
		
		
		Image add_icon=new ImageIcon("Assets/Icon/add.png").getImage();//
		add_icon=add_icon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton add_button = new JButton("",new ImageIcon(add_icon));
		
		add_button.setBounds(10, 10, 72, 57);
		function_panel.add(add_button);
		
		Image accept_icon=new ImageIcon("Assets/Icon/edit.png").getImage();//
		accept_icon=accept_icon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton accept_button = new JButton("",new ImageIcon(accept_icon));
		accept_button.setBounds(106, 10, 72, 57);
		function_panel.add(accept_button);
		
		Image delete_icon=new ImageIcon("Assets/Icon/delete.png").getImage();//
		delete_icon=delete_icon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton delete_button = new JButton("",new ImageIcon(delete_icon));
		delete_button.setBounds(201, 10, 72, 57);
		function_panel.add(delete_button);
		
		Image clear_icon=new ImageIcon("Assets/Icon/clear.png").getImage();//
		clear_icon=clear_icon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton clear_button = new JButton("",new ImageIcon(clear_icon));
		clear_button.setBounds(295, 10, 72, 57);
		function_panel.add(clear_button);
		
		Image customer_header_icon=new ImageIcon("Assets/Icon/homeLane.png").getImage();//
		customer_header_icon=customer_header_icon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JLabel customer_label = new JLabel("Customer");
		 Border border = new LineBorder(Color.BLACK, 1); // Red border with a thickness of 2 pixels
	        customer_label.setBorder(border);
		customer_label.setBackground(SystemColor.activeCaption);
		 customer_label.setOpaque(true);
		customer_label.setIcon(new ImageIcon(customer_header_icon));
		customer_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		customer_label.setBounds(0, 0, 142, 32);
		add(customer_label);
		
		
		Image homePage_header_icon=new ImageIcon("Assets/Icon/customer_picture.png").getImage();//
		homePage_header_icon=homePage_header_icon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JLabel my_homePage_header_title = new JLabel("Trang chủ");
		my_homePage_header_title.setBorder(border);
		my_homePage_header_title.setBackground(Color.WHITE);
		my_homePage_header_title.setOpaque(true);
		my_homePage_header_title.setIcon(new ImageIcon(homePage_header_icon));
		my_homePage_header_title.setBounds(141, 0, 142, 32);
	add(my_homePage_header_title);
		
		
		
	}
	
    private static DefaultTableCellRenderer getRenderer(int fontSize) {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setFont(new Font("Arial", Font.PLAIN, fontSize));
        return renderer;
    }

}


