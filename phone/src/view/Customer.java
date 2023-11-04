package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Customer extends JPanel {
	private JTextField textField_customer_searching;
	private JTextField textField_customer_id;
	private JTextField textField_customer_name;
	private JTextField textField_phone;
	private JTextField textField_address;
	private JTextField textField_email;
	private JTextField textField_password;
	private JTextField textField_comment;
	private JTable table;
	/**
	 * Create the panel.
	 */
	public Customer() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{138, 547, 0};
		gridBagLayout.rowHeights = new int[]{428, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel_table_customer = new JPanel();
		panel_table_customer.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_table_customer = new GridBagConstraints();
		gbc_panel_table_customer.fill = GridBagConstraints.BOTH;
		gbc_panel_table_customer.gridx = 1;
		gbc_panel_table_customer.gridy = 0;
		add(panel_table_customer, gbc_panel_table_customer);
		panel_table_customer.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("Thông tin khách hàng");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_table_customer.add(lblNewLabel_9, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_table_customer.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "H\u1ECD t\u00EAn", "Gi\u1EDBi t\u00EDnh", "S\u0110T", "\u0110\u1ECBa ch\u1EC9", "V\u1ECB tr\u00ED", "Email", "Password", "Ng\u00E0y sinh", "Ghi ch\u00FA"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{99, 119, 97, 38};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 20, 23, 0, 27, 34, 0, 0, 0, 96, 178, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel label_customer_searching = new JLabel("Tìm kiếm khách hàng");
		label_customer_searching.setFont(new Font("Times New Roman", Font.BOLD, 16));
//		label_customer_searching.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		GridBagConstraints gbc_label_customer_searching = new GridBagConstraints();
		gbc_label_customer_searching.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_customer_searching.insets = new Insets(0, 5, 10, 5);
		gbc_label_customer_searching.gridx = 0;
		gbc_label_customer_searching.gridy = 0;
		panel.add(label_customer_searching, gbc_label_customer_searching);
		
		   Border lineBorder = BorderFactory.createLineBorder(Color.BLUE); // Line border
	        Border loweredBevelBorder = BorderFactory.createLoweredBevelBorder(); // Lowered bevel border
	        Border raisedBevelBorder = BorderFactory.createRaisedBevelBorder(); // Raised bevel border
	        Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10); // Empty border with padding
		
		textField_customer_searching = new JTextField();
		textField_customer_searching.setBorder(lineBorder);
		textField_customer_searching.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		GridBagConstraints gbc_textField_customer_searching = new GridBagConstraints();
		gbc_textField_customer_searching.ipady = 15;
		gbc_textField_customer_searching.gridwidth = 3;
		gbc_textField_customer_searching.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_customer_searching.insets = new Insets(0, 5, 5, 5);
		gbc_textField_customer_searching.gridx = 0;
		gbc_textField_customer_searching.gridy = 1;
		panel.add(textField_customer_searching, gbc_textField_customer_searching);
		textField_customer_searching.setColumns(10);
		
		JButton button_customer_searching = new JButton("Tìm ");
		GridBagConstraints gbc_button_customer_searching = new GridBagConstraints();
		gbc_button_customer_searching.fill = GridBagConstraints.BOTH;
		gbc_button_customer_searching.insets = new Insets(0, 0, 5, 5);
		gbc_button_customer_searching.gridx = 3;
		gbc_button_customer_searching.gridy = 1;
		panel.add(button_customer_searching, gbc_button_customer_searching);
		button_customer_searching.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblThmKhchHng = new JLabel("Thêm khách hàng mới");
		lblThmKhchHng.setFont(new Font("Times New Roman", Font.BOLD, 16));
		GridBagConstraints gbc_lblThmKhchHng = new GridBagConstraints();
		gbc_lblThmKhchHng.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblThmKhchHng.insets = new Insets(0, 5, 10, 5);
		gbc_lblThmKhchHng.gridx = 0;
		gbc_lblThmKhchHng.gridy = 2;
		panel.add(lblThmKhchHng, gbc_lblThmKhchHng);
//		label_customer_adding.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		JLabel lblMKhchHng = new JLabel("Mã khách hàng");
		lblMKhchHng.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblMKhchHng = new GridBagConstraints();
		gbc_lblMKhchHng.anchor = GridBagConstraints.WEST;
		gbc_lblMKhchHng.insets = new Insets(0, 5, 5, 5);
		gbc_lblMKhchHng.gridx = 0;
		gbc_lblMKhchHng.gridy = 3;
		panel.add(lblMKhchHng, gbc_lblMKhchHng);
		
		JLabel label_customer_gender = new JLabel("Giới tính");
		label_customer_gender.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_label_customer_gender = new GridBagConstraints();
		gbc_label_customer_gender.anchor = GridBagConstraints.WEST;
		gbc_label_customer_gender.insets = new Insets(0, 0, 5, 5);
		gbc_label_customer_gender.gridx = 2;
		gbc_label_customer_gender.gridy = 3;
		panel.add(label_customer_gender, gbc_label_customer_gender);
		
		textField_customer_id = new JTextField();
		textField_customer_id.setBorder(lineBorder);
		GridBagConstraints gbc_textField_customer_id = new GridBagConstraints();
		gbc_textField_customer_id.gridwidth = 2;
		gbc_textField_customer_id.ipady = 10;
		gbc_textField_customer_id.insets = new Insets(0, 0, 15, 5);
		gbc_textField_customer_id.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_customer_id.gridx = 0;
		gbc_textField_customer_id.gridy = 4;
		panel.add(textField_customer_id, gbc_textField_customer_id);
		textField_customer_id.setColumns(10);

	      
		JRadioButton radioButton_customer_gender_male = new JRadioButton("Nam");
		GridBagConstraints gbc_radioButton_customer_gender_male = new GridBagConstraints();
		gbc_radioButton_customer_gender_male.anchor = GridBagConstraints.WEST;
		gbc_radioButton_customer_gender_male.ipady = 10;
		gbc_radioButton_customer_gender_male.insets = new Insets(0, 0, 15, 5);
		gbc_radioButton_customer_gender_male.gridx = 2;
		gbc_radioButton_customer_gender_male.gridy = 4;
		panel.add(radioButton_customer_gender_male, gbc_radioButton_customer_gender_male);
		
		JRadioButton radioButton_customer_gender_female = new JRadioButton("Nữ");
		GridBagConstraints gbc_radioButton_customer_gender_female = new GridBagConstraints();
		gbc_radioButton_customer_gender_female.anchor = GridBagConstraints.WEST;
		gbc_radioButton_customer_gender_female.insets = new Insets(0, 0, 15, 0);
		gbc_radioButton_customer_gender_female.gridx = 3;
		gbc_radioButton_customer_gender_female.gridy = 4;
		panel.add(radioButton_customer_gender_female, gbc_radioButton_customer_gender_female);
		
		
		ButtonGroup buttonGroup = new ButtonGroup();
		 buttonGroup.add(radioButton_customer_gender_male);
		 buttonGroup.add(radioButton_customer_gender_female);
	       
	       
		JLabel lblHTnKhch = new JLabel("Họ tên khách hàng");
		lblHTnKhch.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblHTnKhch = new GridBagConstraints();
		gbc_lblHTnKhch.anchor = GridBagConstraints.WEST;
		gbc_lblHTnKhch.insets = new Insets(0, 5, 5, 5);
		gbc_lblHTnKhch.gridx = 0;
		gbc_lblHTnKhch.gridy = 5;
		panel.add(lblHTnKhch, gbc_lblHTnKhch);
		
		JLabel label_phone = new JLabel("Số điện thoại");
		label_phone.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_label_phone = new GridBagConstraints();
		gbc_label_phone.anchor = GridBagConstraints.WEST;
		gbc_label_phone.insets = new Insets(0, 0, 5, 5);
		gbc_label_phone.gridx = 2;
		gbc_label_phone.gridy = 5;
		panel.add(label_phone, gbc_label_phone);
		
		textField_customer_name = new JTextField();
		textField_customer_name.setBorder(lineBorder);
		GridBagConstraints gbc_textField_customer_name = new GridBagConstraints();
		gbc_textField_customer_name.gridwidth = 2;
		gbc_textField_customer_name.ipady = 10;
		gbc_textField_customer_name.insets = new Insets(0, 5, 15, 5);
		gbc_textField_customer_name.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_customer_name.gridx = 0;
		gbc_textField_customer_name.gridy = 6;
		panel.add(textField_customer_name, gbc_textField_customer_name);
		textField_customer_name.setColumns(10);
		
		textField_phone = new JTextField();
		textField_phone.setBorder(lineBorder);
		GridBagConstraints gbc_textField_phone = new GridBagConstraints();
		gbc_textField_phone.gridwidth = 2;
		gbc_textField_phone.ipady = 10;
		gbc_textField_phone.insets = new Insets(0, 0, 15, 5);
		gbc_textField_phone.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_phone.gridx = 2;
		gbc_textField_phone.gridy = 6;
		panel.add(textField_phone, gbc_textField_phone);
		textField_phone.setColumns(10);
		
		JLabel label_Address = new JLabel("Địa chỉ");
		label_Address.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_label_Address = new GridBagConstraints();
		gbc_label_Address.anchor = GridBagConstraints.WEST;
		gbc_label_Address.insets = new Insets(0, 5, 5, 5);
		gbc_label_Address.gridx = 0;
		gbc_label_Address.gridy = 7;
		panel.add(label_Address, gbc_label_Address);
		
		JLabel lblLoiNhan = new JLabel("Vị trí");
		lblLoiNhan.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblLoiNhan = new GridBagConstraints();
		gbc_lblLoiNhan.anchor = GridBagConstraints.WEST;
		gbc_lblLoiNhan.insets = new Insets(0, 0, 5, 5);
		gbc_lblLoiNhan.gridx = 2;
		gbc_lblLoiNhan.gridy = 7;
		panel.add(lblLoiNhan, gbc_lblLoiNhan);
		
		textField_address = new JTextField();
		textField_address.setBorder(lineBorder);
		GridBagConstraints gbc_textField_address = new GridBagConstraints();
		gbc_textField_address.gridwidth = 2;
		gbc_textField_address.ipady = 10;
		gbc_textField_address.insets = new Insets(0, 5, 15, 5);
		gbc_textField_address.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_address.gridx = 0;
		gbc_textField_address.gridy = 8;
		panel.add(textField_address, gbc_textField_address);
		textField_address.setColumns(10);
		
		
		String[] customer_type_list=new String[] {"Quản lý","Nhân viên"};
		JComboBox jcomboBox_customer_type = new JComboBox( customer_type_list);
		jcomboBox_customer_type.setFont(new Font("Times New Roman", Font.BOLD, 13));
		GridBagConstraints gbc_jcomboBox_customer_type = new GridBagConstraints();
		gbc_jcomboBox_customer_type.gridwidth = 2;
		gbc_jcomboBox_customer_type.ipady = 10;
		gbc_jcomboBox_customer_type.insets = new Insets(0, 0, 15, 5);
		gbc_jcomboBox_customer_type.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcomboBox_customer_type.gridx = 2;
		gbc_jcomboBox_customer_type.gridy = 8;
		panel.add(jcomboBox_customer_type, gbc_jcomboBox_customer_type);
		
		JLabel label_email = new JLabel("Email");
		label_email.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_label_email = new GridBagConstraints();
		gbc_label_email.anchor = GridBagConstraints.WEST;
		gbc_label_email.insets = new Insets(0, 5, 5, 5);
		gbc_label_email.gridx = 0;
		gbc_label_email.gridy = 9;
		panel.add(label_email, gbc_label_email);
		
		JLabel label_password = new JLabel("Password");
		label_password.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_label_password = new GridBagConstraints();
		gbc_label_password.anchor = GridBagConstraints.WEST;
		gbc_label_password.insets = new Insets(0, 0, 5, 5);
		gbc_label_password.gridx = 2;
		gbc_label_password.gridy = 9;
		panel.add(label_password, gbc_label_password);
		
		textField_email = new JTextField();
		textField_email.setBorder(lineBorder);
		GridBagConstraints gbc_textField_email = new GridBagConstraints();
		gbc_textField_email.gridwidth = 2;
		gbc_textField_email.ipady = 10;
		gbc_textField_email.insets = new Insets(0, 5, 15, 5);
		gbc_textField_email.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_email.gridx = 0;
		gbc_textField_email.gridy = 10;
		panel.add(textField_email, gbc_textField_email);
		textField_email.setColumns(10);
		
		textField_password = new JTextField();
		textField_password.setBorder(lineBorder);
		GridBagConstraints gbc_textField_password = new GridBagConstraints();
		gbc_textField_password.gridwidth = 2;
		gbc_textField_password.ipady = 10;
		gbc_textField_password.insets = new Insets(0, 0, 15, 5);
		gbc_textField_password.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_password.gridx = 2;
		gbc_textField_password.gridy = 10;
		panel.add(textField_password, gbc_textField_password);
		textField_password.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ngày sinh");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 5, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 11;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		String []day_list=new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String []month_list=new String[] {"1","2","3","4","5","6","7","8","9","10","11","12"};
		String []year_list=new String[]{"2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
		JComboBox day_comboBox = new JComboBox(day_list);
		GridBagConstraints gbc_day_comboBox = new GridBagConstraints();
		gbc_day_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_day_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_day_comboBox.gridx = 0;
		gbc_day_comboBox.gridy = 12;
		panel.add(day_comboBox, gbc_day_comboBox);
		
		JComboBox month_comboBox = new JComboBox(month_list);
		GridBagConstraints gbc_month_comboBox = new GridBagConstraints();
		gbc_month_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_month_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_month_comboBox.gridx = 1;
		gbc_month_comboBox.gridy = 12;
		panel.add(month_comboBox, gbc_month_comboBox);
		
		JComboBox month_comboBox_1 = new JComboBox(year_list);
		GridBagConstraints gbc_month_comboBox_1 = new GridBagConstraints();
		gbc_month_comboBox_1.gridwidth = 2;
		gbc_month_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_month_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_month_comboBox_1.gridx = 2;
		gbc_month_comboBox_1.gridy = 12;
		panel.add(month_comboBox_1, gbc_month_comboBox_1);
		
		JLabel label_comment = new JLabel("Ghi chú");
		label_comment.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_label_comment = new GridBagConstraints();
		gbc_label_comment.anchor = GridBagConstraints.WEST;
		gbc_label_comment.insets = new Insets(0, 5, 5, 5);
		gbc_label_comment.gridx = 0;
		gbc_label_comment.gridy = 13;
		panel.add(label_comment, gbc_label_comment);
		
		textField_comment = new JTextField();
		textField_comment.setBorder(lineBorder);
		textField_comment.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_textField_comment = new GridBagConstraints();
		gbc_textField_comment.gridwidth = 4;
		gbc_textField_comment.insets = new Insets(0, 5, 5, 5);
		gbc_textField_comment.fill = GridBagConstraints.BOTH;
		gbc_textField_comment.gridx = 0;
		gbc_textField_comment.gridy = 14;
		panel.add(textField_comment, gbc_textField_comment);
		textField_comment.setColumns(10);
		
		JPanel panelFeature = new JPanel();
		panelFeature.setBorder(null);
		GridBagConstraints gbc_panelFeature = new GridBagConstraints();
		gbc_panelFeature.gridwidth = 4;
		gbc_panelFeature.fill = GridBagConstraints.BOTH;
		gbc_panelFeature.gridx = 0;
		gbc_panelFeature.gridy = 15;
		panel.add(panelFeature, gbc_panelFeature);
		panelFeature.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Image iconAdd = new ImageIcon("Assets/Icon/add.png").getImage();
		iconAdd = iconAdd.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
	
	Image delete_icon=new ImageIcon("Assets/Icon/delete.png").getImage();//
	delete_icon=delete_icon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
	Image iconEdit = new ImageIcon("Assets/Icon/edit.png").getImage();
	iconEdit = iconEdit.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
	Image iconDelete = new ImageIcon("Assets/Icon/clear.png").getImage();
	iconDelete = iconDelete.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setPreferredSize(new Dimension(60, 40));
		btnNewButton_1.setIcon(new ImageIcon(iconAdd));
		panelFeature.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setPreferredSize(new Dimension(60, 40));
		 btnNewButton_1_1.setIcon(new ImageIcon(delete_icon));
		panelFeature.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setPreferredSize(new Dimension(60, 40));
		btnNewButton_2.setIcon(new ImageIcon(iconEdit));
		panelFeature.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setPreferredSize(new Dimension(60, 40));
		btnNewButton_3.setIcon(new ImageIcon(iconDelete));
		panelFeature.add(btnNewButton_3);
	}

}
