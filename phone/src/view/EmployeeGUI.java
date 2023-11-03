package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.TextArea;
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
public class EmployeeGUI extends JPanel{

	private static final long serialVersionUID = 1L;
	private JTextField txtEmpSearch;
	private JTextField txtEmpId;
	private JTextField txtEmpName;
	private JTextField txtEmpAddrs;
	private JTextField txtEmpNum;
	private JTextField txtEmpEmail;
	private JTextField txtEmpBirth;
	private JTextField txtImage;
	
	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	
	public EmployeeGUI(){
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {400, 400, 400};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel tablePanel = new JPanel();
		tablePanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_tablePanel = new GridBagConstraints();
		gbc_tablePanel.gridheight = 2;
		gbc_tablePanel.weighty = 1.0;
		gbc_tablePanel.weightx = 1.0;
		gbc_tablePanel.gridwidth = 2;
		gbc_tablePanel.insets = new Insets(5, 5, 5, 5);
		gbc_tablePanel.fill = GridBagConstraints.BOTH;
		gbc_tablePanel.gridx = 0;
		gbc_tablePanel.gridy = 0;
		add(tablePanel, gbc_tablePanel);
		GridBagLayout gbl_tablePanel = new GridBagLayout();
		gbl_tablePanel.columnWidths = new int[]{346, 0};
		gbl_tablePanel.rowHeights = new int[]{16, 0, 83, 0};
		gbl_tablePanel.columnWeights = new double[]{1.0, 0.0};
		gbl_tablePanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		tablePanel.setLayout(gbl_tablePanel);
		
		
		JLabel lblTable = new JLabel("Thông Tin Nhân Viên");
		GridBagConstraints gbc_lblTable = new GridBagConstraints();
		gbc_lblTable.gridwidth = 2;
		gbc_lblTable.anchor = GridBagConstraints.NORTH;
		gbc_lblTable.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTable.insets = new Insets(0, 0, 5, 0);
		gbc_lblTable.gridx = 0;
		gbc_lblTable.gridy = 0;
		tablePanel.add(lblTable, gbc_lblTable);
		lblTable.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblTable.setOpaque(true);
		lblTable.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtEmpSearch = new JTextField();
		GridBagConstraints gbc_txtEmpSearch = new GridBagConstraints();
		gbc_txtEmpSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmpSearch.insets = new Insets(0, 10, 5, 5);
		gbc_txtEmpSearch.gridx = 0;
		gbc_txtEmpSearch.gridy = 1;
		tablePanel.add(txtEmpSearch, gbc_txtEmpSearch);
		txtEmpSearch.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtEmpSearch.setColumns(12);
		
		JButton btnSearch = new JButton("Tìm kiếm");
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.insets = new Insets(0, 0, 5, 5);
		gbc_btnSearch.gridx = 1;
		gbc_btnSearch.gridy = 1;
		tablePanel.add(btnSearch, gbc_btnSearch);
		GridBagConstraints gbc_scrollEmployeeTable = new GridBagConstraints();
		gbc_scrollEmployeeTable.insets = new Insets(5, 5, 5, 5);
		
		gbc_scrollEmployeeTable.gridwidth = 2;
		gbc_scrollEmployeeTable.gridheight = 2;
		gbc_scrollEmployeeTable.fill = GridBagConstraints.BOTH;
		gbc_scrollEmployeeTable.gridx = 0;
		gbc_scrollEmployeeTable.gridy = 2;
		
	    
		 String[] columnNames1 = {"STT" ,"Mã Nhân Viên", "Tên Nhân Viên", "Ngày Sinh", "Giới Tính", "Email" , "Số Điện Thoại", "Địa Chỉ", "Chức Vụ", "Ghi Chú"};
		    Object[][] data1 = {
		         {"1" ,"NVA", "Nguyễn Văn A", "09/12/2000", "Nam", "nva@gmail.com", "0909298272", "43/23 Đường Số 1", "Quản lý", ""},
		         {"2", "NVB", "Nguyễn Văn B", "01/12/2000", "Nam", "nvb@gmail.com", "0909292272", "43/23 Đường Số 4", "Nhân viên" , ""},
		     };
		     
	     
	    DefaultTableModel modelEmployee = new DefaultTableModel(data1, columnNames1) {
	            @Override
	            public boolean isCellEditable(int row, int column) {
	                return false;
	            }
	     };
	    JTable EmployeeTable = new JTable(modelEmployee);
		EmployeeTable.getTableHeader().setReorderingAllowed(false);
		JScrollPane scrollEmployeeTable = new JScrollPane(EmployeeTable);
		tablePanel.add(scrollEmployeeTable, gbc_scrollEmployeeTable);

		
		JPanel inputPanel = new JPanel();
		inputPanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_inputPanel = new GridBagConstraints();
		gbc_inputPanel.insets = new Insets(5, 0, 5, 5);
		gbc_inputPanel.gridheight = 2;
		gbc_inputPanel.weighty = 1.0;
		gbc_inputPanel.weightx = 1.0;
		gbc_inputPanel.fill = GridBagConstraints.BOTH;
		gbc_inputPanel.gridx = 2;
		gbc_inputPanel.gridy = 0;
		add(inputPanel, gbc_inputPanel);
		GridBagLayout gbl_inputPanel = new GridBagLayout();
		gbl_inputPanel.columnWidths = new int[] {0, 73, 69};
		gbl_inputPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 72, 0, -68, 64, 0};
		gbl_inputPanel.columnWeights = new double[]{0.0, 1.0, 1.0};
		gbl_inputPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		inputPanel.setLayout(gbl_inputPanel);
		
