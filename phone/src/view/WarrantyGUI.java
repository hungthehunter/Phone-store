package view;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
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
	private JTextField txtSearch;
	private GridBagConstraints gbc_lblWarrantyInfo;
	private JTextField txtWarrantyId;
	private JTextField txtCustomerId;
	private JTextField txtProductName;
	private JTextField txtDateReceived;
	private JTextField txtDateReturned;


	/**
	 * Create the frame.
	 */
	public Warranty() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {700, 400};
		gridBagLayout.rowHeights = new int[]{615, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel tablePanel = new JPanel();
		tablePanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_tablePanel = new GridBagConstraints();
		gbc_tablePanel.gridheight = 2;
		gbc_tablePanel.insets = new Insets(5, 5, 5, 5);
		gbc_tablePanel.fill = GridBagConstraints.BOTH;
		gbc_tablePanel.gridx = 0;
		gbc_tablePanel.gridy = 0;
		add(tablePanel, gbc_tablePanel);
		GridBagLayout gbl_tablePanel = new GridBagLayout();
		gbl_tablePanel.columnWidths = new int[]{450, 0, 0};
		gbl_tablePanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_tablePanel.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_tablePanel.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		tablePanel.setLayout(gbl_tablePanel);
		
		JLabel lblInfo = new JLabel("Thông Tin Chung");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setFont(new Font("Verdana", Font.PLAIN, 12));
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		tablePanel.add(lblInfo, gbc_lblNewLabel);
		
		

				
		String[] infoColumn = {"Mã Bảo Hành", "Mã Khách Hàng", "Tên Sản Phẩm", "Ngày Bảo Hành", "Ngày Trả" , "Ghi Chú"};
        Object[][] infoData = {
            {"NOKIA1", "NVA", "LSP001", "1/11/2023", "8/11/2023" , ""},
            {"PHONE2", "CCV", "LSP002", "9/2/2022", "9/11/2022" , ""},
        };

        DefaultTableModel Infomodel = new DefaultTableModel(infoData, infoColumn) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable InfoTable = new JTable(Infomodel);
		GridBagConstraints gbc_table_1 = new GridBagConstraints();
		gbc_table_1.insets = new Insets(5, 5, 5, 5);
		gbc_table_1.gridwidth = 2;
		gbc_table_1.fill = GridBagConstraints.BOTH;
		gbc_table_1.gridx = 0;
		gbc_table_1.gridy = 2;
        InfoTable.getTableHeader().setReorderingAllowed(false);
        
        txtSearch = new JTextField();
        txtSearch.setFont(new Font("Verdana", Font.PLAIN, 12));
        GridBagConstraints gbc_txtSearch = new GridBagConstraints();
        gbc_txtSearch.insets = new Insets(5, 5, 5, 5);
        gbc_txtSearch.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtSearch.gridx = 0;
        gbc_txtSearch.gridy = 1;
        tablePanel.add(txtSearch, gbc_txtSearch);
        txtSearch.setColumns(10);
        
        JButton btnSearch = new JButton("Tìm kiếm");
        btnSearch.setFont(new Font("Verdana", Font.PLAIN, 12));
        GridBagConstraints gbc_btnSearch = new GridBagConstraints();
        gbc_btnSearch.insets = new Insets(5, 5, 5, 5);
        gbc_btnSearch.gridx = 1;
        gbc_btnSearch.gridy = 1;
        tablePanel.add(btnSearch, gbc_btnSearch);
        JScrollPane scrollInfoTable = new JScrollPane(InfoTable);
        tablePanel.add(scrollInfoTable, gbc_table_1);
        
        JPanel detailPanel = new JPanel();
        detailPanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
        GridBagConstraints gbc_detailPanel = new GridBagConstraints();
        gbc_detailPanel.insets = new Insets(5, 0, 0, 5);
        gbc_detailPanel.fill = GridBagConstraints.BOTH;
        gbc_detailPanel.gridx = 1;
        gbc_detailPanel.gridy = 0;
        add(detailPanel, gbc_detailPanel);
        GridBagLayout gbl_detailPanel = new GridBagLayout();
        gbl_detailPanel.columnWidths = new int[]{0, 0, 0};
        gbl_detailPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        gbl_detailPanel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
        gbl_detailPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        detailPanel.setLayout(gbl_detailPanel);
        
        JLabel lblWarrantyInfo = new JLabel("Thông Tin Bảo Hành");
        lblWarrantyInfo.setFont(new Font("Verdana", Font.PLAIN, 12));
        gbc_lblWarrantyInfo = new GridBagConstraints();
        gbc_lblWarrantyInfo.gridwidth = 2;
        gbc_lblWarrantyInfo.insets = new Insets(5, 5, 20, 0);
        gbc_lblWarrantyInfo.gridx = 0;
        gbc_lblWarrantyInfo.gridy = 0;
        detailPanel.add(lblWarrantyInfo, gbc_lblWarrantyInfo);
        
        JLabel lblWarrantyId = new JLabel("Mã bảo hành:");
        lblWarrantyId.setFont(new Font("Verdana", Font.PLAIN, 12));
        GridBagConstraints gbc_lblWarrantyId = new GridBagConstraints();
        gbc_lblWarrantyId.insets = new Insets(15, 0, 25, 5);
        gbc_lblWarrantyId.gridx = 0;
        gbc_lblWarrantyId.gridy = 1;
        detailPanel.add(lblWarrantyId, gbc_lblWarrantyId);
        
        txtWarrantyId = new JTextField();
        txtWarrantyId.setFont(new Font("Verdana", Font.PLAIN, 12));
        GridBagConstraints gbc_txtWarrantyId = new GridBagConstraints();
        gbc_txtWarrantyId.insets = new Insets(15, 0, 25, 5);
        gbc_txtWarrantyId.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtWarrantyId.gridx = 1;
        gbc_txtWarrantyId.gridy = 1;
        detailPanel.add(txtWarrantyId, gbc_txtWarrantyId);
        txtWarrantyId.setColumns(10);
        
        JLabel lblCustomerId = new JLabel("Mã khách hàng:");
        lblCustomerId.setFont(new Font("Verdana", Font.PLAIN, 12));
        GridBagConstraints gbc_lblCustomerId = new GridBagConstraints();
        gbc_lblCustomerId.insets = new Insets(15, 0, 25, 5);
        gbc_lblCustomerId.gridx = 0;
        gbc_lblCustomerId.gridy = 2;
        detailPanel.add(lblCustomerId, gbc_lblCustomerId);
        
        txtCustomerId = new JTextField();
        txtCustomerId.setColumns(10);
        txtCustomerId.setFont(new Font("Verdana", Font.PLAIN, 12));
        GridBagConstraints gbc_txtCustomerId = new GridBagConstraints();
        gbc_txtCustomerId.insets = new Insets(15, 0, 25, 5);
        gbc_txtCustomerId.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtCustomerId.gridx = 1;
        gbc_txtCustomerId.gridy = 2;
        detailPanel.add(txtCustomerId, gbc_txtCustomerId);
        
        JLabel lblProductName = new JLabel("Tên sản phẩm:");
        lblProductName.setFont(new Font("Verdana", Font.PLAIN, 12));
        GridBagConstraints gbc_lblProductName = new GridBagConstraints();
        gbc_lblProductName.insets = new Insets(15, 0, 25, 5);
        gbc_lblProductName.gridx = 0;
        gbc_lblProductName.gridy = 3;
        detailPanel.add(lblProductName, gbc_lblProductName);
        
        txtProductName = new JTextField();
        txtProductName.setColumns(10);
        txtProductName.setFont(new Font("Verdana", Font.PLAIN, 12));
        GridBagConstraints gbc_txtProductName = new GridBagConstraints();
        gbc_txtProductName.insets = new Insets(15, 0, 25, 5);
        gbc_txtProductName.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtProductName.gridx = 1;
        gbc_txtProductName.gridy = 3;
        detailPanel.add(txtProductName, gbc_txtProductName);
        
        JLabel lblDateReceived = new JLabel("Ngày bảo hành:");
        lblDateReceived.setFont(new Font("Verdana", Font.PLAIN, 12));
        GridBagConstraints gbc_lblDateReceived = new GridBagConstraints();
        gbc_lblDateReceived.insets = new Insets(15, 0, 25, 5);
        gbc_lblDateReceived.gridx = 0;
        gbc_lblDateReceived.gridy = 4;
        detailPanel.add(lblDateReceived, gbc_lblDateReceived);
        
        txtDateReceived = new JTextField();
        txtDateReceived.setColumns(10);
        txtDateReceived.setFont(new Font("Verdana", Font.PLAIN, 12));
        GridBagConstraints gbc_txtDateReceived = new GridBagConstraints();
        gbc_txtDateReceived.insets = new Insets(15, 0, 25, 5);
        gbc_txtDateReceived.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtDateReceived.gridx = 1;
        gbc_txtDateReceived.gridy = 4;
        detailPanel.add(txtDateReceived, gbc_txtDateReceived);
        
        JLabel lblDateReturned = new JLabel("Ngày trả:");
        lblDateReturned.setFont(new Font("Verdana", Font.PLAIN, 12));
        GridBagConstraints gbc_lblDateReturned = new GridBagConstraints();
        gbc_lblDateReturned.insets = new Insets(15, 0, 25, 5);
        gbc_lblDateReturned.gridx = 0;
        gbc_lblDateReturned.gridy = 5;
        detailPanel.add(lblDateReturned, gbc_lblDateReturned);
        
        txtDateReturned = new JTextField();
        txtDateReturned.setColumns(10);
        txtDateReturned.setFont(new Font("Verdana", Font.PLAIN, 12));
        GridBagConstraints gbc_txtDateReturned = new GridBagConstraints();
        gbc_txtDateReturned.insets = new Insets(15, 0, 25, 5);
        gbc_txtDateReturned.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtDateReturned.gridx = 1;
        gbc_txtDateReturned.gridy = 5;
        detailPanel.add(txtDateReturned, gbc_txtDateReturned);
        
        JLabel lblNote = new JLabel("Ghi chú:");
        lblNote.setFont(new Font("Verdana", Font.PLAIN, 12));
        GridBagConstraints gbc_lblNote = new GridBagConstraints();
        gbc_lblNote.anchor = GridBagConstraints.NORTH;
        gbc_lblNote.insets = new Insets(15, 0, 25, 5);
        gbc_lblNote.gridx = 0;
        gbc_lblNote.gridy = 6;
        detailPanel.add(lblNote, gbc_lblNote);
        
        TextArea txtNote = new TextArea();
        txtNote.setRows(5);
        txtNote.setFont(new Font("Verdana", Font.PLAIN, 12));
        txtNote.setColumns(1);
        GridBagConstraints gbc_txtNote = new GridBagConstraints();
        gbc_txtNote.insets = new Insets(15, 0, 25, 5);
        gbc_txtNote.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtNote.gridx = 1;
        gbc_txtNote.gridy = 6;
        detailPanel.add(txtNote, gbc_txtNote);
        
        JPanel btnPanel = new JPanel();
        btnPanel.setBorder(new LineBorder(Color.LIGHT_GRAY));      
        GridBagConstraints gbc_btnPanel = new GridBagConstraints();
        gbc_btnPanel.fill = GridBagConstraints.BOTH;
        gbc_btnPanel.insets = new Insets(5, 0, 5, 5);
        gbc_btnPanel.gridx = 1;
        gbc_btnPanel.gridy = 1;
        add(btnPanel, gbc_btnPanel);
        
        Image iconAdd = new ImageIcon("Assets/Icon/add.png").getImage();
		iconAdd = iconAdd.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		Image iconDelete = new ImageIcon("Assets/Icon/delete.png").getImage();
		iconDelete = iconDelete.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		Image iconAccept = new ImageIcon("Assets/Icon/accept.png").getImage();
		iconAccept = iconAccept.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		Image iconClear = new ImageIcon("Assets/Icon/clear.png").getImage();
		iconClear = iconClear.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnAdd = new JButton("");
		btnAdd.setIcon(new ImageIcon(iconAdd));
		btnAdd.setPreferredSize(new Dimension(60, 40));
		btnPanel.add(btnAdd);
		
		JButton btnDelete= new JButton("");
		btnDelete.setIcon(new ImageIcon(iconDelete));
		btnDelete.setPreferredSize(new Dimension(60, 40));
		btnPanel.add(btnDelete);
		
		JButton btnAccept = new JButton("");
		btnAccept.setIcon(new ImageIcon(iconAccept));
		btnAccept.setPreferredSize(new Dimension(60, 40));
		btnPanel.add(btnAccept);
		
		JButton btnClear = new JButton("");
		btnClear.setIcon(new ImageIcon(iconClear));
		btnClear.setPreferredSize(new Dimension(60, 40));
		btnPanel.add(btnClear);
	}
}
