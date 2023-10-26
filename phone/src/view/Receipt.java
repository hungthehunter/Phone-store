package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Component;

public class Receipt extends JPanel {
	private JPanel contentPane;
	private JTable receiptTable;
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public Receipt() {
		setSize(1110, 856);
		setLayout(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    contentPane.setBounds(5, 5, 1110, 856);
		contentPane.setLayout(null);
		add(contentPane);
		
		JLabel lblChiTitPhiu = new JLabel("Chi tiết phiếu nhập");
		lblChiTitPhiu.setOpaque(true);
		lblChiTitPhiu.setBounds(40, 400, 143, 14);
		contentPane.add(lblChiTitPhiu);
		
		JLabel lblThngTinPhiu_1_1_1 = new JLabel("Chức năng chi tiết phiếu nhập");
		lblThngTinPhiu_1_1_1.setOpaque(true);
		lblThngTinPhiu_1_1_1.setBounds(705, 692, 165, 14);
		contentPane.add(lblThngTinPhiu_1_1_1);
		
		JLabel lblThngTinPhiu_1_2 = new JLabel("Thông tin chi tiết phiếu nhập");
		lblThngTinPhiu_1_2.setOpaque(true);
		lblThngTinPhiu_1_2.setBounds(705, 400, 143, 14);
		contentPane.add(lblThngTinPhiu_1_2);
		
		
		//Receipt table area
		JLabel lblThngTinPhiu = new JLabel("Thông tin phiếu nhập");
		lblThngTinPhiu.setOpaque(true);
		lblThngTinPhiu.setBounds(34, 29, 143, 14);
		contentPane.add(lblThngTinPhiu);
		
		JPanel panelReceiptTable = new JPanel();
		panelReceiptTable.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panelReceiptTable.setBounds(30, 37, 655, 360);
		contentPane.add(panelReceiptTable);
		
	    String[] columnNames = {"STT", "Mã Phiếu Nhập", "Nhân Viên Nhập", "Tên Nhà Phân Phối", "Thành Tiền", "Ngày Lập", "Chú Thích"};
	     Object[][] data = {
	         {"1", "PN001", "Nhân Viên 1", "Nhà Phân Phối 1", "3.480.000.000 đ", "2019-11-27", ""},
	         {"2", "PN002", "Nhân Viên 2", "Nhà Phân Phối 2", "3.480.000.000 đ", "2019-11-27", ""},
	     };
	     
	     DefaultTableModel model = new DefaultTableModel(data, columnNames) {
	            @Override
	            public boolean isCellEditable(int row, int column) {
	                return false;
	            }
	        };
		     	     
	     receiptTable = new JTable(model);
	     receiptTable.setBounds(10, 11, 530, 198);                 		
		 receiptTable.getTableHeader().setReorderingAllowed(false);
		 panelReceiptTable.setLayout(null);
		     
		 JScrollPane scrollPaneReceiptTable = new JScrollPane(receiptTable);
		 scrollPaneReceiptTable.setBounds(10, 11, 635, 338);
		 panelReceiptTable.add(scrollPaneReceiptTable);
		 
		 //Receipt info area
		 JLabel lblThngTinPhiu_1 = new JLabel("Thông tin phiếu nhập");
		 lblThngTinPhiu_1.setOpaque(true);
		 lblThngTinPhiu_1.setBounds(705, 29, 143, 14);
		 contentPane.add(lblThngTinPhiu_1);
			
		 JPanel panel = new JPanel();
		 panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		 panel.setBounds(695, 37, 405, 281);
		 contentPane.add(panel);
		 panel.setLayout(null);
		 
		 JLabel lblNewLabel_1 = new JLabel("Mã PN:");
		 lblNewLabel_1.setFont(lblNewLabel_1.getFont().deriveFont(lblNewLabel_1.getFont().getStyle() | Font.BOLD));
		 lblNewLabel_1.setBounds(10, 20, 74, 14);
		 panel.add(lblNewLabel_1);
		 
		 JLabel lblNewLabel_2 = new JLabel("Nhân Viên:");
		 lblNewLabel_2.setFont(lblNewLabel_2.getFont().deriveFont(lblNewLabel_2.getFont().getStyle() | Font.BOLD));
		 lblNewLabel_2.setBounds(10, 60, 74, 14);
		 panel.add(lblNewLabel_2);
		 
		 JLabel lblNewLabel_3 = new JLabel("Ngày Nhập:");
		 lblNewLabel_3.setFont(lblNewLabel_3.getFont().deriveFont(lblNewLabel_3.getFont().getStyle() | Font.BOLD));
		 lblNewLabel_3.setBounds(10, 100, 74, 14);
		 panel.add(lblNewLabel_3);
		 
		 JLabel lblNewLabel_4 = new JLabel("Nhà Phân Phối");
		 lblNewLabel_4.setFont(lblNewLabel_4.getFont().deriveFont(lblNewLabel_4.getFont().getStyle() | Font.BOLD));
		 lblNewLabel_4.setBounds(10, 140, 74, 14);
		 panel.add(lblNewLabel_4);
		 
		 JLabel lblNewLabel_5 = new JLabel("Tổng Tiền:");
		 lblNewLabel_5.setFont(lblNewLabel_5.getFont().deriveFont(lblNewLabel_5.getFont().getStyle() | Font.BOLD));
		 lblNewLabel_5.setBounds(10, 180, 74, 14);
		 panel.add(lblNewLabel_5);
		 
		 JLabel lblNewLabel_6 = new JLabel("Chú Thích:");
		 lblNewLabel_6.setFont(lblNewLabel_6.getFont().deriveFont(lblNewLabel_6.getFont().getStyle() | Font.BOLD));
		 lblNewLabel_6.setBounds(10, 220, 74, 14);
		 panel.add(lblNewLabel_6);
		 
		 textField_1 = new JTextField();
		 textField_1.setBounds(94, 17, 301, 20);
		 panel.add(textField_1);
		 textField_1.setColumns(10);
		 
		 JComboBox comboBox = new JComboBox();
		 comboBox.setBounds(94, 56, 301, 22);
		 panel.add(comboBox);
		 
		 JComboBox comboBox_1 = new JComboBox();
		 comboBox_1.setBounds(94, 96, 60, 22);
		 panel.add(comboBox_1);
		 
		 JComboBox comboBox_1_1 = new JComboBox();
		 comboBox_1_1.setBounds(164, 96, 60, 22);
		 panel.add(comboBox_1_1);
		 
		 JComboBox comboBox_1_2 = new JComboBox();
		 comboBox_1_2.setBounds(234, 96, 60, 22);
		 panel.add(comboBox_1_2);
		 
		 JComboBox comboBox_1_3 = new JComboBox();
		 comboBox_1_3.setBounds(94, 136, 301, 22);
		 panel.add(comboBox_1_3);
		 
		 textField_2 = new JTextField();
		 textField_2.setBounds(94, 177, 301, 20);
		 textField_2.setEnabled(false);
		 panel.add(textField_2);
		 textField_2.setColumns(10);
		 
		 JTextArea textArea = new JTextArea();
		 textArea.setBounds(94, 215, 301, 50);
		 panel.add(textArea);
		 
		 JLabel lblNewLabel = new JLabel("Tổng Vốn:");
		 lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getStyle() | Font.BOLD));
		 lblNewLabel.setBounds(695, 12, 74, 14);
		 contentPane.add(lblNewLabel);
		 
