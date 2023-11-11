package view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;


import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;

public class Login extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField emailText;
	private JPasswordField passwordField;

	public Login() {
		int r = 34;
		int g = 33;
		int b = 75;

		Color myColor = new Color(r, g, b);
		getContentPane().setBackground(Color.WHITE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {300, 350};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(null);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weightx = 0.4;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		getContentPane().add(panel, gbc_panel);

		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{161, 0};
		gbl_panel.rowHeights = new int[]{261, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("");	
		ImageIcon myPicture = new ImageIcon("Assets/phone.jpg");
		Image image = myPicture.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
		myPicture = new ImageIcon(image);
		lblNewLabel.setIcon(myPicture);
		
		
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.weighty = 1.0;
		gbc_lblNewLabel.weightx = 1.0;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.weightx = 0.6;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel close = new JLabel("");
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		ImageIcon closeIcon = new ImageIcon("Assets/Icon/close.png");
		Image imageClose = closeIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		closeIcon = new ImageIcon(imageClose);
		close.setIcon(closeIcon);
		close.setVerticalAlignment(SwingConstants.BOTTOM);
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		GridBagConstraints dbc_close = new GridBagConstraints();
		dbc_close.insets = new Insets(0, 0, 5, 5);
		dbc_close.gridx = 2;
		dbc_close.gridy = 0;
		panel_1.add(close, dbc_close);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setForeground(myColor);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.weighty = 0.1;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.weightx = 1.0;
		gbc_lblNewLabel_1.gridwidth = 3;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		emailText = new JTextField("Nhập địa chỉ email");		
		emailText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		emailText.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
                if (emailText.getText().isEmpty()) {
                	emailText.setText("Nhập địa chỉ email");
                	emailText.setForeground(Color.GRAY);
                }
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				 if (emailText.getText().equals("Nhập địa chỉ email")) {
					 	emailText.setText("");
					 	emailText.setForeground(Color.BLACK);
	                }
			}
		});		
		
		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setForeground(myColor);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.weighty = 0.1;
		gbc_lblNewLabel_2.weightx = 1.0;
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.gridwidth = 2;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
        
		emailText.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(34, 33, 75)));
		GridBagConstraints gbc_emailText = new GridBagConstraints();
		gbc_emailText.weighty = 0.2;
		gbc_emailText.weightx = 1.0;
		gbc_emailText.gridwidth = 3;
		gbc_emailText.insets = new Insets(0, 0, 5, 10);
		gbc_emailText.fill = GridBagConstraints.HORIZONTAL;
		gbc_emailText.gridx = 0;
		gbc_emailText.gridy = 3;
		panel_1.add(emailText, gbc_emailText);
		emailText.setColumns(10);
		passwordField = new JPasswordField("************************************************************************************************");
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.addFocusListener(new FocusListener() {
			
			@Override
            public void focusGained(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).equals("************************************************************************************************")) {
                    passwordField.setText("");
                    passwordField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).isEmpty()) {
                    passwordField.setText("************************************************************************************************");
                    passwordField.setForeground(Color.GRAY);
                }
            }
		});		
		
		JLabel lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setForeground(myColor);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.weighty = 0.1;
		gbc_lblNewLabel_3.gridwidth = 2;
		gbc_lblNewLabel_3.weightx = 1.0;
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
        
		passwordField.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(34, 33, 75)));
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.weighty = 0.2;
		gbc_passwordField.ipady = 5;
		gbc_passwordField.weightx = 1.0;
		gbc_passwordField.gridwidth = 3;
		gbc_passwordField.insets = new Insets(0, 0, 5, 10);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 0;
		gbc_passwordField.gridy = 5;
		panel_1.add(passwordField, gbc_passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("Quên Mật Khẩu?");
		lblNewLabel_4.setFont(lblNewLabel_4.getFont().deriveFont(lblNewLabel_4.getFont().getStyle() | Font.BOLD));
		lblNewLabel_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_4.setForeground(myColor);
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.weighty = 0.1;
		gbc_lblNewLabel_4.weightx = 1.0;
		gbc_lblNewLabel_4.gridwidth = 3;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 6;
		panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Đăng Nhập");
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setRequestFocusEnabled(true);
		btnNewButton.requestFocus();
		btnNewButton.setBackground(myColor);
		btnNewButton.setForeground(Color.white);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.weighty = 0.3;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 10);
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.ipady = 20;
		gbc_btnNewButton.weightx = 1.0;
		gbc_btnNewButton.gridwidth = 3;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 7;
		panel_1.add(btnNewButton, gbc_btnNewButton);
		


	}
	
	public static void main(String[] args) {
		System.setProperty("sun.java2d.uiScale", "1.0");
		try {
			Login loginBr=new Login();
			loginBr.setSize(650, 350);
			loginBr.setUndecorated(true);
			loginBr.setVisible(true);	
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		    int x = (screenSize.width - loginBr.getWidth()) / 2;
		    int y = (screenSize.height - loginBr.getHeight()) / 2;
		    loginBr.setLocation(x, y);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
