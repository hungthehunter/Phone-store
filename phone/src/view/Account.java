package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Account extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable detail_table;
	private JTextField txtID;
	private JTextField txtUser;
	private JTextField txtPasswd;
	private JPanel account_panel;

	/**
	 * Create the panel.
	 */
	public Account() {
		
		setLayout(new BorderLayout());'
		
		account_panel = new JPanel();
		account_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JPanel detail_panel = new JPanel();
		detail_panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		detail_panel.setBounds(12, 37, 676, 516);
		detail_panel.setBorder(BorderFactory.createTitledBorder("Thông tin chung"));
		((TitledBorder) detail_panel.getBorder()).setTitleFont(new Font("Verdana", Font.PLAIN, 12));
		account_panel.setLayout(null);
		account_panel.add(detail_panel);
		
		String[] detail_columns =  {"STT", "ID", "Nhân Viên" , "Tên Đăng Nhập" , "Mật Khẩu" , "Quyền" , "Chú Thích"};
		Object[][] detail_data = {
				{"1" , "4K" , "Nguyen Van A" , "A3333" , "123" , "Admin", "test"} ,
				{"" , "" , "" , "" , "" , "" , ""} ,
				{"" , "" , "" , "" , "" , "" , ""} ,
				{"" , "" , "" , "" , "" , "" , ""} ,
				{"" , "" , "" , "" , "" , "" , ""} ,
				{"" , "" , "" , "" , "" , "" , ""} ,
				{"" , "" , "" , "" , "" , "" , ""} ,
				{"" , "" , "" , "" , "" , "" , ""} ,
				{"" , "" , "" , "" , "" , "" , ""} 

		};
		DefaultTableModel detailModel = new DefaultTableModel(detail_data, detail_columns) {
			@Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
		};
		detail_table = new JTable(detailModel);
		detail_table.getTableHeader().setReorderingAllowed(false);
		detail_panel.setLayout(null);
		
		JScrollPane detail_scroll = new JScrollPane(detail_table);
		detail_scroll.setBounds(12, 21, 654, 481);
		detail_panel.add(detail_scroll);
		
		JPanel inf_panel = new JPanel();
		inf_panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		inf_panel.setBounds(698, 37, 351, 626);
		inf_panel.setBorder(BorderFactory.createTitledBorder("Thông tin tài khoản"));
		((TitledBorder) inf_panel.getBorder()).setTitleFont(new Font("Verdana", Font.PLAIN, 12));
		account_panel.add(inf_panel);
		inf_panel.setLayout(null);
		
		JLabel lblID = new JLabel("ID:");
		lblID.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblID.setBounds(15, 40, 75, 13);
		inf_panel.add(lblID);
		
		JLabel lblName = new JLabel("Tên NV:");
		lblName.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblName.setBounds(15, 130, 75, 13);
		inf_panel.add(lblName);
		
		JLabel lblUser = new JLabel("User:");
		lblUser.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblUser.setBounds(15, 220, 75, 13);
		inf_panel.add(lblUser);
		
		JLabel lblPasswd = new JLabel("Password:");
		lblPasswd.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblPasswd.setBounds(15, 310, 96, 16);
		inf_panel.add(lblPasswd);
		
		JLabel lblPermission = new JLabel("Quyền:");
		lblPermission.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblPermission.setBounds(15, 400, 75, 13);
		inf_panel.add(lblPermission);
		
		JLabel lblNote = new JLabel("Ghi chú:");
		lblNote.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNote.setBounds(15, 490, 75, 16);
		inf_panel.add(lblNote);
		
		txtID = new JTextField();
		txtID.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtID.setBounds(120, 32, 179, 22);
		txtID.setEnabled(false);
		txtID.setOpaque(false);
		inf_panel.add(txtID);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtUser.setBounds(120, 215, 179, 22);
		inf_panel.add(txtUser);
		
		txtPasswd = new JTextField();
		txtPasswd.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtPasswd.setBounds(120, 305, 179, 22);
		txtPasswd.setEnabled(false);
		txtPasswd.setOpaque(false);
		inf_panel.add(txtPasswd);
		
		JComboBox cbbName = new JComboBox();
		cbbName.setBounds(120, 125, 179, 22);
		inf_panel.add(cbbName);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(120, 395, 179, 22);
		inf_panel.add(comboBox_1);
		
		JTextArea txtNote = new JTextArea("");
		txtNote.setBounds(120, 437, 177, 79);
		JScrollPane note_scroll = new JScrollPane(txtNote);
		note_scroll.setBounds(120, 485, 179, 100);
		inf_panel.add(note_scroll);
		
		JPanel btn_panel = new JPanel();
		btn_panel.setBounds(264, 563, 424, 98);
		account_panel.add(btn_panel);
		btn_panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		btn_panel.setBorder(BorderFactory.createTitledBorder("Chức năng"));
		btn_panel.setLayout(null);
		
		Image addIcon = new ImageIcon("Assets/add.png").getImage();
		addIcon = addIcon.getScaledInstance(54, 36, Image.SCALE_SMOOTH);
		
		Image acceptIcon = new ImageIcon("Assets/accept.png").getImage();
		acceptIcon = acceptIcon.getScaledInstance(54, 36, Image.SCALE_SMOOTH);
		
		Image deleteIcon = new ImageIcon("Assets/delete.png").getImage();
		deleteIcon = deleteIcon.getScaledInstance(54, 36, Image.SCALE_SMOOTH);
		
		Image clearIcon = new ImageIcon("Assets/clear.png").getImage();
		clearIcon = clearIcon.getScaledInstance(54, 36, Image.SCALE_SMOOTH);
		
		JButton btnAddStaffAccount = new JButton("");
		btnAddStaffAccount.setBounds(50, 31, 54, 36);
		btnAddStaffAccount.setIcon(new ImageIcon(addIcon));
		btn_panel.add(btnAddStaffAccount);
		
		JButton btnAcceptStaffAccount = new JButton("");
		btnAcceptStaffAccount.setBounds(150, 31, 54, 36);
		btnAcceptStaffAccount.setIcon(new ImageIcon(acceptIcon));
		btn_panel.add(btnAcceptStaffAccount);
		
		JButton btnDeleteStaffAccount = new JButton("");
		btnDeleteStaffAccount.setBounds(250, 31, 54, 36);
		btnDeleteStaffAccount.setIcon(new ImageIcon(deleteIcon));
		btn_panel.add(btnDeleteStaffAccount);
		
		JButton btnClearStaffAccount = new JButton("");
		btnClearStaffAccount.setBounds(350, 31, 54, 36);
		btnClearStaffAccount.setIcon(new ImageIcon(clearIcon));
		btn_panel.add(btnClearStaffAccount);
		
		add(account_panel , BorderLayout.CENTER);
	}

}
