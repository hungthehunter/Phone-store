package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Position extends JPanel {
	private JPanel contentPane;

	private JTable pos_detail_table;

	private JTable emp_detail_table;

	private static final long serialVersionUID = 1L;
	private JTextField txtMaCV;
	private JTextField txtTenCV;

	/**
	 * Create the panel.
	 */
	public Position() {
//		setLayout(new BorderLayout());
        setSize(1110, 856);
        setLayout(null);
        
        contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    contentPane.setBounds(5, 5, 1110, 856);
	    contentPane.setLayout(null);	
	    
	    
	    add(contentPane);

	    
	    JPanel pos_detail_panel = new JPanel();
	    pos_detail_panel.setBorder(new LineBorder(new Color(192, 192, 192)));
	    pos_detail_panel.setBounds(5, 5, 661, 294);
	    pos_detail_panel.setBorder(BorderFactory.createTitledBorder("Chức vụ"));
		contentPane.add(pos_detail_panel);
		
		String[] pos_detail_columns =  {"STT", "Mã", "Tên Chức Vụ" , "Ghi Chú"};
		Object[][] pos_detail_data = {
				{"1A" , "NVA" , "QuanLy" , "Nam" } ,
				{"" , "" , "" , "" } ,
				{"" , "" , "" , "" } ,
				{"" , "" , "" , "" } ,
				{"" , "" , "" , "" } ,
				{"" , "" , "" , "" } ,

		};
		DefaultTableModel pos_detailModel = new DefaultTableModel(pos_detail_data, pos_detail_columns){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        pos_detail_table = new JTable(pos_detailModel);
        pos_detail_table.getTableHeader().setReorderingAllowed(false);
        pos_detail_panel.setLayout(null);
        pos_detail_table.setLayout(null);
		JScrollPane pos_detail_scroll = new JScrollPane(pos_detail_table);
		pos_detail_scroll.setBounds(12, 21, 634, 251);
		pos_detail_panel.add(pos_detail_scroll);
		
		JPanel emp_detail_panel = new JPanel();
		emp_detail_panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		emp_detail_panel.setBorder(BorderFactory.createTitledBorder("Nhân viên"));
		emp_detail_panel.setBounds(5, 309, 661, 294);
		contentPane.add(emp_detail_panel);
		
		String[] emp_detail_columns =  {"STT", "Mã Nhân Viên", "Tên Nhân Viên" , "Chức Vụ"};
		Object[][] emp_detail_data = {
				{"1A" , "NVA" , "Nguyen Van A" , "Giám Đốc" } ,
				{"" , "" , "" , "" } ,
				{"" , "" , "" , "" } ,
				{"" , "" , "" , "" } ,
				{"" , "" , "" , "" } ,
				{"" , "" , "" , "" } ,

		};
		DefaultTableModel emp_detailModel = new DefaultTableModel(emp_detail_data, emp_detail_columns){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
	    emp_detail_table = new JTable(emp_detailModel);
	    emp_detail_table.getTableHeader().setReorderingAllowed(false);
	    emp_detail_panel.setLayout(null);
		emp_detail_table.setLayout(null);
		JScrollPane emp_detail_scroll = new JScrollPane(emp_detail_table);
		emp_detail_scroll.setBounds(12, 21, 634, 251);
		emp_detail_panel.add(emp_detail_scroll);
			    
	    JPanel inf_detail_panel = new JPanel();
	    inf_detail_panel.setBorder(new LineBorder(new Color(192, 192, 192)));
	    inf_detail_panel.setBounds(676, 5, 410, 289);
	    inf_detail_panel.setBorder(BorderFactory.createTitledBorder("Thông tin chức vụ"));
	    contentPane.add(inf_detail_panel);
	    inf_detail_panel.setLayout(null);
	    
	    JLabel lblmaCV = new JLabel("Mã chức vụ:");
	    lblmaCV.setFont(new Font("Verdana", Font.PLAIN, 12));
	    lblmaCV.setBounds(58, 37, 83, 16);
		inf_detail_panel.add(lblmaCV);
		
		txtMaCV = new JTextField();
		txtMaCV.setBounds(172, 34, 200, 25);
		txtMaCV.setEnabled(false);
		inf_detail_panel.add(txtMaCV);
		txtMaCV.setColumns(10);
		
		JLabel lbltenCV = new JLabel("Tên chức vụ:");
		lbltenCV.setFont(new Font("Verdana", Font.PLAIN, 12));
		lbltenCV.setBounds(58, 96, 83, 16);
		inf_detail_panel.add(lbltenCV);
		
		txtTenCV = new JTextField();
		txtTenCV.setColumns(10);
		txtTenCV.setBounds(172, 93, 200, 25);
		inf_detail_panel.add(txtTenCV);
		
		JLabel lblNote = new JLabel("Ghi chú:");
		lblNote.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNote.setBounds(58, 169, 83, 16);
		inf_detail_panel.add(lblNote);
		
		JTextArea txtNote = new JTextArea("");
		JScrollPane note_scroll = new JScrollPane(txtNote);
		note_scroll.setBounds(172, 166, 200, 79);
		inf_detail_panel.add(note_scroll);
		
		JPanel btn_panel = new JPanel();
		btn_panel.setBounds(676, 309, 410, 294);
		btn_panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		btn_panel.setBorder(BorderFactory.createTitledBorder("Chức năng"));
		contentPane.add(btn_panel);
		btn_panel.setLayout(null);
		
		Image addIcon = new ImageIcon("Assets/Icon/add.png").getImage();
		addIcon = addIcon.getScaledInstance(41, 32, Image.SCALE_SMOOTH);
		
		Image deleteIcon = new ImageIcon("Assets/Icon/delete.png").getImage();
		deleteIcon = deleteIcon.getScaledInstance(41, 32, Image.SCALE_SMOOTH);
		
		Image acceptIcon = new ImageIcon("Assets/Icon/accept.png").getImage();
		acceptIcon = acceptIcon.getScaledInstance(41, 32, Image.SCALE_SMOOTH);
		
		Image clearIcon = new ImageIcon("Assets/Icon/clear.png").getImage();
		clearIcon = clearIcon.getScaledInstance(41, 32, Image.SCALE_SMOOTH);
		
		JButton btnAddPos = new JButton("");
		btnAddPos.setBounds(71, 61, 41, 32);
		btnAddPos.setIcon(new ImageIcon(addIcon));
		btn_panel.add(btnAddPos);
		
		JButton btnDelPos = new JButton("");
		btnDelPos.setBounds(71, 162, 41, 32);
		btnDelPos.setIcon(new ImageIcon(deleteIcon));
		btn_panel.add(btnDelPos);
		
		JButton btnAcceptPos = new JButton("");
		btnAcceptPos.setBounds(288, 61, 41, 32);
		btnAcceptPos.setIcon(new ImageIcon(acceptIcon));
		btn_panel.add(btnAcceptPos);
		
		JButton btnClearPos = new JButton("");
		btnClearPos.setBounds(288, 162, 41, 32);
		btnClearPos.setIcon(new ImageIcon(clearIcon));
		btn_panel.add(btnClearPos);
		
		
	}
}
