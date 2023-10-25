package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextArea;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

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

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Product productFrame = new Product();
//					productFrame.setVisible(true);
//					productFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
//					productFrame.setSize(1110, 856);
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Product() {
         setLayout(new BorderLayout());
//	     setPreferredSize(new Dimension(1110, 856));
         
		 contentPane = new JPanel();
	     contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	     contentPane.setBounds(5, 5, 1110, 856);
	     contentPane.setLayout(null);
	     
	     JLabel lblHnhnh = new JLabel("Hình Ảnh");
	     lblHnhnh.setOpaque(true);
	     lblHnhnh.setBounds(155, 405, 60, 21);
	     contentPane.add(lblHnhnh);
	     
	     JLabel lblTmKim = new JLabel("Tìm Kiếm");
	     lblTmKim.setOpaque(true);
	     lblTmKim.setBounds(351, 402, 74, 21);
	     contentPane.add(lblTmKim);
	     
	     JLabel lblChcNng = new JLabel("Chức Năng");
	     lblChcNng.setOpaque(true);
	     lblChcNng.setBounds(640, 402, 74, 21);
	     contentPane.add(lblChcNng);
	     
	     JLabel lblNewLabel = new JLabel("Thông Tin Chung");
	     lblNewLabel.setBounds(23, 30, 103, 21);
	     contentPane.add(lblNewLabel);
	     lblNewLabel.setOpaque(true);
	     
	     JLabel lblThngTinSn = new JLabel("Thông Tin Sản Phẩm");
	     lblThngTinSn.setOpaque(true);
	     lblThngTinSn.setBounds(647, 30, 126, 21);
	     contentPane.add(lblThngTinSn);
	     
	     
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
	     //Product Table Area
		 JPanel panelProductTable = new JPanel();
		 panelProductTable.setBorder(new LineBorder(Color.LIGHT_GRAY));
		 panelProductTable.setBounds(10, 43, 610, 358);
		 contentPane.add(panelProductTable);
		 panelProductTable.setLayout(null);
		     	     
		 JTable productTable = new JTable(model);
		 productTable.getTableHeader().setReorderingAllowed(false);
		     
		 JScrollPane scrollPaneProductTable = new JScrollPane(productTable);
		 scrollPaneProductTable.setBounds(10, 10, 590, 337);
		 panelProductTable.add(scrollPaneProductTable);
		     
	     //Product Info Area
	     JPanel panelProductInfo = new JPanel();
	     panelProductInfo.setBorder(new LineBorder(Color.LIGHT_GRAY));
	     panelProductInfo.setBounds(630, 43, 454, 358);
	     contentPane.add(panelProductInfo);
	     panelProductInfo.setLayout(null);
	     
	     JLabel lblNewLabel_1 = new JLabel("Mã SP:");
	     lblNewLabel_1.setFont(lblNewLabel_1.getFont().deriveFont(lblNewLabel_1.getFont().getStyle() | Font.BOLD));
	     lblNewLabel_1.setBounds(10, 24, 46, 14);
	     panelProductInfo.add(lblNewLabel_1);
	     
	     JLabel lblNewLabel_1_1 = new JLabel("Tên SP:");
	     lblNewLabel_1_1.setFont(lblNewLabel_1_1.getFont().deriveFont(lblNewLabel_1_1.getFont().getStyle() | Font.BOLD));
	     lblNewLabel_1_1.setBounds(10, 49, 46, 14);
	     panelProductInfo.add(lblNewLabel_1_1);
	     
	     JLabel lblNewLabel_1_2 = new JLabel("Loại SP:");
	     lblNewLabel_1_2.setFont(lblNewLabel_1_2.getFont().deriveFont(lblNewLabel_1_2.getFont().getStyle() | Font.BOLD));
	     lblNewLabel_1_2.setBounds(10, 74, 46, 14);
	     panelProductInfo.add(lblNewLabel_1_2);
	     
	     JLabel lblNewLabel_1_3 = new JLabel("Giá Nhập:");
	     lblNewLabel_1_3.setFont(lblNewLabel_1_3.getFont().deriveFont(lblNewLabel_1_3.getFont().getStyle() | Font.BOLD));
	     lblNewLabel_1_3.setBounds(10, 99, 63, 14);
	     panelProductInfo.add(lblNewLabel_1_3);
	     
	     JLabel lblNewLabel_1_4 = new JLabel("Giá Bán:");
	     lblNewLabel_1_4.setFont(lblNewLabel_1_4.getFont().deriveFont(lblNewLabel_1_4.getFont().getStyle() | Font.BOLD));
	     lblNewLabel_1_4.setBounds(10, 124, 46, 14);
	     panelProductInfo.add(lblNewLabel_1_4);
	     
	     JLabel lblNewLabel_1_5 = new JLabel("Hãng SX:");
	     lblNewLabel_1_5.setFont(lblNewLabel_1_5.getFont().deriveFont(lblNewLabel_1_5.getFont().getStyle() | Font.BOLD));
	     lblNewLabel_1_5.setBounds(10, 149, 63, 14);
	     panelProductInfo.add(lblNewLabel_1_5);
	     
	     JLabel lblNewLabel_1_6 = new JLabel("Tồn Kho:");
	     lblNewLabel_1_6.setFont(lblNewLabel_1_6.getFont().deriveFont(lblNewLabel_1_6.getFont().getStyle() | Font.BOLD));
	     lblNewLabel_1_6.setBounds(10, 174, 63, 14);
	     panelProductInfo.add(lblNewLabel_1_6);
	     
	     productIDText = new JTextField();
	     productIDText.setBounds(83, 21, 361, 20);
	     panelProductInfo.add(productIDText);
	     productIDText.setColumns(10);
	     
	     productNameText = new JTextField();
	     productNameText.setColumns(10);
	     productNameText.setBounds(83, 46, 361, 20);
	     panelProductInfo.add(productNameText);
	     
	     productCatText = new JTextField();
	     productCatText.setColumns(10);
	     productCatText.setBounds(83, 71, 361, 20);
	     panelProductInfo.add(productCatText);
	     
	     productPurchaseText = new JTextField();
	     productPurchaseText.setColumns(10);
	     productPurchaseText.setBounds(83, 96, 361, 20);
	     panelProductInfo.add(productPurchaseText);
	     
	     productPriceText = new JTextField();
	     productPriceText.setColumns(10);
	     productPriceText.setBounds(83, 121, 361, 20);
	     panelProductInfo.add(productPriceText);
	     
	     productProducerText = new JTextField();
	     productProducerText.setColumns(10);
	     productProducerText.setBounds(83, 146, 361, 20);
	     panelProductInfo.add(productProducerText);
	     
	     productQuantityText = new JTextField();
	     productQuantityText.setColumns(10);
	     productQuantityText.setBounds(83, 171, 361, 20);
	     panelProductInfo.add(productQuantityText);
	     
	     JButton imageBtn = new JButton("Image");
	     imageBtn.setBounds(10, 199, 77, 23);
	     panelProductInfo.add(imageBtn);
	     
	     productImageText = new JTextField();
	     productImageText.setColumns(10);
	     productImageText.setBounds(93, 202, 351, 20);
	     panelProductInfo.add(productImageText);
	     
	     JLabel lblNewLabel_1_6_1 = new JLabel("Chú Thích:");
	     lblNewLabel_1_6_1.setFont(lblNewLabel_1_6_1.getFont().deriveFont(lblNewLabel_1_6_1.getFont().getStyle() | Font.BOLD));
	     lblNewLabel_1_6_1.setBounds(10, 233, 67, 14);
	     panelProductInfo.add(lblNewLabel_1_6_1);
	     
	     TextArea textArea = new TextArea();
	     textArea.setBounds(83, 228, 361, 94);
	     panelProductInfo.add(textArea);
	     
	     //Product Action Area
	     JPanel panelProductAction = new JPanel();
	     panelProductAction.setBorder(new LineBorder(Color.LIGHT_GRAY));
	     panelProductAction.setBounds(630, 412, 454, 63);
	     contentPane.add(panelProductAction);
	     panelProductAction.setLayout(null);
	     
	     JButton addProductBtn = new JButton();
	     addProductBtn.setBounds(10, 11, 75, 41); 
	     
	     Image iconAdd = new ImageIcon("Assets/add.png").getImage();
	     iconAdd = iconAdd.getScaledInstance(75, 41, Image.SCALE_SMOOTH);
	     addProductBtn.setIcon(new ImageIcon(iconAdd));
	     panelProductAction.add(addProductBtn);
	     
	     
	     JButton editProductBtn = new JButton();
	     Image iconEdit = new ImageIcon("Assets/edit.png").getImage();
	     iconEdit = iconEdit.getScaledInstance(75, 41, Image.SCALE_SMOOTH);
	     editProductBtn.setIcon(new ImageIcon(iconEdit));
	     editProductBtn.setBounds(133, 11, 75, 41);
	     panelProductAction.add(editProductBtn);
	     
	     JButton deleteProductBtn = new JButton();
	     Image iconDelete = new ImageIcon("Assets/delete.png").getImage();
	     iconDelete = iconDelete.getScaledInstance(75, 41, Image.SCALE_SMOOTH);
	     deleteProductBtn.setIcon(new ImageIcon(iconDelete));
	     deleteProductBtn.setBounds(252, 11, 75, 41);
	     panelProductAction.add(deleteProductBtn);
	     
	     JButton refreshProductBtn = new JButton();
	     refreshProductBtn.setBounds(369, 11, 75, 41);
	     Image iconRefresh = new ImageIcon("Assets/clear.png").getImage();
	     iconRefresh = iconRefresh.getScaledInstance(75, 41, Image.SCALE_SMOOTH);
	     refreshProductBtn.setIcon(new ImageIcon(iconRefresh));
	     panelProductAction.add(refreshProductBtn);
	     
	     JLabel label = new JLabel("New label");
	     label.setBounds(640, 402, 46, 14);
	     contentPane.add(label);
	     
	     //Product Find Area
	     JPanel panelProductFind = new JPanel();
	     panelProductFind.setBorder(new LineBorder(Color.LIGHT_GRAY));
	     panelProductFind.setBounds(340, 412, 272, 226);
	     contentPane.add(panelProductFind);
	     panelProductFind.setLayout(null);
	     
	     JLabel lblNewLabel_2 = new JLabel("Tên Sản Phẩm:");
	     lblNewLabel_2.setFont(lblNewLabel_2.getFont().deriveFont(lblNewLabel_2.getFont().getStyle() | Font.BOLD));
	     lblNewLabel_2.setBounds(10, 42, 83, 23);
	     panelProductFind.add(lblNewLabel_2);
	     
	     JCheckBox chckbxFind = new JCheckBox("Tìm Kiếm");
	     chckbxFind.setFont(chckbxFind.getFont().deriveFont(chckbxFind.getFont().getStyle() | Font.BOLD));
	     chckbxFind.setBounds(51, 6, 119, 29);
	     panelProductFind.add(chckbxFind);
	     
	     textField = new JTextField();
	     textField.setBounds(103, 43, 159, 20);
	     panelProductFind.add(textField);
	     textField.setColumns(10);
	     
	     JLabel lblNewLabel_2_1 = new JLabel("Loại Sản Phẩm:");
	     lblNewLabel_2_1.setFont(lblNewLabel_2_1.getFont().deriveFont(lblNewLabel_2_1.getFont().getStyle() | Font.BOLD));
	     lblNewLabel_2_1.setBounds(10, 83, 96, 23);
	     panelProductFind.add(lblNewLabel_2_1);
	     
	     JComboBox comboBox = new JComboBox();
	     comboBox.setBounds(103, 83, 159, 22);
	     panelProductFind.add(comboBox);
	     
	     //Product Display img area
	     JPanel panelPoductImage = new JPanel();
	     panelPoductImage.setBorder(new LineBorder(Color.LIGHT_GRAY));
	     panelPoductImage.setBounds(149, 412, 150, 226);
	     contentPane.add(panelPoductImage);
	     panelPoductImage.setLayout(null);
	     
	     //display invisible product
	     JButton btnNewButton = new JButton("Sản Phẩm Bị Ẩn");
	     btnNewButton.setBounds(10, 421, 129, 42);
	     contentPane.add(btnNewButton);
	     
	     // Lưu ý phải có dòng code này 
	     add(contentPane, BorderLayout.CENTER);

		
	
	}
}