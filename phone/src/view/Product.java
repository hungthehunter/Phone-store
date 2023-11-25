package view;

import java.awt.Color;
import java.awt.Desktop;
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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import bus.CategoryBUS;
import bus.ProductBUS;
import dao.CategoryDAO;
import dao.ProductDAO;
import dto.CategoryDTO;
import dto.ProductDTO;
import service.ExcelExporter;
import service.Formater;
import service.Validation;
import view.component.InputImage;

public class Product extends JPanel implements MouseListener, KeyListener{

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
	private JTextField productIdTxt;
	private JTextField productNameTxt;
	private JComboBox categoryNameTxt;
	private JTextField purchasePriceTxt;
	private JTextField sellingPriceTxt;
	private JSpinner quantityTxt;
	private JTextField imgUrlTxt;
	private JTextArea descripTxt;
	private JComboBox comboBox1;
	private JLabel labelImgName, labelImg;
	private GridBagConstraints gbc_comboBox1;
	private JTextField findTxt;
	private DefaultTableModel productModel;
	private JButton addProductBtn ,editProductBtn ,deleteProductBtn ,refreshProductBtn, imgBtn;
	private String url_img;

	
	ProductBUS productBUS = new ProductBUS();
	ArrayList<ProductDTO> listProduct = productBUS.getALL();
//	ArrayList<ProductDTO> listProductDelete = productBUS.getALLDeleted();

	CategoryBUS categoryBUS = new CategoryBUS();
	ArrayList<CategoryDTO> listCategory = categoryBUS.getALL();
	
	private JPanel panel_1;
	private JButton restoreBtn;
	private JButton restoreListBtn;
	private JButton btnXutExcel;
	private JButton btnXutExcel_1;
	/**
	 * Create the panel.
	 */
	public Product() {
		initComponent();
		loadDataTable(listProduct);

	}
	
	public void initComponent() {
		Color myColor = new Color(34, 33, 75);
		Color backGroundColor = Color.white;
		Color borderColor = myColor;
		Color textColor = myColor;
		Color buttonColor = myColor;
		setBackground(backGroundColor);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {700, 300};
		gridBagLayout.rowHeights = new int[] {600, 400};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0};
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
		gbl_panelProductTable.columnWidths = new int[] {0, 0, 0, 0};
		gbl_panelProductTable.rowHeights = new int[] {0, 0, 0, 0};
		gbl_panelProductTable.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelProductTable.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelProductTable.setLayout(gbl_panelProductTable);
		
        
        
        JLabel lblNewLabel = new JLabel("Thông Tin Chung");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setForeground(textColor);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.gridwidth = 3;
        gbc_lblNewLabel.weightx = 1.0;
        gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
        gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
        gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel.gridx = 0;
        gbc_lblNewLabel.gridy = 0;
        panelProductTable.add(lblNewLabel, gbc_lblNewLabel);
        
        findTxt = new JTextField();
        findTxt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        findTxt.setBorder(new LineBorder(borderColor, 2));
        findTxt.addKeyListener(this);
        GridBagConstraints gbc_findTxt = new GridBagConstraints();
        gbc_findTxt.ipady = 5;
        gbc_findTxt.weighty = 0.1;
        gbc_findTxt.weightx = 0.8;
        gbc_findTxt.insets = new Insets(0, 5, 5, 5);
        gbc_findTxt.fill = GridBagConstraints.HORIZONTAL;
        gbc_findTxt.gridx = 0;
        gbc_findTxt.gridy = 1;
        panelProductTable.add(findTxt, gbc_findTxt);
        findTxt.setColumns(10);

        Image iconExcel = new ImageIcon("Assets/Icon/excel.png").getImage();
        iconExcel = iconExcel.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        
        GridBagConstraints gbc_scrollPaneProductTable = new GridBagConstraints();
        gbc_scrollPaneProductTable.gridwidth = 3;
        gbc_scrollPaneProductTable.weighty = 0.8;
        gbc_scrollPaneProductTable.weightx = 1.0;
        gbc_scrollPaneProductTable.insets = new Insets(0, 5, 0, 0);
        gbc_scrollPaneProductTable.fill = GridBagConstraints.BOTH;
        gbc_scrollPaneProductTable.gridx = 0;
        gbc_scrollPaneProductTable.gridy = 2;

		
	     String[] columnNames = {"Mã SP", "Tên SP", "Loại SP", "Giá Nhập", "Giá Bán", "Tồn Kho", "Url", "Chú Thích"};
	     Object[][] data = {
	    		 
	     };
	     
