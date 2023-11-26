package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.TextArea;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.JTextArea;

public class Product extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField productIDText;
	private JTextField productNameText;
	private JTextField productCatText;
	private JTextField productPurchaseText;
	private JTextField productPriceText;
	private JTextField productProducerText;
	private JTextField productQuantityText;
	private JTextField productImageText;
	private JTextField textField;
	private JTable productTable;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JComboBox comboBox1;
	private GridBagConstraints gbc_comboBox1;
	private JTextField textField_8;
	/**
	 * Create the panel.
	 */
	public Product() {
		Color myColor = new Color(34, 33, 75);
		Color backGroundColor = Color.white;
		Color borderColor = myColor;
		Color textColor = myColor;
		Color buttonColor = myColor;
		setBackground(backGroundColor);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		//Product Table area
		JPanel panelProductTable = new JPanel();
		panelProductTable.setBackground(backGroundColor);
		panelProductTable.setBorder(null);
		GridBagConstraints gbc_panelProductTable = new GridBagConstraints();
		gbc_panelProductTable.weighty = 0.7;
		gbc_panelProductTable.weightx = 0.7;
		gbc_panelProductTable.insets = new Insets(20, 20, 5, 10);
		gbc_panelProductTable.fill = GridBagConstraints.BOTH;
		gbc_panelProductTable.gridx = 0;
		gbc_panelProductTable.gridy = 0;
		add(panelProductTable, gbc_panelProductTable);
		GridBagLayout gbl_panelProductTable = new GridBagLayout();
		gbl_panelProductTable.columnWidths = new int[] {0, 0, 0};
		gbl_panelProductTable.rowHeights = new int[] {0, 0, 0, 0};
		gbl_panelProductTable.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panelProductTable.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelProductTable.setLayout(gbl_panelProductTable);
		
        
        
        JLabel lblNewLabel = new JLabel("Thông Tin Chung");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setForeground(textColor);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.weighty = 0.1;
        gbc_lblNewLabel.gridwidth = 2;
        gbc_lblNewLabel.weightx = 1.0;
        gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
        gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
        gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel.gridx = 0;
        gbc_lblNewLabel.gridy = 0;
        panelProductTable.add(lblNewLabel, gbc_lblNewLabel);
        
        textField_8 = new JTextField();
        textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        textField_8.setBorder(new LineBorder(borderColor, 2));
        GridBagConstraints gbc_textField_8 = new GridBagConstraints();
        gbc_textField_8.ipady = 5;
        gbc_textField_8.weighty = 0.1;
        gbc_textField_8.weightx = 0.9;
        gbc_textField_8.insets = new Insets(0, 5, 5, 5);
        gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_8.gridx = 0;
        gbc_textField_8.gridy = 1;
        panelProductTable.add(textField_8, gbc_textField_8);
        textField_8.setColumns(10);
        
        JButton btnNewButton_1 = new JButton("Tìm Kiếm");
        btnNewButton_1.setBorder(new LineBorder(borderColor, 2, true));
        btnNewButton_1.setBackground(borderColor);
        btnNewButton_1.setForeground(Color.white);
        btnNewButton_1.setFocusPainted(false);
        Image iconSearch = new ImageIcon("Assets/Icon/searching.png").getImage();
        iconSearch = iconSearch.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        btnNewButton_1.setIcon(new ImageIcon(iconSearch));
		 
        GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
        gbc_btnNewButton_1.weighty = 0.1;
        gbc_btnNewButton_1.weightx = 0.1;
        gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
        gbc_btnNewButton_1.gridx = 1;
        gbc_btnNewButton_1.gridy = 1;
        panelProductTable.add(btnNewButton_1, gbc_btnNewButton_1);
        
        GridBagConstraints gbc_scrollPaneProductTable = new GridBagConstraints();
        gbc_scrollPaneProductTable.gridwidth = 2;
        gbc_scrollPaneProductTable.weighty = 0.8;
        gbc_scrollPaneProductTable.weightx = 1.0;
        gbc_scrollPaneProductTable.insets = new Insets(0, 5, 0, 5);
        gbc_scrollPaneProductTable.fill = GridBagConstraints.BOTH;
        gbc_scrollPaneProductTable.gridx = 0;
        gbc_scrollPaneProductTable.gridy = 2;

		
	     String[] columnNames = {"STT", "Mã SP", "Tên SP", "Loại SP", "Giá Nhập", "Giá Bán", "Hãng SX", "Tồn Kho", "Hình Ảnh", "Chú Thích"};
	     Object[][] data = {
	         {"1", "SP001", "Sản phẩm 1", "Loại 1", "100", "150", "Hãng A", "50", "image1.jpg", "Mô tả sản phẩm 1"},
	         {"2", "SP002", "Sản phẩm 2", "Loại 2", "200", "250", "Hãng B", "30", "image2.jpg", "Mô tả sản phẩm 2"},
	     };
	     
	     DefaultTableModel model = new DefaultTableModel(data, columnNames) {
	            @Override
	            public boolean isCellEditable(int row, int column) {
	                return false;
	            }
	        };
        productTable = new JTable(model);	
        productTable.setBorder(new LineBorder(borderColor, 2, false));
        productTable.getTableHeader().setBorder(new LineBorder(borderColor, 2, false));
        productTable.getTableHeader().setReorderingAllowed(false);
        productTable.getTableHeader().setBackground(borderColor);
        productTable.getTableHeader().setForeground(Color.white);
        
        
        JScrollPane scrollPaneProductTable = new JScrollPane(productTable);
        scrollPaneProductTable.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        scrollPaneProductTable.setBorder(new LineBorder(borderColor, 2, false));
        scrollPaneProductTable.setBackground(backGroundColor);
        panelProductTable.add(scrollPaneProductTable, gbc_scrollPaneProductTable);
		JPanel panelProductInfo = new JPanel();
		panelProductInfo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		panelProductInfo.setBackground(backGroundColor);
		panelProductInfo.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(34, 33, 75)));
		GridBagConstraints gbc_panelProductInfo = new GridBagConstraints();
		gbc_panelProductInfo.weighty = 0.7;
		gbc_panelProductInfo.weightx = 0.3;
		gbc_panelProductInfo.insets = new Insets(20, 0, 5, 20);
		gbc_panelProductInfo.fill = GridBagConstraints.BOTH;
		gbc_panelProductInfo.gridx = 1;
		gbc_panelProductInfo.gridy = 0;
		add(panelProductInfo, gbc_panelProductInfo);
		GridBagLayout gbl_panelProductInfo = new GridBagLayout();
		gbl_panelProductInfo.columnWidths = new int[]{0, 0, 0};
		gbl_panelProductInfo.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelProductInfo.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panelProductInfo.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelProductInfo.setLayout(gbl_panelProductInfo);
		
		JLabel lblNewLabel_1 = new JLabel("Thông Tin Sản Phẩm");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setForeground(borderColor);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.weightx = 1.0;
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 10);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panelProductInfo.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mã SP:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setForeground(borderColor);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.weighty = 0.1;
		gbc_lblNewLabel_2.weightx = 0.2;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panelProductInfo.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_1.setBorder(new LineBorder(new Color(34, 33, 75), 2, true));
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.ipady = 5;
		gbc_textField_1.weighty = 0.1;
		gbc_textField_1.weightx = 0.8;
		gbc_textField_1.insets = new Insets(0, 0, 15, 10);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panelProductInfo.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tên SP:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setForeground(borderColor);
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 2;
		panelProductInfo.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_2.setForeground(textColor);
		textField_2.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.ipady = 5;
		gbc_textField_2.weighty = 0.1;
		gbc_textField_2.insets = new Insets(0, 0, 15, 10);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		panelProductInfo.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Loại SP:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setForeground(borderColor);
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 3;
		panelProductInfo.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBox.setBorder(new LineBorder(borderColor, 1, true));
		comboBox.setBackground(Color.WHITE);
		comboBox.setForeground(Color.white);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.ipady = 5;
		gbc_comboBox.weighty = 0.1;
		gbc_comboBox.insets = new Insets(0, 0, 15, 10);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		panelProductInfo.add(comboBox, gbc_comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Giá Nhập:");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_5.setForeground(textColor);
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 4;
		panelProductInfo.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_4.setForeground(textColor);
		textField_4.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.ipady = 5;
		gbc_textField_4.weighty = 0.1;
		gbc_textField_4.insets = new Insets(0, 0, 15, 10);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 4;
		panelProductInfo.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Giá Bán:");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_6.setForeground(textColor);
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 5;
		panelProductInfo.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_5.setForeground(textColor);
		textField_5.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.ipady = 5;
		gbc_textField_5.weighty = 0.1;
		gbc_textField_5.insets = new Insets(0, 0, 15, 10);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 5;
		panelProductInfo.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Hãng SX:");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_7.setForeground(textColor);
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 6;
		panelProductInfo.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_6.setForeground(textColor);
		textField_6.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.ipady = 5;
		gbc_textField_6.weighty = 0.1;
		gbc_textField_6.insets = new Insets(0, 0, 15, 10);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 6;
		panelProductInfo.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Tồn Kho:");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_8.setForeground(textColor);
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 7;
		panelProductInfo.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_7.setForeground(textColor);
		textField_7.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.ipady = 5;
		gbc_textField_7.weighty = 0.1;
		gbc_textField_7.insets = new Insets(0, 0, 15, 10);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 7;
		panelProductInfo.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("Image:");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBorder(new LineBorder(borderColor, 1, true));		
		Image imgIcon = new ImageIcon("Assets/Icon/img.png").getImage();
		imgIcon = imgIcon.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		btnNewButton.setPreferredSize(new Dimension(100, 30));
		btnNewButton.setBackground(buttonColor);
		btnNewButton.setForeground(Color.white);
		btnNewButton.setIcon(new ImageIcon(imgIcon));
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 15, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 8;
		panelProductInfo.add(btnNewButton, gbc_btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_3.setForeground(buttonColor);
		textField_3.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.ipady = 5;
		gbc_textField_3.weighty = 0.1;
		gbc_textField_3.insets = new Insets(0, 0, 15, 10);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 8;
		panelProductInfo.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Chú Thích:");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_9.setForeground(textColor);
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 9;
		panelProductInfo.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 9;
		panelProductInfo.add(scrollPane, gbc_scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		scrollPane.setViewportView(textArea);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		
		JPanel panelDisplayAndImg = new JPanel();
		panelDisplayAndImg.setBackground(backGroundColor);
		GridBagConstraints gbc_panelDisplayAndImg = new GridBagConstraints();
		gbc_panelDisplayAndImg.weightx = 0.7;
		gbc_panelDisplayAndImg.weighty = 0.3;
		gbc_panelDisplayAndImg.insets = new Insets(0, 0, 0, 5);
		gbc_panelDisplayAndImg.fill = GridBagConstraints.BOTH;
		gbc_panelDisplayAndImg.gridx = 0;
		gbc_panelDisplayAndImg.gridy = 1;
		add(panelDisplayAndImg, gbc_panelDisplayAndImg);
		GridBagLayout gbl_panelDisplayAndImg = new GridBagLayout();
		gbl_panelDisplayAndImg.columnWidths = new int[]{0, 0, 0};
		gbl_panelDisplayAndImg.rowHeights = new int[]{0, 0};
		gbl_panelDisplayAndImg.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panelDisplayAndImg.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelDisplayAndImg.setLayout(gbl_panelDisplayAndImg);
		
		JButton btnNewButton_2 = new JButton("Hiển Thị Sản Phẩm Đã Xóa");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setBorder(new LineBorder(borderColor, 2, true));
		btnNewButton_2.setBackground(buttonColor);
		btnNewButton_2.setForeground(Color.white);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weighty = 1.0;
		gbc_panel.weightx = 0.5;
		gbc_panel.insets = new Insets(0, 25, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		panelDisplayAndImg.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_10 = new JLabel("Hình Ảnh");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_10.setForeground(buttonColor);
		lblNewLabel_10.setBackground(backGroundColor);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.weightx = 1.0;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_10.gridx = 0;
		gbc_lblNewLabel_10.gridy = 0;
		panel.add(lblNewLabel_10, gbc_lblNewLabel_10);
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.weighty = 1.0;
		gbc_btnNewButton_2.ipady = 10;
		gbc_btnNewButton_2.insets = new Insets(10, 0, 0, 0);
		gbc_btnNewButton_2.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton_2.weightx = 0.5;
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 0;
		panelDisplayAndImg.add(btnNewButton_2, gbc_btnNewButton_2);
		
		//Panel feature area
		JPanel panelFeature = new JPanel();
		panelFeature.setBackground(backGroundColor);
		FlowLayout flowLayout = (FlowLayout) panelFeature.getLayout();
		flowLayout.setVgap(10);
		flowLayout.setHgap(10);
		panelFeature.setBorder(null);
		GridBagConstraints gbc_panelFeature = new GridBagConstraints();
		gbc_panelFeature.fill = GridBagConstraints.BOTH;
		gbc_panelFeature.weighty = 0.3;
		gbc_panelFeature.weightx = 0.3;
		gbc_panelFeature.insets = new Insets(0, 0, 50, 20);
		gbc_panelFeature.gridx = 1;
		gbc_panelFeature.gridy = 1;
		add(panelFeature, gbc_panelFeature);
		
		JButton addProductBtn = new JButton();
		addProductBtn.setFont(new Font("Times New Roman", Font.BOLD, 12));
		addProductBtn.setBorder(new LineBorder(borderColor, 2, true));
		addProductBtn.setText("Thêm");
		Image iconAdd = new ImageIcon("Assets/Icon/add.png").getImage();
		iconAdd = iconAdd.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		addProductBtn.setPreferredSize(new Dimension(100, 40));
		addProductBtn.setBackground(buttonColor);
		addProductBtn.setForeground(Color.white);
		addProductBtn.setFocusPainted(false);
		addProductBtn.setIcon(new ImageIcon(iconAdd));
		panelFeature.add(addProductBtn);
     
     
		JButton editProductBtn = new JButton();
		editProductBtn.setFont(new Font("Times New Roman", Font.BOLD, 12));
		editProductBtn.setBorder(new LineBorder(borderColor, 2, true));
		editProductBtn.setText("Sửa");
     	Image iconEdit = new ImageIcon("Assets/Icon/edit.png").getImage();
     	iconEdit = iconEdit.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
     	editProductBtn.setPreferredSize(new Dimension(100, 40));
     	editProductBtn.setBackground(buttonColor);
     	editProductBtn.setForeground(Color.white);
		editProductBtn.setFocusPainted(false);
		editProductBtn.setIcon(new ImageIcon(iconEdit));
     	panelFeature.add(editProductBtn);
     
     	JButton deleteProductBtn = new JButton();
     	deleteProductBtn.setFont(new Font("Times New Roman", Font.BOLD, 12));
     	deleteProductBtn.setBorder(new LineBorder(borderColor, 2, true));
     	deleteProductBtn.setText("Xóa");
     	Image iconDelete = new ImageIcon("Assets/Icon/delete.png").getImage();
     	iconDelete = iconDelete.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
     	deleteProductBtn.setPreferredSize(new Dimension(100, 40));
     	deleteProductBtn.setBackground(buttonColor);
     	deleteProductBtn.setForeground(Color.white);
     	deleteProductBtn.setFocusPainted(false);
     	deleteProductBtn.setIcon(new ImageIcon(iconDelete));
     	panelFeature.add(deleteProductBtn);
     
     	JButton refreshProductBtn = new JButton();
     	refreshProductBtn.setFont(new Font("Times New Roman", Font.BOLD, 12));
     	refreshProductBtn.setBorder(new LineBorder(borderColor, 2, true));
     	refreshProductBtn.setText("Mới");
     	Image iconRefresh = new ImageIcon("Assets/Icon/clear.png").getImage();
     	iconRefresh = iconRefresh.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		refreshProductBtn.setPreferredSize(new Dimension(100, 40));
		refreshProductBtn.setBackground(buttonColor);
		refreshProductBtn.setForeground(Color.white);
		refreshProductBtn.setFocusPainted(false);
		refreshProductBtn.setIcon(new ImageIcon(iconRefresh));
     	panelFeature.add(refreshProductBtn);

	}

}