		JLabel lblInfo = new JLabel("Thông Tin Cá Nhân");
		GridBagConstraints gbc_lblInfo = new GridBagConstraints();
		gbc_lblInfo.insets = new Insets(10, 0, 10, 0);
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		gbc_lblInfo.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblInfo.gridwidth = 3;
		gbc_lblInfo.gridx = 0;
		gbc_lblInfo.gridy = 0;
		inputPanel.add(lblInfo, gbc_lblInfo);
		
		JLabel lblEmpId = new JLabel("Mã NV:");
		lblEmpId.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEmpId = new GridBagConstraints();
		gbc_lblEmpId.weightx = 1.0;
		gbc_lblEmpId.insets = new Insets(0, 0, 10, 5);
		gbc_lblEmpId.gridx = 0;
		gbc_lblEmpId.gridy = 1;
		inputPanel.add(lblEmpId, gbc_lblEmpId);
		
		txtEmpId = new JTextField();
		txtEmpId.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_txtEmpId = new GridBagConstraints();
		gbc_txtEmpId.weightx = 1.0;
		gbc_txtEmpId.gridwidth = 2;
		gbc_txtEmpId.insets = new Insets(0, 0, 10, 0);
		gbc_txtEmpId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmpId.gridx = 1;
		gbc_txtEmpId.gridy = 1;
		inputPanel.add(txtEmpId, gbc_txtEmpId);
		txtEmpId.setColumns(10);
		
		JLabel lblEmpName = new JLabel("Tên nhân viên:");
		lblEmpName.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEmpName = new GridBagConstraints();
		gbc_lblEmpName.insets = new Insets(0, 0, 10, 5);
		gbc_lblEmpName.gridx = 0;
		gbc_lblEmpName.gridy = 2;
		inputPanel.add(lblEmpName, gbc_lblEmpName);
		
		txtEmpName = new JTextField();
		txtEmpName.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtEmpName.setColumns(10);
		GridBagConstraints gbc_txtEmpName = new GridBagConstraints();
		gbc_txtEmpName.gridwidth = 2;
		gbc_txtEmpName.insets = new Insets(0, 0, 10, 0);
		gbc_txtEmpName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmpName.gridx = 1;
		gbc_txtEmpName.gridy = 2;
		inputPanel.add(txtEmpName, gbc_txtEmpName);
		
		JLabel lblEmpBirth = new JLabel("Ngày sinh:");
		lblEmpBirth.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEmpBirth = new GridBagConstraints();
		gbc_lblEmpBirth.insets = new Insets(0, 0, 10, 5);
		gbc_lblEmpBirth.gridx = 0;
		gbc_lblEmpBirth.gridy = 3;
		inputPanel.add(lblEmpBirth, gbc_lblEmpBirth);
		
		txtEmpBirth = new JTextField();
		txtEmpBirth.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtEmpBirth.setColumns(10);
		GridBagConstraints gbc_txtEmpBirth = new GridBagConstraints();
		gbc_txtEmpBirth.gridwidth = 2;
		gbc_txtEmpBirth.insets = new Insets(0, 0, 10, 0);
		gbc_txtEmpBirth.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmpBirth.gridx = 1;
		gbc_txtEmpBirth.gridy = 3;
		inputPanel.add(txtEmpBirth, gbc_txtEmpBirth);
		