	     productModel = new DefaultTableModel(data, columnNames) {
//	            @Override
	            public boolean isCellEditable(int row, int column) {
	                return false;
	            }
	        };
        productModel.setColumnIdentifiers(columnNames);
        productTable = new JTable(productModel);	
        productTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        productTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        productTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        productTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        productTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        productTable.getColumnModel().getColumn(5).setPreferredWidth(50);

        productTable.addMouseListener(this);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        TableColumnModel columnModel = productTable.getColumnModel();
        columnModel.getColumn(0).setCellRenderer(centerRenderer);
        columnModel.getColumn(1).setCellRenderer(centerRenderer);
        columnModel.getColumn(2).setCellRenderer(centerRenderer);
        columnModel.getColumn(3).setCellRenderer(centerRenderer);
        columnModel.getColumn(4).setCellRenderer(centerRenderer);
        columnModel.getColumn(5).setCellRenderer(centerRenderer);
        columnModel.getColumn(6).setCellRenderer(centerRenderer);
        columnModel.getColumn(7).setCellRenderer(centerRenderer);
        
//        columnModel.getColumn(1).setCellRenderer(centerRenderer);
        productTable.setBorder(new LineBorder(borderColor, 2, false));
        productTable.getTableHeader().setBorder(new LineBorder(borderColor, 2, false));
        productTable.getTableHeader().setReorderingAllowed(false);
        productTable.getTableHeader().setBackground(borderColor);
        productTable.getTableHeader().setForeground(Color.white);
        
        btnXutExcel = new JButton("Xuất Excel");
//        Image iconExcel = new ImageIcon("Assets/Icon/excel.png").getImage();
        iconExcel = iconExcel.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        btnXutExcel.setIcon(new ImageIcon(iconExcel));
        btnXutExcel.setForeground(Color.WHITE);
        btnXutExcel.setFocusPainted(false);
        btnXutExcel.setBackground(new Color(34, 33, 75));
        btnXutExcel.addMouseListener(this);
        
        btnXutExcel_1 = new JButton("Nhập Excel");
        btnXutExcel_1.setForeground(Color.WHITE);
        btnXutExcel_1.setFocusPainted(false);
        btnXutExcel_1.setBackground(new Color(34, 33, 75));
        btnXutExcel_1.setIcon(new ImageIcon(iconExcel));
        GridBagConstraints gbc_btnXutExcel_1 = new GridBagConstraints();
        gbc_btnXutExcel_1.insets = new Insets(0, 0, 5, 5);
        gbc_btnXutExcel_1.gridx = 1;
        gbc_btnXutExcel_1.gridy = 1;
        panelProductTable.add(btnXutExcel_1, gbc_btnXutExcel_1);
        GridBagConstraints gbc_btnXutExcel = new GridBagConstraints();
        gbc_btnXutExcel.weighty = 0.1;
        gbc_btnXutExcel.insets = new Insets(0, 0, 5, 0);
        gbc_btnXutExcel.gridx = 2;
        gbc_btnXutExcel.gridy = 1;
        panelProductTable.add(btnXutExcel, gbc_btnXutExcel);
        
        
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
		
