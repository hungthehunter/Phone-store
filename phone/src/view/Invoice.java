package view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.UIManager;

public class Invoice extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTable table_1;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_9;
	private JTable table_2;
	private JTextField textField_5;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 * @param panelFeature 
	 */
	public Invoice() {
		setSize(1110, 856);  
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {700, 300};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0};
		setLayout(gridBagLayout);
		
		// *Table DANH SÁC HÓA ĐƠN
		JPanel panel_table_1 = new JPanel();
		panel_table_1.setBorder(new LineBorder(new Color(192, 192, 192)));

		GridBagConstraints gbc_panel_table_1 = new GridBagConstraints();
		gbc_panel_table_1.weighty = 0.3;
		gbc_panel_table_1.fill = GridBagConstraints.BOTH;
		gbc_panel_table_1.weightx = 0.6;
		gbc_panel_table_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_table_1.gridx = 0;
		gbc_panel_table_1.gridy = 0;
		add(panel_table_1, gbc_panel_table_1);
		GridBagLayout gbl_panel_table_1 = new GridBagLayout();
		gbl_panel_table_1.columnWidths = new int[] {0, 0, 0};
		gbl_panel_table_1.rowHeights = new int[] {0, 0, 0};
		gbl_panel_table_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_table_1.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_table_1.setLayout(gbl_panel_table_1);
					
		JLabel lblNewLabel_2_1_1 = new JLabel("Danh sách hoá đơn");
		lblNewLabel_2_1_1.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_2_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_1.gridwidth = 2;
		gbc_lblNewLabel_2_1_1.weightx = 1.0;
		gbc_lblNewLabel_2_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2_1_1.gridx = 0;
		gbc_lblNewLabel_2_1_1.gridy = 0;
		panel_table_1.add(lblNewLabel_2_1_1, gbc_lblNewLabel_2_1_1);
				
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 20, 20);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		panel_table_1.add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Verdana", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã đơn đặt hàng", "Mã khách hàng", "Tên khách hàng", "Mã nhân viên", "Ngày tạo"
			}
		));
		scrollPane.setViewportView(table);
		// **
		
		// *Table GIỎ HÀNG
		JPanel panel_table_2 = new JPanel();
		panel_table_2.setBorder(new LineBorder(new Color(192, 192, 192)));
		
		GridBagConstraints gbc_panel_table_2 = new GridBagConstraints();
		gbc_panel_table_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_table_2.fill = GridBagConstraints.BOTH;
		gbc_panel_table_2.gridx = 0;
		gbc_panel_table_2.gridy = 1;
		add(panel_table_2, gbc_panel_table_2);
		GridBagLayout gbl_panel_table_2 = new GridBagLayout();
		gbl_panel_table_2.columnWidths = new int[]{0, 0, 0};
		gbl_panel_table_2.rowHeights = new int[]{0, 0, 0};
		gbl_panel_table_2.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_table_2.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_table_2.setLayout(gbl_panel_table_2);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Giỏ hàng");
		lblNewLabel_2_1_1_1.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_2_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_1_1.weightx = 1.0;
		gbc_lblNewLabel_2_1_1_1.gridwidth = 2;
		gbc_lblNewLabel_2_1_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2_1_1_1.gridx = 0;
		gbc_lblNewLabel_2_1_1_1.gridy = 0;
		panel_table_2.add(lblNewLabel_2_1_1_1, gbc_lblNewLabel_2_1_1_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 20, 20);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 1;
		panel_table_2.add(scrollPane_1, gbc_scrollPane_1);
				
		table_1 = new JTable();
		table_1.setFont(new Font("Verdana", Font.PLAIN, 12));		
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT", "Mã mặt hàng", "Tên mặt hàng", "Số lượng", "Giá"
			}
		));
		scrollPane_1.setViewportView(table_1);
		// **
		
		// *Table DANH SÁC SẢN PHẨM
		JPanel panel_table_3 = new JPanel();
		panel_table_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		GridBagConstraints gbc_panel_table_3 = new GridBagConstraints();
		gbc_panel_table_3.insets = new Insets(0, 0, 0, 5);
		gbc_panel_table_3.fill = GridBagConstraints.BOTH;
		gbc_panel_table_3.gridx = 0;
		gbc_panel_table_3.gridy = 2;
		add(panel_table_3, gbc_panel_table_3);
		GridBagLayout gbl_panel_table_3 = new GridBagLayout();
		gbl_panel_table_3.columnWidths = new int[]{0, 144, 322, 163, 0};
		gbl_panel_table_3.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_table_3.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_table_3.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_table_3.setLayout(gbl_panel_table_3);				
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Danh sách sản phẩm");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_2_1_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_1_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2_1_1_1_1.gridwidth = 3;
		gbc_lblNewLabel_2_1_1_1_1.weightx = 1.0;
		gbc_lblNewLabel_2_1_1_1_1.gridx = 1;
		gbc_lblNewLabel_2_1_1_1_1.gridy = 0;
		panel_table_3.add(lblNewLabel_2_1_1_1_1, gbc_lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mã mặt hàng");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.weightx = 0.3;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 1;
		panel_table_3.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Verdana", Font.PLAIN, 12));
		textField_9.setColumns(10);
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.weightx = 0.4;
		gbc_textField_9.insets = new Insets(0, 20, 5, 20);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 2;
		gbc_textField_9.gridy = 1;
		panel_table_3.add(textField_9, gbc_textField_9);
		
		JButton btnNewButton_1 = new JButton("Thêm");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setActionCommand("Thêm");
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.ipadx = 25;
		gbc_btnNewButton_1.weightx = 0.3;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 1;
		panel_table_3.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.gridwidth = 3;
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 20);
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 1;
		gbc_scrollPane_2.gridy = 2;
		panel_table_3.add(scrollPane_2, gbc_scrollPane_2);
		
		table_2 = new JTable();		
		table_2.setFont(new Font("Verdana", Font.PLAIN, 12));		
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT", "Mã mặt hàng", "Tên loại mặt hàng", "Màu", "Size", "Số lượng", "Giá"
			}
		));
		scrollPane_2.setViewportView(table_2);
		// **
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.weightx = 0.5;
		gbc_panel_1.gridheight = 3;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		add(panel_1, gbc_panel_1);		
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 287, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Thông tin hóa đơn");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã đơn hàng:");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.weightx = 0.3;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.PLAIN, 12));
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.ipady = 5;
		gbc_textField.weightx = 0.7;
		gbc_textField.insets = new Insets(0, 0, 5, 15);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		panel_1.add(textField, gbc_textField);
		
		JLabel lblNewLabel_3 = new JLabel("Mã khách hàng:");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.weightx = 0.3;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 2;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Verdana", Font.PLAIN, 12));
		comboBox.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 15);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 2;
		panel_1.add(comboBox, gbc_comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Tên khách hàng:");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.weightx = 0.3;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 3;
		panel_1.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.scrollbar);
		textField_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.ipady = 5;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.weightx = 0.7;
		gbc_textField_2.insets = new Insets(0, 0, 5, 15);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		panel_1.add(textField_2, gbc_textField_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mã mặt hàng:");
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.weightx = 0.3;
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1.gridx = 0;
		gbc_lblNewLabel_1_1.gridy = 4;
		panel_1.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Verdana", Font.PLAIN, 12));
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.ipady = 5;
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.weightx = 0.7;
		gbc_textField_3.insets = new Insets(0, 0, 5, 15);
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 4;
		panel_1.add(textField_3, gbc_textField_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Tên mặt hàng:");
		lblNewLabel_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1_1.weightx = 0.3;
		gbc_lblNewLabel_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1_1.gridx = 0;
		gbc_lblNewLabel_1_1_1.gridy = 5;
		panel_1.add(lblNewLabel_1_1_1, gbc_lblNewLabel_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Verdana", Font.PLAIN, 12));
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 15);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 5;
		panel_1.add(textField_4, gbc_textField_4);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Tổng tiền hàng:");
		lblNewLabel_1_1_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_1_1_2.weightx = 0.3;
		gbc_lblNewLabel_1_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1_2.gridx = 0;
		gbc_lblNewLabel_1_1_2.gridy = 6;
		panel_1.add(lblNewLabel_1_1_2, gbc_lblNewLabel_1_1_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Verdana", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 15);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 6;
		panel_1.add(textField_5, gbc_textField_5);
		
		JLabel lblNewLabel_1_1_3 = new JLabel(" Tiền khách đưa:");
		lblNewLabel_1_1_3.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1_1_3 = new GridBagConstraints();
		gbc_lblNewLabel_1_1_3.weightx = 0.3;
		gbc_lblNewLabel_1_1_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1_3.gridx = 0;
		gbc_lblNewLabel_1_1_3.gridy = 7;
		panel_1.add(lblNewLabel_1_1_3, gbc_lblNewLabel_1_1_3);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Verdana", Font.PLAIN, 12));
		textField_6.setColumns(10);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 15);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 7;
		panel_1.add(textField_6, gbc_textField_6);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel(" Tiền thừa:");
		lblNewLabel_1_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_1_1_3_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1_3_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1_3_1.gridx = 0;
		gbc_lblNewLabel_1_1_3_1.gridy = 8;
		panel_1.add(lblNewLabel_1_1_3_1, gbc_lblNewLabel_1_1_3_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Verdana", Font.PLAIN, 12));
		textField_7.setColumns(10);
		textField_7.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 15);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 8;
		panel_1.add(textField_7, gbc_textField_7);
		
		JLabel lblNewLabel_1_1_3_1_1 = new JLabel(" Hình thức thanh toán:");
		lblNewLabel_1_1_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3_1_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_1_1_3_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1_3_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1_3_1_1.gridx = 0;
		gbc_lblNewLabel_1_1_3_1_1.gridy = 9;
		panel_1.add(lblNewLabel_1_1_3_1_1, gbc_lblNewLabel_1_1_3_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 15);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 9;
		panel_1.add(comboBox_1, gbc_comboBox_1);
		
		JPanel panel_Button = new JPanel();
		GridBagConstraints gbc_panel_Button = new GridBagConstraints();
		gbc_panel_Button.gridwidth = 2;
		gbc_panel_Button.insets = new Insets(0, 0, 5, 0);
		gbc_panel_Button.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_Button.gridx = 0;
		gbc_panel_Button.gridy = 10;
		panel_1.add(panel_Button, gbc_panel_Button);
		GridBagLayout gbl_panel_Button = new GridBagLayout();
		gbl_panel_Button.columnWidths = new int[]{0, 0};
		gbl_panel_Button.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_Button.columnWeights = new double[]{0.0, 4.9E-324};
		gbl_panel_Button.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_Button.setLayout(gbl_panel_Button);
		
		// Icon Tạo đơn hàng -> Chưa hiện icon
		Image iconInvoice = new ImageIcon("Assets/Icon/invoice.png").getImage();
		iconInvoice = iconInvoice.getScaledInstance(50, 30, Image.SCALE_SMOOTH);	
				
		JButton btnInvoice = new JButton("Tạo đơn hàng");
//		btnInvoice.setPreferredSize(new Dimension(60, 40));
		btnInvoice.setIcon(new ImageIcon(iconInvoice));
		panel_Button.add(btnInvoice);
		
		GridBagConstraints gbc_btnInvoice = new GridBagConstraints();
		gbc_btnInvoice.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnInvoice.weightx = 0.3;
		gbc_btnInvoice.insets = new Insets(0, 50, 5, 50);
		gbc_btnInvoice.gridx = 0;
		gbc_btnInvoice.gridy = 1;
		panel_Button.add(btnInvoice, gbc_btnInvoice);
		btnInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInvoice.setFont(new Font("Verdana", Font.PLAIN, 12));	
		
		// Icon Thanh toán -> Chưa hiện icon
		Image iconPayment = new ImageIcon("Assets/Icon/salary.png").getImage();
		iconPayment = iconPayment.getScaledInstance(50, 30, Image.SCALE_SMOOTH);	
			
		JButton btnPayment = new JButton("Thanh toán");
//		btnPayment.setPreferredSize(new Dimension(60, 40));
		btnPayment.setIcon(new ImageIcon(iconPayment));
		panel_Button.add(btnPayment);
		
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnPayment = new GridBagConstraints();
		gbc_btnPayment.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPayment.weightx = 0.3;
		gbc_btnPayment.insets = new Insets(0, 50, 5, 50);
		gbc_btnPayment.gridx = 1;
		gbc_btnPayment.gridy = 1;
		panel_Button.add(btnPayment, gbc_btnPayment);
		btnPayment.setFont(new Font("Verdana", Font.PLAIN, 12));
		
	}
}
