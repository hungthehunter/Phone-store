package view;

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
//	public static void main(String[] args) {
//		
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					test frame = new test();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Warranty() {
		setLayout(new BorderLayout());
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(1450, 800);
//		setLocationRelativeTo(null);
		warranty_panel = new JPanel();
//		setContentPane(warranty_panel);
		
		warranty_panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		warranty_panel.setBounds(2, 2, 1071, 856);
		warranty_panel.setLayout(null);
		
		JLabel lblIMEI = new JLabel("Ma IMEI");
		lblIMEI.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblIMEI.setBounds(207, 74, 47, 16);
		warranty_panel.add(lblIMEI);
		
		txtIMEI = new JTextField();
		txtIMEI.setBounds(270, 73, 223, 22);
		warranty_panel.add(txtIMEI);
		txtIMEI.setColumns(10);
			
		Image searchIcon = new ImageIcon("Assets/search.png").getImage();
		searchIcon = searchIcon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton btnSearch = new JButton("");
		btnSearch.setBounds(517, 61, 44, 40);
		btnSearch.setIcon(new ImageIcon(searchIcon));
		warranty_panel.add(btnSearch);
		
		String[] warranty_detail_columns =  {"STT", "Mã BH", "Khách Hàng" , "Tên Sản Phẩm" , "Ngày Bảo Hành" , "Hạn Bảo Hành"};
		Object[][] warranty_detail_data = {
				{"1" , "Nokia" , "2323" , "2323" , "2323" , "2323"} ,
				{"" , "" , "" , "" , "" , ""} ,
				{"" , "" , "" , "" , "" , ""}
		};
		DefaultTableModel warranty_detailModel = new DefaultTableModel(warranty_detail_data, warranty_detail_columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
		warranty_detail_table = new JTable(warranty_detailModel);
		warranty_detail_table.getTableHeader().setReorderingAllowed(false);
		JScrollPane warranty_detail_scroll = new JScrollPane(warranty_detail_table);
		warranty_detail_scroll.setBounds(10, 137, 1026, 134);
		warranty_detail_scroll.setBorder(new LineBorder(Color.LIGHT_GRAY));
		warranty_panel.add(warranty_detail_scroll);

		String[] inf_columns =  {"Mã BH", "Mã CTBH", "Ngày BH" , "Nội dung" , "Ghi chú"};
		Object[][] inf_data = {
				{"1" , "uy3" , "2323" , "2323" , "2323"} ,
				{"" , "" , "" , "" , "" , ""} ,
				{"" , "" , "" , "" , "" , ""}
		};
		DefaultTableModel warranty_infModel = new DefaultTableModel(inf_data, inf_columns){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
		warranty_inf_table = new JTable(warranty_infModel);
		warranty_inf_table.getTableHeader().setReorderingAllowed(false);
		JScrollPane warranty_inf_scroll = new JScrollPane(warranty_inf_table);
		warranty_inf_scroll.setBounds(21, 378, 723, 331);
		warranty_panel.add(warranty_inf_scroll);
		
		JLabel lblCTBH = new JLabel("Mã CTBH:");
		lblCTBH.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblCTBH.setBounds(793, 445, 60, 16);
		warranty_panel.add(lblCTBH);
		
		JTextArea txtInf = new JTextArea();
		txtInf.setFont(new Font("Verdana", Font.PLAIN, 12));
		JScrollPane infScroll = new JScrollPane(txtInf);
		infScroll.setBounds(876, 594, 160, 28);
		infScroll.setBorder(new LineBorder(Color.LIGHT_GRAY));
		warranty_panel.add(infScroll);
		
		JTextArea txtNote = new JTextArea();
		JScrollPane noteScroll = new JScrollPane(txtNote);
		noteScroll.setBounds(876, 654, 160, 68);
		noteScroll.setBorder(new LineBorder(Color.LIGHT_GRAY));
		warranty_panel.add(noteScroll);
		
		Image addIcon = new ImageIcon("Assets/add.png").getImage();
		addIcon = addIcon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton btnAdd = new JButton("");
		btnAdd.setBounds(1055, 526, 44, 40);
		btnAdd.setIcon(new ImageIcon(addIcon));
		warranty_panel.add(btnAdd);
		
		Image deleteIcon = new ImageIcon("Assets/delete.png").getImage();
		deleteIcon = deleteIcon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton btnDelete = new JButton("");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBounds(1055, 590, 44, 40);
		btnDelete.setIcon(new ImageIcon(deleteIcon));
		warranty_panel.add(btnDelete);
		
		Image acceptIcon = new ImageIcon("Assets/accept.png").getImage();
		acceptIcon = acceptIcon.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		
		JButton btnAccept = new JButton("");
		btnAccept.setBounds(1055, 650, 44, 40);
		btnAccept.setIcon(new ImageIcon(acceptIcon));
		warranty_panel.add(btnAccept);
		
		JLabel lblmaBH = new JLabel("Mã BH:");
		lblmaBH.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblmaBH.setBounds(793, 492, 44, 16);
		warranty_panel.add(lblmaBH);
		
		JLabel lblngayBH = new JLabel("Ngày BH:");
		lblngayBH.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblngayBH.setBounds(793, 535, 57, 16);
		warranty_panel.add(lblngayBH);
		
		
		txtMaCTBH = new JTextField();
		txtMaCTBH.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtMaCTBH.setBounds(876, 442, 160, 22);
		warranty_panel.add(txtMaCTBH);
		txtMaCTBH.setColumns(10);
		
		txtMaBH = new JTextField();
		txtMaBH.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtMaBH.setColumns(10);
		txtMaBH.setBounds(876, 489, 160, 22);
		warranty_panel.add(txtMaBH);
		
		txtNgayBH = new JTextField();
		txtNgayBH.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtNgayBH.setColumns(10);
		txtNgayBH.setBounds(876, 532, 160, 22);
		warranty_panel.add(txtNgayBH);
		
		JLabel lblInf = new JLabel("Nội dung:");
		lblInf.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblInf.setBounds(793, 596, 58, 16);
		warranty_panel.add(lblInf);
		
		JLabel lblNote = new JLabel("Ghi chú:");
		lblNote.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNote.setBounds(793, 657, 50, 16);
		warranty_panel.add(lblNote);
		
		add(warranty_panel, BorderLayout.CENTER);
	}
}
