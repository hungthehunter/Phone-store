package view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class VuView extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField searchText;
	private JComboBox comboBox;
	private DefaultTableModel supplierModel;
	private JTable productTable;
	private JTable receiptTable;
	private JTextField receiptIdText;
	private JButton btnPay;

	/**
	 * Create the panel.
	 */
	public VuView() {
		Color myColor = new Color(34, 33, 75);
		Color backGroundColor = Color.white;
		Color borderColor = myColor;
		Color textColor = myColor;
		Color buttonColor = myColor;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel productPanel = new JPanel();
		GridBagConstraints gbc_productPanel = new GridBagConstraints();
		gbc_productPanel.insets = new Insets(20, 20, 5, 5);
		gbc_productPanel.fill = GridBagConstraints.BOTH;
		gbc_productPanel.gridx = 0;
		gbc_productPanel.gridy = 0;
		add(productPanel, gbc_productPanel);
		GridBagLayout gbl_productPanel = new GridBagLayout();
		gbl_productPanel.columnWidths = new int[]{0, 0, 0};
		gbl_productPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_productPanel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_productPanel.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		productPanel.setLayout(gbl_productPanel);
		
		JLabel lblSearch = new JLabel("Tìm kiếm sản phẩm");
		lblSearch.setFont(new Font("Verdana", Font.BOLD, 13));
		lblSearch.setForeground(textColor);
		GridBagConstraints gbc_lblSearch = new GridBagConstraints();
		gbc_lblSearch.insets = new Insets(0, 0, 5, 5);
		gbc_lblSearch.gridx = 0;
		gbc_lblSearch.gridy = 0;
		productPanel.add(lblSearch, gbc_lblSearch);
		
		JLabel lblSearch_1 = new JLabel("Tìm kiếm sản phẩm");
		lblSearch_1.setForeground(new Color(34, 33, 75));
		lblSearch_1.setFont(new Font("Verdana", Font.BOLD, 13));
		GridBagConstraints gbc_lblSearch_1 = new GridBagConstraints();
		gbc_lblSearch_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblSearch_1.gridx = 1;
		gbc_lblSearch_1.gridy = 0;
		productPanel.add(lblSearch_1, gbc_lblSearch_1);
		
		searchText = new JTextField();
		searchText.setBorder(new LineBorder(borderColor, 2, true));	
		searchText.setForeground(textColor);
//		searchText.addKeyListener(this);
		searchText.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.ipady = 5;
		gbc_textField.insets = new Insets(0, 5, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 1;
		productPanel.add(searchText, gbc_textField);
		searchText.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBox.setBorder(new LineBorder(borderColor, 1, true));
		comboBox.setBackground(Color.WHITE);
		comboBox.setForeground(Color.white);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 5, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 1;
		productPanel.add(comboBox, gbc_comboBox);
		
		String[] productColumnNames = {"Ảnh", "Tên Sản Phẩm", "Giá Bán", "Kho"};
		Object[][] productData = {
				
		};
		
		supplierModel = new DefaultTableModel(productData, productColumnNames) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		productTable = new JTable(supplierModel);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
	    centerRenderer.setHorizontalAlignment(JLabel.CENTER);
	    TableColumnModel columnModel = productTable.getColumnModel();
	    columnModel.getColumn(0).setCellRenderer(centerRenderer);
	    columnModel.getColumn(1).setCellRenderer(centerRenderer);
	    columnModel.getColumn(2).setCellRenderer(centerRenderer);
	    columnModel.getColumn(3).setCellRenderer(centerRenderer);
		productTable.setFont(new Font("Verdana", Font.PLAIN, 12));
		productTable.setBorder(new LineBorder(borderColor, 2, false));
		productTable.getTableHeader().setBorder(new LineBorder(borderColor, 2, false));
		productTable.getTableHeader().setBackground(borderColor);
		productTable.getTableHeader().setForeground(Color.white);
		productTable.getTableHeader().setReorderingAllowed(false);
		
		JScrollPane scrollPane = new JScrollPane(productTable);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		productPanel.add(scrollPane, gbc_scrollPane);
		
		JPanel inpuPanel = new JPanel();
		GridBagConstraints gbc_inpuPanel = new GridBagConstraints();
		gbc_inpuPanel.ipady = 5;
		gbc_inpuPanel.gridheight = 2;
		gbc_inpuPanel.insets = new Insets(20, 5, 20, 20);
		gbc_inpuPanel.fill = GridBagConstraints.BOTH;
		gbc_inpuPanel.gridx = 1;
		gbc_inpuPanel.gridy = 0;
		add(inpuPanel, gbc_inpuPanel);
		GridBagLayout gbl_inpuPanel = new GridBagLayout();
		gbl_inpuPanel.columnWidths = new int[]{0, 0, 0};
		gbl_inpuPanel.rowHeights = new int[]{0, 0, 0, 4, 242, 0, -98, 0};
		gbl_inpuPanel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_inpuPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		inpuPanel.setLayout(gbl_inpuPanel);
		
		JLabel lblReceiptId = new JLabel("Mã hóa đơn");
		lblReceiptId.setFont(new Font("Verdana", Font.BOLD, 12));
		lblReceiptId.setForeground(textColor);
		GridBagConstraints gbc_lblReceiptId = new GridBagConstraints();
		gbc_lblReceiptId.ipady = 5;
		gbc_lblReceiptId.insets = new Insets(10, 5, 5, 5);
		gbc_lblReceiptId.gridx = 0;
		gbc_lblReceiptId.gridy = 0;
		inpuPanel.add(lblReceiptId, gbc_lblReceiptId);
		
		receiptIdText = new JTextField();
		receiptIdText.setForeground(new Color(34, 33, 75));
		receiptIdText.setFont(new Font("Verdana", Font.PLAIN, 12));
		receiptIdText.setColumns(10);
		GridBagConstraints gbc_receiptIdText = new GridBagConstraints();
		gbc_receiptIdText.ipady = 5;
		gbc_receiptIdText.insets = new Insets(10, 0, 5, 0);
		gbc_receiptIdText.fill = GridBagConstraints.HORIZONTAL;
		gbc_receiptIdText.gridx = 1;
		gbc_receiptIdText.gridy = 0;
		inpuPanel.add(receiptIdText, gbc_receiptIdText);
		
		JLabel lblEmployee = new JLabel("Nhân viên");
		lblEmployee.setForeground(new Color(34, 33, 75));
		lblEmployee.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_lblEmployee = new GridBagConstraints();
		gbc_lblEmployee.ipady = 5;
		gbc_lblEmployee.insets = new Insets(10, 0, 5, 5);
		gbc_lblEmployee.gridx = 0;
		gbc_lblEmployee.gridy = 1;
		inpuPanel.add(lblEmployee, gbc_lblEmployee);
		
		JComboBox cbb_Employee = new JComboBox();
		cbb_Employee.setForeground(Color.WHITE);
		cbb_Employee.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cbb_Employee.setBackground(Color.WHITE);
		GridBagConstraints gbc_cbb_Employee = new GridBagConstraints();
		gbc_cbb_Employee.ipady = 5;
		gbc_cbb_Employee.insets = new Insets(10, 5, 5, 0);
		gbc_cbb_Employee.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbb_Employee.gridx = 1;
		gbc_cbb_Employee.gridy = 1;
		inpuPanel.add(cbb_Employee, gbc_cbb_Employee);
		
		JLabel lblCustomer = new JLabel("Khách Hàng");
		lblCustomer.setForeground(new Color(34, 33, 75));
		lblCustomer.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_lblCustomer = new GridBagConstraints();
		gbc_lblCustomer.insets = new Insets(10, 0, 5, 5);
		gbc_lblCustomer.gridx = 0;
		gbc_lblCustomer.gridy = 2;
		inpuPanel.add(lblCustomer, gbc_lblCustomer);
		
		JComboBox cbb_Customer = new JComboBox();
		cbb_Customer.setForeground(Color.WHITE);
		cbb_Customer.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cbb_Customer.setBackground(Color.WHITE);
		GridBagConstraints gbc_cbb_Customer = new GridBagConstraints();
		gbc_cbb_Customer.ipady = 5;
		gbc_cbb_Customer.insets = new Insets(10, 5, 5, 0);
		gbc_cbb_Customer.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbb_Customer.gridx = 1;
		gbc_cbb_Customer.gridy = 2;
		inpuPanel.add(cbb_Customer, gbc_cbb_Customer);
		
		JLabel lblDay = new JLabel("Ngày thanh toán");
		lblDay.setForeground(new Color(34, 33, 75));
		lblDay.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_lblDay = new GridBagConstraints();
		gbc_lblDay.ipady = 5;
		gbc_lblDay.insets = new Insets(10, 5, 5, 5);
		gbc_lblDay.gridx = 0;
		gbc_lblDay.gridy = 3;
		inpuPanel.add(lblDay, gbc_lblDay);
		
		JLabel lblNewLabel_1_7_1_1 = new JLabel("Tổng tiền:");
		lblNewLabel_1_7_1_1.setForeground(new Color(34, 33, 75));
		lblNewLabel_1_7_1_1.setFont(new Font("Verdana", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_1_7_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_7_1_1.gridwidth = 2;
		gbc_lblNewLabel_1_7_1_1.ipady = 5;
		gbc_lblNewLabel_1_7_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1_7_1_1.gridx = 0;
		gbc_lblNewLabel_1_7_1_1.gridy = 4;
		inpuPanel.add(lblNewLabel_1_7_1_1, gbc_lblNewLabel_1_7_1_1);
		
		JPanel btnPanel = new JPanel();
		GridBagConstraints gbc_btnPanel = new GridBagConstraints();
		gbc_btnPanel.gridwidth = 2;
		gbc_btnPanel.fill = GridBagConstraints.BOTH;
		gbc_btnPanel.gridx = 0;
		gbc_btnPanel.gridy = 6;
		inpuPanel.add(btnPanel, gbc_btnPanel);
		btnPanel.setLayout(new BorderLayout(0, 0));
		
		btnPay = new JButton("Thanh toán");
		btnPay.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnPay.setBorder(new LineBorder(borderColor, 2, true));
		btnPay.setBackground(buttonColor);
		btnPay.setForeground(Color.white);
		btnPay.setFocusPainted(false);
		btnPanel.add(btnPay);
		
		JPanel receiptPanel = new JPanel();
		GridBagConstraints gbc_receiptPanel = new GridBagConstraints();
		gbc_receiptPanel.insets = new Insets(0, 20, 20, 5);
		gbc_receiptPanel.fill = GridBagConstraints.BOTH;
		gbc_receiptPanel.gridx = 0;
		gbc_receiptPanel.gridy = 1;
		add(receiptPanel, gbc_receiptPanel);
		receiptPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblReceipt = new JLabel("Đơn hàng");
		lblReceipt.setFont(new Font("Verdana", Font.BOLD, 13));
		lblReceipt.setForeground(textColor);
		receiptPanel.add(lblReceipt, BorderLayout.NORTH);
		
		String[] receiptColumnNames = {"Ảnh", "Tên Sản Phẩm", "Giá Bán", "Kho"};
		Object[][] receiptData = {
				
		};
		
		supplierModel = new DefaultTableModel(receiptData, receiptColumnNames) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		receiptTable = new JTable(supplierModel);
	    centerRenderer.setHorizontalAlignment(JLabel.CENTER);
	    TableColumnModel receiptColumnModel = receiptTable.getColumnModel();
	    receiptColumnModel.getColumn(0).setCellRenderer(centerRenderer);
	    receiptColumnModel.getColumn(1).setCellRenderer(centerRenderer);
	    receiptColumnModel.getColumn(2).setCellRenderer(centerRenderer);
	    receiptColumnModel.getColumn(3).setCellRenderer(centerRenderer);
	    receiptTable.setFont(new Font("Verdana", Font.PLAIN, 12));
	    receiptTable.setBorder(new LineBorder(borderColor, 2, false));
	    receiptTable.getTableHeader().setBorder(new LineBorder(borderColor, 2, false));
	    receiptTable.getTableHeader().setBackground(borderColor);
	    receiptTable.getTableHeader().setForeground(Color.white);
	    receiptTable.getTableHeader().setReorderingAllowed(false);
		
		JScrollPane scrollPane_1 = new JScrollPane(receiptTable);
		receiptPanel.add(scrollPane_1, BorderLayout.CENTER);

	}

}
