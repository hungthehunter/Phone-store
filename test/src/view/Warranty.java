package view;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
@SuppressWarnings("unused")
public class Warranty extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField searchText;
	private GridBagConstraints gbc_lblWarrantyInfo;
	private JTextField warrantyIdText;
	private JTextField customerIdText;
	private JTextField productNameText;
	private JTextField dateReceivedText;
	private JTextField dateReturnedText;


	/**
	 * Create the frame.
	 */
	public Warranty() {
		Color myColor = new Color(34, 33, 75);
		Color backGroundColor = Color.white;
		Color borderColor = myColor;
		Color textColor = myColor;
		Color buttonColor = myColor;
		
		setBackground(backGroundColor);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {566, 400};
		gridBagLayout.rowHeights = new int[]{395, 82, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel tablePanel = new JPanel();
		tablePanel.setBackground(backGroundColor);
		tablePanel.setBorder(null);
		GridBagConstraints gbc_tablePanel = new GridBagConstraints();
		gbc_tablePanel.weighty = 1.0;
		gbc_tablePanel.weightx = 0.6;
		gbc_tablePanel.gridheight = 2;
		gbc_tablePanel.insets = new Insets(20, 20, 20, 5);
		gbc_tablePanel.fill = GridBagConstraints.BOTH;
		gbc_tablePanel.gridx = 0;
		gbc_tablePanel.gridy = 0;
		add(tablePanel, gbc_tablePanel);
		GridBagLayout gbl_tablePanel = new GridBagLayout();
		gbl_tablePanel.columnWidths = new int[]{450, 0, 0};
		gbl_tablePanel.rowHeights = new int[]{0, 0, 384, 0, 0};
		gbl_tablePanel.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_tablePanel.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		tablePanel.setLayout(gbl_tablePanel);
		
		JLabel lblInfo = new JLabel("Thông Tin Chung");
		lblInfo.setForeground(textColor);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setFont(new Font("Verdana", Font.BOLD, 15));
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		tablePanel.add(lblInfo, gbc_lblNewLabel);
				
		String[] infoColumn = {"STT", "Mã Bảo Hành", "Mã Khách Hàng", "Tên Sản Phẩm", "Ngày Bảo Hành", "Ngày Trả" , "Ghi Chú"};
        Object[][] infoData = {
            {"1", "NOKIA1", "NVA", "LSP001", "1/11/2023", "8/11/2023" , ""},
            {"2", "PHONE2", "CCV", "LSP002", "9/2/2022", "9/11/2022" , ""},
        };

        DefaultTableModel Infomodel = new DefaultTableModel(infoData, infoColumn) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable InfoTable = new JTable(Infomodel);
        InfoTable.setBorder(new LineBorder(borderColor, 2, false));
        InfoTable.getTableHeader().setBorder(new LineBorder(borderColor, 2, false));
        InfoTable.getTableHeader().setBackground(borderColor);
        InfoTable.getTableHeader().setForeground(Color.white);
		GridBagConstraints gbc_table_1 = new GridBagConstraints();
		gbc_table_1.gridheight = 2;
		gbc_table_1.insets = new Insets(5, 5, 5, 0);
		gbc_table_1.gridwidth = 2;
		gbc_table_1.fill = GridBagConstraints.BOTH;
		gbc_table_1.gridx = 0;
		gbc_table_1.gridy = 2;
        InfoTable.getTableHeader().setReorderingAllowed(false);
        JScrollPane scrollInfoTable = new JScrollPane(InfoTable);
        tablePanel.add(scrollInfoTable, gbc_table_1);
        
        searchText = new JTextField();
        searchText.setFont(new Font("Verdana", Font.PLAIN, 12));
        searchText.setBorder(new LineBorder(borderColor, 2, true));	
        searchText.setForeground(textColor);
        GridBagConstraints gbc_txtSearch = new GridBagConstraints();
        gbc_txtSearch.insets = new Insets(5, 5, 5, 5);
        gbc_txtSearch.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtSearch.gridx = 0;
        gbc_txtSearch.gridy = 1;
        tablePanel.add(searchText, gbc_txtSearch);
        searchText.setColumns(10);
        
        JButton btnSearch = new JButton("Tìm kiếm");
        btnSearch.setFont(new Font("Verdana", Font.PLAIN, 12));
        btnSearch.setBorder(new LineBorder(borderColor, 2, true));
        btnSearch.setBackground(borderColor);
        btnSearch.setForeground(Color.white);
        btnSearch.setFocusPainted(false);
        Image iconSearch = new ImageIcon("Assets/Icon/searching.png").getImage();
        iconSearch = iconSearch.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        btnSearch.setIcon(new ImageIcon(iconSearch));
        GridBagConstraints gbc_btnSearch = new GridBagConstraints();
        gbc_btnSearch.insets = new Insets(5, 5, 5, 0);
        gbc_btnSearch.gridx = 1;
        gbc_btnSearch.gridy = 1;
        tablePanel.add(btnSearch, gbc_btnSearch);
               
        JPanel detailPanel = new JPanel();
        detailPanel.setBackground(backGroundColor);
        detailPanel.setBorder(new MatteBorder(0, 2, 0, 0, (borderColor)));
        GridBagConstraints gbc_detailPanel = new GridBagConstraints();
        gbc_detailPanel.weighty = 0.7;
        gbc_detailPanel.weightx = 0.3;
        gbc_detailPanel.insets = new Insets(20, 0, 5, 20);
        gbc_detailPanel.fill = GridBagConstraints.BOTH;
        gbc_detailPanel.gridx = 1;
        gbc_detailPanel.gridy = 0;
        add(detailPanel, gbc_detailPanel);
        GridBagLayout gbl_detailPanel = new GridBagLayout();
        gbl_detailPanel.columnWidths = new int[] {100, 100, 0};
        gbl_detailPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 52, 0};
        gbl_detailPanel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
        gbl_detailPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        detailPanel.setLayout(gbl_detailPanel);
        
        JLabel lblWarrantyInfo = new JLabel("Thông Tin Bảo Hành");
        lblWarrantyInfo.setFont(new Font("Verdana", Font.BOLD, 15));
        lblWarrantyInfo.setForeground(textColor);
        gbc_lblWarrantyInfo = new GridBagConstraints();
        gbc_lblWarrantyInfo.weightx = 1.0;
        gbc_lblWarrantyInfo.gridwidth = 2;
        gbc_lblWarrantyInfo.insets = new Insets(5, 5, 20, 0);
        gbc_lblWarrantyInfo.gridx = 0;
        gbc_lblWarrantyInfo.gridy = 0;
        detailPanel.add(lblWarrantyInfo, gbc_lblWarrantyInfo);
        
        JLabel lblWarrantyId = new JLabel("Mã bảo hành:");
        lblWarrantyId.setFont(new Font("Verdana", Font.BOLD, 12));
        lblWarrantyId.setForeground(textColor);
        GridBagConstraints gbc_lblWarrantyId = new GridBagConstraints();
        gbc_lblWarrantyId.weighty = 0.1;
        gbc_lblWarrantyId.weightx = 0.2;
        gbc_lblWarrantyId.insets = new Insets(10, 0, 25, 5);
        gbc_lblWarrantyId.gridx = 0;
        gbc_lblWarrantyId.gridy = 1;
        detailPanel.add(lblWarrantyId, gbc_lblWarrantyId);
        
        warrantyIdText = new JTextField();
        warrantyIdText.setFont(new Font("Verdana", Font.PLAIN, 12));
        warrantyIdText.setBorder(new LineBorder(borderColor, 2, true));	
        warrantyIdText.setForeground(textColor);
        GridBagConstraints gbc_txtWarrantyId = new GridBagConstraints();
        gbc_txtWarrantyId.weightx = 0.6;
        gbc_txtWarrantyId.weighty = 0.1;
        gbc_txtWarrantyId.ipady = 5;
        gbc_txtWarrantyId.insets = new Insets(10, 0, 25, 5);
        gbc_txtWarrantyId.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtWarrantyId.gridx = 1;
        gbc_txtWarrantyId.gridy = 1;
        detailPanel.add(warrantyIdText, gbc_txtWarrantyId);
        warrantyIdText.setColumns(10);
        
        JLabel lblCustomerId = new JLabel("Mã khách hàng:");
        lblCustomerId.setFont(new Font("Verdana", Font.BOLD, 12));
        lblCustomerId.setForeground(textColor);
        GridBagConstraints gbc_lblCustomerId = new GridBagConstraints();
        gbc_lblCustomerId.insets = new Insets(10, 0, 25, 5);
        gbc_lblCustomerId.gridx = 0;
        gbc_lblCustomerId.gridy = 2;
        detailPanel.add(lblCustomerId, gbc_lblCustomerId);
        
        customerIdText = new JTextField();
        customerIdText.setColumns(10);
        customerIdText.setBorder(new LineBorder(borderColor, 2, true));	
        customerIdText.setForeground(textColor);
        customerIdText.setFont(new Font("Verdana", Font.PLAIN, 12));
        GridBagConstraints gbc_txtCustomerId = new GridBagConstraints();
        gbc_txtCustomerId.weighty = 0.1;
        gbc_txtCustomerId.ipady = 5;
        gbc_txtCustomerId.insets = new Insets(10, 0, 25, 5);
        gbc_txtCustomerId.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtCustomerId.gridx = 1;
        gbc_txtCustomerId.gridy = 2;
        detailPanel.add(customerIdText, gbc_txtCustomerId);
        
        JLabel lblProductName = new JLabel("Tên sản phẩm:");
        lblProductName.setFont(new Font("Verdana", Font.BOLD, 12));
        lblProductName.setForeground(textColor);
        GridBagConstraints gbc_lblProductName = new GridBagConstraints();
        gbc_lblProductName.insets = new Insets(10, 0, 25, 5);
        gbc_lblProductName.gridx = 0;
        gbc_lblProductName.gridy = 3;
        detailPanel.add(lblProductName, gbc_lblProductName);
        
        productNameText = new JTextField();
        productNameText.setColumns(10);
        productNameText.setBorder(new LineBorder(borderColor, 2, true));	
        productNameText.setForeground(textColor);
        productNameText.setFont(new Font("Verdana", Font.PLAIN, 12));
        GridBagConstraints gbc_txtProductName = new GridBagConstraints();
        gbc_txtProductName.weighty = 0.1;
        gbc_txtProductName.ipady = 5;
        gbc_txtProductName.insets = new Insets(10, 0, 25, 5);
        gbc_txtProductName.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtProductName.gridx = 1;
        gbc_txtProductName.gridy = 3;
        detailPanel.add(productNameText, gbc_txtProductName);
        
        JLabel lblDateReceived = new JLabel("Ngày bảo hành:");
        lblDateReceived.setFont(new Font("Verdana", Font.BOLD, 12));
        lblDateReceived.setForeground(textColor);
        GridBagConstraints gbc_lblDateReceived = new GridBagConstraints();
        gbc_lblDateReceived.insets = new Insets(10, 0, 25, 5);
        gbc_lblDateReceived.gridx = 0;
        gbc_lblDateReceived.gridy = 4;
        detailPanel.add(lblDateReceived, gbc_lblDateReceived);
        
        dateReceivedText = new JTextField();
        dateReceivedText.setColumns(10);
        dateReceivedText.setBorder(new LineBorder(borderColor, 2, true));	
        dateReceivedText.setForeground(textColor);
        dateReceivedText.setFont(new Font("Verdana", Font.PLAIN, 12));
        GridBagConstraints gbc_txtDateReceived = new GridBagConstraints();
        gbc_txtDateReceived.weighty = 0.1;
        gbc_txtDateReceived.ipady = 5;
        gbc_txtDateReceived.insets = new Insets(10, 0, 25, 5);
        gbc_txtDateReceived.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtDateReceived.gridx = 1;
        gbc_txtDateReceived.gridy = 4;
        detailPanel.add(dateReceivedText, gbc_txtDateReceived);
        
        JLabel lblDateReturned = new JLabel("Ngày trả:");
        lblDateReturned.setFont(new Font("Verdana", Font.BOLD, 12));
        lblDateReturned.setForeground(textColor);
        GridBagConstraints gbc_lblDateReturned = new GridBagConstraints();
        gbc_lblDateReturned.insets = new Insets(10, 0, 25, 5);
        gbc_lblDateReturned.gridx = 0;
        gbc_lblDateReturned.gridy = 5;
        detailPanel.add(lblDateReturned, gbc_lblDateReturned);
        
        dateReturnedText = new JTextField();
        dateReturnedText.setColumns(10);
        dateReturnedText.setBorder(new LineBorder(borderColor, 2, true));	
        dateReturnedText.setForeground(textColor);
        dateReturnedText.setFont(new Font("Verdana", Font.PLAIN, 12));
        GridBagConstraints gbc_txtDateReturned = new GridBagConstraints();
        gbc_txtDateReturned.weighty = 0.1;
        gbc_txtDateReturned.ipady = 5;
        gbc_txtDateReturned.insets = new Insets(10, 0, 25, 5);
        gbc_txtDateReturned.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtDateReturned.gridx = 1;
        gbc_txtDateReturned.gridy = 5;
        detailPanel.add(dateReturnedText, gbc_txtDateReturned);
        
        JLabel lblNote = new JLabel("Ghi chú:");
        lblNote.setFont(new Font("Verdana", Font.BOLD, 12));
        lblNote.setForeground(textColor);
        GridBagConstraints gbc_lblNote = new GridBagConstraints();
        gbc_lblNote.insets = new Insets(10, 0, 25, 5);
        gbc_lblNote.gridx = 0;
        gbc_lblNote.gridy = 6;
        detailPanel.add(lblNote, gbc_lblNote);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBackground(Color.WHITE);
        scrollPane.setBorder(null);
        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
        gbc_scrollPane.weighty = 0.1;
        gbc_scrollPane.insets = new Insets(10, 0, 25, 5);
        gbc_scrollPane.fill = GridBagConstraints.HORIZONTAL;
        gbc_scrollPane.gridx = 1;
        gbc_scrollPane.gridy = 6;
        detailPanel.add(scrollPane, gbc_scrollPane);
        
		JTextArea txtNote = new JTextArea();
		txtNote.setRows(3);
		txtNote.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtNote.setBorder(new LineBorder(borderColor ,2 ,true));
		scrollPane.setViewportView(txtNote);
        
        JPanel btnPanel = new JPanel();
        btnPanel.setBackground(backGroundColor);
        btnPanel.setBorder(null);      
        GridBagConstraints gbc_btnPanel = new GridBagConstraints();
        gbc_btnPanel.weighty = 0.3;
        gbc_btnPanel.weightx = 0.3;
        gbc_btnPanel.fill = GridBagConstraints.BOTH;
        gbc_btnPanel.insets = new Insets(5, 0, 20, 20);
        gbc_btnPanel.gridx = 1;
        gbc_btnPanel.gridy = 1;
        add(btnPanel, gbc_btnPanel);
        
        Image iconAdd = new ImageIcon("Assets/Icon/add.png").getImage();
		iconAdd = iconAdd.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		Image iconDelete = new ImageIcon("Assets/Icon/delete.png").getImage();
		iconDelete = iconDelete.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		Image iconEdit = new ImageIcon("Assets/edit.png").getImage();
		iconEdit = iconEdit.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		Image iconClear = new ImageIcon("Assets/Icon/clear.png").getImage();
		iconClear = iconClear.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnAdd = new JButton("Thêm");
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setIcon(new ImageIcon(iconAdd));
		btnAdd.setPreferredSize(new Dimension(100, 40));
		btnAdd.setFont(new Font("Verdana", Font.BOLD, 12));
		btnAdd.setBorder(new LineBorder(borderColor, 2, true));
		btnAdd.setBackground(buttonColor);
		btnAdd.setForeground(Color.white);
		btnAdd.setFocusPainted(false);
		btnPanel.add(btnAdd);
		
		JButton btnDelete= new JButton("Xóa");
		btnDelete.setIcon(new ImageIcon(iconDelete));
		btnDelete.setPreferredSize(new Dimension(100, 40));
		btnDelete.setFont(new Font("Verdana", Font.BOLD, 12));
		btnDelete.setBorder(new LineBorder(borderColor, 2, true));
		btnDelete.setBackground(buttonColor);
		btnDelete.setForeground(Color.white);
		btnDelete.setFocusPainted(false);
		btnPanel.add(btnDelete);
		
		JButton btnEdit = new JButton("Sửa");
		btnEdit.setIcon(new ImageIcon(iconEdit));
		btnEdit.setPreferredSize(new Dimension(100, 40));
		btnEdit.setFont(new Font("Verdana", Font.BOLD, 12));
		btnEdit.setBorder(new LineBorder(borderColor, 2, true));
		btnEdit.setBackground(buttonColor);
		btnEdit.setForeground(Color.white);
		btnEdit.setFocusPainted(false);
		btnPanel.add(btnEdit);
		
		JButton btnClear = new JButton("Mới");
		btnClear.setIcon(new ImageIcon(iconClear));
		btnClear.setPreferredSize(new Dimension(100, 40));
		btnClear.setFont(new Font("Verdana", Font.BOLD, 12));
		btnClear.setBorder(new LineBorder(borderColor, 2, true));
		btnClear.setBackground(buttonColor);
		btnClear.setForeground(Color.white);
		btnClear.setFocusPainted(false);
		btnPanel.add(btnClear);
	}
}