		productIdTxt = new JTextField();
		productIdTxt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		productIdTxt.setBorder(new LineBorder(new Color(34, 33, 75), 2, true));
		productIdTxt.setEditable(false);
		productIdTxt.setFocusable(false);
		GridBagConstraints gbc_productIdTxt = new GridBagConstraints();
		gbc_productIdTxt.ipady = 5;
		gbc_productIdTxt.weighty = 0.1;
		gbc_productIdTxt.weightx = 0.8;
		gbc_productIdTxt.insets = new Insets(0, 0, 15, 10);
		gbc_productIdTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_productIdTxt.gridx = 1;
		gbc_productIdTxt.gridy = 1;
		panelProductInfo.add(productIdTxt, gbc_productIdTxt);
		productIdTxt.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tên SP:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setForeground(borderColor);
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 2;
		panelProductInfo.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		productNameTxt = new JTextField();
		productNameTxt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		productNameTxt.setForeground(textColor);
		productNameTxt.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_productNameTxt = new GridBagConstraints();
		gbc_productNameTxt.ipady = 5;
		gbc_productNameTxt.weighty = 0.1;
		gbc_productNameTxt.insets = new Insets(0, 0, 15, 10);
		gbc_productNameTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_productNameTxt.gridx = 1;
		gbc_productNameTxt.gridy = 2;
		panelProductInfo.add(productNameTxt, gbc_productNameTxt);
		productNameTxt.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Loại SP:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setForeground(borderColor);
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 3;
		panelProductInfo.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		categoryNameTxt = new JComboBox();
		for (CategoryDTO category : listCategory) {
			categoryNameTxt.addItem(category.getCategoryName());
		}
		categoryNameTxt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		categoryNameTxt.setBorder(new LineBorder(borderColor, 1, true));
		categoryNameTxt.setBackground(Color.WHITE);
		categoryNameTxt.setForeground(textColor);
		
		
		GridBagConstraints gbc_categoryTxt = new GridBagConstraints();
		gbc_categoryTxt.ipady = 5;
		gbc_categoryTxt.weighty = 0.1;
		gbc_categoryTxt.insets = new Insets(0, 0, 15, 10);
		gbc_categoryTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_categoryTxt.gridx = 1;
		gbc_categoryTxt.gridy = 3;
		panelProductInfo.add(categoryNameTxt, gbc_categoryTxt);
		
		JLabel lblNewLabel_5 = new JLabel("Giá Nhập:");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_5.setForeground(textColor);
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 4;
		panelProductInfo.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		purchasePriceTxt = new JTextField();
		purchasePriceTxt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		purchasePriceTxt.setForeground(textColor);
		purchasePriceTxt.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_purchasePriceTxt = new GridBagConstraints();
		gbc_purchasePriceTxt.ipady = 5;
		gbc_purchasePriceTxt.weighty = 0.1;
		gbc_purchasePriceTxt.insets = new Insets(0, 0, 15, 10);
		gbc_purchasePriceTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_purchasePriceTxt.gridx = 1;
		gbc_purchasePriceTxt.gridy = 4;
		panelProductInfo.add(purchasePriceTxt, gbc_purchasePriceTxt);
		purchasePriceTxt.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Giá Bán:");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_6.setForeground(textColor);
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 5;
		panelProductInfo.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		sellingPriceTxt = new JTextField();
		sellingPriceTxt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		sellingPriceTxt.setForeground(textColor);
		sellingPriceTxt.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_sellingPriceTxt = new GridBagConstraints();
		gbc_sellingPriceTxt.ipady = 5;
		gbc_sellingPriceTxt.weighty = 0.1;
		gbc_sellingPriceTxt.insets = new Insets(0, 0, 15, 10);
		gbc_sellingPriceTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_sellingPriceTxt.gridx = 1;
		gbc_sellingPriceTxt.gridy = 5;
		panelProductInfo.add(sellingPriceTxt, gbc_sellingPriceTxt);
		sellingPriceTxt.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Tồn Kho:");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_8.setForeground(textColor);
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 15, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 7;
		panelProductInfo.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		imgBtn = new JButton("Image:");
		imgBtn.addMouseListener(this);
		imgBtn.setFont(new Font("Times New Roman", Font.BOLD, 12));
		imgBtn.setBorder(new LineBorder(borderColor, 1, true));		
		Image imgIcon = new ImageIcon("Assets/Icon/img.png").getImage();
		imgIcon = imgIcon.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		imgBtn.setPreferredSize(new Dimension(100, 30));
		imgBtn.setBackground(buttonColor);
		imgBtn.setForeground(Color.white);
		imgBtn.setIcon(new ImageIcon(imgIcon));
		
		
		quantityTxt = new JSpinner();
		quantityTxt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		quantityTxt.setBorder(new LineBorder(borderColor, 2, true));
		quantityTxt.setForeground(textColor);
		quantityTxt.setAlignmentX(LEFT_ALIGNMENT);
		GridBagConstraints gbc_quantity = new GridBagConstraints();
		gbc_quantity.ipady = 5;
		gbc_quantity.ipadx = 60;
		gbc_quantity.anchor = GridBagConstraints.WEST;
		gbc_quantity.insets = new Insets(0, 0, 5, 0);
		gbc_quantity.gridx = 1;
		gbc_quantity.gridy = 7;
		panelProductInfo.add(quantityTxt, gbc_quantity);
		GridBagConstraints gbc_imgBtn = new GridBagConstraints();
		gbc_imgBtn.insets = new Insets(0, 0, 15, 5);
		gbc_imgBtn.gridx = 0;
		gbc_imgBtn.gridy = 8;
		panelProductInfo.add(imgBtn, gbc_imgBtn);
		