		 textField = new JTextField();
		 textField.setBounds(786, 9, 301, 20);
		 contentPane.add(textField);
		 textField.setColumns(10);
		 
		 //Feature receipt area
		 JLabel lblThngTinPhiu_1_1 = new JLabel("Chức năng phiếu nhập");
		 lblThngTinPhiu_1_1.setOpaque(true);
		 lblThngTinPhiu_1_1.setBounds(705, 321, 143, 14);
		contentPane.add(lblThngTinPhiu_1_1);
		 
		 JPanel panel_1 = new JPanel();
		 panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		 panel_1.setBounds(695, 329, 405, 68);
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
		 btnNewButton_1.setBounds(112, 11, 75, 41);
		 panel_1.add(btnNewButton_1);
		 
		 JButton btnNewButton_2 = new JButton("Delete button");
		 Image iconDelete = new ImageIcon("Assets/delete.png").getImage();
		 iconDelete = iconDelete.getScaledInstance(75, 41, Image.SCALE_SMOOTH);
		 btnNewButton_2.setIcon(new ImageIcon(iconDelete));
		 btnNewButton_2.setBounds(217, 11, 75, 41);
		 panel_1.add(btnNewButton_2);
		 
		 JButton btnNewButton_3 = new JButton("Refresh button");
		 Image iconRefresh = new ImageIcon("Assets/clear.png").getImage();
		 iconRefresh = iconRefresh.getScaledInstance(75, 41, Image.SCALE_SMOOTH);
		 btnNewButton_3.setIcon(new ImageIcon(iconRefresh));
		 btnNewButton_3.setBounds(320, 11, 75, 41);
		 panel_1.add(btnNewButton_3);
		 
