package view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class testPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public testPanel() {
		Color myColor = new Color(34, 33, 75);
		Color backGroundColor = Color.white;
		Color borderColor = myColor;
		Color textColor = myColor;
		Color buttonColor = myColor;
		setBackground(backGroundColor);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {600, 400};
		gridBagLayout.rowHeights = new int[] {400, 600};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0};
		setLayout(gridBagLayout);
		
		JPanel panelCategoryTable = new JPanel();
		panelCategoryTable.setBackground(Color.WHITE);
		panelCategoryTable.setBorder(new MatteBorder(0, 0, 0, 2, borderColor));
		GridBagConstraints gbc_panelCategoryTable = new GridBagConstraints();
		gbc_panelCategoryTable.weightx = 0.7;
		gbc_panelCategoryTable.insets = new Insets(20, 20, 5, 10);
		gbc_panelCategoryTable.fill = GridBagConstraints.BOTH;
		gbc_panelCategoryTable.gridx = 0;
		gbc_panelCategoryTable.gridy = 0;
		add(panelCategoryTable, gbc_panelCategoryTable);
		GridBagLayout gbl_panelCategoryTable = new GridBagLayout();
		gbl_panelCategoryTable.columnWidths = new int[]{0, 0, 0};
		gbl_panelCategoryTable.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panelCategoryTable.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panelCategoryTable.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelCategoryTable.setLayout(gbl_panelCategoryTable);
		
		JLabel lblNewLabel = new JLabel("Thông Tin Loại SP");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setForeground(textColor);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.weighty = 0.1;
		gbc_lblNewLabel.weightx = 1.0;
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panelCategoryTable.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.ipady = 5;
		gbc_textField.weighty = 0.1;
		gbc_textField.weightx = 0.9;
		gbc_textField.insets = new Insets(0, 5, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 1;
		panelCategoryTable.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Tìm Kiếm");
        Image iconSearch = new ImageIcon("Assets/Icon/searching.png").getImage();
        iconSearch = iconSearch.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        btnNewButton.setIcon(new ImageIcon(iconSearch));
        btnNewButton.setBorder(new LineBorder(borderColor, 2, true));
		btnNewButton.setForeground(Color.white);
		btnNewButton.setBackground(buttonColor);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.weighty = 0.1;
		gbc_btnNewButton.weightx = 0.1;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 1;
		panelCategoryTable.add(btnNewButton, gbc_btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(borderColor, 2));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 5, 5, 5);
		gbc_scrollPane.weighty = 0.8;
		gbc_scrollPane.weightx = 1.0;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		panelCategoryTable.add(scrollPane, gbc_scrollPane);
		
	     String[] columnNames = {"Mã Loại SP", "Loại SP"};
	     Object[][] data = {

	     };
	     
	     DefaultTableModel model = new DefaultTableModel(data, columnNames) {
	            @Override
	            public boolean isCellEditable(int row, int column) {
	                return false;
	            }
	        };
       table = new JTable(model);	
       table.setBorder(new LineBorder(borderColor, 2, false));
       table.getTableHeader().setBorder(new LineBorder(borderColor, 2, false));
       table.getTableHeader().setReorderingAllowed(false);
       table.getTableHeader().setBackground(borderColor);
       table.getTableHeader().setForeground(Color.white);
		
		
		
		scrollPane.setViewportView(table);
		
		JPanel panelCategoryInfo = new JPanel();
		panelCategoryInfo.setBackground(Color.WHITE);
		GridBagConstraints gbc_panelCategoryInfo = new GridBagConstraints();
		gbc_panelCategoryInfo.weightx = 0.3;
		gbc_panelCategoryInfo.insets = new Insets(20, 5, 5, 10);
		gbc_panelCategoryInfo.fill = GridBagConstraints.BOTH;
		gbc_panelCategoryInfo.gridx = 1;
		gbc_panelCategoryInfo.gridy = 0;
		add(panelCategoryInfo, gbc_panelCategoryInfo);
		GridBagLayout gbl_panelCategoryInfo = new GridBagLayout();
		gbl_panelCategoryInfo.columnWidths = new int[] {50, 200};
		gbl_panelCategoryInfo.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panelCategoryInfo.columnWeights = new double[]{1.0, 1.0};
		gbl_panelCategoryInfo.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelCategoryInfo.setLayout(gbl_panelCategoryInfo);
		
		JLabel lblNewLabel_1 = new JLabel("Thông Tin Loại SP");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setForeground(textColor);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.weighty = 0.1;
		gbc_lblNewLabel_1.weightx = 1.0;
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panelCategoryInfo.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mã Loại SP:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.weighty = 0.3;
		gbc_lblNewLabel_2.weightx = 0.1;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panelCategoryInfo.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.ipady = 5;
		gbc_textField_1.weightx = 0.9;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panelCategoryInfo.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tên SP:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.weighty = 0.3;
		gbc_lblNewLabel_3.weightx = 0.1;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 2;
		panelCategoryInfo.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.ipady = 5;
		gbc_textField_2.weightx = 0.8;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		panelCategoryInfo.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.weightx = 1.0;
		gbc_panel_3.weighty = 0.3;
		gbc_panel_3.gridwidth = 2;
		gbc_panel_3.insets = new Insets(10, 5, 10, 5);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 3;
		panelCategoryInfo.add(panel_3, gbc_panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_1 = new JButton("Thêm");
     	btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
     	btnNewButton_1.setBorder(new LineBorder(borderColor, 2, true));
     	Image iconAdd = new ImageIcon("Assets/Icon/add.png").getImage();
     	iconAdd = iconAdd.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		btnNewButton_1.setPreferredSize(new Dimension(100, 40));
		btnNewButton_1.setBackground(buttonColor);
		btnNewButton_1.setForeground(Color.white);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setIcon(new ImageIcon(iconAdd));
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Sửa");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_3.setBorder(new LineBorder(borderColor, 2, true));
     	Image iconEdit = new ImageIcon("Assets/Icon/edit.png").getImage();
     	iconEdit = iconEdit.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
     	btnNewButton_3.setPreferredSize(new Dimension(100, 40));
     	btnNewButton_3.setBackground(buttonColor);
     	btnNewButton_3.setForeground(Color.white);
     	btnNewButton_3.setFocusPainted(false);
     	btnNewButton_3.setIcon(new ImageIcon(iconEdit));
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Xóa");
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_4.setBorder(new LineBorder(borderColor, 2, true));
     	Image iconDelete = new ImageIcon("Assets/Icon/delete.png").getImage();
     	iconDelete = iconDelete.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
     	btnNewButton_4.setPreferredSize(new Dimension(100, 40));
     	btnNewButton_4.setBackground(buttonColor);
     	btnNewButton_4.setForeground(Color.white);
     	btnNewButton_4.setFocusPainted(false);
     	btnNewButton_4.setIcon(new ImageIcon(iconDelete));
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("Mới");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_2.setBorder(new LineBorder(borderColor, 2, true));
     	Image iconRefresh = new ImageIcon("Assets/Icon/clear.png").getImage();
     	iconRefresh = iconRefresh.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
     	btnNewButton_2.setPreferredSize(new Dimension(100, 40));
     	btnNewButton_2.setBackground(buttonColor);
     	btnNewButton_2.setForeground(Color.white);
     	btnNewButton_2.setFocusPainted(false);
     	btnNewButton_2.setIcon(new ImageIcon(iconRefresh));
		panel_3.add(btnNewButton_2);
		
		JPanel panelProductTable = new JPanel();
		panelProductTable.setBackground(Color.WHITE);
		panelProductTable.setBorder(new MatteBorder(2, 0, 0, 0, borderColor));
		GridBagConstraints gbc_panelProductTable = new GridBagConstraints();
		gbc_panelProductTable.weightx = 1.0;
		gbc_panelProductTable.gridwidth = 2;
		gbc_panelProductTable.insets = new Insets(5, 20, 5, 10);
		gbc_panelProductTable.fill = GridBagConstraints.BOTH;
		gbc_panelProductTable.gridx = 0;
		gbc_panelProductTable.gridy = 1;
		add(panelProductTable, gbc_panelProductTable);
		GridBagLayout gbl_panelProductTable = new GridBagLayout();
		gbl_panelProductTable.columnWidths = new int[]{0, 0, 0};
		gbl_panelProductTable.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panelProductTable.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panelProductTable.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelProductTable.setLayout(gbl_panelProductTable);
		
		JLabel lblNewLabel_4 = new JLabel("Thông Tin Sản Phẩm");
		lblNewLabel_4.setForeground(textColor);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.gridwidth = 2;
		gbc_lblNewLabel_4.weighty = 0.1;
		gbc_lblNewLabel_4.weightx = 1.0;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 0;
		panelProductTable.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.ipady = 5;
		gbc_textField_3.weighty = 0.1;
		gbc_textField_3.weightx = 0.9;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 0;
		gbc_textField_3.gridy = 1;
		panelProductTable.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Tìm Kiếm");
		btnNewButton_5.setIcon(new ImageIcon(iconSearch));
		btnNewButton_5.setBorder(new LineBorder(borderColor, 2, true));
		btnNewButton_5.setForeground(Color.white);
		btnNewButton_5.setBackground(buttonColor);
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.weightx = 0.1;
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_5.gridx = 1;
		gbc_btnNewButton_5.gridy = 1;
		panelProductTable.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.weighty = 0.8;
		gbc_scrollPane_1.weightx = 1.0;
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridwidth = 2;
		gbc_scrollPane_1.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 2;
		panelProductTable.add(scrollPane_1, gbc_scrollPane_1);
		
	     String[] columnNames1 = {"Mã SP","Tên SP" ,"Loại SP"};
	     Object[][] data1 = {

	     };
	     
	     DefaultTableModel model1 = new DefaultTableModel(data1, columnNames1) {
	            @Override
	            public boolean isCellEditable(int row, int column) {
	                return false;
	            }
	        };
      table_1 = new JTable(model1);	
      table_1.setBorder(new LineBorder(borderColor, 2, false));
      table_1.getTableHeader().setBorder(new LineBorder(borderColor, 2, false));
      table_1.getTableHeader().setReorderingAllowed(false);
      table_1.getTableHeader().setBackground(borderColor);
      table_1.getTableHeader().setForeground(Color.white);
      scrollPane_1.setViewportView(table_1);

	}

}