		imgUrlTxt = new JTextField();
		imgUrlTxt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		imgUrlTxt.setForeground(buttonColor);
		imgUrlTxt.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_imgUrlTxt = new GridBagConstraints();
		gbc_imgUrlTxt.ipady = 5;
		gbc_imgUrlTxt.weighty = 0.1;
		gbc_imgUrlTxt.insets = new Insets(0, 0, 15, 10);
		gbc_imgUrlTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_imgUrlTxt.gridx = 1;
		gbc_imgUrlTxt.gridy = 8;
		panelProductInfo.add(imgUrlTxt, gbc_imgUrlTxt);
		imgUrlTxt.setColumns(10);
		
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
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 9;
		panelProductInfo.add(scrollPane, gbc_scrollPane);
		
		descripTxt = new JTextArea();
		descripTxt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		scrollPane.setViewportView(descripTxt);
		descripTxt.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		
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
		gbl_panelDisplayAndImg.columnWidths = new int[] {300, 100};
		gbl_panelDisplayAndImg.rowHeights = new int[]{0, 0};
		gbl_panelDisplayAndImg.columnWeights = new double[]{1.0, 1.0};
		gbl_panelDisplayAndImg.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelDisplayAndImg.setLayout(gbl_panelDisplayAndImg);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weighty = 1.0;
		gbc_panel.weightx = 0.5;
		gbc_panel.insets = new Insets(0, 25, 0, 5);
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
		
		labelImgName = new JLabel("Hình Ảnh");
		labelImgName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		labelImgName.setForeground(buttonColor);
		labelImgName.setBackground(backGroundColor);
		labelImgName.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_labelImgName = new GridBagConstraints();
		gbc_labelImgName.weighty = 0.1;
		gbc_labelImgName.weightx = 1.0;
		gbc_labelImgName.insets = new Insets(0, 0, 5, 0);
		gbc_labelImgName.gridx = 0;
		gbc_labelImgName.gridy = 0;
		panel.add(labelImgName, gbc_labelImgName);
		
		labelImg = new JLabel("");
		GridBagConstraints gbc_labelImg = new GridBagConstraints();
		gbc_labelImg.weighty = 0.9;
		gbc_labelImg.weightx = 1.0;
		gbc_labelImg.gridx = 0;
		gbc_labelImg.gridy = 1;
		panel.add(labelImg, gbc_labelImg);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		panelDisplayAndImg.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{100, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		restoreListBtn = new JButton("Hiển Thị Sản Phẩm Đã Xóa");
		restoreListBtn.setPreferredSize(new Dimension(200, 40));
		restoreListBtn.setForeground(Color.WHITE);
		restoreListBtn.setFont(new Font("Times New Roman", Font.BOLD, 12));
		restoreListBtn.setFocusPainted(false);
		restoreListBtn.setBackground(new Color(34, 33, 75));
		restoreListBtn.addMouseListener(this);
		GridBagConstraints gbc_restoreListBtn = new GridBagConstraints();
		gbc_restoreListBtn.weighty = 0.5;
		gbc_restoreListBtn.weightx = 1.0;
		gbc_restoreListBtn.insets = new Insets(0, 0, 5, 0);
		gbc_restoreListBtn.gridx = 0;
		gbc_restoreListBtn.gridy = 0;
		panel_1.add(restoreListBtn, gbc_restoreListBtn);
		
		restoreBtn = new JButton("Khôi Phục");
		restoreBtn.setPreferredSize(new Dimension(100, 40));
		restoreBtn.setForeground(Color.WHITE);
		restoreBtn.setFont(new Font("Times New Roman", Font.BOLD, 12));
		restoreBtn.setFocusPainted(false);
		restoreBtn.setBackground(new Color(34, 33, 75));
		restoreBtn.addMouseListener(this);
		GridBagConstraints gbc_restoreBtn = new GridBagConstraints();
		gbc_restoreBtn.weighty = 0.5;
		gbc_restoreBtn.insets = new Insets(0, 0, 100, 0);
		gbc_restoreBtn.weightx = 1.0;
		gbc_restoreBtn.gridx = 0;
		gbc_restoreBtn.gridy = 1;
		panel_1.add(restoreBtn, gbc_restoreBtn);
		
		//Panel feature area
		JPanel panelFeature = new JPanel();
		panelFeature.setBackground(backGroundColor);
		FlowLayout flowLayout = (FlowLayout) panelFeature.getLayout();
		flowLayout.setVgap(10);
		flowLayout.setHgap(20);
		panelFeature.setBorder(null);
		GridBagConstraints gbc_panelFeature = new GridBagConstraints();
		gbc_panelFeature.fill = GridBagConstraints.BOTH;
		gbc_panelFeature.weighty = 0.3;
		gbc_panelFeature.weightx = 0.3;
		gbc_panelFeature.insets = new Insets(0, 0, 0, 20);
		gbc_panelFeature.gridx = 1;
		gbc_panelFeature.gridy = 1;
		add(panelFeature, gbc_panelFeature);
		
		addProductBtn = new JButton();
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
		addProductBtn.addMouseListener(this);
		panelFeature.add(addProductBtn);
     
     
		editProductBtn = new JButton();
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
		editProductBtn.addMouseListener(this);
     	panelFeature.add(editProductBtn);
     
     	deleteProductBtn = new JButton();
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
     	deleteProductBtn.addMouseListener(this);
     	panelFeature.add(deleteProductBtn);
     
     	refreshProductBtn = new JButton();
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
		refreshProductBtn.addMouseListener(this);
     	panelFeature.add(refreshProductBtn);
	}

