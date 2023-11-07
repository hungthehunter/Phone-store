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

public class Supplier extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField supplierSearchText;
	private JTextField SupplierIdText;
	private JTextField supplierNameText;
	private JTextField phoneText;
	private JTextField addressText;
	private JTextField emailText;
	private JTextField noteText;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Supplier() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{138, 648, 0};
		gridBagLayout.rowHeights = new int[]{428, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel_table_supplier = new JPanel();
		panel_table_supplier.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_table_supplier = new GridBagConstraints();
		gbc_panel_table_supplier.fill = GridBagConstraints.BOTH;
		gbc_panel_table_supplier.gridx = 1;
		gbc_panel_table_supplier.gridy = 0;
		add(panel_table_supplier, gbc_panel_table_supplier);
		panel_table_supplier.setLayout(new BorderLayout(0, 0));
		
		JLabel lblInfo = new JLabel("Thông tin nhà cung cấp");
		lblInfo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_table_supplier.add(lblInfo, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_table_supplier.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã Nhà Cung Cấp", "Họ Và Tên", "Giới Tính", "Số Điện Thoại", "Địa Chỉ", "Sản Phẩm Giao Dịch", "Email", "Ngày Giao Dịch", "Ghi Chú"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 2, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{99, 119, 97, 38};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 20, 23, 0, 27, 34, 0, 0, 0, 128, 178, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblSearch = new JLabel("Tìm kiếm nhà cung cấp");
		lblSearch.setFont(new Font("Times New Roman", Font.BOLD, 16));
//		label_supplier_searching.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		GridBagConstraints gbc_lblSearch = new GridBagConstraints();
		gbc_lblSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSearch.insets = new Insets(0, 5, 10, 5);
		gbc_lblSearch.gridx = 0;
		gbc_lblSearch.gridy = 0;
		panel.add(lblSearch, gbc_lblSearch);
		
		   Border lineBorder = BorderFactory.createLineBorder(Color.BLUE); // Line border
	        Border loweredBevelBorder = BorderFactory.createLoweredBevelBorder(); // Lowered bevel border
	        Border raisedBevelBorder = BorderFactory.createRaisedBevelBorder(); // Raised bevel border
	        Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10); // Empty border with padding
		
		supplierSearchText = new JTextField();
		supplierSearchText.setBorder(lineBorder);
		supplierSearchText.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		GridBagConstraints gbc_supplierSearchText = new GridBagConstraints();
		gbc_supplierSearchText.ipady = 15;
		gbc_supplierSearchText.gridwidth = 3;
		gbc_supplierSearchText.fill = GridBagConstraints.HORIZONTAL;
		gbc_supplierSearchText.insets = new Insets(0, 5, 5, 5);
		gbc_supplierSearchText.gridx = 0;
		gbc_supplierSearchText.gridy = 1;
		panel.add(supplierSearchText, gbc_supplierSearchText);
		supplierSearchText.setColumns(10);
		
		JButton btnSearch = new JButton("Tìm ");
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.fill = GridBagConstraints.BOTH;
		gbc_btnSearch.insets = new Insets(0, 0, 5, 5);
		gbc_btnSearch.gridx = 3;
		gbc_btnSearch.gridy = 1;
		panel.add(btnSearch, gbc_btnSearch);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblInput = new JLabel("Thêm nhà cung cấp mới");
		lblInput.setFont(new Font("Times New Roman", Font.BOLD, 16));
		GridBagConstraints gbc_lblInput = new GridBagConstraints();
		gbc_lblInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblInput.insets = new Insets(0, 5, 10, 5);
		gbc_lblInput.gridx = 0;
		gbc_lblInput.gridy = 2;
		panel.add(lblInput, gbc_lblInput);
//		label_supplier_adding.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		JLabel lblMNhCung = new JLabel("Mã nhà cung cấp");
		lblMNhCung.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblMNhCung = new GridBagConstraints();
		gbc_lblMNhCung.anchor = GridBagConstraints.WEST;
		gbc_lblMNhCung.insets = new Insets(0, 5, 5, 5);
		gbc_lblMNhCung.gridx = 0;
		gbc_lblMNhCung.gridy = 3;
		panel.add(lblMNhCung, gbc_lblMNhCung);
		
		JLabel label_supplier_gender = new JLabel("Giới tính");
		label_supplier_gender.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_label_supplier_gender = new GridBagConstraints();
		gbc_label_supplier_gender.anchor = GridBagConstraints.WEST;
		gbc_label_supplier_gender.insets = new Insets(0, 0, 5, 5);
		gbc_label_supplier_gender.gridx = 2;
		gbc_label_supplier_gender.gridy = 3;
		panel.add(label_supplier_gender, gbc_label_supplier_gender);
		
		SupplierIdText = new JTextField();
		SupplierIdText.setBorder(lineBorder);
		GridBagConstraints gbc_SupplierIdText = new GridBagConstraints();
		gbc_SupplierIdText.gridwidth = 2;
		gbc_SupplierIdText.ipady = 10;
		gbc_SupplierIdText.insets = new Insets(0, 5, 15, 5);
		gbc_SupplierIdText.fill = GridBagConstraints.HORIZONTAL;
		gbc_SupplierIdText.gridx = 0;
		gbc_SupplierIdText.gridy = 4;
		panel.add(SupplierIdText, gbc_SupplierIdText);
		SupplierIdText.setColumns(10);

	      
		JRadioButton radioButton_supplier_gender_male = new JRadioButton("Nam");
		GridBagConstraints gbc_radioButton_supplier_gender_male = new GridBagConstraints();
		gbc_radioButton_supplier_gender_male.anchor = GridBagConstraints.WEST;
		gbc_radioButton_supplier_gender_male.ipady = 10;
		gbc_radioButton_supplier_gender_male.insets = new Insets(0, 0, 15, 5);
		gbc_radioButton_supplier_gender_male.gridx = 2;
		gbc_radioButton_supplier_gender_male.gridy = 4;
		panel.add(radioButton_supplier_gender_male, gbc_radioButton_supplier_gender_male);
		
		JRadioButton radioButton_supplier_gender_female = new JRadioButton("Nữ");
		GridBagConstraints gbc_radioButton_supplier_gender_female = new GridBagConstraints();
		gbc_radioButton_supplier_gender_female.anchor = GridBagConstraints.WEST;
		gbc_radioButton_supplier_gender_female.insets = new Insets(0, 0, 15, 0);
		gbc_radioButton_supplier_gender_female.gridx = 3;
		gbc_radioButton_supplier_gender_female.gridy = 4;
		panel.add(radioButton_supplier_gender_female, gbc_radioButton_supplier_gender_female);
		
		
		ButtonGroup buttonGroup = new ButtonGroup();
		 buttonGroup.add(radioButton_supplier_gender_male);
		 buttonGroup.add(radioButton_supplier_gender_female);
	       
	       
		JLabel lblSupplierName = new JLabel("Họ tên nhà cung cấp");
		lblSupplierName.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblSupplierName = new GridBagConstraints();
		gbc_lblSupplierName.anchor = GridBagConstraints.WEST;
		gbc_lblSupplierName.insets = new Insets(0, 5, 5, 5);
		gbc_lblSupplierName.gridx = 0;
		gbc_lblSupplierName.gridy = 5;
		panel.add(lblSupplierName, gbc_lblSupplierName);
		
		JLabel label_phone = new JLabel("Số điện thoại");
		label_phone.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_label_phone = new GridBagConstraints();
		gbc_label_phone.anchor = GridBagConstraints.WEST;
		gbc_label_phone.insets = new Insets(0, 0, 5, 5);
		gbc_label_phone.gridx = 2;
		gbc_label_phone.gridy = 5;
		panel.add(label_phone, gbc_label_phone);
		
		supplierNameText = new JTextField();
		supplierNameText.setBorder(lineBorder);
		GridBagConstraints gbc_supplierNameText = new GridBagConstraints();
		gbc_supplierNameText.gridwidth = 2;
		gbc_supplierNameText.ipady = 10;
		gbc_supplierNameText.insets = new Insets(0, 5, 15, 5);
		gbc_supplierNameText.fill = GridBagConstraints.HORIZONTAL;
		gbc_supplierNameText.gridx = 0;
		gbc_supplierNameText.gridy = 6;
		panel.add(supplierNameText, gbc_supplierNameText);
		supplierNameText.setColumns(10);
		
		phoneText = new JTextField();
		phoneText.setBorder(lineBorder);
		GridBagConstraints gbc_phoneText = new GridBagConstraints();
		gbc_phoneText.gridwidth = 2;
		gbc_phoneText.ipady = 10;
		gbc_phoneText.insets = new Insets(0, 0, 15, 5);
		gbc_phoneText.fill = GridBagConstraints.HORIZONTAL;
		gbc_phoneText.gridx = 2;
		gbc_phoneText.gridy = 6;
		panel.add(phoneText, gbc_phoneText);
		phoneText.setColumns(10);
		
		JLabel label_Address = new JLabel("Địa chỉ");
		label_Address.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_label_Address = new GridBagConstraints();
		gbc_label_Address.anchor = GridBagConstraints.WEST;
		gbc_label_Address.insets = new Insets(0, 5, 5, 5);
		gbc_label_Address.gridx = 0;
		gbc_label_Address.gridy = 7;
		panel.add(label_Address, gbc_label_Address);
		
		addressText = new JTextField();
		addressText.setBorder(lineBorder);
		GridBagConstraints gbc_addressText = new GridBagConstraints();
		gbc_addressText.gridwidth = 2;
		gbc_addressText.ipady = 10;
		gbc_addressText.insets = new Insets(0, 5, 15, 5);
		gbc_addressText.fill = GridBagConstraints.HORIZONTAL;
		gbc_addressText.gridx = 0;
		gbc_addressText.gridy = 8;
		panel.add(addressText, gbc_addressText);
		addressText.setColumns(10);
		
		
		String[] supplier_type_list=new String[] {"Nokia", "Samsung Galaxy Prime J7"};
		
		JLabel label_email = new JLabel("Email");
		label_email.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_label_email = new GridBagConstraints();
		gbc_label_email.anchor = GridBagConstraints.WEST;
		gbc_label_email.insets = new Insets(0, 5, 5, 5);
		gbc_label_email.gridx = 0;
		gbc_label_email.gridy = 9;
		panel.add(label_email, gbc_label_email);
		
		JLabel lblSnPhmGiao = new JLabel("Sản phẩm giao dịch");
		lblSnPhmGiao.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblSnPhmGiao = new GridBagConstraints();
		gbc_lblSnPhmGiao.gridwidth = 2;
		gbc_lblSnPhmGiao.anchor = GridBagConstraints.WEST;
		gbc_lblSnPhmGiao.insets = new Insets(0, 0, 5, 5);
		gbc_lblSnPhmGiao.gridx = 2;
		gbc_lblSnPhmGiao.gridy = 9;
		panel.add(lblSnPhmGiao, gbc_lblSnPhmGiao);
		
		emailText = new JTextField();
		emailText.setBorder(lineBorder);
		GridBagConstraints gbc_emailText = new GridBagConstraints();
		gbc_emailText.gridwidth = 2;
		gbc_emailText.ipady = 10;
		gbc_emailText.insets = new Insets(0, 5, 15, 5);
		gbc_emailText.fill = GridBagConstraints.HORIZONTAL;
		gbc_emailText.gridx = 0;
		gbc_emailText.gridy = 10;
		panel.add(emailText, gbc_emailText);
		emailText.setColumns(10);
		JComboBox jcomboBox_supplier_type = new JComboBox( supplier_type_list);
		jcomboBox_supplier_type.setFont(new Font("Times New Roman", Font.BOLD, 13));
		GridBagConstraints gbc_jcomboBox_supplier_type = new GridBagConstraints();
		gbc_jcomboBox_supplier_type.gridwidth = 2;
		gbc_jcomboBox_supplier_type.ipady = 10;
		gbc_jcomboBox_supplier_type.insets = new Insets(0, 0, 15, 5);
		gbc_jcomboBox_supplier_type.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcomboBox_supplier_type.gridx = 2;
		gbc_jcomboBox_supplier_type.gridy = 10;
		panel.add(jcomboBox_supplier_type, gbc_jcomboBox_supplier_type);
		
		JLabel lblDateTrading = new JLabel("Ngày sinh");
		lblDateTrading.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblDateTrading = new GridBagConstraints();
		gbc_lblDateTrading.anchor = GridBagConstraints.WEST;
		gbc_lblDateTrading.insets = new Insets(0, 5, 5, 5);
		gbc_lblDateTrading.gridx = 0;
		gbc_lblDateTrading.gridy = 11;
		panel.add(lblDateTrading, gbc_lblDateTrading);
		
		String []day_list=new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String []month_list=new String[] {"1","2","3","4","5","6","7","8","9","10","11","12"};
		String []year_list=new String[]{"2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
		JComboBox day_comboBox = new JComboBox(day_list);
		GridBagConstraints gbc_day_comboBox = new GridBagConstraints();
		gbc_day_comboBox.insets = new Insets(0, 5, 5, 5);
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
		
		JLabel lblNote = new JLabel("Ghi chú");
		lblNote.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblNote = new GridBagConstraints();
		gbc_lblNote.anchor = GridBagConstraints.WEST;
		gbc_lblNote.insets = new Insets(0, 5, 5, 5);
		gbc_lblNote.gridx = 0;
		gbc_lblNote.gridy = 13;
		panel.add(lblNote, gbc_lblNote);
		
		noteText = new JTextField();
		noteText.setBorder(lineBorder);
		noteText.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_noteText = new GridBagConstraints();
		gbc_noteText.gridwidth = 4;
		gbc_noteText.insets = new Insets(0, 5, 5, 5);
		gbc_noteText.fill = GridBagConstraints.BOTH;
		gbc_noteText.gridx = 0;
		gbc_noteText.gridy = 14;
		panel.add(noteText, gbc_noteText);
		noteText.setColumns(10);
		
		JPanel panelFeature = new JPanel();
		panelFeature.setBorder(null);
		GridBagConstraints gbc_panelFeature = new GridBagConstraints();
		gbc_panelFeature.insets = new Insets(0, 5, 0, 5);
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
	Image iconClear = new ImageIcon("Assets/Icon/clear.png").getImage();
	iconClear = iconClear.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		JButton btnAdd = new JButton("");
		btnAdd.setPreferredSize(new Dimension(60, 40));
		btnAdd.setIcon(new ImageIcon(iconAdd));
		panelFeature.add(btnAdd);
		
		JButton btnDelete = new JButton("");
		btnDelete.setPreferredSize(new Dimension(60, 40));
		 btnDelete.setIcon(new ImageIcon(delete_icon));
		panelFeature.add(btnDelete);
		
		JButton btnEdit = new JButton("");
		btnEdit.setPreferredSize(new Dimension(60, 40));
		btnEdit.setIcon(new ImageIcon(iconEdit));
		panelFeature.add(btnEdit);
		
		JButton btnClear = new JButton("");
		btnClear.setPreferredSize(new Dimension(60, 40));
		btnClear.setIcon(new ImageIcon(iconClear));
		panelFeature.add(btnClear);
	}

}
