package view;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
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

public class HeadQuarter extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeadQuarter frame = new HeadQuarter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HeadQuarter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(538, 11, 377, 157);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New product price");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBounds(10, 45, 114, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("áp dụng toàn bộ sản phẩm");
		lblNewLabel.setBounds(135, 11, 128, 14);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Day add item");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setBounds(10, 70, 97, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Old product price");
		lblNewLabel_3.setBounds(10, 96, 104, 22);
		panel.add(lblNewLabel_3);
		
		String day[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		JComboBox comboBox = new JComboBox(day);
		comboBox.setBounds(123, 66, 49, 22);
		panel.add(comboBox);
		String month[]= {"1","2","3","4","5","6","7","8","9","10","11","12"};
		JComboBox comboBox_1 = new JComboBox(month);
		comboBox_1.setBounds(204, 66, 38, 22);
		panel.add(comboBox_1);
		String year[]={"2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
		JComboBox comboBox_2 = new JComboBox(year);
		comboBox_2.setBounds(279, 66, 63, 22);
		panel.add(comboBox_2);
		
		textField = new JTextField();
		textField.setBounds(123, 42, 219, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(123, 93, 219, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("change price");
		btnNewButton.setBounds(157, 123, 114, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Name Product");
		lblNewLabel_4.setBounds(1008, 344, 78, 24);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(1096, 346, 225, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("coefficient");
		lblNewLabel_5.setBounds(1008, 382, 78, 24);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(1096, 384, 225, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("coefficient");
		btnNewButton_1.setBounds(1156, 443, 109, 41);
		contentPane.add(btnNewButton_1);
	     
	    this.setSize(1480, 1580);
	    
	    String[] columnNames = {"STT", "Tên SP", "Ngày Nhập", "Hệ số"};
	     Object[][] data = {
	         {"1", "Sản phẩm 1", "12/11/2014", "30"},
	         {"2", "Sản phẩm 2", "23/9/2017", "20"},
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
		 panelProductTable.setBounds(20, 203, 810, 358);
		 contentPane.add(panelProductTable);
		 panelProductTable.setLayout(null);
		     	     
		 JTable productTable = new JTable(model);
		 productTable.getTableHeader().setReorderingAllowed(false);
		     
		 JScrollPane scrollPaneProductTable = new JScrollPane(productTable);
		 scrollPaneProductTable.setBounds(10, 10, 790, 337);
		 panelProductTable.add(scrollPaneProductTable);

}
}
