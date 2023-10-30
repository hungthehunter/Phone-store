package view;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

@SuppressWarnings("unused")
public class Employee extends JPanel{

	private static final long serialVersionUID = 1L;
	private JPanel employee_panel;
	private JTable detail_table;
	private JTextField txtPasswd;
	private JTextField txtID;
	private JTextField txtUser;
	private JTextField txtmaNV;
	private JTextField txtTenNV;
	private JTextField txtDiaChi;
	private JTextField txtSDT;
	private JTextField txtImg;
	private JComboBox cbbBDay;
	private JComboBox cbbBMonth;
	private JComboBox cbbBYear;
	private JTextField textField;
	
	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	
	public Employee(){
		setLayout(new BorderLayout());
		
		employee_panel = new JPanel();
		
//		setContentPane(employee_panel);
		
		employee_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		employee_panel.setBounds(2, 2, 1110, 856);
		employee_panel.setLayout(null);
		
		JPanel detail_panel = new JPanel();
		detail_panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		detail_panel.setBounds(5, 5, 704, 444);
		detail_panel.setBorder(BorderFactory.createTitledBorder("Thông tin chung"));
		employee_panel.add(detail_panel);
		
		String[] detail_columns =  {"Mã NV", "Tên NV", "Ngày Sinh" , "Giới Tính" , "Ngày Vào Làm" , 
											"Chức Vụ" , "Địa Chỉ" , "SDT" , "Hình Ảnh" , "Chú Thích"};
		Object[][] detail_data = {
				{"1A" , "Nguyen Van A" , "12/12/2002" , "Nam" , "12/12/2023" , "Tiếp Tân", "52 Đường số 1" , "010101010101" , "pic" , "Test"} ,
				{"" , "" , "" , "" , "" , "" , "" , "" , "" ,""} ,
				{"" , "" , "" , "" , "" , "" , "" , "" , "" ,""} ,
				{"" , "" , "" , "" , "" , "" , "" , "" , "" ,""} ,
				{"" , "" , "" , "" , "" , "" , "" , "" , "" ,""} ,
				{"" , "" , "" , "" , "" , "" , "" , "" , "" ,""} ,
				{"" , "" , "" , "" , "" , "" , "" , "" , "" ,""} ,

		};
		DefaultTableModel detailModel = new DefaultTableModel(detail_data, detail_columns){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
		detail_table = new JTable(detailModel);
		detail_table.getTableHeader().setReorderingAllowed(false);
		detail_panel.setLayout(null);
		JScrollPane detail_scroll = new JScrollPane(detail_table);
		detail_scroll.setBounds(12, 21, 677, 401);
		detail_panel.add(detail_scroll);
		
		JPanel account_panel = new JPanel();
		account_panel.setBounds(720, 10, 343, 604);
		employee_panel.add(account_panel);
		account_panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		account_panel.setBorder(BorderFactory.createTitledBorder("Thông tin tài khoản"));
		account_panel.setLayout(null);
		
		JLabel lblmaNV = new JLabel("Mã NV:");
		lblmaNV.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblmaNV.setBounds(15, 30, 75, 13);
		account_panel.add(lblmaNV);
		
		JLabel lvlTenNV = new JLabel("Tên NV:");
		lvlTenNV.setFont(new Font("Verdana", Font.PLAIN, 12));
		lvlTenNV.setBounds(15, 81, 75, 13);
		account_panel.add(lvlTenNV);
		
		JLabel lblBDay = new JLabel("Ngày sinh:");
		lblBDay.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblBDay.setBounds(15, 132, 89, 13);
		account_panel.add(lblBDay);
		
		JLabel lblGender = new JLabel("Giới tính:");
		lblGender.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblGender.setBounds(15, 183, 89, 13);
		account_panel.add(lblGender);
		
		JLabel lblDayIn = new JLabel("Ngày vào làm:");
		lblDayIn.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblDayIn.setBounds(15, 234, 89, 13);
		account_panel.add(lblDayIn);
		
		JLabel lblPermission = new JLabel("Chức vụ:");
		lblPermission.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblPermission.setBounds(15, 285, 75, 13);
		account_panel.add(lblPermission);
		
		JLabel lblAddr = new JLabel("Địa chỉ");
		lblAddr.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblAddr.setBounds(15, 336, 75, 13);
		account_panel.add(lblAddr);
		
		JLabel lblNum = new JLabel("SDT:");
		lblNum.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNum.setBounds(15, 387, 75, 13);
		account_panel.add(lblNum);
		
		JButton lblImg = new JButton("Hình ảnh:");
		lblImg.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblImg.setBounds(15, 432, 89, 25);
		account_panel.add(lblImg);
		
		JLabel lblNote = new JLabel("Chú thích:");
		lblNote.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNote.setBounds(15, 498, 75, 13);
		account_panel.add(lblNote);
		
		txtmaNV = new JTextField();
		txtmaNV.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtmaNV.setBounds(120, 22, 200, 25);
		account_panel.add(txtmaNV);
		
		txtTenNV = new JTextField();
		txtTenNV.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtTenNV.setBounds(120, 73, 200, 25);
		account_panel.add(txtTenNV);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtDiaChi.setBounds(120, 328, 200, 25);
		account_panel.add(txtDiaChi);
		
		txtSDT = new JTextField();
		txtSDT.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtSDT.setBounds(120, 379, 200, 25);
		account_panel.add(txtSDT);
		
		txtImg = new JTextField();
		txtImg.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtImg.setBounds(120, 432, 200, 25);
		account_panel.add(txtImg);
		
		JTextArea txtNote = new JTextArea("");
		JScrollPane note_scroll = new JScrollPane(txtNote);
		note_scroll.setBounds(120, 490, 200, 100);
		account_panel.add(note_scroll);
		
		cbbBDay = new JComboBox();
		//cbbBDay.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cbbBDay.setFont(new Font("Verdana", Font.PLAIN, 12));
		cbbBDay.setBounds(120, 128, 46, 21);
		account_panel.add(cbbBDay);
		
		cbbBMonth = new JComboBox();
		cbbBMonth.setFont(new Font("Verdana", Font.PLAIN, 12));
		cbbBMonth.setBounds(176, 128, 46, 21);
		account_panel.add(cbbBMonth);
		
		cbbBYear = new JComboBox();
		cbbBYear.setFont(new Font("Verdana", Font.PLAIN, 12));
		cbbBYear.setBounds(232, 128, 88, 21);
		account_panel.add(cbbBYear);
		
		JRadioButton rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setFont(new Font("Verdana", Font.PLAIN, 12));
		rdbtnNam.setBounds(120, 180, 64, 21);
		account_panel.add(rdbtnNam);
		
		JRadioButton rdbtnNu = new JRadioButton("Nu");
		rdbtnNu.setFont(new Font("Verdana", Font.PLAIN, 12));
		rdbtnNu.setBounds(232, 180, 64, 21);
		account_panel.add(rdbtnNu);
		
		JComboBox cbbWDay = new JComboBox();
		cbbWDay.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cbbWDay.setFont(new Font("Verdana", Font.PLAIN, 12));
		cbbWDay.setBounds(120, 230, 46, 21);
		account_panel.add(cbbWDay);
		
		JComboBox cbbWMonth = new JComboBox();
		cbbWMonth.setFont(new Font("Verdana", Font.PLAIN, 12));
		cbbWMonth.setBounds(176, 230, 46, 21);
		account_panel.add(cbbWMonth);
		
		JComboBox cbbWYear = new JComboBox();
		cbbWYear.setFont(new Font("Verdana", Font.PLAIN, 12));
		cbbWYear.setBounds(232, 230, 88, 21);
		account_panel.add(cbbWYear);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(120, 281, 200, 25);
		account_panel.add(comboBox);
		
		JPanel search_panel = new JPanel();
		search_panel.setBounds(15, 459, 257, 155);
		employee_panel.add(search_panel);
		search_panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		search_panel.setBorder(BorderFactory.createTitledBorder("Tìm kiếm"));
		search_panel.setLayout(null);
		
		JLabel lblSearchTenNV = new JLabel("Tên NV:");
		lblSearchTenNV.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblSearchTenNV.setBounds(10, 59, 52, 21);
		search_panel.add(lblSearchTenNV);
		
		JCheckBox cbbtnSearch = new JCheckBox("Tìm kiếm");
		cbbtnSearch.setBounds(77, 17, 75, 32);
		search_panel.add(cbbtnSearch);
		
		JLabel lblSearchChucVu = new JLabel("Chức vụ:");
		lblSearchChucVu.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblSearchChucVu.setBounds(10, 104, 57, 21);
		search_panel.add(lblSearchChucVu);
		
		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.PLAIN, 12));
		textField.setBounds(70, 55, 155, 25);
		search_panel.add(textField);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(70, 100, 155, 25);
		search_panel.add(comboBox_1);
		