		 //Receipt detail table area
		 JPanel panelReceiptDetailTable = new JPanel();
		 panelReceiptDetailTable.setBorder(new LineBorder(Color.LIGHT_GRAY));
		 panelReceiptDetailTable.setBounds(34, 408, 651, 360);
		 contentPane.add(panelReceiptDetailTable);
		 panelReceiptDetailTable.setLayout(null);
		 
		 String[] columnNames1 = {"STT", "Mã CTPN", "Mã PN", "Sản Phẩm", "Số Lượng", "Tổng Tiền", "Chú Thích"};
	     Object[][] data1 = {
	         {"1", "CTPN001", "PN001", "Sản Phẩm 1", "10", "40.000.000 đ", ""},
	         {"2", "CTPN002", "PN002", "Sản Phẩm 2", "10", "40.000.000 đ", ""},
	     };
	     
	     DefaultTableModel modelDetailReceipt = new DefaultTableModel(data1, columnNames1) {
	            @Override
	            public boolean isCellEditable(int row, int column) {
	                return false;
	            }
	        };
		     	     
	     receiptTable = new JTable(model);
	     receiptTable.setBounds(10, 11, 530, 198);                 		
		 receiptTable.getTableHeader().setReorderingAllowed(false);
		 panelReceiptTable.setLayout(null);
		     
		 JScrollPane scrollPaneReceiptDetailTable = new JScrollPane(receiptTable);
		 scrollPaneReceiptDetailTable.setBounds(10, 11, 635, 338);
		 panelReceiptDetailTable.add(scrollPaneReceiptDetailTable);
		 
	        
	     //Feature Receipt Detail area
		 JPanel panel_2 = new JPanel();
		 panel_2.setLayout(null);
		 panel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		 panel_2.setBounds(695, 408, 405, 281);
		 contentPane.add(panel_2);
		 
		 JLabel lblNewLabel_1_1 = new JLabel("Mã CTPN:");
		 lblNewLabel_1_1.setFont(lblNewLabel_1_1.getFont().deriveFont(lblNewLabel_1_1.getFont().getStyle() | Font.BOLD));
		 lblNewLabel_1_1.setBounds(10, 20, 74, 14);
		 panel_2.add(lblNewLabel_1_1);
		 
		 JLabel lblNewLabel_2_1 = new JLabel("Mã PN:");
		 lblNewLabel_2_1.setFont(lblNewLabel_2_1.getFont().deriveFont(lblNewLabel_2_1.getFont().getStyle() | Font.BOLD));
		 lblNewLabel_2_1.setBounds(10, 60, 74, 14);
		 panel_2.add(lblNewLabel_2_1);
		 
		 JLabel lblNewLabel_3_1 = new JLabel("Sản Phẩm");
		 lblNewLabel_3_1.setFont(lblNewLabel_3_1.getFont().deriveFont(lblNewLabel_3_1.getFont().getStyle() | Font.BOLD));
		 lblNewLabel_3_1.setBounds(10, 100, 74, 14);
		 panel_2.add(lblNewLabel_3_1);
		 
		 JLabel lblNewLabel_4_1 = new JLabel("Số Lượng:");
		 lblNewLabel_4_1.setFont(lblNewLabel_4_1.getFont().deriveFont(lblNewLabel_4_1.getFont().getStyle() | Font.BOLD));
		 lblNewLabel_4_1.setBounds(10, 140, 74, 14);
		 panel_2.add(lblNewLabel_4_1);
		 