	public void loadDataTable(ArrayList<ProductDTO> result) {
		productModel.setRowCount(0);	
		for (ProductDTO p : result) {
			productModel.addRow(new Object[] {
					p.getProductId(), p.getProductName(), p.getCategoryName(), Formater.FormatVND(p.getPurchasePrice()), Formater.FormatVND((p.getSellingPrice())), p.getQuantity(), p.getImgURL(), p.getDescription()
			});
		}
		
	}
	
	  public int getRowSelected() {
	        int index = productTable.getSelectedRow();
	        if (index == -1) {
	            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm!");
	        }
	        return index;
	 }
	  
	
	public void resetForm() {
//		productIDText.setText("");
        productNameTxt.setText("");
        purchasePriceTxt.setText("");
        sellingPriceTxt.setText("");
        quantityTxt.setValue(0);
        imgUrlTxt.setText("");
        descripTxt.setText("");
	}
	
	public ProductDTO getProductInfo(int id) {
		ProductDTO product = new ProductDTO();
		int productId = id;
		String productName = productNameTxt.getText().trim();                
		String categoryName = (String) categoryNameTxt.getSelectedItem();
		double purchasePrice = Double.parseDouble(purchasePriceTxt.getText());
	    double sellingPrice = Double.parseDouble(sellingPriceTxt.getText());
		int quantity = (Integer) quantityTxt.getValue();
		String imgURL = addImageToFolder(imgUrlTxt.getText());
		String description = descripTxt.getText().trim();
		if (productBUS.checkDup(productName, productId)) {
			product = new ProductDTO(productId, productName, categoryName, purchasePrice, sellingPrice, quantity, imgURL, description);			
			return product;
		} else {
            JOptionPane.showMessageDialog(this, "Tên sản phẩm đã tồn tại !");
		}
		return product;
	}
	
