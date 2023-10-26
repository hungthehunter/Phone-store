package views;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
@SuppressWarnings("unused")
public class Warranty extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel warranty_panel;
	private JTextField txtIMEI;
	private JTable warranty_detail_table;
	private JTable warranty_inf_table;
	private JTextField txtMaCTBH;
	private JTextField txtMaBH;
	private JTextField txtNgayBH;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Warranty frame = new Warranty();
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
	public Warranty() {
		//setLayout(new BorderLayout());
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(1450, 800);
//		setLocationRelativeTo(null);
//		setTitle("Quan Ly Dien Thoai");
		warranty_panel = new JPanel();
		warranty_panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		warranty_panel.setBounds(389, 52, 1037, 701);
		contentPane.add(warranty_panel);
		warranty_panel.setLayout(null);
		
		JLabel lblIMEI = new JLabel("Ma IMEI");
		lblIMEI.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblIMEI.setBounds(348, 66, 75, 36);
		warranty_panel.add(lblIMEI);
		
		txtIMEI = new JTextField();
		txtIMEI.setBounds(433, 66, 276, 29);
		warranty_panel.add(txtIMEI);
		txtIMEI.setColumns(10);
			
		Image searchIcon = new ImageIcon("Assets/search.png").getImage();
		searchIcon = searchIcon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton btnSearch = new JButton("");
		btnSearch.setBounds(732, 66, 54, 29);
		btnSearch.setIcon(new ImageIcon(searchIcon));
		warranty_panel.add(btnSearch);
		
		String[] warranty_detail_columns =  {"STT", "Mã BH", "Khách Hàng" , "Tên Sản Phẩm" , "Ngày Bảo Hành" , "Hạn Bảo Hành"};
		Object[][] warranty_detail_data = {
				{"1" , "Nokia" , "2323" , "2323" , "2323" , "2323"} ,
				{"" , "" , "" , "" , "" , ""} ,
				{"" , "" , "" , "" , "" , ""}
		};
		DefaultTableModel warranty_detailModel = new DefaultTableModel(warranty_detail_data, warranty_detail_columns);
		warranty_detail_table = new JTable(warranty_detailModel);
		warranty_detail_table.getTableHeader().setReorderingAllowed(false);
		JScrollPane warranty_detail_scroll = new JScrollPane(warranty_detail_table);
		warranty_detail_scroll.setBounds(67, 135, 956, 190);
		warranty_detail_scroll.setBorder(new LineBorder(Color.LIGHT_GRAY));
		warranty_panel.add(warranty_detail_scroll);

		String[] inf_columns =  {"Mã BH", "Mã CTBH", "Ngày BH" , "Nội dung" , "Ghi chú"};
		Object[][] inf_data = {
				{"1" , "uy3" , "2323" , "2323" , "2323"} ,
				{"" , "" , "" , "" , "" , ""} ,
				{"" , "" , "" , "" , "" , ""}
		};
		DefaultTableModel warranty_infModel = new DefaultTableModel(inf_data, inf_columns);
		warranty_inf_table = new JTable(warranty_infModel);
		warranty_inf_table.getTableHeader().setReorderingAllowed(false);
		JScrollPane warranty_inf_scroll = new JScrollPane(warranty_inf_table);
		warranty_inf_scroll.setBounds(23, 392, 642, 226);
		warranty_panel.add(warranty_inf_scroll);
		
		JLabel lblCTBH = new JLabel("Mã CTBH:");
		lblCTBH.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblCTBH.setBounds(675, 384, 91, 29);
		warranty_panel.add(lblCTBH);
		
		JTextArea txtInf = new JTextArea();
		txtInf.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtInf.setBounds(772, 535, 175, 36);
		warranty_panel.add(txtInf);
		
		JTextArea txtNote = new JTextArea();
		txtNote.setBounds(772, 594, 175, 36);
		warranty_panel.add(txtNote);
		
		Image addIcon = new ImageIcon("Assets/add.png").getImage();
		addIcon = addIcon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton btnAdd = new JButton("");
		btnAdd.setBounds(969, 480, 54, 36);
		btnAdd.setIcon(new ImageIcon(addIcon));
		warranty_panel.add(btnAdd);
		
		Image deleteIcon = new ImageIcon("Assets/delete.png").getImage();
		deleteIcon = deleteIcon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton btnDelete = new JButton("");
		btnDelete.setBounds(969, 535, 54, 36);
		btnDelete.setIcon(new ImageIcon(deleteIcon));
		warranty_panel.add(btnDelete);
		
		Image acceptIcon = new ImageIcon("Assets/accept.png").getImage();
		acceptIcon = acceptIcon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton btnAccept = new JButton("");
		btnAccept.setBounds(969, 594, 54, 36);
		btnAccept.setIcon(new ImageIcon(acceptIcon));
		warranty_panel.add(btnAccept);
		
		JLabel lblmaBH = new JLabel("Mã BH:");
		lblmaBH.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblmaBH.setBounds(675, 436, 75, 29);
		warranty_panel.add(lblmaBH);
		
		JLabel lblngayBH = new JLabel("Ngày BH:");
		lblngayBH.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblngayBH.setBounds(675, 484, 75, 29);
		warranty_panel.add(lblngayBH);
		
		JLabel lblInf = new JLabel("Nội dung:");
		lblInf.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblInf.setBounds(675, 542, 75, 29);
		warranty_panel.add(lblInf);
		
		JLabel lblNote = new JLabel("Ghi chú:");
		lblNote.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNote.setBounds(675, 601, 75, 29);
		warranty_panel.add(lblNote);
		
		txtMaCTBH = new JTextField();
		txtMaCTBH.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtMaCTBH.setBounds(772, 386, 175, 25);
		warranty_panel.add(txtMaCTBH);
		txtMaCTBH.setColumns(10);
		
		txtMaBH = new JTextField();
		txtMaBH.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtMaBH.setColumns(10);
		txtMaBH.setBounds(772, 438, 175, 25);
		warranty_panel.add(txtMaBH);
		
		txtNgayBH = new JTextField();
		txtNgayBH.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtNgayBH.setColumns(10);
		txtNgayBH.setBounds(772, 486, 175, 25);
		warranty_panel.add(txtNgayBH);
	}
}
