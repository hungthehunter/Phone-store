package view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import org.apache.logging.log4j.core.tools.picocli.CommandLine.Help.TextTable.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mysql.cj.result.Row;

import bus.CategoryBUS;
import dao.CategoryDAO;
import dto.CategoryDTO;
import service.ExcelExporter;
import service.Validation;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class Category extends JPanel implements MouseListener, KeyListener{

	private static final long serialVersionUID = 1L;
	private JTextField cateFindTxt;
	private JTable table;
	private JTextField cateNameTxt;
	private JTextField textField_3;
	private JTable table_1;
	private DefaultTableModel categoryModel;
	private JButton btnAddCate;
	private JButton btnEditCate;
	private JButton btnDeleteCate;
	private JButton btnRefreshCate;
	CategoryBUS categoryBUS = new CategoryBUS();
	
	ArrayList<CategoryDTO> listCategory = categoryBUS.getALL();
	private JTextField cateIdTxt;
	private JButton btnExport;

	/**
	 * Create the panel.
	 */
	public Category() {
		initComponent();
		loadDataTable(listCategory);
	}

	public void initComponent() {
		Color myColor = new Color(34, 33, 75);
		Color backGroundColor = Color.white;
		Color borderColor = myColor;
		Color textColor = myColor;
		Color buttonColor = myColor;
		setBackground(backGroundColor);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {600, 400};
		gridBagLayout.rowHeights = new int[] {400, 600};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0};
		setLayout(gridBagLayout);
		
		JPanel panelCategoryTable = new JPanel();
		panelCategoryTable.setBackground(Color.WHITE);
		panelCategoryTable.setBorder(new MatteBorder(0, 0, 0, 2, borderColor));
		GridBagConstraints gbc_panelCategoryTable = new GridBagConstraints();
		gbc_panelCategoryTable.weightx = 0.7;
		gbc_panelCategoryTable.insets = new Insets(20, 20, 5, 10);
		gbc_panelCategoryTable.fill = GridBagConstraints.BOTH;
		gbc_panelCategoryTable.gridx = 0;
		gbc_panelCategoryTable.gridy = 0;
		add(panelCategoryTable, gbc_panelCategoryTable);
		GridBagLayout gbl_panelCategoryTable = new GridBagLayout();
		gbl_panelCategoryTable.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panelCategoryTable.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panelCategoryTable.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelCategoryTable.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelCategoryTable.setLayout(gbl_panelCategoryTable);
		
		JLabel lblNewLabel = new JLabel("Thông Tin Loại SP");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setForeground(textColor);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.weighty = 0.1;
		gbc_lblNewLabel.weightx = 1.0;
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panelCategoryTable.add(lblNewLabel, gbc_lblNewLabel);
		
		cateFindTxt = new JTextField();
		cateFindTxt.setBorder(new LineBorder(borderColor, 2, true));
		cateFindTxt.setColumns(10);
		cateFindTxt.addKeyListener(this);
		GridBagConstraints gbc_cateFindTxt = new GridBagConstraints();
		gbc_cateFindTxt.ipady = 5;
		gbc_cateFindTxt.weighty = 0.1;
		gbc_cateFindTxt.weightx = 0.8;
		gbc_cateFindTxt.insets = new Insets(0, 5, 5, 5);
		gbc_cateFindTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_cateFindTxt.gridx = 0;
		gbc_cateFindTxt.gridy = 1;
		panelCategoryTable.add(cateFindTxt, gbc_cateFindTxt);
		
		btnExport = new JButton("Xuất Excel");
        Image iconExcel = new ImageIcon("Assets/Icon/excel.png").getImage();
        iconExcel = iconExcel.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        btnExport.setIcon(new ImageIcon(iconExcel));
        btnExport.setBorder(new LineBorder(borderColor, 2, true));
        btnExport.setForeground(Color.white);
        btnExport.setBackground(buttonColor);
        btnExport.addMouseListener(this);
		
		GridBagConstraints gbc_btnFindCate = new GridBagConstraints();
		gbc_btnFindCate.weighty = 0.1;
		gbc_btnFindCate.weightx = 0.1;
		gbc_btnFindCate.insets = new Insets(0, 0, 5, 5);
		gbc_btnFindCate.gridx = 1;
		gbc_btnFindCate.gridy = 1;
		panelCategoryTable.add(btnExport, gbc_btnFindCate);
		
		JButton btnFindCate_1 = new JButton("Nhập Excel");
		iconExcel = iconExcel.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        btnFindCate_1.setIcon(new ImageIcon(iconExcel));
        btnFindCate_1.setBorder(new LineBorder(borderColor, 2, true));
        btnFindCate_1.setForeground(Color.white);
        btnFindCate_1.setBackground(buttonColor);
        btnFindCate_1.addMouseListener(this);
		
		
		GridBagConstraints gbc_btnFindCate_1 = new GridBagConstraints();
		gbc_btnFindCate_1.weighty = 0.1;
		gbc_btnFindCate_1.weightx = 0.1;
		gbc_btnFindCate_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnFindCate_1.gridx = 2;
		gbc_btnFindCate_1.gridy = 1;
		panelCategoryTable.add(btnFindCate_1, gbc_btnFindCate_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(borderColor, 2));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 5, 0, 5);
		gbc_scrollPane.weighty = 0.8;
		gbc_scrollPane.weightx = 1.0;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		panelCategoryTable.add(scrollPane, gbc_scrollPane);
		
	     String[] columnNames = {"Mã Loại SP", "Loại SP"};
	     Object[][] data = {

	     };
	    
	   categoryModel = new DefaultTableModel(data, columnNames) {
           @Override
           public boolean isCellEditable(int row, int column) {
               return false;
           }
       };
	   categoryModel.setColumnIdentifiers(columnNames);
	   
       table = new JTable(categoryModel);
       table.addMouseListener(this);
       DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
       centerRenderer.setHorizontalAlignment(JLabel.CENTER);
       TableColumnModel columnModel = table.getColumnModel();
       columnModel.getColumn(0).setCellRenderer(centerRenderer);
       columnModel.getColumn(1).setCellRenderer(centerRenderer);
       table.setBorder(new LineBorder(borderColor, 2, false));
       table.getTableHeader().setBorder(new LineBorder(borderColor, 2, false));
       table.getTableHeader().setReorderingAllowed(false);
       table.getTableHeader().setBackground(borderColor);
       table.getTableHeader().setForeground(Color.white);
		
		
		
		scrollPane.setViewportView(table);
		
		JPanel panelCategoryInfo = new JPanel();
		panelCategoryInfo.setBackground(Color.WHITE);
		GridBagConstraints gbc_panelCategoryInfo = new GridBagConstraints();
		gbc_panelCategoryInfo.weightx = 0.3;
		gbc_panelCategoryInfo.insets = new Insets(20, 5, 5, 10);
		gbc_panelCategoryInfo.fill = GridBagConstraints.BOTH;
		gbc_panelCategoryInfo.gridx = 1;
		gbc_panelCategoryInfo.gridy = 0;
		add(panelCategoryInfo, gbc_panelCategoryInfo);
		GridBagLayout gbl_panelCategoryInfo = new GridBagLayout();
		gbl_panelCategoryInfo.columnWidths = new int[] {50, 200};
		gbl_panelCategoryInfo.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panelCategoryInfo.columnWeights = new double[]{1.0, 1.0};
		gbl_panelCategoryInfo.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelCategoryInfo.setLayout(gbl_panelCategoryInfo);
		
		JLabel lblNewLabel_1 = new JLabel("Thông Tin Loại SP");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setForeground(textColor);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.weighty = 0.1;
		gbc_lblNewLabel_1.weightx = 1.0;
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panelCategoryInfo.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mã Loại SP:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.weighty = 0.3;
		gbc_lblNewLabel_2.weightx = 0.1;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panelCategoryInfo.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		cateIdTxt = new JTextField();
		cateIdTxt.setColumns(10);
		cateIdTxt.setEditable(false);
		cateIdTxt.setFocusable(false);
		GridBagConstraints gbc_cateIdTxt = new GridBagConstraints();
		gbc_cateIdTxt.insets = new Insets(0, 0, 5, 0);
		gbc_cateIdTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_cateIdTxt.gridx = 1;
		gbc_cateIdTxt.gridy = 1;
		panelCategoryInfo.add(cateIdTxt, gbc_cateIdTxt);
		
		JLabel lblNewLabel_3 = new JLabel("Tên SP:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.weighty = 0.3;
		gbc_lblNewLabel_3.weightx = 0.1;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 2;
		panelCategoryInfo.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		cateNameTxt = new JTextField();
		cateNameTxt.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_cateNameTxt = new GridBagConstraints();
		gbc_cateNameTxt.ipady = 5;
		gbc_cateNameTxt.weightx = 0.9;
		gbc_cateNameTxt.insets = new Insets(0, 0, 5, 0);
		gbc_cateNameTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_cateNameTxt.gridx = 1;
		gbc_cateNameTxt.gridy = 2;
		panelCategoryInfo.add(cateNameTxt, gbc_cateNameTxt);
		cateNameTxt.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.weightx = 1.0;
		gbc_panel_3.weighty = 0.3;
		gbc_panel_3.gridwidth = 2;
		gbc_panel_3.insets = new Insets(10, 5, 10, 0);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 3;
		panelCategoryInfo.add(panel_3, gbc_panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAddCate = new JButton("Thêm");
     	btnAddCate.setFont(new Font("Times New Roman", Font.BOLD, 12));
     	btnAddCate.setBorder(new LineBorder(borderColor, 2, true));
     	Image iconAdd = new ImageIcon("Assets/Icon/add.png").getImage();
     	iconAdd = iconAdd.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		btnAddCate.setPreferredSize(new Dimension(100, 40));
		btnAddCate.setBackground(buttonColor);
		btnAddCate.setForeground(Color.white);
		btnAddCate.setFocusPainted(false);
		btnAddCate.setIcon(new ImageIcon(iconAdd));
		btnAddCate.addMouseListener(this);
		panel_3.add(btnAddCate);
		btnEditCate = new JButton("Sửa");
		btnEditCate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnEditCate.setBorder(new LineBorder(borderColor, 2, true));
     	Image iconEdit = new ImageIcon("Assets/Icon/edit.png").getImage();
     	iconEdit = iconEdit.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
     	btnEditCate.setPreferredSize(new Dimension(100, 40));
     	btnEditCate.setBackground(buttonColor);
     	btnEditCate.setForeground(Color.white);
     	btnEditCate.setFocusPainted(false);
     	btnEditCate.setIcon(new ImageIcon(iconEdit));
     	btnEditCate.addMouseListener(this);
		panel_3.add(btnEditCate);
		
		btnDeleteCate = new JButton("Xóa");
		btnDeleteCate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnDeleteCate.setBorder(new LineBorder(borderColor, 2, true));
     	Image iconDelete = new ImageIcon("Assets/Icon/delete.png").getImage();
     	iconDelete = iconDelete.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
     	btnDeleteCate.setPreferredSize(new Dimension(100, 40));
     	btnDeleteCate.setBackground(buttonColor);
     	btnDeleteCate.setForeground(Color.white);
     	btnDeleteCate.setFocusPainted(false);
     	btnDeleteCate.setIcon(new ImageIcon(iconDelete));
     	btnDeleteCate.addMouseListener(this);
		panel_3.add(btnDeleteCate);
		
		btnRefreshCate = new JButton("Mới");
		btnRefreshCate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnRefreshCate.setBorder(new LineBorder(borderColor, 2, true));
     	Image iconRefresh = new ImageIcon("Assets/Icon/clear.png").getImage();
     	iconRefresh = iconRefresh.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
     	btnRefreshCate.setPreferredSize(new Dimension(100, 40));
     	btnRefreshCate.setBackground(buttonColor);
     	btnRefreshCate.setForeground(Color.white);
     	btnRefreshCate.setFocusPainted(false);
     	btnRefreshCate.setIcon(new ImageIcon(iconRefresh));
     	btnRefreshCate.addMouseListener(this);
		panel_3.add(btnRefreshCate);
		
		JPanel paneltable = new JPanel();
		paneltable.setBackground(Color.WHITE);
		paneltable.setBorder(new MatteBorder(2, 0, 0, 0, borderColor));
		GridBagConstraints gbc_paneltable = new GridBagConstraints();
		gbc_paneltable.weightx = 1.0;
		gbc_paneltable.gridwidth = 2;
		gbc_paneltable.insets = new Insets(5, 20, 5, 10);
		gbc_paneltable.fill = GridBagConstraints.BOTH;
		gbc_paneltable.gridx = 0;
		gbc_paneltable.gridy = 1;
		add(paneltable, gbc_paneltable);
		GridBagLayout gbl_paneltable = new GridBagLayout();
		gbl_paneltable.columnWidths = new int[]{0, 0};
		gbl_paneltable.rowHeights = new int[]{0, 0, 0, 0};
		gbl_paneltable.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_paneltable.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		paneltable.setLayout(gbl_paneltable);
		
		JLabel lblNewLabel_4 = new JLabel("Thông Tin Sản Phẩm");
		lblNewLabel_4.setForeground(textColor);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.weighty = 0.1;
		gbc_lblNewLabel_4.weightx = 1.0;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 0;
		paneltable.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.ipady = 5;
		gbc_textField_3.weighty = 0.1;
		gbc_textField_3.weightx = 1.0;
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 0;
		gbc_textField_3.gridy = 1;
		paneltable.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new LineBorder(borderColor, 2, true));
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.weighty = 0.8;
		gbc_scrollPane_1.weightx = 1.0;
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 2;
		paneltable.add(scrollPane_1, gbc_scrollPane_1);
		
	     String[] columnNames1 = {"Mã SP","Tên SP" ,"Loại SP"};
	     Object[][] data1 = {

	     };
	     
	     DefaultTableModel model1 = new DefaultTableModel(data1, columnNames1) {
	            @Override
	            public boolean isCellEditable(int row, int column) {
	                return false;
	            }
	        };
      table_1 = new JTable(model1);	
      table_1.setBorder(new LineBorder(borderColor, 2, false));
      table_1.getTableHeader().setBorder(new LineBorder(borderColor, 2, false));
      table_1.getTableHeader().setReorderingAllowed(false);
      table_1.getTableHeader().setBackground(borderColor);
      table_1.getTableHeader().setForeground(Color.white);
      scrollPane_1.setViewportView(table_1);

	}
	
	public void loadDataTable(ArrayList<CategoryDTO> result) {
		categoryModel.setRowCount(0);
		for (CategoryDTO c : result) {
			categoryModel.addRow(new Object[] {
					c.getCategoryId(), c.getCategoryName()
			});
		}
	}
	
	  public int getRowSelected() {
	        int index = table.getSelectedRow();
	        if (index == -1) {
	            JOptionPane.showMessageDialog(this, "Vui lòng chọn loại sản phẩm!");
	        }
	        return index;
	    }
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnAddCate) {
			System.out.println("Click");
            if (Validation.isEmpty(cateNameTxt.getText())) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập tên loại sản phẩm mới");
            } else {
                String categoryName = cateNameTxt.getText().trim();                
                if (categoryBUS.checkDup(categoryName)) {
                    int id = CategoryDAO.getInstance().getAutoIncrement();
                    categoryBUS.add(categoryName);
                    loadDataTable(listCategory);
                    cateNameTxt.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Loại sản phẩm đã tồn tại !");
                }
            }
        } else if (e.getSource() == btnDeleteCate) {
            int index = getRowSelected();
            if (index != -1) {
            	categoryBUS.delete(listCategory.get(index));
                loadDataTable(listCategory);
                cateNameTxt.setText("");
            }
        } else if (e.getSource() == btnEditCate) {
            int index = getRowSelected();
            if (index != -1) {
                if (Validation.isEmpty(cateNameTxt.getText())) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập loại sản phẩm mới");
                } else {
                    String categoryName = cateNameTxt.getText().trim();
                    if (categoryBUS.checkDup(categoryName)) {
                    	categoryBUS.update(new CategoryDTO(listCategory.get(index).getCategoryId(), categoryName));
                        loadDataTable(listCategory);
                        cateNameTxt.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "Thương hiệu đã tồn tại !");
                    }
                }
            }
        } else if (e.getSource() == table) {   
        	System.out.println("Edit");
            int index = table.getSelectedRow();
            cateIdTxt.setText(String.valueOf(listCategory.get(index).getCategoryId()));
            cateNameTxt.setText(listCategory.get(index).getCategoryName());
        } else if (e.getSource() == btnRefreshCate) {
        	loadDataTable(listCategory);
        	cateIdTxt.setText("");
            cateNameTxt.setText("");     
            cateFindTxt.setText("");
        } else if(e.getSource() == btnExport) {
        	try {
        		ExcelExporter excel = new ExcelExporter();
				excel.exportJTableToExcel(table);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
	}
	

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
        try {
//            filterTable(cateFindTxt.getText());
    	    ArrayList<CategoryDTO> filteredList = new ArrayList<>();
        	filteredList = categoryBUS.search(cateFindTxt.getText());
        	loadDataTable(filteredList);
        } catch (Exception  ex) {
            Logger.getLogger(testPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
		
	}
}
