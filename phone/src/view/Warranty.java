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
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
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
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, -190, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[] {25, 0, 0, 0, 0, 0, 0, 1};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		
		JPanel infoPanel = new JPanel();
		GridBagConstraints gbc_infoPanel = new GridBagConstraints();
		gbc_infoPanel.gridwidth = 9;
		gbc_infoPanel.insets = new Insets(0, 0, 5, 5);
		gbc_infoPanel.fill = GridBagConstraints.BOTH;
		gbc_infoPanel.gridx = 0;
		gbc_infoPanel.gridy = 0;
		infoPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblInfo = new JLabel("Thông tin chung");
		lblInfo.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		infoPanel.add(lblInfo, BorderLayout.NORTH);
		
		String[] infoColumn = {"Mã Bảo Hành", "Mã Khách Hàng", "Tên Sản Phẩm", "Ngày Bảo Hành", "Ngày Trả"};
        Object[][] infoData = {
            {"NOKIA1", "NVA", "LSP001", "1/11/2023", "8/11/2023"},
            {"PHONE2", "CCV", "LSP002", "9/2/2022", "9/11/2022"},
        };

        DefaultTableModel Infomodel = new DefaultTableModel(infoData, infoColumn) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable InfoTable = new JTable(Infomodel);
        InfoTable.getTableHeader().setReorderingAllowed(false);
        JScrollPane scrollInfoTable = new JScrollPane(InfoTable);
        infoPanel.add(scrollInfoTable, BorderLayout.CENTER);
		
		JPanel searchPanel = new JPanel();
		GridBagConstraints gbc_searchPanel = new GridBagConstraints();
		gbc_searchPanel.gridwidth = 3;
		gbc_searchPanel.insets = new Insets(0, 0, 5, 0);
		gbc_searchPanel.fill = GridBagConstraints.BOTH;
		gbc_searchPanel.gridx = 9;
		gbc_searchPanel.gridy = 0;
		GridBagLayout gbl_searchPanel = new GridBagLayout();
		gbl_searchPanel.columnWidths = new int[] {10, 30, 0, 10};
		gbl_searchPanel.rowHeights = new int[]{13, 165, 0};
		gbl_searchPanel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_searchPanel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		searchPanel.setLayout(gbl_searchPanel);
		
		JLabel lblSearch = new JLabel("Tìm kiếm");
		lblSearch.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblSearch = new GridBagConstraints();
		gbc_lblSearch.gridwidth = 3;
		gbc_lblSearch.insets = new Insets(0, 0, 5, 5);
		gbc_lblSearch.gridx = 0;
		gbc_lblSearch.gridy = 0;
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		searchPanel.add(lblSearch, gbc_lblSearch);
		
		JLabel lblSearchId = new JLabel("Mã ID:");
		GridBagConstraints gbc_lblSearchId = new GridBagConstraints();
		gbc_lblSearchId.anchor = GridBagConstraints.EAST;
		gbc_lblSearchId.insets = new Insets(0, 0, 0, 5);
		gbc_lblSearchId.gridx = 0;
		gbc_lblSearchId.gridy = 1;
		searchPanel.add(lblSearchId, gbc_lblSearchId);
		
		txtSearchId = new JTextField();
		txtSearchId.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_txtSearchId = new GridBagConstraints();
		gbc_txtSearchId.insets = new Insets(0, 0, 0, 5);
		gbc_txtSearchId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSearchId.gridx = 1;
		gbc_txtSearchId.gridy = 1;
		searchPanel.add(txtSearchId, gbc_txtSearchId);
		txtSearchId.setColumns(10);
		
		JButton btnSearchId = new JButton("");
		Image iconSearch = new ImageIcon("Assets/search.png").getImage();
		iconSearch = iconSearch.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		btnSearchId.setIcon(new ImageIcon(iconSearch));
		btnSearchId.setPreferredSize(new Dimension(25, 25));
		GridBagConstraints gbc_btnSearchId = new GridBagConstraints();
		gbc_btnSearchId.anchor = GridBagConstraints.EAST;
		gbc_btnSearchId.gridx = 2;
		gbc_btnSearchId.gridy = 1;
		searchPanel.add(btnSearchId, gbc_btnSearchId);
		
		JPanel DetailPanel = new JPanel();
		GridBagConstraints gbc_DetailPanel = new GridBagConstraints();
		gbc_DetailPanel.gridheight = 6;
		gbc_DetailPanel.gridwidth = 9;
		gbc_DetailPanel.insets = new Insets(0, 0, 5, 5);
		gbc_DetailPanel.fill = GridBagConstraints.BOTH;
		gbc_DetailPanel.gridx = 0;
		gbc_DetailPanel.gridy = 1;
		DetailPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDetail = new JLabel("Thông tin bảo hành");
		lblDetail.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblDetail.setHorizontalAlignment(SwingConstants.CENTER);
		DetailPanel.add(lblDetail, BorderLayout.NORTH);
		
		String[] detailColumn = {"Mã Bảo Hành", "Ngày Bảo Hành", "Trạng Thái", "Nội Dung", "Phí"};
        Object[][] detailData = {
            {"NOKIA1", "1/11/2023", "Chưa", "...", "300.000đ"},
            {"PHONE2", "9/2/2022", "Chưa", "...", "1000đ"},
        };

        DefaultTableModel Detailmodel = new DefaultTableModel(detailData, detailColumn) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable DetailTable = new JTable(Detailmodel);
        DetailTable.getTableHeader().setReorderingAllowed(false);
        JScrollPane scrollDetailTable = new JScrollPane(DetailTable);
        DetailPanel.add(scrollDetailTable, BorderLayout.CENTER);
		
		JPanel input_panel = new JPanel();
		GridBagConstraints gbc_input_panel = new GridBagConstraints();
		gbc_input_panel.gridheight = 6;
		gbc_input_panel.gridwidth = 3;
		gbc_input_panel.fill = GridBagConstraints.BOTH;
		gbc_input_panel.gridx = 9;
		gbc_input_panel.gridy = 1;
		GridBagLayout gbl_input_panel = new GridBagLayout();
		gbl_input_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_input_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_input_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_input_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		input_panel.setLayout(gbl_input_panel);
		
		JLabel lblWarrantyId = new JLabel("Mã bảo hành:");
		lblWarrantyId.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblWarrantyId = new GridBagConstraints();
		gbc_lblWarrantyId.gridwidth = 2;
		gbc_lblWarrantyId.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarrantyId.gridx = 0;
		gbc_lblWarrantyId.gridy = 0;
		input_panel.add(lblWarrantyId, gbc_lblWarrantyId);
		
		txtId = new JTextField();
		txtId.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtId.setEnabled(false);
		GridBagConstraints gbc_txtId = new GridBagConstraints();
		gbc_txtId.insets = new Insets(0, 0, 5, 0);
		gbc_txtId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtId.gridx = 2;
		gbc_txtId.gridy = 0;
		input_panel.add(txtId, gbc_txtId);
		txtId.setColumns(10);
		
		JLabel lblDateIn = new JLabel("Ngày bảo hành:");
		lblDateIn.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblDateIn = new GridBagConstraints();
		gbc_lblDateIn.gridwidth = 2;
		gbc_lblDateIn.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateIn.gridx = 0;
		gbc_lblDateIn.gridy = 1;
		input_panel.add(lblDateIn, gbc_lblDateIn);
		
		txtDateIn = new JTextField();
		txtDateIn.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtDateIn.setColumns(10);
		GridBagConstraints gbc_txtDateIn = new GridBagConstraints();
		gbc_txtDateIn.insets = new Insets(0, 0, 5, 0);
		gbc_txtDateIn.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDateIn.gridx = 2;
		gbc_txtDateIn.gridy = 1;
		input_panel.add(txtDateIn, gbc_txtDateIn);
		
		JLabel lblStatus = new JLabel("Trạng thái:");
		lblStatus.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStatus = new GridBagConstraints();
		gbc_lblStatus.gridwidth = 2;
		gbc_lblStatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblStatus.gridx = 0;
		gbc_lblStatus.gridy = 2;
		input_panel.add(lblStatus, gbc_lblStatus);
		
		txtStatus = new JTextField();
		txtStatus.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_txtStatus = new GridBagConstraints();
		gbc_txtStatus.insets = new Insets(0, 0, 5, 0);
		gbc_txtStatus.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtStatus.gridx = 2;
		gbc_txtStatus.gridy = 2;
		input_panel.add(txtStatus, gbc_txtStatus);
		
		JLabel lblFee = new JLabel("Phí:");
		lblFee.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFee = new GridBagConstraints();
		gbc_lblFee.gridwidth = 2;
		gbc_lblFee.insets = new Insets(0, 0, 5, 5);
		gbc_lblFee.gridx = 0;
		gbc_lblFee.gridy = 3;
		lblFee.setHorizontalAlignment(SwingConstants.LEFT);
		input_panel.add(lblFee, gbc_lblFee);
		
		txtFee = new JTextField();
		txtFee.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtFee.setColumns(10);
		GridBagConstraints gbc_txtFee = new GridBagConstraints();
		gbc_txtFee.insets = new Insets(0, 0, 5, 0);
		gbc_txtFee.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFee.gridx = 2;
		gbc_txtFee.gridy = 3;
		input_panel.add(txtFee, gbc_txtFee);
		
		JLabel lblWarrantyId_4 = new JLabel("Nội dung:");
		lblWarrantyId_4.setFont(new Font("Verdana", Font.PLAIN, 12));
		GridBagConstraints gbc_lblWarrantyId_4 = new GridBagConstraints();
		gbc_lblWarrantyId_4.gridwidth = 2;
		gbc_lblWarrantyId_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarrantyId_4.gridx = 0;
		gbc_lblWarrantyId_4.gridy = 4;
		input_panel.add(lblWarrantyId_4, gbc_lblWarrantyId_4);
		
		JTextArea txtNote = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		JScrollPane scrollNote = new JScrollPane(txtNote);
		gbc_textArea.insets = new Insets(0, 0, 5, 0);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 2;
		gbc_textArea.gridy = 4;
		input_panel.add(scrollNote, gbc_textArea);
		
		JButton btnAdd = new JButton("");
		Image iconAdd = new ImageIcon("Assets/Icon/add.png").getImage();
		iconAdd = iconAdd.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		btnAdd.setIcon(new ImageIcon(iconAdd));
		btnAdd.setPreferredSize(new Dimension(25, 25));
		GridBagConstraints gbc_btnSearchId_1 = new GridBagConstraints();
		gbc_btnSearchId_1.gridwidth = 2;
		gbc_btnSearchId_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnSearchId_1.gridx = 0;
		gbc_btnSearchId_1.gridy = 5;
		input_panel.add(btnAdd, gbc_btnSearchId_1);
		
		JButton btnClear = new JButton("");
		Image iconClear = new ImageIcon("Assets/Icon/clear.png").getImage();
		iconClear = iconClear.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		btnClear.setIcon(new ImageIcon(iconClear));
		btnClear.setPreferredSize(new Dimension(25, 25));
		GridBagConstraints gbc_btnClear = new GridBagConstraints();
		gbc_btnClear.insets = new Insets(0, 0, 5, 0);
		gbc_btnClear.gridx = 2;
		gbc_btnClear.gridy = 5;
		input_panel.add(btnClear, gbc_btnClear);
		
		JButton btnAccept = new JButton("");
		Image iconAccept = new ImageIcon("Assets/Icon/accept.png").getImage();
		iconAccept = iconAccept.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		btnAccept.setIcon(new ImageIcon(iconAccept));
		btnAccept.setPreferredSize(new Dimension(25, 25));
		GridBagConstraints gbc_btnAccept = new GridBagConstraints();
		gbc_btnAccept.gridwidth = 3;
		gbc_btnAccept.insets = new Insets(0, 0, 0, 5);
		gbc_btnAccept.gridx = 0;
		gbc_btnAccept.gridy = 6;
		input_panel.add(btnAccept, gbc_btnAccept);
	}
}
