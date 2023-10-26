package view;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;


public class invoice extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					invoice frame = new invoice();
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
	public invoice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1408, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBounds(1021, 26, 266, 294);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID product");
		lblNewLabel_1.setBounds(10, 11, 59, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(79, 8, 177, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("staff");
		lblNewLabel_2.setBounds(10, 36, 46, 25);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(79, 39, 177, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Customer");
		lblNewLabel_3.setBounds(10, 72, 46, 14);
		panel.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(79, 72, 177, 22);
		panel.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(79, 105, 177, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Date");
		lblNewLabel_4.setBounds(10, 108, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("total amount");
		lblNewLabel_5.setBounds(10, 145, 70, 25);
		panel.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(79, 147, 177, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(79, 178, 177, 97);
		panel.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JLabel lblNewLabel_6 = new JLabel("Note");
		lblNewLabel_6.setBounds(23, 178, 46, 25);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("purchase order information");
		lblNewLabel.setBounds(1022, 11, 167, 24);
		contentPane.add(lblNewLabel);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnNewButton = new JButton("than....");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(1297, 26, 63, 53);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Ain1144\\Pictures\\New Folder\\add-outline-icon (1).png"));
		btnNewButton_1.setBounds(1307, 90, 42, 39);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Ain1144\\Pictures\\New Folder\\Trash-empty-icon.png"));
		btnNewButton_2.setBounds(1307, 190, 42, 45);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Ain1144\\Pictures\\New Folder\\Button-Refresh-icon.png"));
		btnNewButton_3.setBounds(1304, 246, 45, 45);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Ain1144\\Pictures\\New Folder\\media-floppy-icon.png"));
		btnNewButton_4.setBounds(1307, 140, 42, 39);
		contentPane.add(btnNewButton_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1021, 357, 266, 307);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("ID CMTHD");
		lblNewLabel_8.setBounds(10, 11, 58, 14);
		panel_1.add(lblNewLabel_8);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(78, 8, 178, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("ID MH");
		lblNewLabel_9.setBounds(10, 36, 46, 14);
		panel_1.add(lblNewLabel_9);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(78, 33, 178, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(78, 64, 178, 22);
		panel_1.add(comboBox_2);
		
		JLabel lblNewLabel_10 = new JLabel("product");
		lblNewLabel_10.setBounds(10, 61, 58, 34);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("ID IMID");
		lblNewLabel_11.setBounds(10, 92, 58, 20);
		panel_1.add(lblNewLabel_11);
		
		textField_5 = new JTextField();
		textField_5.setBounds(78, 97, 178, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("guarantee");
		lblNewLabel_12.setBounds(10, 123, 58, 14);
		panel_1.add(lblNewLabel_12);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(78, 128, 178, 22);
		panel_1.add(comboBox_3);
		
		JLabel lblNewLabel_13 = new JLabel("note");
		lblNewLabel_13.setBounds(10, 235, 46, 14);
		panel_1.add(lblNewLabel_13);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(78, 235, 178, 61);
		panel_1.add(scrollPane_1);
		
		JTextPane textPane_1 = new JTextPane();
		scrollPane_1.setViewportView(textPane_1);
		
		JLabel lblNewLabel_14 = new JLabel("number");
		lblNewLabel_14.setBounds(10, 157, 58, 20);
		panel_1.add(lblNewLabel_14);
		
		textField_6 = new JTextField();
		textField_6.setBounds(78, 161, 178, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Price");
		lblNewLabel_15.setBounds(10, 199, 46, 14);
		panel_1.add(lblNewLabel_15);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(78, 204, 178, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("entry information");
		lblNewLabel_7.setBounds(1021, 331, 90, 24);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\Ain1144\\Pictures\\New Folder\\Add-Outline-icon.png"));
		btnNewButton_5.setBounds(1297, 357, 42, 39);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\Ain1144\\Pictures\\New Folder\\Trash-empty-icon.png"));
		btnNewButton_6.setBounds(1297, 402, 42, 45);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setIcon(new ImageIcon("C:\\Users\\Ain1144\\Pictures\\New Folder\\Button-Refresh-icon.png"));
		btnNewButton_7.setBounds(1297, 458, 42, 39);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setIcon(new ImageIcon("C:\\Users\\Ain1144\\Pictures\\New Folder\\media-floppy-icon.png"));
		btnNewButton_8.setBounds(1297, 508, 42, 39);
		contentPane.add(btnNewButton_8);
		
		 String[] columnNames = {"mã HĐ", "Khách Hàng", "Nhân viên", "ngày lập hóa đơn","tổng tiền"};
	     Object[][] data = {
	         {"GHN1", "Lê Trung Hiếu","Vũ Nguyễn Quang Vinh", "22/6/2014", "23tr9"},
	         {"YHY2", "Hồ Ngọc Hà","Cao Chấn Vũ ","13/2/2013", "4tr9"},
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
		 panelProductTable.setBounds(20, 20, 910, 320);
		 contentPane.add(panelProductTable);
		 panelProductTable.setLayout(null);
		     	     
		 JTable productTable = new JTable(model);
		 productTable.getTableHeader().setReorderingAllowed(false);
		     
		 JScrollPane scrollPaneProductTable = new JScrollPane(productTable);
		 scrollPaneProductTable.setBounds(10, 10, 890, 300);
		 panelProductTable.add(scrollPaneProductTable);
		 
		 
		 String[] columnNames1 = {"mã CTHĐ","mã HĐ","SP","mã IMEI", "số lượng", "Thành tiền", "ghi chú"};
	     Object[][] data1 = {
	         {"GHN01", "GHN1","Sản phẩm 1","001", "23","23tr9","no"},
	         {"YHY02", "YHY2","Sản phẩm 2","002", "41","4tr9","no"},
	     };
		 DefaultTableModel model1 = new DefaultTableModel(data1, columnNames1) {
	            @Override
	            public boolean isCellEditable(int row, int column) {
	                return false;
	            }
	        };
	     //Product Table Area1
		 JPanel panelProductTable1 = new JPanel();
		 panelProductTable1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		 panelProductTable1.setBounds(20, 230, 910, 420);
		 contentPane.add(panelProductTable1);
		 panelProductTable1.setLayout(null);
		     	     
		 JTable productTable1 = new JTable(model);
		 productTable1.getTableHeader().setReorderingAllowed(false);
		     
		 JScrollPane scrollPaneProductTable1 = new JScrollPane(productTable1);
		 scrollPaneProductTable1.setBounds(10, 150, 890, 150);
		 panelProductTable1.add(scrollPaneProductTable1);
	}
}