		JPanel employee_btn_panel = new JPanel();
		employee_btn_panel.setBounds(509, 459, 200, 155);
		employee_panel.add(employee_btn_panel);
		employee_btn_panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		employee_btn_panel.setBorder(BorderFactory.createTitledBorder("Chức năng"));
		employee_btn_panel.setLayout(null);
		
		Image addIcon = new ImageIcon("Assets/Icon/add.png").getImage();
		addIcon = addIcon.getScaledInstance(41, 32, Image.SCALE_SMOOTH);
		
		Image deleteIcon = new ImageIcon("Assets/Icon/delete.png").getImage();
		deleteIcon = deleteIcon.getScaledInstance(41, 32, Image.SCALE_SMOOTH);
		
		Image acceptIcon = new ImageIcon("Assets/Icon/accept.png").getImage();
		acceptIcon = acceptIcon.getScaledInstance(41, 32, Image.SCALE_SMOOTH);
		
		Image clearIcon = new ImageIcon("Assets/Icon/clear.png").getImage();
		clearIcon = clearIcon.getScaledInstance(41, 32, Image.SCALE_SMOOTH);
		
		JButton btnAddStaff = new JButton("");
		btnAddStaff.setBounds(23, 20, 41, 32);
		btnAddStaff.setIcon(new ImageIcon(addIcon));
		employee_btn_panel.add(btnAddStaff);
		
		JButton btnDeleteStaff = new JButton("");
		btnDeleteStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeleteStaff.setBounds(23, 95, 41, 32);
		btnDeleteStaff.setIcon(new ImageIcon(deleteIcon));
		employee_btn_panel.add(btnDeleteStaff);
		
		JButton btnAcceptStaff = new JButton("");
		btnAcceptStaff.setBounds(122, 20, 41, 32);
		btnAcceptStaff.setIcon(new ImageIcon(acceptIcon));
		employee_btn_panel.add(btnAcceptStaff);
		
		JButton btnClearStaff = new JButton("");
		btnClearStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClearStaff.setBounds(122, 95, 41, 32);
		btnClearStaff.setIcon(new ImageIcon(clearIcon));
		employee_btn_panel.add(btnClearStaff);
		
		JPanel pic_panel = new JPanel();
		pic_panel.setBounds(291, 459, 200, 155);
		employee_panel.add(pic_panel);
		pic_panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		pic_panel.setBorder(BorderFactory.createTitledBorder("Hình ảnh"));
		pic_panel.setLayout(null);

		add(employee_panel, BorderLayout.CENTER);
	}
}