		 JLabel lblNewLabel_5_1 = new JLabel("Tổng Tiền:");
		 lblNewLabel_5_1.setFont(lblNewLabel_5_1.getFont().deriveFont(lblNewLabel_5_1.getFont().getStyle() | Font.BOLD));
		 lblNewLabel_5_1.setBounds(10, 180, 74, 14);
		 panel_2.add(lblNewLabel_5_1);
		 
		 JLabel lblNewLabel_6_1 = new JLabel("Chú Thích:");
		 lblNewLabel_6_1.setFont(lblNewLabel_6_1.getFont().deriveFont(lblNewLabel_6_1.getFont().getStyle() | Font.BOLD));
		 lblNewLabel_6_1.setBounds(10, 220, 74, 14);
		 panel_2.add(lblNewLabel_6_1);
		 
		 textField_3 = new JTextField();
		 textField_3.setColumns(10);
		 textField_3.setBounds(94, 17, 301, 20);
		 panel_2.add(textField_3);
		 
		 textField_4 = new JTextField();
		 textField_4.setEnabled(false);
		 textField_4.setColumns(10);
		 textField_4.setBounds(94, 177, 301, 20);
		 panel_2.add(textField_4);
		 
		 JTextArea textArea_1 = new JTextArea();
		 textArea_1.setBounds(94, 215, 301, 50);
		 panel_2.add(textArea_1);
		 
		 JComboBox comboBox_2_1 = new JComboBox();
		 comboBox_2_1.setBounds(94, 96, 301, 22);
		 panel_2.add(comboBox_2_1);
		 
		 textField_5 = new JTextField();
		 textField_5.setColumns(10);
		 textField_5.setBounds(94, 57, 301, 20);
		 panel_2.add(textField_5);
		 
		 textField_6 = new JTextField();
		 textField_6.setColumns(10);
		 textField_6.setBounds(94, 137, 301, 20);
		 panel_2.add(textField_6);
		 
		 JPanel panel_1_1 = new JPanel();
		 panel_1_1.setLayout(null);
		 panel_1_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		 panel_1_1.setBounds(695, 700, 405, 68);
		 contentPane.add(panel_1_1);
		 
		 JButton btnNewButton_4 = new JButton("Add button");
		 Image iconAddDetailReceipt = new ImageIcon("Assets/add.png").getImage();
		 iconAddDetailReceipt = iconAddDetailReceipt.getScaledInstance(75, 41, Image.SCALE_SMOOTH);
		 btnNewButton.setIcon(new ImageIcon(iconAdd));
		 btnNewButton_4.setBounds(10, 11, 75, 41);
		 panel_1_1.add(btnNewButton_4);
		 
		 JButton btnNewButton_1_1 = new JButton("Edit button");
		 Image iconEditDetailReceipt = new ImageIcon("Assets/edit.png").getImage();
		 iconEditDetailReceipt = iconEditDetailReceipt.getScaledInstance(75, 41, Image.SCALE_SMOOTH);
		 btnNewButton.setIcon(new ImageIcon(iconAdd));
		 btnNewButton_1_1.setBounds(112, 11, 75, 41);
		 panel_1_1.add(btnNewButton_1_1);
		 
		 JButton btnNewButton_2_1 = new JButton("Delete button");
		 Image iconDeleteDetailReceipt = new ImageIcon("Assets/delete.png").getImage();
		 iconDeleteDetailReceipt = iconDeleteDetailReceipt.getScaledInstance(75, 41, Image.SCALE_SMOOTH);
		 btnNewButton.setIcon(new ImageIcon(iconAdd));
		 btnNewButton_2_1.setBounds(217, 11, 75, 41);
		 panel_1_1.add(btnNewButton_2_1);
		 
		 JButton btnNewButton_3_1 = new JButton("Refresh button");
		 Image iconRefreshDetailReceipt = new ImageIcon("Assets/refresh.png").getImage();
		 iconRefreshDetailReceipt = iconRefreshDetailReceipt.getScaledInstance(75, 41, Image.SCALE_SMOOTH);
		 btnNewButton.setIcon(new ImageIcon(iconAdd));
		 btnNewButton_3_1.setBounds(320, 11, 75, 41);
		 panel_1_1.add(btnNewButton_3_1);
		 
		
		
	}
}
