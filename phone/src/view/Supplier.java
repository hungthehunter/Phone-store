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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

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
		Color myColor = new Color(34, 33, 75);
		Color backGroundColor = Color.white;
		Color borderColor = myColor;
		Color textColor = myColor;
		Color buttonColor = myColor;
		
		setBackground(backGroundColor);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{138, 648, 0};
		gridBagLayout.rowHeights = new int[]{428, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel_table_supplier = new JPanel();
		panel_table_supplier.setBackground(backGroundColor);
		panel_table_supplier.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_table_supplier = new GridBagConstraints();
		gbc_panel_table_supplier.insets = new Insets(20, 0, 20, 20);
		gbc_panel_table_supplier.fill = GridBagConstraints.BOTH;
		gbc_panel_table_supplier.gridx = 1;
		gbc_panel_table_supplier.gridy = 0;
		add(panel_table_supplier, gbc_panel_table_supplier);
		panel_table_supplier.setLayout(new BorderLayout(0, 0));
		
		JLabel lblInfo = new JLabel("Thông tin nhà cung cấp");
		lblInfo.setFont(new Font("Verdana", Font.BOLD, 15));
		lblInfo.setForeground(textColor);
		panel_table_supplier.add(lblInfo, BorderLayout.NORTH);
		
		
		String[] columnNames = {"Mã Nhà Cung Cấp", "Họ Và Tên", "Giới Tính", "Số Điện Thoại", "Địa Chỉ", "Sản Phẩm Giao Dịch", "Email", "Ngày Giao Dịch", "Ghi Chú"};
		Object[][] data = {
		         {"NVA", "Nguyen Van A", "Nam", "09092382938", "43/12 Duong so 1", "Nokia", "nva@gmail.com", "09/12/2021", "test"},
		         {"NVB", "Nguyen Van B", "Nam", "09092121311", "32 Go Vap" , "Iphone", "nvb@gmail.com", "23/01/2021", "new"},		
		         {"NVC", "Nguyen Van C", "Nam", "09092333338", "3/12 Duong so 9", "Samsung", "nvc@gmail.com", "02/1/2021", ""},
		         {"NVD", "Nguyen Van D", "Nam", "09092381111", "23/12 Duong so 5", "Oppo", "nvd@gmail.com", "01/2/2021", ""},
		         {"NVE", "Nguyen Van E", "Nam", "09092322228", "13/12 Duong so 3", "Xiaomi", "nve@gmail.com", "03/11/2021", "test"},
		};
		
		DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
		infoTable = new JTable(model);
		infoTable.setFont(new Font("Verdana", Font.PLAIN, 12));
		infoTable.setBorder(new LineBorder(borderColor, 2, false));
		infoTable.getTableHeader().setBorder(new LineBorder(borderColor, 2, false));
		infoTable.getTableHeader().setBackground(borderColor);
		infoTable.getTableHeader().setForeground(Color.white);
		infoTable.getTableHeader().setReorderingAllowed(false);
		JScrollPane scrollPane = new JScrollPane(infoTable);	
		panel_table_supplier.add(scrollPane, BorderLayout.CENTER);

		
		JPanel inputPanel = new JPanel();
		inputPanel.setBackground(backGroundColor);
		inputPanel.setBorder(null);
		GridBagConstraints gbc_inputPanel = new GridBagConstraints();
		gbc_inputPanel.weightx = 0.7;
		gbc_inputPanel.insets = new Insets(20, 20, 20, 5);
		gbc_inputPanel.fill = GridBagConstraints.BOTH;
		gbc_inputPanel.gridx = 0;
		gbc_inputPanel.gridy = 0;
		add(inputPanel, gbc_inputPanel);
		GridBagLayout gbl_inputPanel = new GridBagLayout();
		gbl_inputPanel.columnWidths = new int[]{99, 119, 97, 38};
		gbl_inputPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 20, 23, 0, 27, 34, 0, 0, 0, 128, 178, 0};
		gbl_inputPanel.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0};
		gbl_inputPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		inputPanel.setLayout(gbl_inputPanel);
		
		JLabel lblSearch = new JLabel("Tìm kiếm nhà cung cấp");
		lblSearch.setFont(new Font("Verdana", Font.BOLD, 15));
		lblSearch.setForeground(textColor);
		GridBagConstraints gbc_lblSearch = new GridBagConstraints();
		gbc_lblSearch.weightx = 1.0;
		gbc_lblSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSearch.insets = new Insets(0, 5, 10, 5);
		gbc_lblSearch.gridx = 0;
		gbc_lblSearch.gridy = 0;
		inputPanel.add(lblSearch, gbc_lblSearch);
		
		searchText = new JTextField();
		searchText.setBorder(new LineBorder(borderColor, 2, true));	
		searchText.setForeground(textColor);
		searchText.setFont(new Font("Verdana", Font.PLAIN, 15));
		GridBagConstraints gbc_searchText = new GridBagConstraints();
		gbc_searchText.weighty = 0.1;
		gbc_searchText.weightx = 0.8;
		gbc_searchText.ipady = 15;
		gbc_searchText.gridwidth = 3;
		gbc_searchText.fill = GridBagConstraints.HORIZONTAL;
		gbc_searchText.insets = new Insets(0, 5, 5, 5);
		gbc_searchText.gridx = 0;
		gbc_searchText.gridy = 1;
		inputPanel.add(searchText, gbc_searchText);
		searchText.setColumns(10);
		
		JButton btnSearch = new JButton("Tìm ");
		btnSearch.setBorder(new LineBorder(borderColor, 2, true));
		btnSearch.setBackground(borderColor);
		btnSearch.setForeground(Color.white);
		btnSearch.setFocusPainted(false);
        Image iconSearch = new ImageIcon("Assets/Icon/searching.png").getImage();
        iconSearch = iconSearch.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        btnSearch.setIcon(new ImageIcon(iconSearch));
