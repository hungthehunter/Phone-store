package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.table.TableModel;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Category extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable categoryTable;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Category() {
		setSize(1110, 856);
		setLayout(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    contentPane.setBounds(5, 5, 1110, 856);
		contentPane.setLayout(null);	
		
		//Category table area
		JLabel lblNewLabel = new JLabel("Thông tin loại sản phẩm");
		lblNewLabel.setBounds(42, 29, 143, 14);
		lblNewLabel.setOpaque(true);
		contentPane.add(lblNewLabel);
		
	    JPanel panelCategoryTable = new JPanel();
	    panelCategoryTable.setBorder(new LineBorder(Color.LIGHT_GRAY));
	    panelCategoryTable.setBounds(30, 37, 655, 220);
	    contentPane.add(panelCategoryTable);
	    panelCategoryTable.setLayout(null);
		
		
	    String[] columnNames = {"STT", "Mã Loại", "Loại SP"};
	     Object[][] data = {
	         {"1", "LSP001", "Loại 1"},
	         {"2", "LSP002", "Loại 2"},
	     };
	     
	     DefaultTableModel model = new DefaultTableModel(data, columnNames) {
	            @Override
	            public boolean isCellEditable(int row, int column) {
	                return false;
	            }
	        };
		     	     
	     categoryTable = new JTable(model);
	     categoryTable.setBounds(10, 11, 530, 198);                 		
		 categoryTable.getTableHeader().setReorderingAllowed(false);
		     
		 JScrollPane scrollPaneCategoryTable = new JScrollPane(categoryTable);
		 scrollPaneCategoryTable.setBounds(10, 11, 635, 198);
		 panelCategoryTable.add(scrollPaneCategoryTable);
		
		
		
	    
	    //Category info area
		JLabel lblNewLabel_1 = new JLabel("Thông tin loại sản phẩm");
		lblNewLabel_1.setBounds(711, 29, 127, 14);
		lblNewLabel_1.setOpaque(true);
		contentPane.add(lblNewLabel_1);
		
			
	    JPanel panel = new JPanel();
	    panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
	    panel.setBounds(695, 37, 405, 220);
	    contentPane.add(panel);
	    panel.setLayout(null);
	    
	    JLabel lblNewLabel_2 = new JLabel("Mã loại:");
	    lblNewLabel_2.setFont(lblNewLabel_2.getFont().deriveFont(lblNewLabel_2.getFont().getStyle() | Font.BOLD));
	    lblNewLabel_2.setBounds(10, 26, 60, 14);
	    panel.add(lblNewLabel_2);
	    
	    textField = new JTextField();
	    textField.setBounds(80, 23, 315, 20);
	    panel.add(textField);
	    textField.setColumns(10);
	    
	    JLabel lblNewLabel_2_1 = new JLabel("Tên loại:");
	    lblNewLabel_2_1.setFont(lblNewLabel_2_1.getFont().deriveFont(lblNewLabel_2_1.getFont().getStyle() | Font.BOLD));
	    lblNewLabel_2_1.setBounds(10, 74, 60, 14);
	    panel.add(lblNewLabel_2_1);
	    
	    textField_1 = new JTextField();
	    textField_1.setColumns(10);
	    textField_1.setBounds(80, 71, 315, 20);
	    panel.add(textField_1);	    
	    
	    //Product table area	    
		JLabel lblSnPhm = new JLabel("Sản Phẩm");
		lblSnPhm.setOpaque(true);
		lblSnPhm.setBounds(42, 295, 69, 14);
		contentPane.add(lblSnPhm);
		
	    String[] columnNames1 = {"STT", "Mã SP", "Tên SP", "Loại SP"};
	     Object[][] data1 = {
	         {"1", "SP001", "Sản phẩm 1", "Loại 1"},
	         {"2", "SP002", "Sản phẩm 2", "Loại 2"},
	     };
	     
	     DefaultTableModel modelProduct = new DefaultTableModel(data1, columnNames1) {
	            @Override
	            public boolean isCellEditable(int row, int column) {
	                return false;
	            }
	        };
	    JPanel panelProductTable = new JPanel();
	    panelProductTable.setLayout(null);
	    panelProductTable.setBorder(new LineBorder(Color.LIGHT_GRAY));
	    panelProductTable.setBounds(30, 303, 655, 322);
	    contentPane.add(panelProductTable);
	    
		 JTable categoryTable = new JTable(modelProduct);
		 categoryTable.getTableHeader().setReorderingAllowed(false);
	    
	    JScrollPane scrollPaneProductTable = new JScrollPane(categoryTable);
	    scrollPaneProductTable.setBounds(10, 11, 635, 300);
	    panelProductTable.add(scrollPaneProductTable);
	    
	    
	    //Feature area
		JLabel lblChcNng = new JLabel("Chức Năng");
		lblChcNng.setOpaque(true);
		lblChcNng.setBounds(699, 295, 69, 14);
		contentPane.add(lblChcNng);
		
	    JPanel panel_1 = new JPanel();
	    panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
	    panel_1.setBounds(695, 303, 405, 126);
	    contentPane.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JButton btnNewButton = new JButton("Add button");
		Image iconAdd = new ImageIcon("Assets/add.png").getImage();
		iconAdd = iconAdd.getScaledInstance(75, 41, Image.SCALE_SMOOTH);
		btnNewButton.setIcon(new ImageIcon(iconAdd));
		btnNewButton.setBounds(10, 11, 75, 41);
		panel_1.add(btnNewButton);
	    
	    
	    JButton btnNewButton_1 = new JButton("Edit button");
	    Image iconEdit = new ImageIcon("Assets/edit.png").getImage();
	    iconEdit = iconEdit.getScaledInstance(75, 41, Image.SCALE_SMOOTH);
	    btnNewButton_1.setIcon(new ImageIcon(iconEdit));
	    btnNewButton_1.setBounds(119, 11, 75, 41);
	    panel_1.add(btnNewButton_1);
	    
	    JButton btnNewButton_2 = new JButton("Delete button");
	    Image iconDelete = new ImageIcon("Assets/delete.png").getImage();
	    iconDelete = iconDelete.getScaledInstance(75, 41, Image.SCALE_SMOOTH);
	    btnNewButton_2.setIcon(new ImageIcon(iconDelete));
	    btnNewButton_2.setBounds(218, 11, 75, 41);
	    panel_1.add(btnNewButton_2);
	    
	    JButton btnNewButton_3 = new JButton("Refresh button");
	    Image iconRefresh = new ImageIcon("Assets/clear.png").getImage();
	    iconRefresh = iconRefresh.getScaledInstance(75, 41, Image.SCALE_SMOOTH);
	    btnNewButton_3.setIcon(new ImageIcon(iconRefresh));
	    btnNewButton_3.setBounds(320, 11, 75, 41);
	    panel_1.add(btnNewButton_3);
	    
	    add(contentPane);

	}
}
