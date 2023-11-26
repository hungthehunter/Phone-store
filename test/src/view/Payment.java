package view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;

import bus.ProductBUS;
import bus.SupplierBUS;
import dto.ProductDTO;
import dto.SupplierDTO;
import service.Formater;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JSpinner;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Payment extends JPanel implements MouseListener{

	private static final long serialVersionUID = 1L;
	private DefaultTableModel paymentModel, cartModel;
	
//	ProductBUS productBUS = new ProductBUS();
//	ArrayList<ProductDTO> listProduct = productBUS.getALL();
//	ArrayList<ProductDTO> listCart = new ArrayList<ProductDTO>();	
//	
//	SupplierBUS supplierBUS = new SupplierBUS();
//	ArrayList<SupplierDTO> listSupplier = supplierBUS.getALL();
	private JTextField searchText;
	private JTextField productIdText;
	private JTextField productNameText;
	private JTextField priceText;
	private JTextField receiptIdText;
	private JTable paymentTable;
//	SupplierBUS supplierBUS = new SupplierBUS();
//	ArrayList<SupplierDTO> listSupplier = supplierBUS.getALL();
	private JButton btnAdd;
	private JButton btnEdit;
	private JButton btnDelete;
	private JButton btnRefresh;
	private JTable cartTable;
	private JLabel totalPrice;

	/**
	 * Create the panel.
	 */
	public Payment() {
		initComponent();
	}

	public void initComponent() {
		Color myColor = new Color(34, 33, 75);
		Color backGroundColor = Color.white;
		Color borderColor = myColor;
		Color textColor = myColor;
		Color buttonColor = myColor;
		
		setBackground(backGroundColor);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {750, 250};
		gridBagLayout.rowHeights = new int[] {400, 120, 400};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0};
		setLayout(gridBagLayout);
		
		JPanel paymentPanel = new JPanel();
		paymentPanel.setBackground(backGroundColor);
		GridBagConstraints gbc_paymentPanel = new GridBagConstraints();
		gbc_paymentPanel.insets = new Insets(20, 20, 5, 5);
		gbc_paymentPanel.fill = GridBagConstraints.BOTH;
		gbc_paymentPanel.gridx = 0;
		gbc_paymentPanel.gridy = 0;
		add(paymentPanel, gbc_paymentPanel);
		GridBagLayout gbl_paymentPanel = new GridBagLayout();
		gbl_paymentPanel.columnWidths = new int[]{400, 200, 0};
		gbl_paymentPanel.rowHeights = new int[]{0, 0};
		gbl_paymentPanel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_paymentPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		paymentPanel.setLayout(gbl_paymentPanel);
		
		JPanel payTablePanel = new JPanel();
		payTablePanel.setBackground(backGroundColor);
		GridBagConstraints gbc_payTablePanel = new GridBagConstraints();
		gbc_payTablePanel.fill = GridBagConstraints.BOTH;
		gbc_payTablePanel.insets = new Insets(0, 0, 0, 5);
		gbc_payTablePanel.gridx = 0;
		gbc_payTablePanel.gridy = 0;
		paymentPanel.add(payTablePanel, gbc_payTablePanel);
		GridBagLayout gbl_payTablePanel = new GridBagLayout();
		gbl_payTablePanel.columnWidths = new int[]{10, 300, 0};
		gbl_payTablePanel.rowHeights = new int[]{0, 0, 0};
		gbl_payTablePanel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_payTablePanel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		payTablePanel.setLayout(gbl_payTablePanel);
		
		JLabel lblSearch = new JLabel("Tìm kiếm:");
		lblSearch.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSearch.setForeground(textColor);
		GridBagConstraints gbc_lblSearch = new GridBagConstraints();
		gbc_lblSearch.weightx = 0.1;
		gbc_lblSearch.anchor = GridBagConstraints.WEST;
		gbc_lblSearch.insets = new Insets(5, 5, 5, 5);
		gbc_lblSearch.gridx = 0;
		gbc_lblSearch.gridy = 0;
		payTablePanel.add(lblSearch, gbc_lblSearch);
		
		searchText = new JTextField();
		searchText.setBorder(new LineBorder(borderColor, 2, true));	
		searchText.setForeground(textColor);
		searchText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		searchText.setColumns(10);
		GridBagConstraints gbc_searchText = new GridBagConstraints();
		gbc_searchText.weightx = 0.9;
		gbc_searchText.ipady = 5;
		gbc_searchText.fill = GridBagConstraints.HORIZONTAL;
		gbc_searchText.insets = new Insets(5, 0, 5, 10);
		gbc_searchText.gridx = 1;
		gbc_searchText.gridy = 0;
		payTablePanel.add(searchText, gbc_searchText);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 5, 0, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridwidth = 2;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 1;
		payTablePanel.add(scrollPane_1, gbc_scrollPane_1);
		
		String[] columnNames = {"Mã Hóa Đơn", "Nhân Viên Thanh Toán", "Khách Hàng", "Ngày Thanh Toán", "Tổng Tiền"};
	     Object[][] data = {
	    		 
	     };
	     
	     paymentModel = new DefaultTableModel(data, columnNames) {
	            @Override
	            public boolean isCellEditable(int row, int column) {
	                return false;
	            }
	     };
	    
       paymentModel.setColumnIdentifiers(columnNames);
	   paymentTable = new JTable(paymentModel);
       paymentTable.getColumnModel().getColumn(0).setPreferredWidth(50);
       paymentTable.getColumnModel().getColumn(1).setPreferredWidth(100);
       paymentTable.getColumnModel().getColumn(2).setPreferredWidth(100);
       paymentTable.getColumnModel().getColumn(3).setPreferredWidth(100);
       paymentTable.addMouseListener(this);
       DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
       centerRenderer.setHorizontalAlignment(JLabel.CENTER);
       TableColumnModel columnModel = paymentTable.getColumnModel();
       columnModel.getColumn(0).setCellRenderer(centerRenderer);
       columnModel.getColumn(1).setCellRenderer(centerRenderer);
       columnModel.getColumn(2).setCellRenderer(centerRenderer);
       columnModel.getColumn(3).setCellRenderer(centerRenderer);
       paymentTable.setBorder(new LineBorder(borderColor, 2, false));
       paymentTable.getTableHeader().setBorder(new LineBorder(borderColor, 2, false));
       paymentTable.getTableHeader().setReorderingAllowed(false);
       paymentTable.getTableHeader().setBackground(borderColor);
       paymentTable.getTableHeader().setForeground(Color.white);
       
		scrollPane_1.setViewportView(paymentTable);
		
		JPanel payInfoPanel = new JPanel();
		payInfoPanel.setBackground(backGroundColor);
		payInfoPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_payInfoPanel = new GridBagConstraints();
		gbc_payInfoPanel.fill = GridBagConstraints.BOTH;
		gbc_payInfoPanel.gridx = 1;
		gbc_payInfoPanel.gridy = 0;
		paymentPanel.add(payInfoPanel, gbc_payInfoPanel);
		GridBagLayout gbl_payInfoPanel = new GridBagLayout();
		gbl_payInfoPanel.columnWidths = new int[]{10, 280, 0};
		gbl_payInfoPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_payInfoPanel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_payInfoPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		payInfoPanel.setLayout(gbl_payInfoPanel);
		
		JLabel lblProductInfo = new JLabel("Thông tin sản phẩm");
		lblProductInfo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblProductInfo.setForeground(textColor);
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.gridwidth = 2;
		gbc_lblNewLabel_6.insets = new Insets(5, 0, 10, 0);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 0;
		payInfoPanel.add(lblProductInfo, gbc_lblNewLabel_6);
		
		JLabel lblProductId = new JLabel("Mã sản phẩm:");
		lblProductId.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblProductId.setForeground(textColor);
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.weighty = 0.2;
		gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7.insets = new Insets(0, 5, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 1;
		payInfoPanel.add(lblProductId, gbc_lblNewLabel_7);
		
		JLabel lblProductName = new JLabel("Tên sản phẩm:");
		lblProductName.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblProductName.setForeground(textColor);
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_8.insets = new Insets(0, 20, 5, 0);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 1;
		payInfoPanel.add(lblProductName, gbc_lblNewLabel_8);
		
		productIdText = new JTextField();
		productIdText.setBorder(new LineBorder(borderColor, 2, true));	
		productIdText.setForeground(textColor);
		productIdText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		productIdText.setMinimumSize(new Dimension(80, 20));
		productIdText.setFocusable(false);
		productIdText.setEditable(false);
		productIdText.setColumns(10);
		GridBagConstraints gbc_productIdText = new GridBagConstraints();
		gbc_productIdText.weighty = 0.2;
		gbc_productIdText.ipady = 5;
		gbc_productIdText.anchor = GridBagConstraints.WEST;
		gbc_productIdText.insets = new Insets(0, 5, 5, 5);
		gbc_productIdText.gridx = 0;
		gbc_productIdText.gridy = 2;
		payInfoPanel.add(productIdText, gbc_productIdText);
		
		productNameText = new JTextField();
		productNameText.setBorder(new LineBorder(borderColor, 2, true));	
		productNameText.setForeground(textColor);
		productNameText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		productNameText.setFocusable(false);
		productNameText.setEditable(false);
		productNameText.setColumns(10);
		GridBagConstraints gbc_productNameText = new GridBagConstraints();
		gbc_productNameText.ipady = 5;
		gbc_productNameText.fill = GridBagConstraints.HORIZONTAL;
		gbc_productNameText.insets = new Insets(0, 20, 5, 5);
		gbc_productNameText.gridx = 1;
		gbc_productNameText.gridy = 2;
		payInfoPanel.add(productNameText, gbc_productNameText);
		
		JLabel lblNewLabel_10 = new JLabel("Số lượng:");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.weighty = 0.2;
		gbc_lblNewLabel_10.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_10.insets = new Insets(0, 5, 5, 5);
		gbc_lblNewLabel_10.gridx = 0;
		gbc_lblNewLabel_10.gridy = 3;
		payInfoPanel.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("Giá nhập:");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_9.insets = new Insets(0, 20, 5, 0);
		gbc_lblNewLabel_9.gridx = 1;
		gbc_lblNewLabel_9.gridy = 3;
		payInfoPanel.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JSpinner quantityTxt = new JSpinner();
		quantityTxt.setBorder(new LineBorder(borderColor, 2, true));	
		quantityTxt.setForeground(textColor);
		quantityTxt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		GridBagConstraints gbc_quantityTxt = new GridBagConstraints();
		gbc_quantityTxt.weighty = 0.2;
		gbc_quantityTxt.ipady = 5;
		gbc_quantityTxt.ipadx = 50;
		gbc_quantityTxt.anchor = GridBagConstraints.WEST;
		gbc_quantityTxt.insets = new Insets(0, 5, 5, 5);
		gbc_quantityTxt.gridx = 0;
		gbc_quantityTxt.gridy = 4;
		payInfoPanel.add(quantityTxt, gbc_quantityTxt);
		
		priceText = new JTextField();
		priceText.setBorder(new LineBorder(borderColor, 2, true));	
		priceText.setForeground(textColor);
		priceText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		priceText.setFocusable(false);
		priceText.setEditable(false);
		priceText.setColumns(10);
		GridBagConstraints gbc_priceText = new GridBagConstraints();
		gbc_priceText.ipady = 5;
		gbc_priceText.fill = GridBagConstraints.HORIZONTAL;
		gbc_priceText.insets = new Insets(0, 20, 5, 5);
		gbc_priceText.gridx = 1;
		gbc_priceText.gridy = 4;
		payInfoPanel.add(priceText, gbc_priceText);
		
		JPanel inputPanel = new JPanel();
		inputPanel.setBackground(backGroundColor);
		inputPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_inputPanel = new GridBagConstraints();
		gbc_inputPanel.insets = new Insets(20, 5, 20, 20);
		gbc_inputPanel.gridheight = 3;
		gbc_inputPanel.fill = GridBagConstraints.BOTH;
		gbc_inputPanel.gridx = 1;
		gbc_inputPanel.gridy = 0;
		add(inputPanel, gbc_inputPanel);
		GridBagLayout gbl_inputPanel = new GridBagLayout();
		gbl_inputPanel.columnWidths = new int[]{0, 0, 0};
		gbl_inputPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_inputPanel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_inputPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		inputPanel.setLayout(gbl_inputPanel);
		
		JLabel lblPaymentInfo = new JLabel("Thông tin thanh toán");
		lblPaymentInfo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPaymentInfo.setForeground(textColor);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(5, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		inputPanel.add(lblPaymentInfo, gbc_lblNewLabel);
		
		JLabel lblReceiptId = new JLabel("Mã hóa đơn:");
		lblReceiptId.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblReceiptId.setForeground(textColor);
		
		GridBagConstraints gbc_lblReceiptId = new GridBagConstraints();
		gbc_lblReceiptId.anchor = GridBagConstraints.WEST;
		gbc_lblReceiptId.insets = new Insets(7, 5, 5, 5);
		gbc_lblReceiptId.gridx = 0;
		gbc_lblReceiptId.gridy = 1;
		inputPanel.add(lblReceiptId, gbc_lblReceiptId);
		
		receiptIdText = new JTextField();
		receiptIdText.setBorder(new LineBorder(borderColor, 2, true));	
		receiptIdText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		receiptIdText.setForeground(textColor);
		receiptIdText.setEditable(false);
		receiptIdText.setColumns(10);
		GridBagConstraints gbc_receiptIdText = new GridBagConstraints();
		gbc_receiptIdText.ipady = 5;
		gbc_receiptIdText.fill = GridBagConstraints.HORIZONTAL;
		gbc_receiptIdText.gridwidth = 2;
		gbc_receiptIdText.insets = new Insets(10, 5, 5, 5);
		gbc_receiptIdText.gridx = 0;
		gbc_receiptIdText.gridy = 2;
		inputPanel.add(receiptIdText, gbc_receiptIdText);
		
		JLabel lblStaff = new JLabel("Nhân viên thanh toán:");
		lblStaff.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblStaff.setForeground(textColor);
		GridBagConstraints gbc_lblStaff = new GridBagConstraints();
		gbc_lblStaff.anchor = GridBagConstraints.WEST;
		gbc_lblStaff.insets = new Insets(10, 5, 5, 5);
		gbc_lblStaff.gridx = 0;
		gbc_lblStaff.gridy = 3;
		inputPanel.add(lblStaff, gbc_lblStaff);
		
		JComboBox cbBstaff = new JComboBox();
		cbBstaff.setBorder(new LineBorder(borderColor, 2, true));	
		cbBstaff.setForeground(textColor);
		cbBstaff.setBackground(backGroundColor);
		cbBstaff.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		GridBagConstraints gbc_cbBstaff = new GridBagConstraints();
		gbc_cbBstaff.ipady = 5;
		gbc_cbBstaff.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbBstaff.gridwidth = 2;
		gbc_cbBstaff.insets = new Insets(10, 5, 5, 5);
		gbc_cbBstaff.gridx = 0;
		gbc_cbBstaff.gridy = 4;
		inputPanel.add(cbBstaff, gbc_cbBstaff);
		
		JLabel lblCustomer = new JLabel("Khách hàng");
		lblCustomer.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCustomer.setForeground(textColor);
		GridBagConstraints gbc_lblCustomer = new GridBagConstraints();
		gbc_lblCustomer.anchor = GridBagConstraints.WEST;
		gbc_lblCustomer.insets = new Insets(10, 5, 5, 5);
		gbc_lblCustomer.gridx = 0;
		gbc_lblCustomer.gridy = 5;
		inputPanel.add(lblCustomer, gbc_lblCustomer);
		
		JComboBox cbBCustomer = new JComboBox();
		cbBCustomer.setBorder(new LineBorder(borderColor, 2, true));	
		cbBCustomer.setForeground(textColor);
		cbBCustomer.setBackground(backGroundColor);
		cbBCustomer.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		GridBagConstraints gbc_cbBCustomer = new GridBagConstraints();
		gbc_cbBCustomer.ipady = 5;
		gbc_cbBCustomer.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbBCustomer.gridwidth = 2;
		gbc_cbBCustomer.insets = new Insets(10, 5, 5, 5);
		gbc_cbBCustomer.gridx = 0;
		gbc_cbBCustomer.gridy = 6;
		inputPanel.add(cbBCustomer, gbc_cbBCustomer);
		
		JLabel lblTotal = new JLabel("TỔNG TIỀN: ");
		lblTotal.setForeground(Color.RED);
		lblTotal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(260, 5, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 8;
		inputPanel.add(lblTotal, gbc_lblNewLabel_4);
		
		totalPrice = new JLabel("0đ");
		totalPrice.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		totalPrice.setForeground(textColor);
		GridBagConstraints gbc_totalPrice = new GridBagConstraints();
		gbc_totalPrice.insets = new Insets(260, 0, 5, 0);
		gbc_totalPrice.gridx = 1;
		gbc_totalPrice.gridy = 8;
		inputPanel.add(totalPrice, gbc_totalPrice);
		
		JButton btnSold = new JButton("Thanh Toán");
		btnSold.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnSold.setBorder(new LineBorder(borderColor, 2, true));
		btnSold.setBackground(buttonColor);
		btnSold.setForeground(Color.white);
		btnSold.setFocusPainted(false);
		GridBagConstraints gbc_btnSold = new GridBagConstraints();
		gbc_btnSold.ipady = 20;
		gbc_btnSold.insets = new Insets(30, 5, 0, 5);
		gbc_btnSold.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSold.gridwidth = 2;
		gbc_btnSold.gridx = 0;
		gbc_btnSold.gridy = 9;
		inputPanel.add(btnSold, gbc_btnSold);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setBackground(backGroundColor);
		GridBagConstraints gbc_btnPanel = new GridBagConstraints();
		gbc_btnPanel.ipady = 10;
		gbc_btnPanel.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPanel.insets = new Insets(0, 20, 10, 0);
		gbc_btnPanel.gridx = 0;
		gbc_btnPanel.gridy = 1;
		add(btnPanel, gbc_btnPanel);
		btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Image iconAdd = new ImageIcon("Assets/Icon/add.png").getImage();
		iconAdd = iconAdd.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		Image iconDelete=new ImageIcon("Assets/Icon/delete.png").getImage();//
		iconDelete =iconDelete.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		Image iconEdit = new ImageIcon("Assets/Icon/edit.png").getImage();
		iconEdit = iconEdit.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		Image iconRefresh = new ImageIcon("Assets/Icon/clear.png").getImage();
		iconRefresh = iconRefresh.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		
		btnAdd = new JButton("Thếm Sản Phẩm");
		btnAdd.setIcon(new ImageIcon(iconAdd));
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnAdd.setBorder(new LineBorder(borderColor, 2, true));
		btnAdd.setBackground(buttonColor);
		btnAdd.setForeground(Color.white);
		btnAdd.setFocusPainted(false);
		btnAdd.addMouseListener(this);
		btnAdd.setPreferredSize(new Dimension(150, 40));
		btnPanel.add(btnAdd);
		
		btnEdit = new JButton("Sửa Sản Phẩm");
		btnEdit.setIcon(new ImageIcon(iconEdit));
		btnEdit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnEdit.setBorder(new LineBorder(borderColor, 2, true));
		btnEdit.setBackground(buttonColor);
		btnEdit.setForeground(Color.white);
		btnEdit.setFocusPainted(false);
		btnEdit.addMouseListener(this);
		btnEdit.setPreferredSize(new Dimension(150, 40));
		btnPanel.add(btnEdit);
		
		btnDelete = new JButton("Xóa Sản Phẩm");
		btnDelete.setIcon(new ImageIcon(iconDelete));
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnDelete.setBorder(new LineBorder(borderColor, 2, true));
		btnDelete.setBackground(buttonColor);
		btnDelete.setForeground(Color.white);
		btnDelete.setFocusPainted(false);
		btnDelete.addMouseListener(this);
		btnDelete.setPreferredSize(new Dimension(150, 40));
		btnPanel.add(btnDelete);
		
		btnRefresh = new JButton("Mới");
		btnRefresh.setIcon(new ImageIcon(iconRefresh));
		btnRefresh.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnRefresh.setBorder(new LineBorder(borderColor, 2, true));
		btnRefresh.setBackground(buttonColor);
		btnRefresh.setForeground(Color.white);
		btnRefresh.setFocusPainted(false);
		btnRefresh.addMouseListener(this);
		btnRefresh.setPreferredSize(new Dimension(150, 40));
		btnPanel.add(btnRefresh);
		
		JPanel cartPanel = new JPanel();
		cartPanel.setBackground(backGroundColor);
		GridBagConstraints gbc_cartPanel = new GridBagConstraints();
		gbc_cartPanel.insets = new Insets(0, 20, 20, 5);
		gbc_cartPanel.fill = GridBagConstraints.BOTH;
		gbc_cartPanel.gridx = 0;
		gbc_cartPanel.gridy = 2;
		add(cartPanel, gbc_cartPanel);
		cartPanel.setLayout(new GridLayout(0, 1, 0, 0));

		JScrollPane scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 0;
		gbc_scrollPane_2.gridy = 0;
		cartPanel.add(scrollPane_2);
		
	     String[] columnNamesCart = {"Mã SP", "Tên Sản Phẩm", "Loại SP", "Giá Bán", "Số Lượng"};
	     Object[][] dataCart = {
	    		 
	     };
	     
	     cartModel = new DefaultTableModel(dataCart, columnNamesCart) {
//	            @Override
	            public boolean isCellEditable(int row, int column) {
	                return false;
	            }
	        };
        cartModel.setColumnIdentifiers(columnNamesCart);
        cartTable = new JTable(cartModel);	
        cartTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        cartTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        cartTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        cartTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        cartTable.getColumnModel().getColumn(4).setPreferredWidth(100);
		
		cartTable.addMouseListener(this);
        TableColumnModel columnModelCart = cartTable.getColumnModel();
        columnModelCart.getColumn(0).setCellRenderer(centerRenderer);
        columnModelCart.getColumn(1).setCellRenderer(centerRenderer);
        columnModelCart.getColumn(2).setCellRenderer(centerRenderer);
        columnModelCart.getColumn(3).setCellRenderer(centerRenderer);
        columnModelCart.getColumn(4).setCellRenderer(centerRenderer);
        
        cartTable.setBorder(new LineBorder(borderColor, 2, false));
        cartTable.getTableHeader().setBorder(new LineBorder(borderColor, 2, false));
        cartTable.getTableHeader().setReorderingAllowed(false);
        cartTable.getTableHeader().setBackground(borderColor);
        cartTable.getTableHeader().setForeground(Color.white);
		scrollPane_2.setViewportView(cartTable);
		
		
}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