//		btnSearch.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String query = searchText.getText().toLowerCase();
//		        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
//		        sorter.setRowFilter(RowFilter.regexFilter(query));
//		        infoTable.setRowSorter(sorter);
//			}
//		});
		
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.weighty = 0.1;
		gbc_btnSearch.weightx = 0.2;
		gbc_btnSearch.fill = GridBagConstraints.BOTH;
		gbc_btnSearch.insets = new Insets(0, 0, 5, 5);
		gbc_btnSearch.gridx = 3;
		gbc_btnSearch.gridy = 1;
		inputPanel.add(btnSearch, gbc_btnSearch);
		
		JLabel lblInput = new JLabel("Thêm nhà cung cấp mới");
		lblInput.setFont(new Font("Verdana", Font.BOLD, 15));
		lblInput.setForeground(textColor);
		GridBagConstraints gbc_lblInput = new GridBagConstraints();
		gbc_lblInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblInput.insets = new Insets(0, 5, 10, 5);
		gbc_lblInput.gridx = 0;
		gbc_lblInput.gridy = 2;
		inputPanel.add(lblInput, gbc_lblInput);
		
		JLabel lblSupplierId = new JLabel("Mã nhà cung cấp");
		lblSupplierId.setFont(new Font("Verdana", Font.BOLD, 12));
		lblSupplierId.setForeground(textColor);
		GridBagConstraints gbc_lblSupplierId = new GridBagConstraints();
		gbc_lblSupplierId.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSupplierId.insets = new Insets(0, 5, 5, 5);
		gbc_lblSupplierId.gridx = 0;
		gbc_lblSupplierId.gridy = 3;
		inputPanel.add(lblSupplierId, gbc_lblSupplierId);
		
		JLabel lblSupplier_gender = new JLabel("Giới tính");
		lblSupplier_gender.setForeground(textColor);
		lblSupplier_gender.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_label_supplier_gender = new GridBagConstraints();
		gbc_label_supplier_gender.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_supplier_gender.insets = new Insets(0, 0, 5, 5);
		gbc_label_supplier_gender.gridx = 2;
		gbc_label_supplier_gender.gridy = 3;
		inputPanel.add(lblSupplier_gender, gbc_label_supplier_gender);
		
		SupplierIdText = new JTextField();
		SupplierIdText.setBorder(new LineBorder(borderColor, 2, true));	
		SupplierIdText.setForeground(textColor);
		SupplierIdText.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_SupplierIdText = new GridBagConstraints();
		gbc_SupplierIdText.weighty = 0.1;
		gbc_SupplierIdText.gridwidth = 2;
		gbc_SupplierIdText.ipady = 10;
		gbc_SupplierIdText.insets = new Insets(0, 5, 15, 5);
		gbc_SupplierIdText.fill = GridBagConstraints.HORIZONTAL;
		gbc_SupplierIdText.gridx = 0;
		gbc_SupplierIdText.gridy = 4;
		inputPanel.add(SupplierIdText, gbc_SupplierIdText);
		SupplierIdText.setColumns(10);
	      
		JRadioButton radioButton_supplier_gender_male = new JRadioButton("Nam");
		radioButton_supplier_gender_male.setFont(new Font("Verdana", Font.PLAIN, 12));
		radioButton_supplier_gender_male.setForeground(textColor);
		radioButton_supplier_gender_male.setBackground(backGroundColor);
		GridBagConstraints gbc_radioButton_supplier_gender_male = new GridBagConstraints();
		gbc_radioButton_supplier_gender_male.weighty = 0.1;
		gbc_radioButton_supplier_gender_male.anchor = GridBagConstraints.WEST;
		gbc_radioButton_supplier_gender_male.ipady = 10;
		gbc_radioButton_supplier_gender_male.insets = new Insets(0, 0, 15, 5);
		gbc_radioButton_supplier_gender_male.gridx = 2;
		gbc_radioButton_supplier_gender_male.gridy = 4;
		inputPanel.add(radioButton_supplier_gender_male, gbc_radioButton_supplier_gender_male);
		
		JRadioButton radioButton_supplier_gender_female = new JRadioButton("Nữ");
		radioButton_supplier_gender_female.setFont(new Font("Verdana", Font.PLAIN, 12));
		radioButton_supplier_gender_female.setBackground(backGroundColor);
		radioButton_supplier_gender_female.setForeground(textColor);
		GridBagConstraints gbc_radioButton_supplier_gender_female = new GridBagConstraints();
		gbc_radioButton_supplier_gender_female.weighty = 0.1;
		gbc_radioButton_supplier_gender_female.anchor = GridBagConstraints.WEST;
		gbc_radioButton_supplier_gender_female.insets = new Insets(0, 0, 15, 0);
		gbc_radioButton_supplier_gender_female.gridx = 3;
		gbc_radioButton_supplier_gender_female.gridy = 4;
		inputPanel.add(radioButton_supplier_gender_female, gbc_radioButton_supplier_gender_female);
		
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(radioButton_supplier_gender_male);
		buttonGroup.add(radioButton_supplier_gender_female);
	         
		JLabel lblSupplierName = new JLabel("Họ tên nhà cung cấp");
		lblSupplierName.setFont(new Font("Verdana", Font.BOLD, 12));
		lblSupplierName.setForeground(textColor);
		GridBagConstraints gbc_lblSupplierName = new GridBagConstraints();
		gbc_lblSupplierName.weightx = 0.3;
		gbc_lblSupplierName.anchor = GridBagConstraints.WEST;
		gbc_lblSupplierName.insets = new Insets(0, 5, 5, 5);
		gbc_lblSupplierName.gridx = 0;
		gbc_lblSupplierName.gridy = 5;
		inputPanel.add(lblSupplierName, gbc_lblSupplierName);
		
		JLabel label_phone = new JLabel("Số điện thoại");
		label_phone.setFont(new Font("Verdana", Font.BOLD, 12));
		label_phone.setForeground(textColor);
		GridBagConstraints gbc_label_phone = new GridBagConstraints();
		gbc_label_phone.anchor = GridBagConstraints.WEST;
		gbc_label_phone.insets = new Insets(0, 0, 5, 5);
		gbc_label_phone.gridx = 2;
		gbc_label_phone.gridy = 5;
		inputPanel.add(label_phone, gbc_label_phone);
		
		supplierNameText = new JTextField();
		supplierNameText.setBorder(new LineBorder(borderColor, 2, true));	
		supplierNameText.setForeground(textColor);
		supplierNameText.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_supplierNameText = new GridBagConstraints();
		gbc_supplierNameText.weighty = 0.1;
		gbc_supplierNameText.gridwidth = 2;
		gbc_supplierNameText.ipady = 10;
		gbc_supplierNameText.insets = new Insets(0, 5, 15, 5);
		gbc_supplierNameText.fill = GridBagConstraints.HORIZONTAL;
		gbc_supplierNameText.gridx = 0;
		gbc_supplierNameText.gridy = 6;
		inputPanel.add(supplierNameText, gbc_supplierNameText);
		supplierNameText.setColumns(10);
		
		phoneText = new JTextField();
		phoneText.setBorder(new LineBorder(borderColor, 2, true));	
		phoneText.setForeground(textColor);
		phoneText.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_phoneText = new GridBagConstraints();
		gbc_phoneText.weighty = 0.1;
		gbc_phoneText.gridwidth = 2;
		gbc_phoneText.ipady = 10;
		gbc_phoneText.insets = new Insets(0, 0, 15, 5);
		gbc_phoneText.fill = GridBagConstraints.HORIZONTAL;
		gbc_phoneText.gridx = 2;
		gbc_phoneText.gridy = 6;
		inputPanel.add(phoneText, gbc_phoneText);
		phoneText.setColumns(10);
		
		JLabel label_Address = new JLabel("Địa chỉ");
		label_Address.setFont(new Font("Verdana", Font.BOLD, 12));
		label_Address.setForeground(textColor);
		GridBagConstraints gbc_label_Address = new GridBagConstraints();
		gbc_label_Address.anchor = GridBagConstraints.WEST;
		gbc_label_Address.insets = new Insets(0, 5, 5, 5);
		gbc_label_Address.gridx = 0;
		gbc_label_Address.gridy = 7;
		inputPanel.add(label_Address, gbc_label_Address);
		
		addressText = new JTextField();
		addressText.setBorder(new LineBorder(borderColor, 2, true));	
		addressText.setForeground(textColor);
		addressText.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_addressText = new GridBagConstraints();
		gbc_addressText.weighty = 0.1;
		gbc_addressText.gridwidth = 2;
		gbc_addressText.ipady = 10;
		gbc_addressText.insets = new Insets(0, 5, 15, 5);
		gbc_addressText.fill = GridBagConstraints.HORIZONTAL;
		gbc_addressText.gridx = 0;
		gbc_addressText.gridy = 8;
		inputPanel.add(addressText, gbc_addressText);
		addressText.setColumns(10);
		
		String[] supplier_type_list=new String[] {"Nokia", "Samsung Galaxy Prime J7"};
		
		JLabel label_email = new JLabel("Email");
		label_email.setFont(new Font("Verdana", Font.BOLD, 12));
		label_email.setForeground(textColor);
		GridBagConstraints gbc_label_email = new GridBagConstraints();
		gbc_label_email.anchor = GridBagConstraints.WEST;
		gbc_label_email.insets = new Insets(0, 5, 5, 5);
		gbc_label_email.gridx = 0;
		gbc_label_email.gridy = 9;
		inputPanel.add(label_email, gbc_label_email);
		
		JLabel lblTradingProduct = new JLabel("Sản phẩm giao dịch");
		lblTradingProduct.setFont(new Font("Verdana", Font.BOLD, 12));
		lblTradingProduct.setForeground(textColor);
		GridBagConstraints gbc_lblTradingProduct = new GridBagConstraints();
		gbc_lblTradingProduct.gridwidth = 2;
		gbc_lblTradingProduct.anchor = GridBagConstraints.WEST;
		gbc_lblTradingProduct.insets = new Insets(0, 0, 5, 5);
		gbc_lblTradingProduct.gridx = 2;
		gbc_lblTradingProduct.gridy = 9;
		inputPanel.add(lblTradingProduct, gbc_lblTradingProduct);
		
		emailText = new JTextField();
		emailText.setBorder(new LineBorder(borderColor, 2, true));	
		emailText.setForeground(textColor);
		emailText.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_emailText = new GridBagConstraints();
		gbc_emailText.weighty = 0.1;
		gbc_emailText.gridwidth = 2;
		gbc_emailText.ipady = 10;
		gbc_emailText.insets = new Insets(0, 5, 15, 5);
		gbc_emailText.fill = GridBagConstraints.HORIZONTAL;
		gbc_emailText.gridx = 0;
		gbc_emailText.gridy = 10;
		inputPanel.add(emailText, gbc_emailText);
		emailText.setColumns(10);
		
		JComboBox cbBProduct = new JComboBox( supplier_type_list);
		cbBProduct.setFont(new Font("Verdana", Font.PLAIN, 12));
		cbBProduct.setBorder(new LineBorder(borderColor , 1 , true));
		cbBProduct.setForeground(textColor);
		cbBProduct.setBackground(backGroundColor);
		GridBagConstraints gbc_cbBProduct = new GridBagConstraints();
		gbc_cbBProduct.weighty = 0.1;
		gbc_cbBProduct.gridwidth = 2;
		gbc_cbBProduct.ipady = 5;
		gbc_cbBProduct.insets = new Insets(0, 0, 15, 5);
		gbc_cbBProduct.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbBProduct.gridx = 2;
		gbc_cbBProduct.gridy = 10;
		inputPanel.add(cbBProduct, gbc_cbBProduct);
		
		JLabel lblDateTrading = new JLabel("Ngày sinh");
		lblDateTrading.setFont(new Font("Verdana", Font.BOLD, 12));
		lblDateTrading.setForeground(textColor);
		GridBagConstraints gbc_lblDateTrading = new GridBagConstraints();
		gbc_lblDateTrading.anchor = GridBagConstraints.WEST;
		gbc_lblDateTrading.insets = new Insets(0, 5, 5, 5);
		gbc_lblDateTrading.gridx = 0;
		gbc_lblDateTrading.gridy = 11;
		inputPanel.add(lblDateTrading, gbc_lblDateTrading);
		
		String []day_list=new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String []month_list=new String[] {"1","2","3","4","5","6","7","8","9","10","11","12"};
		String []year_list=new String[]{"2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
		
		JComboBox cbBday = new JComboBox(day_list);
		cbBday.setFont(new Font("Verdana", Font.PLAIN, 12));
		cbBday.setForeground(textColor);
		cbBday.setBackground(backGroundColor);
		cbBday.setBorder(new LineBorder(borderColor, 1 , true));
		GridBagConstraints gbc_cbBday = new GridBagConstraints();
		gbc_cbBday.insets = new Insets(0, 5, 5, 5);
		gbc_cbBday.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbBday.gridx = 0;
		gbc_cbBday.gridy = 12;
		inputPanel.add(cbBday, gbc_cbBday);
		
		JComboBox cbBmonth = new JComboBox(month_list);
		cbBmonth.setFont(new Font("Verdana", Font.PLAIN, 12));
		cbBmonth.setForeground(textColor);
		cbBmonth.setBackground(backGroundColor);
		cbBmonth.setBorder(new LineBorder(borderColor, 1 , true));
		GridBagConstraints gbc_cbBmonth = new GridBagConstraints();
		gbc_cbBmonth.insets = new Insets(0, 0, 5, 5);
		gbc_cbBmonth.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbBmonth.gridx = 1;
		gbc_cbBmonth.gridy = 12;
		inputPanel.add(cbBmonth, gbc_cbBmonth);
		
		JComboBox cbByear = new JComboBox(year_list);
		cbByear.setForeground(textColor);
		cbByear.setBackground(backGroundColor);
		cbByear.setBorder(new LineBorder(borderColor, 1 , true));
		cbByear.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_cbByear = new GridBagConstraints();
		gbc_cbByear.weightx = 0.3;
		gbc_cbByear.gridwidth = 2;
		gbc_cbByear.insets = new Insets(0, 0, 5, 5);
		gbc_cbByear.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbByear.gridx = 2;
		gbc_cbByear.gridy = 12;
		inputPanel.add(cbByear, gbc_cbByear);
		
		JLabel lblNote = new JLabel("Ghi chú");
		lblNote.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_lblNote = new GridBagConstraints();
		gbc_lblNote.anchor = GridBagConstraints.WEST;
		gbc_lblNote.insets = new Insets(0, 5, 5, 5);
		gbc_lblNote.gridx = 0;
		gbc_lblNote.gridy = 13;
		inputPanel.add(lblNote, gbc_lblNote);
		
		JScrollPane noteScroll = new JScrollPane();
		noteScroll.setBackground(Color.WHITE);
		noteScroll.setBorder(null);
		GridBagConstraints gbc_noteText = new GridBagConstraints();
		gbc_noteText.weightx = 0.1;
		gbc_noteText.weighty = 0.1;
		gbc_noteText.gridwidth = 4;
		gbc_noteText.insets = new Insets(0, 5, 5, 5);
		gbc_noteText.fill = GridBagConstraints.BOTH;
		gbc_noteText.gridx = 0;
		gbc_noteText.gridy = 14;
		inputPanel.add(noteScroll, gbc_noteText);

		noteText = new JTextArea();
		noteText.setForeground(textColor);
		noteText.setFont(new Font("Verdana", Font.PLAIN, 12));
		noteText.setBorder(new LineBorder(borderColor ,2 ,true));
		noteScroll.setViewportView(noteText);
		noteText.setColumns(10);
		
		JPanel panelFeature = new JPanel();
		panelFeature.setBorder(null);
		panelFeature.setBackground(backGroundColor);
		GridBagConstraints gbc_panelFeature = new GridBagConstraints();
		gbc_panelFeature.weighty = 0.3;
		gbc_panelFeature.insets = new Insets(0, 5, 0, 5);
		gbc_panelFeature.gridwidth = 4;
		gbc_panelFeature.fill = GridBagConstraints.BOTH;
		gbc_panelFeature.gridx = 0;
		gbc_panelFeature.gridy = 15;
		inputPanel.add(panelFeature, gbc_panelFeature);
		panelFeature.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Image iconAdd = new ImageIcon("Assets/Icon/add.png").getImage();
		iconAdd = iconAdd.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		Image delete_icon=new ImageIcon("Assets/Icon/delete.png").getImage();//
		delete_icon=delete_icon.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		Image iconEdit = new ImageIcon("Assets/Icon/edit.png").getImage();
		iconEdit = iconEdit.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		Image iconClear = new ImageIcon("Assets/Icon/clear.png").getImage();
		iconClear = iconClear.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		
		JButton btnAdd = new JButton("Thêm");
		btnAdd.setPreferredSize(new Dimension(100, 40));
		btnAdd.setIcon(new ImageIcon(iconAdd));
		btnAdd.setFont(new Font("Verdana", Font.BOLD, 12));
		btnAdd.setBorder(new LineBorder(borderColor, 2, true));
		btnAdd.setBackground(buttonColor);
		btnAdd.setForeground(Color.white);
		btnAdd.setFocusPainted(false);
		panelFeature.add(btnAdd);
		
		JButton btnDelete = new JButton("Xóa");
		btnDelete.setPreferredSize(new Dimension(100, 40));
		btnDelete.setIcon(new ImageIcon(delete_icon));
		btnDelete.setFont(new Font("Verdana", Font.BOLD, 12));
		btnDelete.setBorder(new LineBorder(borderColor, 2, true));
		btnDelete.setBackground(buttonColor);
		btnDelete.setForeground(Color.white);
		btnDelete.setFocusPainted(false);
		panelFeature.add(btnDelete);
		
		JButton btnEdit = new JButton("Sửa");
		btnEdit.setPreferredSize(new Dimension(100, 40));
		btnEdit.setIcon(new ImageIcon(iconEdit));
		btnEdit.setFont(new Font("Verdana", Font.BOLD, 12));
		btnEdit.setBorder(new LineBorder(borderColor, 2, true));
		btnEdit.setBackground(buttonColor);
		btnEdit.setForeground(Color.white);
		btnEdit.setFocusPainted(false);
		panelFeature.add(btnEdit);
		
		JButton btnClear = new JButton("Mới");
		btnClear.setPreferredSize(new Dimension(100, 40));
		btnClear.setIcon(new ImageIcon(iconClear));
		btnClear.setFont(new Font("Verdana", Font.BOLD, 12));
		btnClear.setBorder(new LineBorder(borderColor, 2, true));
		btnClear.setBackground(buttonColor);
		btnClear.setForeground(Color.white);
		btnClear.setFocusPainted(false);
		panelFeature.add(btnClear);
	}

}
