package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;

public class testPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable receiptTable;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_8;
	private JTextField textField_15;

	/**
	 * Create the panel.
	 */
	public testPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		
		//Receipt table area
		JPanel panelReceiptTable = new JPanel();
		panelReceiptTable.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_panelReceiptTable = new GridBagConstraints();
		gbc_panelReceiptTable.weighty = 1.0;
		gbc_panelReceiptTable.weightx = 2.0;
		gbc_panelReceiptTable.insets = new Insets(20, 10, 5, 5);
		gbc_panelReceiptTable.fill = GridBagConstraints.BOTH;
		gbc_panelReceiptTable.gridx = 0;
		gbc_panelReceiptTable.gridy = 0;
		add(panelReceiptTable, gbc_panelReceiptTable);
		GridBagLayout gbl_panelReceiptTable = new GridBagLayout();
		gbl_panelReceiptTable.columnWidths = new int[]{476, 0, 0};
		gbl_panelReceiptTable.rowHeights = new int[]{14, 0, 323, 0};
		gbl_panelReceiptTable.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panelReceiptTable.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelReceiptTable.setLayout(gbl_panelReceiptTable);
		

		 
		 JLabel lblNewLabel = new JLabel("Thông Tin Phiếu Nhập");
		 lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		 GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		 gbc_lblNewLabel.gridwidth = 2;
		 gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		 gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		 gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		 gbc_lblNewLabel.gridx = 0;
		 gbc_lblNewLabel.gridy = 0;
		 panelReceiptTable.add(lblNewLabel, gbc_lblNewLabel);
		 
		 textField_8 = new JTextField();
		 GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		 gbc_textField_8.insets = new Insets(0, 5, 5, 5);
		 gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		 gbc_textField_8.gridx = 0;
		 gbc_textField_8.gridy = 1;
		 panelReceiptTable.add(textField_8, gbc_textField_8);
		 textField_8.setColumns(10);
		 
		 JButton btnNewButton_6 = new JButton("Tìm Kiếm");
		 GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		 gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		 gbc_btnNewButton_6.gridx = 1;
		 gbc_btnNewButton_6.gridy = 1;
		 panelReceiptTable.add(btnNewButton_6, gbc_btnNewButton_6);
	     
		 GridBagConstraints gbc_scrollPaneReceiptTable = new GridBagConstraints();
		 gbc_scrollPaneReceiptTable.weighty = 1.0;
		 gbc_scrollPaneReceiptTable.weightx = 1.0;
		 gbc_scrollPaneReceiptTable.gridwidth = 2;
		 gbc_scrollPaneReceiptTable.insets = new Insets(0, 5, 10, 5);
		 gbc_scrollPaneReceiptTable.fill = GridBagConstraints.BOTH;
		 gbc_scrollPaneReceiptTable.gridx = 0;
		 gbc_scrollPaneReceiptTable.gridy = 2;
		

	    String[] columnNames = {"STT", "Mã Phiếu Nhập", "Nhân Viên Nhập", "Tên Nhà Phân Phối", "Thành Tiền", "Ngày Lập", "Chú Thích"};
	     Object[][] data = {
	         {"1", "PN001", "Nhân Viên 1", "Nhà Phân Phối 1", "3.480.000.000 đ", "2019-11-27", ""},
	         {"2", "PN002", "Nhân Viên 2", "Nhà Phân Phối 2", "3.480.000.000 đ", "2019-11-27", ""},
	     };
	     
	     DefaultTableModel modelReceipt = new DefaultTableModel(data, columnNames) {
	            @Override
	            public boolean isCellEditable(int row, int column) {
	                return false;
	            }
	        };
        receiptTable = new JTable(modelReceipt);
	    receiptTable.getTableHeader().setReorderingAllowed(false);
	    
		JScrollPane scrollPaneReceiptTable = new JScrollPane(receiptTable);		 
		panelReceiptTable.add(scrollPaneReceiptTable, gbc_scrollPaneReceiptTable);

	    
	    
		JPanel panelInputRecep = new JPanel();
		
		JPanel panelReceiptInfo = new JPanel();
		GridBagConstraints gbc_panelReceiptInfo = new GridBagConstraints();
		gbc_panelReceiptInfo.weightx = 1.0;
		gbc_panelReceiptInfo.insets = new Insets(20, 5, 5, 10);
		gbc_panelReceiptInfo.fill = GridBagConstraints.BOTH;
		gbc_panelReceiptInfo.gridx = 1;
		gbc_panelReceiptInfo.gridy = 0;
		add(panelReceiptInfo, gbc_panelReceiptInfo);
		panelReceiptInfo.setLayout(new BoxLayout(panelReceiptInfo, BoxLayout.Y_AXIS));
		
		JPanel panelReceiptInput = new JPanel();
		panelReceiptInput.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panelReceiptInfo.add(panelReceiptInput);
		GridBagLayout gbl_panelReceiptInput = new GridBagLayout();
		gbl_panelReceiptInput.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panelReceiptInput.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelReceiptInput.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelReceiptInput.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelReceiptInput.setLayout(gbl_panelReceiptInput);
		
		JLabel lblNewLabel_1 = new JLabel("Thông Tin Phiếu Nhập");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 3;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panelReceiptInput.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tổng Vốn:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panelReceiptInput.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.gridwidth = 2;
		gbc_textField_7.insets = new Insets(0, 0, 5, 0);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 1;
		panelReceiptInput.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Mã PN:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 2;
		panelReceiptInput.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JComboBox comboBox_3 = new JComboBox();
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.gridwidth = 2;
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 1;
		gbc_comboBox_3.gridy = 2;
		panelReceiptInput.add(comboBox_3, gbc_comboBox_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nhân Viên:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 3;
		panelReceiptInput.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		panelReceiptInput.add(comboBox, gbc_comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Ngày Nhập:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 4;
		panelReceiptInput.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_10 = new JTextField();
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(0, 0, 5, 5);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 1;
		gbc_textField_10.gridy = 4;
		panelReceiptInput.add(textField_10, gbc_textField_10);
		textField_10.setColumns(10);
		
		JButton btnNewButton = new JButton("TIme");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 4;
		panelReceiptInput.add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Nhà PP:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 5;
		panelReceiptInput.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JComboBox comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.gridwidth = 2;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 5;
		panelReceiptInput.add(comboBox_1, gbc_comboBox_1);
		
		JLabel lblNewLabel_7 = new JLabel("Tổng Tiền:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 6;
		panelReceiptInput.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textField_9 = new JTextField();
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.gridwidth = 2;
		gbc_textField_9.insets = new Insets(0, 0, 5, 0);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 1;
		gbc_textField_9.gridy = 6;
		panelReceiptInput.add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Chú Thích:");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 7;
		panelReceiptInput.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		TextArea textArea = new TextArea();
		textArea.setColumns(1);
		textArea.setRows(5);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridwidth = 2;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 7;
		panelReceiptInput.add(textArea, gbc_textArea);
		
		JPanel panelReceiptFeature = new JPanel();
		panelReceiptFeature.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panelReceiptInfo.add(panelReceiptFeature);
		panelReceiptFeature.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnNewButton_1 = new JButton("");
		Image iconAdd = new ImageIcon("Assets/Icon/add.png").getImage();
		iconAdd = iconAdd.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		btnNewButton_1.setIcon(new ImageIcon(iconAdd));
		btnNewButton_1.setPreferredSize(new Dimension(60, 40));
		panelReceiptFeature.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		Image iconEdit = new ImageIcon("Assets/Icon/edit.png").getImage();
		iconEdit = iconEdit.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		btnNewButton_1_1.setIcon(new ImageIcon(iconEdit));
		btnNewButton_1_1.setPreferredSize(new Dimension(60, 40));		
		panelReceiptFeature.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		Image iconDelete = new ImageIcon("Assets/Icon/delete.png").getImage();
		iconDelete = iconDelete.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		btnNewButton_1_2.setIcon(new ImageIcon(iconDelete));
		btnNewButton_1_2.setPreferredSize(new Dimension(60, 40));		
		panelReceiptFeature.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("");
		Image iconRefresh = new ImageIcon("Assets/Icon/clear.png").getImage();
		iconRefresh = iconRefresh.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		btnNewButton_1_3.setIcon(new ImageIcon(iconRefresh));
		btnNewButton_1_3.setPreferredSize(new Dimension(60, 40));	
		panelReceiptFeature.add(btnNewButton_1_3);
		
		//Receipt details table area
		JPanel panelReceiptDetailTable = new JPanel();
		panelReceiptDetailTable.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_panelReceiptDetailTable = new GridBagConstraints();
		gbc_panelReceiptDetailTable.weighty = 2.0;
		gbc_panelReceiptDetailTable.weightx = 2.0;
		gbc_panelReceiptDetailTable.insets = new Insets(5, 0, 5, 5);
		gbc_panelReceiptDetailTable.fill = GridBagConstraints.BOTH;
		gbc_panelReceiptDetailTable.gridx = 0;
		gbc_panelReceiptDetailTable.gridy = 1;
		add(panelReceiptDetailTable, gbc_panelReceiptDetailTable);
		GridBagLayout gbl_panelReceiptDetailTable = new GridBagLayout();
		gbl_panelReceiptDetailTable.columnWidths = new int[]{620, 0, 0};
		gbl_panelReceiptDetailTable.rowHeights = new int[]{14, 0, 290, 0};
		gbl_panelReceiptDetailTable.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panelReceiptDetailTable.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelReceiptDetailTable.setLayout(gbl_panelReceiptDetailTable);
		
		 JLabel lblThngTinPhiu_1_2 = new JLabel("Thông tin chi tiết phiếu nhập");
		 GridBagConstraints gbc_lblThngTinPhiu_1_2 = new GridBagConstraints();
		 gbc_lblThngTinPhiu_1_2.gridwidth = 2;
		 gbc_lblThngTinPhiu_1_2.anchor = GridBagConstraints.NORTH;
		 gbc_lblThngTinPhiu_1_2.insets = new Insets(0, 0, 5, 5);
		 gbc_lblThngTinPhiu_1_2.gridx = 0;
		 gbc_lblThngTinPhiu_1_2.gridy = 0;
		 panelReceiptDetailTable.add(lblThngTinPhiu_1_2, gbc_lblThngTinPhiu_1_2);
		 
		 textField_15 = new JTextField();
		 GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		 gbc_textField_15.insets = new Insets(0, 5, 5, 5);
		 gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
		 gbc_textField_15.gridx = 0;
		 gbc_textField_15.gridy = 1;
		 panelReceiptDetailTable.add(textField_15, gbc_textField_15);
		 textField_15.setColumns(10);
		 
		 JButton btnNewButton_7 = new JButton("Tìm Kiếm");
		 GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		 gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 5);
		 gbc_btnNewButton_7.gridx = 1;
		 gbc_btnNewButton_7.gridy = 1;
		 panelReceiptDetailTable.add(btnNewButton_7, gbc_btnNewButton_7);
	     
		 GridBagConstraints gbc_scrollPaneReceiptDetailTable = new GridBagConstraints();
		 gbc_scrollPaneReceiptDetailTable.weighty = 1.0;
		 gbc_scrollPaneReceiptDetailTable.weightx = 1.0;
		 gbc_scrollPaneReceiptDetailTable.gridwidth = 2;
		 gbc_scrollPaneReceiptDetailTable.insets = new Insets(0, 5, 0, 5);
		 gbc_scrollPaneReceiptDetailTable.fill = GridBagConstraints.BOTH;
		 gbc_scrollPaneReceiptDetailTable.gridx = 0;
		 gbc_scrollPaneReceiptDetailTable.gridy = 2;		 

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
	     receiptTable = new JTable(modelDetailReceipt);
	     receiptTable.getTableHeader().setReorderingAllowed(false);
	     JScrollPane scrollPaneReceiptDetailTable = new JScrollPane(receiptTable);
		 panelReceiptDetailTable.add(scrollPaneReceiptDetailTable, gbc_scrollPaneReceiptDetailTable);
		
		
		JPanel panelReceiptDetailInfo = new JPanel();
		panelReceiptDetailInfo.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_panelReceiptDetailInfo = new GridBagConstraints();
		gbc_panelReceiptDetailInfo.insets = new Insets(5, 5, 10, 10);
		gbc_panelReceiptDetailInfo.weighty = 1.0;
		gbc_panelReceiptDetailInfo.weightx = 1.0;
		gbc_panelReceiptDetailInfo.fill = GridBagConstraints.BOTH;
		gbc_panelReceiptDetailInfo.gridx = 1;
		gbc_panelReceiptDetailInfo.gridy = 1;
		add(panelReceiptDetailInfo, gbc_panelReceiptDetailInfo);
		panelReceiptDetailInfo.setLayout(new BoxLayout(panelReceiptDetailInfo, BoxLayout.Y_AXIS));
		
		JPanel panelReceiptDetailInput = new JPanel();
		panelReceiptDetailInfo.add(panelReceiptDetailInput);
		GridBagLayout gbl_panelReceiptDetailInput = new GridBagLayout();
		gbl_panelReceiptDetailInput.columnWidths = new int[]{0, 0, 0};
		gbl_panelReceiptDetailInput.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelReceiptDetailInput.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panelReceiptDetailInput.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelReceiptDetailInput.setLayout(gbl_panelReceiptDetailInput);
		
		JLabel lblNewLabel_9 = new JLabel("Thông Tin Chi Tiết Phiếu");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.gridwidth = 2;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 0;
		panelReceiptDetailInput.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("Mã CTPN:");
		GridBagConstraints gbc_lblNewLabel_9_1 = new GridBagConstraints();
		gbc_lblNewLabel_9_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9_1.gridx = 0;
		gbc_lblNewLabel_9_1.gridy = 1;
		panelReceiptDetailInput.add(lblNewLabel_9_1, gbc_lblNewLabel_9_1);
		
		textField_11 = new JTextField();
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(0, 0, 5, 0);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 1;
		gbc_textField_11.gridy = 1;
		panelReceiptDetailInput.add(textField_11, gbc_textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_9_2 = new JLabel("Mã PN:");
		GridBagConstraints gbc_lblNewLabel_9_2 = new GridBagConstraints();
		gbc_lblNewLabel_9_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9_2.gridx = 0;
		gbc_lblNewLabel_9_2.gridy = 2;
		panelReceiptDetailInput.add(lblNewLabel_9_2, gbc_lblNewLabel_9_2);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.insets = new Insets(0, 0, 5, 0);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 1;
		gbc_textField_12.gridy = 2;
		panelReceiptDetailInput.add(textField_12, gbc_textField_12);
		
		JLabel lblNewLabel_9_3 = new JLabel("Sản Phẩm:");
		GridBagConstraints gbc_lblNewLabel_9_3 = new GridBagConstraints();
		gbc_lblNewLabel_9_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9_3.gridx = 0;
		gbc_lblNewLabel_9_3.gridy = 3;
		panelReceiptDetailInput.add(lblNewLabel_9_3, gbc_lblNewLabel_9_3);
		
		JComboBox comboBox_2 = new JComboBox();
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 3;
		panelReceiptDetailInput.add(comboBox_2, gbc_comboBox_2);
		
		JLabel lblNewLabel_9_4 = new JLabel("Số Lượng:");
		GridBagConstraints gbc_lblNewLabel_9_4 = new GridBagConstraints();
		gbc_lblNewLabel_9_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9_4.gridx = 0;
		gbc_lblNewLabel_9_4.gridy = 4;
		panelReceiptDetailInput.add(lblNewLabel_9_4, gbc_lblNewLabel_9_4);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.insets = new Insets(0, 0, 5, 0);
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.gridx = 1;
		gbc_textField_13.gridy = 4;
		panelReceiptDetailInput.add(textField_13, gbc_textField_13);
		
		JLabel lblNewLabel_9_5 = new JLabel("Tổng Tiền:");
		GridBagConstraints gbc_lblNewLabel_9_5 = new GridBagConstraints();
		gbc_lblNewLabel_9_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9_5.gridx = 0;
		gbc_lblNewLabel_9_5.gridy = 5;
		panelReceiptDetailInput.add(lblNewLabel_9_5, gbc_lblNewLabel_9_5);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.insets = new Insets(0, 0, 5, 0);
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.gridx = 1;
		gbc_textField_14.gridy = 5;
		panelReceiptDetailInput.add(textField_14, gbc_textField_14);
		
		JLabel lblNewLabel_9_6 = new JLabel("Chú Thích:");
		GridBagConstraints gbc_lblNewLabel_9_6 = new GridBagConstraints();
		gbc_lblNewLabel_9_6.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_9_6.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_9_6.gridx = 0;
		gbc_lblNewLabel_9_6.gridy = 6;
		panelReceiptDetailInput.add(lblNewLabel_9_6, gbc_lblNewLabel_9_6);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setColumns(1);
		textArea_1.setRows(5);
		GridBagConstraints gbc_textArea_1 = new GridBagConstraints();
		gbc_textArea_1.fill = GridBagConstraints.BOTH;
		gbc_textArea_1.gridx = 1;
		gbc_textArea_1.gridy = 6;
		panelReceiptDetailInput.add(textArea_1, gbc_textArea_1);
		
		JPanel panelReceiptDetailFeature = new JPanel();
		panelReceiptDetailInfo.add(panelReceiptDetailFeature);
		panelReceiptDetailFeature.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(iconAdd));
		btnNewButton_3.setPreferredSize(new Dimension(60, 40));	
		panelReceiptDetailFeature.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(iconEdit));
		btnNewButton_2.setPreferredSize(new Dimension(60, 40));	
		panelReceiptDetailFeature.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(iconDelete));
		btnNewButton_4.setPreferredSize(new Dimension(60, 40));	
		panelReceiptDetailFeature.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(iconRefresh));
		btnNewButton_5.setPreferredSize(new Dimension(60, 40));	
		panelReceiptDetailFeature.add(btnNewButton_5);

	}

}
