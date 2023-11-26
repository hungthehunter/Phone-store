package view;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import bus.SupplierBUS;
import dao.SupplierDAO;
import dto.SupplierDTO;
import service.Validation;
import service.ExcelExporter;

import javax.swing.border.MatteBorder;

public class Supplier extends JPanel implements MouseListener, KeyListener{

	private static final long serialVersionUID = 1L;
	private JTextField SupplierIdText;
	private JTextField supplierNameText;
	private JTextField supplierPhoneText;
	private JTextField supplierAdressText;
	private JTextArea noteText;
	private JTable infoTable;
	private JTextField searchText;
	private JTextField supplierEmailText;
	private JButton btnAdd;
	private JButton btnEdit;
	private JButton btnClear;
	private JButton btnDelete;
	SupplierBUS supplierBUS = new SupplierBUS();
	ArrayList<SupplierDTO> listSupplier = supplierBUS.getALL();
	private DefaultTableModel supplierModel;
	private JButton btnExport;
	private JButton btnImport;
	private JLabel lblSearch;

	/**
	 * Create the panel.
	 */
	public Supplier() {
		initComponent();
		loadDataTable(listSupplier);
	}
	
	public void initComponent() {
		Color myColor = new Color(34, 33, 75);
		Color backGroundColor = Color.white;
		Color borderColor = myColor;
		Color textColor = myColor;
		Color buttonColor = myColor;
		
		setBackground(backGroundColor);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{614, 648, 0};
		gridBagLayout.rowHeights = new int[]{428, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel_table_supplier = new JPanel();
		panel_table_supplier.setBackground(backGroundColor);
		panel_table_supplier.setBorder(null);
		GridBagConstraints gbc_panel_table_supplier = new GridBagConstraints();
		gbc_panel_table_supplier.insets = new Insets(20, 0, 20, 20);
		gbc_panel_table_supplier.fill = GridBagConstraints.BOTH;
		gbc_panel_table_supplier.gridx = 1;
		gbc_panel_table_supplier.gridy = 0;
		add(panel_table_supplier, gbc_panel_table_supplier);
		GridBagLayout gbl_panel_table_supplier = new GridBagLayout();
		gbl_panel_table_supplier.columnWidths = new int[]{0, 543, 75, 90, 0};
		gbl_panel_table_supplier.rowHeights = new int[]{20, 0, 552, 0};
		gbl_panel_table_supplier.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_table_supplier.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_table_supplier.setLayout(gbl_panel_table_supplier);
		
		JLabel lblInfo = new JLabel("Thông tin nhà cung cấp");
		lblInfo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblInfo.setForeground(textColor);
		GridBagConstraints gbc_lblInfo = new GridBagConstraints();
		gbc_lblInfo.gridwidth = 2;
		gbc_lblInfo.anchor = GridBagConstraints.NORTH;
		gbc_lblInfo.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblInfo.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfo.gridx = 0;
		gbc_lblInfo.gridy = 0;
		panel_table_supplier.add(lblInfo, gbc_lblInfo);
		
		String[] columnNames = {"Mã Nhà Cung Cấp", "Tên Nhà Cung Cấp", "Số Điện Thoại", "Địa Chỉ", "Email", "Ghi Chú"};
		Object[][] data = {
				
		};
		
		supplierModel = new DefaultTableModel(data, columnNames) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		infoTable = new JTable(supplierModel);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
	    centerRenderer.setHorizontalAlignment(JLabel.CENTER);
	    TableColumnModel columnModel = infoTable.getColumnModel();
	    columnModel.getColumn(0).setCellRenderer(centerRenderer);
	    columnModel.getColumn(1).setCellRenderer(centerRenderer);
	    columnModel.getColumn(2).setCellRenderer(centerRenderer);
	    columnModel.getColumn(3).setCellRenderer(centerRenderer);
	    columnModel.getColumn(4).setCellRenderer(centerRenderer);
	    columnModel.getColumn(5).setCellRenderer(centerRenderer);
	    
		infoTable.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		infoTable.setBorder(new LineBorder(borderColor, 2, false));
		infoTable.getTableHeader().setBorder(new LineBorder(borderColor, 2, false));
		infoTable.getTableHeader().setBackground(borderColor);
		infoTable.getTableHeader().setForeground(Color.white);
		infoTable.getTableHeader().setReorderingAllowed(false);
		infoTable.addMouseListener(this);
		
		lblSearch = new JLabel("Tìm kiếm");
		lblSearch.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSearch.setForeground(textColor);
		GridBagConstraints gbc_lblSearch = new GridBagConstraints();
		gbc_lblSearch.insets = new Insets(0, 0, 5, 5);
		gbc_lblSearch.anchor = GridBagConstraints.EAST;
		gbc_lblSearch.gridx = 0;
		gbc_lblSearch.gridy = 1;
		panel_table_supplier.add(lblSearch, gbc_lblSearch);
		JScrollPane scrollPane = new JScrollPane(infoTable);	
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		panel_table_supplier.add(scrollPane, gbc_scrollPane);
		
		searchText = new JTextField();
		GridBagConstraints gbc_searchText = new GridBagConstraints();
		gbc_searchText.ipady = 5;
		gbc_searchText.fill = GridBagConstraints.HORIZONTAL;
		gbc_searchText.insets = new Insets(0, 0, 5, 5);
		gbc_searchText.gridx = 1;
		gbc_searchText.gridy = 1;
		panel_table_supplier.add(searchText, gbc_searchText);
		searchText.setBorder(new LineBorder(borderColor, 2, true));	
		searchText.setForeground(textColor);
		searchText.addKeyListener(this);
		searchText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		searchText.setColumns(10);
		
		Image iconExcel = new ImageIcon("Assets/Icon/excel.png").getImage();
		iconExcel = iconExcel.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		
		btnExport = new JButton("Xuất Excel");
		btnExport.setForeground(Color.WHITE);
		btnExport.setBorder(new LineBorder(borderColor, 2, true));
		btnExport.setFocusPainted(false);
		btnExport.addMouseListener(this);
		btnExport.setBackground(new Color(34, 33, 75));
        btnExport.setIcon(new ImageIcon(iconExcel));
		GridBagConstraints gbc_btnExport = new GridBagConstraints();
		gbc_btnExport.ipady = 5;
		gbc_btnExport.ipadx = 5;
		gbc_btnExport.insets = new Insets(0, 5, 5, 5);
		gbc_btnExport.gridx = 2;
		gbc_btnExport.gridy = 1;
		panel_table_supplier.add(btnExport, gbc_btnExport);
		
		btnImport = new JButton("Nhập Excel");
		btnImport.setBorder(new LineBorder(borderColor, 2, true));
		btnImport.setBackground(borderColor);
		btnImport.setForeground(Color.white);
		btnImport.setFocusPainted(false);
		btnImport.setIcon(new ImageIcon(iconExcel));
		btnImport.addMouseListener(this);
		GridBagConstraints gbc_btnImport = new GridBagConstraints();
		gbc_btnImport.ipady = 5;
		gbc_btnImport.ipadx = 5;
		gbc_btnImport.insets = new Insets(0, 5, 5, 0);
		gbc_btnImport.gridx = 3;
		gbc_btnImport.gridy = 1;
		panel_table_supplier.add(btnImport, gbc_btnImport);
		
		JPanel inputPanel = new JPanel();
		inputPanel.setBackground(backGroundColor);
		inputPanel.setBorder(new MatteBorder(0, 0, 0, 2, borderColor));
		GridBagConstraints gbc_inputPanel = new GridBagConstraints();
		gbc_inputPanel.weightx = 0.7;
		gbc_inputPanel.insets = new Insets(20, 20, 20, 20);
		gbc_inputPanel.fill = GridBagConstraints.BOTH;
		gbc_inputPanel.gridx = 0;
		gbc_inputPanel.gridy = 0;
		add(inputPanel, gbc_inputPanel);
		GridBagLayout gbl_inputPanel = new GridBagLayout();
		gbl_inputPanel.columnWidths = new int[]{99, 119, 97};
		gbl_inputPanel.rowHeights = new int[]{0, 0, 0, 0, 20, 23, 0, 27, 34, 0, 0, 0, 87, 178, 0};
		gbl_inputPanel.columnWeights = new double[]{1.0, 0.0, 1.0};
		gbl_inputPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		inputPanel.setLayout(gbl_inputPanel);
		
		JLabel lblInput = new JLabel("Thêm nhà cung cấp mới");
		lblInput.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblInput.setForeground(textColor);
		GridBagConstraints gbc_lblInput = new GridBagConstraints();
		gbc_lblInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblInput.insets = new Insets(0, 5, 10, 5);
		gbc_lblInput.gridx = 0;
		gbc_lblInput.gridy = 0;
		inputPanel.add(lblInput, gbc_lblInput);
		
		JLabel lblSupplierId = new JLabel("Mã nhà cung cấp");
		lblSupplierId.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSupplierId.setForeground(textColor);
		GridBagConstraints gbc_lblSupplierId = new GridBagConstraints();
		gbc_lblSupplierId.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSupplierId.insets = new Insets(0, 5, 5, 5);
		gbc_lblSupplierId.gridx = 0;
		gbc_lblSupplierId.gridy = 1;
		inputPanel.add(lblSupplierId, gbc_lblSupplierId);
		
		SupplierIdText = new JTextField();
		SupplierIdText.setBorder(new LineBorder(borderColor, 2, true));	
		SupplierIdText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		SupplierIdText.setForeground(textColor);
		SupplierIdText.setEditable(false);
		SupplierIdText.setFocusable(false);
		GridBagConstraints gbc_SupplierIdText = new GridBagConstraints();
		gbc_SupplierIdText.weighty = 0.1;
		gbc_SupplierIdText.gridwidth = 3;
		gbc_SupplierIdText.ipady = 10;
		gbc_SupplierIdText.insets = new Insets(0, 5, 15, 20);
		gbc_SupplierIdText.fill = GridBagConstraints.HORIZONTAL;
		gbc_SupplierIdText.gridx = 0;
		gbc_SupplierIdText.gridy = 2;
		inputPanel.add(SupplierIdText, gbc_SupplierIdText);
		SupplierIdText.setColumns(10);
		
		
		ButtonGroup buttonGroup = new ButtonGroup();
	         
		JLabel lblSupplierName = new JLabel("Họ tên nhà cung cấp");
		lblSupplierName.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSupplierName.setForeground(textColor);
		GridBagConstraints gbc_lblSupplierName = new GridBagConstraints();
		gbc_lblSupplierName.weightx = 0.3;
		gbc_lblSupplierName.anchor = GridBagConstraints.WEST;
		gbc_lblSupplierName.insets = new Insets(0, 5, 5, 5);
		gbc_lblSupplierName.gridx = 0;
		gbc_lblSupplierName.gridy = 3;
		inputPanel.add(lblSupplierName, gbc_lblSupplierName);
		
		supplierNameText = new JTextField();
		supplierNameText.setBorder(new LineBorder(borderColor, 2, true));	
		supplierNameText.setForeground(textColor);
		supplierNameText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		GridBagConstraints gbc_supplierNameText = new GridBagConstraints();
		gbc_supplierNameText.weighty = 0.1;
		gbc_supplierNameText.gridwidth = 3;
		gbc_supplierNameText.ipady = 10;
		gbc_supplierNameText.insets = new Insets(0, 5, 15, 20);
		gbc_supplierNameText.fill = GridBagConstraints.HORIZONTAL;
		gbc_supplierNameText.gridx = 0;
		gbc_supplierNameText.gridy = 4;
		inputPanel.add(supplierNameText, gbc_supplierNameText);
		supplierNameText.setColumns(10);
		
		JLabel lblPhone = new JLabel("Số điện thoại");
		lblPhone.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPhone.setForeground(textColor);
		GridBagConstraints gbc_lblPhone = new GridBagConstraints();
		gbc_lblPhone.anchor = GridBagConstraints.WEST;
		gbc_lblPhone.insets = new Insets(0, 5, 5, 5);
		gbc_lblPhone.gridx = 0;
		gbc_lblPhone.gridy = 5;
		inputPanel.add(lblPhone, gbc_lblPhone);
		
		supplierPhoneText = new JTextField();
		supplierPhoneText.setBorder(new LineBorder(borderColor, 2, true));	
		supplierPhoneText.setForeground(textColor);
		supplierPhoneText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		GridBagConstraints gbc_supplierPhoneText = new GridBagConstraints();
		gbc_supplierPhoneText.weighty = 0.1;
		gbc_supplierPhoneText.gridwidth = 3;
		gbc_supplierPhoneText.ipady = 10;
		gbc_supplierPhoneText.insets = new Insets(0, 5, 15, 20);
		gbc_supplierPhoneText.fill = GridBagConstraints.HORIZONTAL;
		gbc_supplierPhoneText.gridx = 0;
		gbc_supplierPhoneText.gridy = 6;
		inputPanel.add(supplierPhoneText, gbc_supplierPhoneText);
		supplierPhoneText.setColumns(10);
		
		String[] supplier_type_list=new String[] {"Nokia", "Samsung Galaxy Prime J7"};
		
		JLabel lblAddress = new JLabel("Địa chỉ");
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAddress.setForeground(textColor);
		GridBagConstraints gbc_lblAddress = new GridBagConstraints();
		gbc_lblAddress.anchor = GridBagConstraints.WEST;
		gbc_lblAddress.insets = new Insets(0, 5, 5, 5);
		gbc_lblAddress.gridx = 0;
		gbc_lblAddress.gridy = 7;
		inputPanel.add(lblAddress, gbc_lblAddress);
		
		supplierAdressText = new JTextField();
		supplierAdressText.setBorder(new LineBorder(borderColor, 2, true));	
		supplierAdressText.setForeground(textColor);
		supplierAdressText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		GridBagConstraints gbc_supplierAdressText = new GridBagConstraints();
		gbc_supplierAdressText.weighty = 0.1;
		gbc_supplierAdressText.gridwidth = 3;
		gbc_supplierAdressText.ipady = 10;
		gbc_supplierAdressText.insets = new Insets(0, 5, 15, 20);
		gbc_supplierAdressText.fill = GridBagConstraints.HORIZONTAL;
		gbc_supplierAdressText.gridx = 0;
		gbc_supplierAdressText.gridy = 8;
		inputPanel.add(supplierAdressText, gbc_supplierAdressText);
		supplierAdressText.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblEmail.setForeground(textColor);
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.gridwidth = 2;
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.insets = new Insets(0, 5, 5, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 9;
		inputPanel.add(lblEmail, gbc_lblEmail);
		
		supplierEmailText = new JTextField();
		supplierEmailText.setBorder(new LineBorder(borderColor, 2, true));	
		supplierEmailText.setForeground(new Color(34, 33, 75));
		supplierEmailText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		supplierEmailText.setColumns(10);
		GridBagConstraints gbc_supplierEmailText = new GridBagConstraints();
		gbc_supplierEmailText.weighty = 0.1;
		gbc_supplierEmailText.ipady = 10;
		gbc_supplierEmailText.gridwidth = 3;
		gbc_supplierEmailText.insets = new Insets(0, 5, 15, 20);
		gbc_supplierEmailText.fill = GridBagConstraints.HORIZONTAL;
		gbc_supplierEmailText.gridx = 0;
		gbc_supplierEmailText.gridy = 10;
		inputPanel.add(supplierEmailText, gbc_supplierEmailText);
		
		String []day_list=new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String []month_list=new String[] {"1","2","3","4","5","6","7","8","9","10","11","12"};
		String []year_list=new String[]{"2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
		
		JLabel lblNote = new JLabel("Ghi chú");
		lblNote.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblNote = new GridBagConstraints();
		gbc_lblNote.anchor = GridBagConstraints.WEST;
		gbc_lblNote.insets = new Insets(0, 5, 5, 5);
		gbc_lblNote.gridx = 0;
		gbc_lblNote.gridy = 11;
		inputPanel.add(lblNote, gbc_lblNote);
		
		JScrollPane noteScroll = new JScrollPane();
		noteScroll.setBackground(Color.WHITE);
		noteScroll.setBorder(null);
		GridBagConstraints gbc_noteText = new GridBagConstraints();
		gbc_noteText.weightx = 0.1;
		gbc_noteText.weighty = 0.1;
		gbc_noteText.gridwidth = 3;
		gbc_noteText.insets = new Insets(0, 5, 5, 20);
		gbc_noteText.fill = GridBagConstraints.BOTH;
		gbc_noteText.gridx = 0;
		gbc_noteText.gridy = 12;
		inputPanel.add(noteScroll, gbc_noteText);

		noteText = new JTextArea();
		noteText.setForeground(textColor);
		noteText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		noteText.setBorder(new LineBorder(borderColor ,2 ,true));
		noteScroll.setViewportView(noteText);
		noteText.setColumns(10);
		
		JPanel panelFeature = new JPanel();
		panelFeature.setBorder(null);
		panelFeature.setBackground(backGroundColor);
		GridBagConstraints gbc_panelFeature = new GridBagConstraints();
		gbc_panelFeature.weighty = 0.3;
		gbc_panelFeature.gridwidth = 3;
		gbc_panelFeature.fill = GridBagConstraints.BOTH;
		gbc_panelFeature.gridx = 0;
		gbc_panelFeature.gridy = 13;
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
		
		btnAdd = new JButton("Thêm");
		btnAdd.setPreferredSize(new Dimension(100, 40));
		btnAdd.setIcon(new ImageIcon(iconAdd));
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnAdd.setBorder(new LineBorder(borderColor, 2, true));
		btnAdd.setBackground(buttonColor);
		btnAdd.setForeground(Color.white);
		btnAdd.setFocusPainted(false);
		btnAdd.addMouseListener(this);
		panelFeature.add(btnAdd);
		
		btnDelete = new JButton("Xóa");
		btnDelete.setPreferredSize(new Dimension(100, 40));
		btnDelete.setIcon(new ImageIcon(delete_icon));
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnDelete.setBorder(new LineBorder(borderColor, 2, true));
		btnDelete.setBackground(buttonColor);
		btnDelete.setForeground(Color.white);
		btnDelete.setFocusPainted(false);
		btnDelete.addMouseListener(this);
		panelFeature.add(btnDelete);
		
		btnEdit = new JButton("Sửa");
		btnEdit.setPreferredSize(new Dimension(100, 40));
		btnEdit.setIcon(new ImageIcon(iconEdit));
		btnEdit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnEdit.setBorder(new LineBorder(borderColor, 2, true));
		btnEdit.setBackground(buttonColor);
		btnEdit.setForeground(Color.white);
		btnEdit.setFocusPainted(false);
		btnEdit.addMouseListener(this);
		panelFeature.add(btnEdit);
		
		btnClear = new JButton("Mới");
		btnClear.setPreferredSize(new Dimension(100, 40));
		btnClear.setIcon(new ImageIcon(iconClear));
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnClear.setBorder(new LineBorder(borderColor, 2, true));
		btnClear.setBackground(buttonColor);
		btnClear.setForeground(Color.white);
		btnClear.setFocusPainted(false);
		btnClear.addMouseListener(this);
		panelFeature.add(btnClear);
		
	}
	
	public void loadDataTable(ArrayList<SupplierDTO> list) {
		supplierModel.setRowCount(0);
		
		for(SupplierDTO s : list) {
			supplierModel.addRow(new Object[] {
				s.getSupplierId(), s.getSupplierName(), s.getPhone(), s.getAddress(), s.getEmail(), s.getNote()
			});
		}
	}
	
	public int getRowSelected() {
        int index = infoTable.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhà cung cấp!");
        }
        return index;
    }
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnAdd) {
			if(Validation.isEmpty(supplierNameText.getText())) {				
				JOptionPane.showMessageDialog(this, "Vui lòng nhập tên nhà cung cấp mới");
			}
			else if(!Validation.isEmail(supplierEmailText.getText())) {
				JOptionPane.showMessageDialog(this, "Vui lòng đúng định dạng email");
			}
			else if(!Validation.isNumber(supplierPhoneText.getText())) {
				JOptionPane.showMessageDialog(this, "Vui lòng đúng định dạng số điện thoại");
			}
			else {	
				String supplierName = supplierNameText.getText().trim();
                String supplierPhone = supplierPhoneText.getText().trim();
				String supplierAddress = supplierAdressText.getText().trim();
				String supplierEmail = supplierEmailText.getText().trim();
	            String supplierNote = noteText.getText().trim();
	            int id = SupplierDAO.getInstance().getAutoIncrement();	            
				if(supplierBUS.checkDup(supplierPhone, id)) {
					supplierBUS.add(supplierName, supplierPhone, supplierAddress, supplierEmail, supplierNote);
					loadDataTable(listSupplier);
					supplierNameText.setText("");
					supplierPhoneText.setText("");
					supplierAdressText.setText("");
					supplierEmailText.setText("");
					noteText.setText("");
				} else {
                    JOptionPane.showMessageDialog(this, "Nhà cung cấp đã tồn tại (SDT trùng)!");
                }
			}
		}else if (e.getSource() == btnDelete) {
			int index = getRowSelected();
	        if (index != -1) {
	          	supplierBUS.delete(listSupplier.get(index));
	          	loadDataTable(listSupplier);
	          	supplierNameText.setText("");
				supplierPhoneText.setText("");
				supplierAdressText.setText("");
				supplierEmailText.setText("");
				noteText.setText("");
            }
		} else if (e.getSource() == btnEdit) {
            int index = getRowSelected();
            if (index != -1) {
                if (Validation.isEmpty(supplierNameText.getText())) {
                    JOptionPane.showMessageDialog(this, "Nhà cung cấp đã tồn tại (SDT trùng)!");
                } 
                else if(!Validation.isEmail(supplierEmailText.getText())) {
    				JOptionPane.showMessageDialog(this, "Vui lòng đúng định dạng email");
    			}
    			else if(!Validation.isNumber(supplierPhoneText.getText())) {
    				JOptionPane.showMessageDialog(this, "Vui lòng đúng định dạng số điện thoại");
    			} else {
                    String supplierName = supplierNameText.getText().trim();
                    String supplierPhone = supplierPhoneText.getText().trim();
    				String supplierAddress = supplierAdressText.getText().trim();
    				String supplierEmail = supplierEmailText.getText().trim();
    	            String supplierNote = noteText.getText().trim();
    	            int id = SupplierDAO.getInstance().getAutoIncrement();	    
                    if (supplierBUS.checkDup(supplierPhone , id)) {
                    	supplierBUS.update(new SupplierDTO(listSupplier.get(index).getSupplierId(), supplierName, supplierPhone, 
                    			supplierAddress, supplierEmail,  supplierNote));
                        loadDataTable(listSupplier);
                        supplierNameText.setText("");
    					supplierPhoneText.setText("");
    					supplierAdressText.setText("");
    					supplierEmailText.setText("");
    					noteText.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "Nhà cung cấp đã tồn tại (SDT trùng)!");
                    }
                }
            }
		} else if (e.getSource() == btnClear) {	
        	loadDataTable(listSupplier);
        	SupplierIdText.setText("");
        	supplierNameText.setText("");
			supplierPhoneText.setText("");
			supplierAdressText.setText("");
			supplierEmailText.setText("");
			noteText.setText("");
        } else if (e.getSource() == infoTable) {          	
            int index = infoTable.getSelectedRow();
            SupplierIdText.setText(String.valueOf(listSupplier.get(index).getSupplierId()));
            supplierNameText.setText(listSupplier.get(index).getSupplierName());
			supplierPhoneText.setText(listSupplier.get(index).getPhone());
			supplierAdressText.setText(listSupplier.get(index).getAddress());
			supplierEmailText.setText(listSupplier.get(index).getEmail());
			noteText.setText(listSupplier.get(index).getNote());
        } else if (e.getSource() == btnExport) {
        	try {
        		ExcelExporter excel = new ExcelExporter();
        		excel.exportJTableToExcel(infoTable);
				JOptionPane.showMessageDialog(this, "Xuất thành công");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				JOptionPane.showMessageDialog(this, "Xuất thất bại!");
			}        				
        } else if(e.getSource() == btnImport) {
    		try {
    			supplierBUS.importExcel();
				JOptionPane.showMessageDialog(this, "Nhập thành công");
				loadDataTable(listSupplier);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				JOptionPane.showMessageDialog(this, "Nhập thất bại!");
			}        			
    	}	     	
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
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		try {
			ArrayList<SupplierDTO> filterList = new ArrayList<>();
			filterList = supplierBUS.search(searchText.getText());
			loadDataTable(filterList);
		} catch (Exception  ex) {
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
        }
	}	
}
