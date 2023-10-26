package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Counterparty extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel_1;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counterparty frame = new Counterparty();
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
	public Counterparty() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1450, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(372, 0, 614, 508);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblThngTinChung = new JLabel("Thông tin chung");
		lblThngTinChung.setForeground(Color.RED);
		lblThngTinChung.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblThngTinChung.setBounds(0, 0, 146, 20);
		panel.add(lblThngTinChung);
		
		table = new JTable();
		table.setBounds(0, 26, 614, 169);
		panel.add(table);
		
		panel_1 = new JPanel();
		panel_1.setBounds(372, 528, 614, 307);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chức năng");
		lblNewLabel.setForeground(new Color(255, 0, 0));		
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 10, 104, 20);
		panel_1.add(lblNewLabel);
		
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		
		JButton button = new JButton("New button");
		button.setBounds(10, 52, 85, 21);
		panel_1.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(164, 52, 85, 21);
		panel_1.add(button_1);
		
		JButton button_1_1 = new JButton("New button");
		button_1_1.setBounds(323, 52, 85, 21);
		panel_1.add(button_1_1);
		
		JButton button_1_1_1 = new JButton("New button");
		button_1_1_1.setBounds(474, 52, 85, 21);
		panel_1.add(button_1_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(996, 0, 440, 508);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblThngTinPhn = new JLabel("Thông tin phân phối");
		lblThngTinPhn.setBounds(0, 10, 147, 20);
		lblThngTinPhn.setVerticalAlignment(SwingConstants.TOP);
		lblThngTinPhn.setForeground(Color.RED);
		lblThngTinPhn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_2.add(lblThngTinPhn);
		
		JLabel lblNewLabel_1 = new JLabel("Mã NPP:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 55, 80, 13);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên NPP:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(10, 105, 80, 13);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Địa chỉ:");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(26, 158, 80, 13);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("SDT:");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(38, 203, 80, 13);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Email:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1.setBounds(26, 253, 80, 13);
		panel_2.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Chú thích:");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 307, 80, 13);
		panel_2.add(lblNewLabel_1_1_1_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(85, 53, 345, 19);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(85, 103, 345, 19);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(85, 156, 345, 19);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(85, 201, 345, 19);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(85, 251, 345, 19);
		panel_2.add(textField_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(85, 302, 345, 185);
		panel_2.add(textArea);
		
		
	}
}