	private int getId(boolean isCreate) {
		int id = ProductDAO.getInstance().getAutoIncrement();
		if (!isCreate) {
	        id = getRowSelected();	        	      
		}
		return id;
	}
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == addProductBtn) {
            addProduct();
        } else if (e.getSource() == deleteProductBtn) {
            deleteProduct();
        } else if (e.getSource() == editProductBtn) {
            editProduct();
        } else if (e.getSource() == productTable) {
            displaySelectedProduct();
        } else if (e.getSource() == refreshProductBtn) {
            refreshProducts();
        } else if (e.getSource() == imgBtn) {
        	addImg();
        } else if (e.getSource() == restoreListBtn) {
        	restoreList();
        } else if (e.getSource() == restoreBtn) {
        	restore();
        } else if (e.getSource() == btnXutExcel) {
        	exportExcel();
        
        }
    }
    
    
    
    private void exportExcel() {
    	try {
    		ExcelExporter excel = new ExcelExporter();
        	excel.exportJTableToExcel(productTable);
		} catch (Exception e2) {
            JOptionPane.showMessageDialog(this, "Lỗi Xuất Excel !");
		}
    }

    private void addProduct() {
    	int index = getId(true);
        productBUS.add(getProductInfo(ProductDAO.getInstance().getAutoIncrement()));
        loadDataTable(listProduct);
        resetForm();
    }

    private void deleteProduct() {
    	int index = getId(false);
    	productBUS.delete(listProduct.get(getRowSelected()));
        loadDataTable(listProduct);
    	resetForm();
    }

    private void editProduct() {
    	int index = getId(false);
        int id = CategoryDAO.getInstance().getAutoIncrement();                    
        productBUS.update(getProductInfo(listProduct.get(id).getProductId()));
        loadDataTable(listProduct);
        resetForm();
    }
    
    private void refreshProducts() {
    	System.out.println("aahello");
    	listProduct = productBUS.getALL();
    	loadDataTable(listProduct);
    	resetForm();
    }
    
    private void restore() {
    	int index = getId(false);
    	System.out.println(listProduct.get(index).getProductId());
        productBUS.restore(getProductInfo(listProduct.get(index).getProductId()));
        listProduct = productBUS.getALLDeleted();
        loadDataTable(listProduct);
        resetForm();
    }
    
    private void restoreList() {
    	listProduct = productBUS.getALLDeleted();
    	loadDataTable(listProduct);
    }
    
    public String addImageToFolder(String urlImg) {
        Random randomGenerator = new Random();
        int ram = randomGenerator.nextInt(1000);
        File sourceFile = new File(urlImg);
        String destPath = "./Assets/Products";
        File destFolder = new File(destPath);
        String newName = ram + sourceFile.getName();        
        try {
            Path dest = Paths.get(destFolder.getPath(), newName);
            Files.copy(sourceFile.toPath(), dest);
        } catch (IOException e) {
        }
        return newName;
    }
    
    private void addImg() {
        JFileChooser jfc;
        jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG and  GIF images", "png", "gif", "jpg", "jpeg");
        jfc.addChoosableFileFilter(filter);
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            this.url_img = (String) jfc.getSelectedFile().getPath();
            File file = jfc.getSelectedFile();
            Image imgicon = new ImageIcon(String.valueOf(jfc.getSelectedFile())).getImage();
            BufferedImage b;
            try {
                b = ImageIO.read(file);
                imgicon = new ImageIcon(imgicon).getImage();
                imgicon = imgicon.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
                labelImg.setText("");
                labelImg.setIcon(new ImageIcon(imgicon));
                imgUrlTxt.setText(this.url_img);
            } catch (IOException ex) {
                Logger.getLogger(InputImage.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    
    public void setUrl_img(String url_img) {
        Image imgicon = new ImageIcon("./Assets/Products/" + url_img).getImage();
        imgicon = new ImageIcon(imgicon).getImage();
        imgicon = imgicon.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        labelImg.setIcon(new ImageIcon(imgicon));
        labelImg.setText("");
        this.url_img = url_img;
    }
    
    private void validateForm() {
        if (Validation.isEmpty(productNameTxt.getText())) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên sản phẩm mới");
        }  
        if (Validation.isEmpty(purchasePriceTxt.getText())) {
            purchasePriceTxt.setText("0");
        }
        if (Validation.isEmpty(sellingPriceTxt.getText())) {
            sellingPriceTxt.setText("0");
        }
    }

    private void displaySelectedProduct() {
        int index = productTable.getSelectedRow();
        productIdTxt.setText(String.valueOf(listProduct.get(index).getProductId()));
        productNameTxt.setText(listProduct.get(index).getProductName());
        purchasePriceTxt.setText(String.valueOf(listProduct.get(index).getPurchasePrice()));
        sellingPriceTxt.setText(String.valueOf(listProduct.get(index).getSellingPrice()));
        quantityTxt.setValue(listProduct.get(index).getQuantity());
        imgUrlTxt.setText(listProduct.get(index).getImgURL());
        setUrl_img(listProduct.get(index).getImgURL());        
        descripTxt.setText(listProduct.get(index).getDescription());    
    }

    
	public void filterTable(String searchText) {
	    searchText = searchText.toLowerCase();
	    ArrayList<ProductDTO> filteredList = new ArrayList<>();

	    for (ProductDTO p : listProduct) {
	        if (p.getProductName().toLowerCase().contains(searchText) || String.valueOf(p.getProductId()).toLowerCase().contains(searchText)) {
	            filteredList.add(p);
	        }
	    }

	    loadDataTable(filteredList);
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
            filterTable(findTxt.getText());
        } catch (Exception  ex) {
            Logger.getLogger(testPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
}
