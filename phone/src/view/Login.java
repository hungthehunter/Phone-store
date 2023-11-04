package view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
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
import javax.swing.JButton;
import java.awt.SystemColor;

public class Login extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	public Login() {
		Color woodColor = new Color(210, 180, 140);
		this.setTitle("Đăng nhập");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1350,700);
		getContentPane().setBackground(woodColor);
		

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{858, 436, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		getContentPane().add(panel, gbc_panel);
		
		
		ImageIcon myPicture=new ImageIcon("Assets/phone.jpg");
		panel.setLayout(new BorderLayout(0, 0));
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(myPicture);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(woodColor);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{104, 388, 56};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel account_label = new JLabel();
		GridBagConstraints gbc_account_label = new GridBagConstraints();
		gbc_account_label.insets = new Insets(0, 0, 5, 5);
		gbc_account_label.gridx = 0;
		gbc_account_label.gridy = 2;
		panel_1.add(account_label, gbc_account_label);
		
		JLabel lblNewLabel_1 = new JLabel("Login Account");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 35));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		Image my_email=new ImageIcon("Assets/email.png").getImage();//
		Image email_pic=my_email.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(email_pic));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(40, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 4;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.ipady = 30;
		gbc_textField.insets = new Insets(50, 0, 10, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 4;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);
		
		Image my_password=new ImageIcon("Assets/key.png").getImage();
		Image password_pic=my_password.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		JLabel lblNewLabel_3 = new JLabel(new ImageIcon(password_pic));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(40, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 5;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.ipady = 30;
		gbc_textField_1.insets = new Insets(50, 0, 10, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 5;
		panel_1.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("    Ghi nhớ mật khẩu");
		chckbxNewCheckBox.setForeground(new Color(139, 69, 19));
		chckbxNewCheckBox.setFont(new Font("Verdana", Font.BOLD, 14));
		chckbxNewCheckBox.setBackground(new Color(255, 204, 153));
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.ipady = 20;
		gbc_chckbxNewCheckBox.insets = new Insets(20, 0, 20, 5);
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 7;
		panel_1.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		JButton btnNewButton_1 = new JButton("Đăng nhập");
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 16));
		btnNewButton_1.setBackground(new Color(255, 204, 153));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.ipady = 15;
		gbc_btnNewButton_1.insets = new Insets(20, 0, 20, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 8;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Quên mật khẩu?");
		btnNewButton_2.setForeground(new Color(139, 69, 19));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.anchor = GridBagConstraints.SOUTH;
		gbc_btnNewButton_2.ipady = 15;
		gbc_btnNewButton_2.insets = new Insets(50, 0, 20, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 15;
		panel_1.add(btnNewButton_2, gbc_btnNewButton_2);

		panel.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                // Get the new size of the label
                int width = lblNewLabel.getWidth();
                int height = lblNewLabel.getHeight();

                // Resize the original image to the new size
                Image image = myPicture.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);

                // Update the label with the resized image
               lblNewLabel.setIcon(new ImageIcon(image));
            }
        });
	}
public static void main(String[] args) {
	System.setProperty("sun.java2d.uiScale", "1.0");
try {
	Login loginBr=new Login();
	loginBr.setVisible(true);
} catch (Exception e) {
	e.printStackTrace();
}
}
}