		JLabel lblGender = new JLabel("Giới tính:");
		lblGender.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblGender = new GridBagConstraints();
		gbc_lblGender.insets = new Insets(0, 0, 10, 5);
		gbc_lblGender.gridx = 0;
		gbc_lblGender.gridy = 4;
		inputPanel.add(lblGender, gbc_lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Nam");
		GridBagConstraints gbc_rdbtnMale = new GridBagConstraints();
		gbc_rdbtnMale.insets = new Insets(0, 0, 10, 5);
		gbc_rdbtnMale.gridx = 1;
		gbc_rdbtnMale.gridy = 4;
		inputPanel.add(rdbtnMale, gbc_rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Nữ");
		GridBagConstraints gbc_rdbtnFemale = new GridBagConstraints();
		gbc_rdbtnFemale.insets = new Insets(0, 0, 10, 0);
		gbc_rdbtnFemale.gridx = 2;
		gbc_rdbtnFemale.gridy = 4;
		inputPanel.add(rdbtnFemale, gbc_rdbtnFemale);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 10, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 5;
		inputPanel.add(lblEmail, gbc_lblEmail);
		
		txtEmpEmail = new JTextField();
		txtEmpEmail.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtEmpEmail.setColumns(10);
		GridBagConstraints gbc_txtEmpEmail = new GridBagConstraints();
		gbc_txtEmpEmail.gridwidth = 2;
		gbc_txtEmpEmail.insets = new Insets(0, 0, 10, 0);
		gbc_txtEmpEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmpEmail.gridx = 1;
		gbc_txtEmpEmail.gridy = 5;
		inputPanel.add(txtEmpEmail, gbc_txtEmpEmail);
		
		JLabel lblEmpNum = new JLabel("SĐT:");
		lblEmpNum.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEmpNum = new GridBagConstraints();
		gbc_lblEmpNum.insets = new Insets(0, 0, 10, 5);
		gbc_lblEmpNum.gridx = 0;
		gbc_lblEmpNum.gridy = 6;
		inputPanel.add(lblEmpNum, gbc_lblEmpNum);
		
		txtEmpNum = new JTextField();
		txtEmpNum.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtEmpNum.setColumns(10);
		GridBagConstraints gbc_txtEmpNum = new GridBagConstraints();
		gbc_txtEmpNum.gridwidth = 2;
		gbc_txtEmpNum.insets = new Insets(0, 0, 10, 0);
		gbc_txtEmpNum.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmpNum.gridx = 1;
		gbc_txtEmpNum.gridy = 6;
		inputPanel.add(txtEmpNum, gbc_txtEmpNum);
		
		JLabel lblAddrs = new JLabel("Địa chỉ:");
		lblAddrs.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblAddrs = new GridBagConstraints();
		gbc_lblAddrs.insets = new Insets(0, 0, 10, 5);
		gbc_lblAddrs.gridx = 0;
		gbc_lblAddrs.gridy = 7;
		inputPanel.add(lblAddrs, gbc_lblAddrs);
		
		txtEmpAddrs = new JTextField();
		txtEmpAddrs.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtEmpAddrs.setColumns(10);
		GridBagConstraints gbc_txtEmpAddrs = new GridBagConstraints();
		gbc_txtEmpAddrs.gridwidth = 2;
		gbc_txtEmpAddrs.insets = new Insets(0, 0, 10, 0);
		gbc_txtEmpAddrs.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmpAddrs.gridx = 1;
		gbc_txtEmpAddrs.gridy = 7;
		inputPanel.add(txtEmpAddrs, gbc_txtEmpAddrs);
		
		JLabel lblEmpPos = new JLabel("Chức vụ:");
		lblEmpPos.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEmpPos = new GridBagConstraints();
		gbc_lblEmpPos.insets = new Insets(0, 0, 10, 5);
		gbc_lblEmpPos.gridx = 0;
		gbc_lblEmpPos.gridy = 8;
		inputPanel.add(lblEmpPos, gbc_lblEmpPos);
		
		JComboBox cbBEmpPos = new JComboBox();
		GridBagConstraints gbc_cbBEmpPos = new GridBagConstraints();
		gbc_cbBEmpPos.gridwidth = 2;
		gbc_cbBEmpPos.insets = new Insets(0, 0, 10, 0);
		gbc_cbBEmpPos.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbBEmpPos.gridx = 1;
		gbc_cbBEmpPos.gridy = 8;
		inputPanel.add(cbBEmpPos, gbc_cbBEmpPos);
		
		JButton btnImage = new JButton("Image");
		GridBagConstraints gbc_btnImage = new GridBagConstraints();
		gbc_btnImage.insets = new Insets(0, 0, 5, 5);
		gbc_btnImage.gridx = 0;
		gbc_btnImage.gridy = 9;
		inputPanel.add(btnImage, gbc_btnImage);
		
		txtImage = new JTextField();
		txtImage.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtImage.setColumns(10);
		GridBagConstraints gbc_txtImage = new GridBagConstraints();
		gbc_txtImage.gridwidth = 2;
		gbc_txtImage.insets = new Insets(0, 0, 5, 0);
		gbc_txtImage.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtImage.gridx = 1;
		gbc_txtImage.gridy = 9;
		inputPanel.add(txtImage, gbc_txtImage);
		
		JLabel lblImage = new JLabel("Hình Ảnh");
		lblImage.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblImage = new GridBagConstraints();
		gbc_lblImage.gridwidth = 3;
		gbc_lblImage.insets = new Insets(0, 0, 5, 0);
		gbc_lblImage.gridx = 0;
		gbc_lblImage.gridy = 10;
		inputPanel.add(lblImage, gbc_lblImage);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 3;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 12;
		inputPanel.add(panel, gbc_panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEmpNote = new JLabel("Ghi chú:");
		lblEmpNote.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEmpNote = new GridBagConstraints();
		gbc_lblEmpNote.anchor = GridBagConstraints.NORTH;
		gbc_lblEmpNote.insets = new Insets(0, 0, 10, 5);
		gbc_lblEmpNote.gridx = 0;
		gbc_lblEmpNote.gridy = 13;
		inputPanel.add(lblEmpNote, gbc_lblEmpNote);
		
		TextArea textArea = new TextArea();
		textArea.setColumns(1);
		textArea.setRows(4);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.fill = GridBagConstraints.HORIZONTAL;
		gbc_textArea.anchor = GridBagConstraints.NORTH;
		gbc_textArea.gridwidth = 2;
		gbc_textArea.insets = new Insets(0, 0, 5, 0);
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 13;
		inputPanel.add(textArea, gbc_textArea);
		
		JPanel btnPanel = new JPanel();
		GridBagConstraints gbc_btnPanel = new GridBagConstraints();
		gbc_btnPanel.insets = new Insets(0, 5, 0, 0);
		gbc_btnPanel.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPanel.gridwidth = 3;
		gbc_btnPanel.gridx = 0;
		gbc_btnPanel.gridy = 14;
		inputPanel.add(btnPanel, gbc_btnPanel);
		btnPanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Image iconAdd = new ImageIcon("Assets/Icon/add.png").getImage();
		iconAdd = iconAdd.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		Image iconDelete = new ImageIcon("Assets/Icon/delete.png").getImage();
		iconDelete = iconDelete.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		Image iconAccept = new ImageIcon("Assets/Icon/accept.png").getImage();
		iconAccept = iconAccept.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		Image iconClear = new ImageIcon("Assets/Icon/clear.png").getImage();
		iconClear = iconClear.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		
		JButton btnAdd = new JButton("");
		btnAdd.setIcon(new ImageIcon(iconAdd));
		btnAdd.setPreferredSize(new Dimension(60, 40));
		btnPanel.add(btnAdd);
		
		JButton btnDelete= new JButton("");
		btnDelete.setIcon(new ImageIcon(iconDelete));
		btnDelete.setPreferredSize(new Dimension(60, 40));
		btnPanel.add(btnDelete);
		
		JButton btnAccept = new JButton("");
		btnAccept.setIcon(new ImageIcon(iconAccept));
		btnAccept.setPreferredSize(new Dimension(60, 40));
		btnPanel.add(btnAccept);
		
		JButton btnClear = new JButton("");
		btnClear.setIcon(new ImageIcon(iconClear));
		btnClear.setPreferredSize(new Dimension(60, 40));
		btnPanel.add(btnClear);
	}
}
