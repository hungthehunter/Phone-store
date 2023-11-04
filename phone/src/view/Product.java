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
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		//Product Table area
		JPanel panelProductTable = new JPanel();
		panelProductTable.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_panelProductTable = new GridBagConstraints();
		gbc_panelProductTable.gridheight = 2;
		gbc_panelProductTable.weighty = 2.0;
		gbc_panelProductTable.weightx = 2.0;
		gbc_panelProductTable.insets = new Insets(20, 20, 0, 5);
		gbc_panelProductTable.fill = GridBagConstraints.BOTH;
		gbc_panelProductTable.gridx = 0;
		gbc_panelProductTable.gridy = 0;
		add(panelProductTable, gbc_panelProductTable);
		GridBagLayout gbl_panelProductTable = new GridBagLayout();
		gbl_panelProductTable.columnWidths = new int[]{513, 0, 0};
		gbl_panelProductTable.rowHeights = new int[]{14, 0, 664, 0};
		gbl_panelProductTable.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panelProductTable.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelProductTable.setLayout(gbl_panelProductTable);
		
        
        
        JLabel lblNewLabel = new JLabel("Thông Tin Chung");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
        gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
        gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel.gridx = 0;
        gbc_lblNewLabel.gridy = 0;
        panelProductTable.add(lblNewLabel, gbc_lblNewLabel);
        
        textField_8 = new JTextField();
        GridBagConstraints gbc_textField_8 = new GridBagConstraints();
        gbc_textField_8.insets = new Insets(0, 0, 5, 5);
        gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_8.gridx = 0;
        gbc_textField_8.gridy = 1;
        panelProductTable.add(textField_8, gbc_textField_8);
        textField_8.setColumns(10);
        
        JButton btnNewButton_1 = new JButton("Tìm Kiếm");
        GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
        gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
        gbc_btnNewButton_1.gridx = 1;
        gbc_btnNewButton_1.gridy = 1;
        panelProductTable.add(btnNewButton_1, gbc_btnNewButton_1);
        
        GridBagConstraints gbc_scrollPaneProductTable = new GridBagConstraints();
        gbc_scrollPaneProductTable.weighty = 1.0;
        gbc_scrollPaneProductTable.weightx = 1.0;
        gbc_scrollPaneProductTable.gridwidth = 2;
        gbc_scrollPaneProductTable.insets = new Insets(0, 0, 0, 5);
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
        productTable.getTableHeader().setReorderingAllowed(false);
        JScrollPane scrollPaneProductTable = new JScrollPane(productTable);
        panelProductTable.add(scrollPaneProductTable, gbc_scrollPaneProductTable);
		JPanel panelProductInfo = new JPanel();
		panelProductInfo.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_panelProductInfo = new GridBagConstraints();
		gbc_panelProductInfo.weighty = 1.0;
		gbc_panelProductInfo.weightx = 1.0;
		gbc_panelProductInfo.insets = new Insets(20, 0, 5, 20);
		gbc_panelProductInfo.fill = GridBagConstraints.BOTH;
		gbc_panelProductInfo.gridx = 1;
		gbc_panelProductInfo.gridy = 0;
		add(panelProductInfo, gbc_panelProductInfo);
		GridBagLayout gbl_panelProductInfo = new GridBagLayout();
		gbl_panelProductInfo.columnWidths = new int[]{0, 0, 0};
		gbl_panelProductInfo.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelProductInfo.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panelProductInfo.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelProductInfo.setLayout(gbl_panelProductInfo);
		
		JLabel lblNewLabel_1 = new JLabel("Thông Tin Sản Phẩm");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 10);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panelProductInfo.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mã SP:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panelProductInfo.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 15, 10);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panelProductInfo.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tên SP:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 2;
		panelProductInfo.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 15, 10);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		panelProductInfo.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Loại SP:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 3;
		panelProductInfo.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 15, 10);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		panelProductInfo.add(comboBox, gbc_comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Giá Nhập:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 4;
		panelProductInfo.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 15, 10);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 4;
		panelProductInfo.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Giá Bán:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 5;
		panelProductInfo.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 15, 10);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 5;
		panelProductInfo.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Hãng SX:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 6;
		panelProductInfo.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 15, 10);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 6;
		panelProductInfo.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Tồn Kho:");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 7;
		panelProductInfo.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 15, 10);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 7;
		panelProductInfo.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("Image:");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 15, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 8;
		panelProductInfo.add(btnNewButton, gbc_btnNewButton);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 15, 10);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 8;
		panelProductInfo.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Hình ảnh");
		lblNewLabel_10.setBackground(Color.ORANGE);
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.gridwidth = 2;
		gbc_lblNewLabel_10.ipady = 50;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_10.gridx = 0;
		gbc_lblNewLabel_10.gridy = 9;
		panelProductInfo.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("Chú Thích:");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 10;
		panelProductInfo.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		TextArea textArea = new TextArea();
		textArea.setRows(5);
		textArea.setColumns(1);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 10, 10);
		gbc_textArea.fill = GridBagConstraints.HORIZONTAL;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 10;
		panelProductInfo.add(textArea, gbc_textArea);
		
		//Panel feature area
		JPanel panelFeature = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelFeature.getLayout();
		flowLayout.setHgap(10);
		panelFeature.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_panelFeature = new GridBagConstraints();
		gbc_panelFeature.insets = new Insets(0, 0, 0, 20);
		gbc_panelFeature.anchor = GridBagConstraints.NORTH;
		gbc_panelFeature.weighty = 1.0;
		gbc_panelFeature.weightx = 1.0;
		gbc_panelFeature.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelFeature.gridx = 1;
		gbc_panelFeature.gridy = 1;
		add(panelFeature, gbc_panelFeature);
		
		JButton addProductBtn = new JButton();
		Image iconAdd = new ImageIcon("Assets/Icon/add.png").getImage();
		iconAdd = iconAdd.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		addProductBtn.setPreferredSize(new Dimension(60, 40));
		addProductBtn.setIcon(new ImageIcon(iconAdd));
		panelFeature.add(addProductBtn);
     
     
		JButton editProductBtn = new JButton();
     	Image iconEdit = new ImageIcon("Assets/Icon/edit.png").getImage();
     	iconEdit = iconEdit.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
     	editProductBtn.setPreferredSize(new Dimension(60, 40));
     	editProductBtn.setIcon(new ImageIcon(iconEdit));
     	panelFeature.add(editProductBtn);
     
     	JButton deleteProductBtn = new JButton();
     	Image iconDelete = new ImageIcon("Assets/Icon/delete.png").getImage();
     	iconDelete = iconDelete.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
     	deleteProductBtn.setPreferredSize(new Dimension(60, 40));
     	deleteProductBtn.setIcon(new ImageIcon(iconDelete));
     	panelFeature.add(deleteProductBtn);
     
     	JButton refreshProductBtn = new JButton();
     	Image iconRefresh = new ImageIcon("Assets/Icon/clear.png").getImage();
     	iconRefresh = iconRefresh.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		refreshProductBtn.setPreferredSize(new Dimension(60, 40));
		refreshProductBtn.setIcon(new ImageIcon(iconRefresh));
     	panelFeature.add(refreshProductBtn);

	}

}
