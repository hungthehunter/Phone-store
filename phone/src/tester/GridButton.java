package tester;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GridButton extends JPanel {

	/**
	 * Create the panel.
	 */
	public GridButton() {
		setBackground(SystemColor.window);
		
		this.setSize(400,845);
	
		this.setVisible(true);

       this.setLayout(new GridLayout(10,1));
        
      
		JLabel picture_navbar = new JLabel("");
		picture_navbar.setBounds(22, 10, 353, 208);
		 Color woodColor = new Color(210, 180, 140);
	        Color darkGreen = new Color(0, 100, 0);
	        Color buttonGreen = new Color(0, 150, 0);
	        Color purple_light=new Color(202,207,255);
		  JPanel panel = new JPanel(new GridLayout(8, 1));
		    Image my_email = new ImageIcon("Assets/planet.jpg").getImage();
			my_email=my_email.getScaledInstance(353, 208, Image.SCALE_SMOOTH);
			picture_navbar.setIcon(new ImageIcon(my_email));
		add(picture_navbar);
			

		    Image my_customer = new ImageIcon("Assets/Icon/customer_picture.png").getImage();
			Image customer_pic=my_customer.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon customer_icon=new ImageIcon(customer_pic);
			
			JButton Customer_button = new JButton("Customer",customer_icon);	
		

			Customer_button.setBackground(purple_light);
			Customer_button.setFont(new Font("Verdana", Font.BOLD, 12));
			Customer_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
		    Customer_button.setVerticalTextPosition(SwingConstants.CENTER); 
			Customer_button.setBounds(22, 249,  353, 41);
			add(Customer_button);
			

		    Image my_invoice = new ImageIcon("Assets/Icon/invoice.png").getImage();

			Image invoice_pic=my_invoice.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon invoice_icon=new ImageIcon(invoice_pic);
			JButton Invoice_button = new JButton("Invoice",invoice_icon);
		
			
			Invoice_button.setBackground(purple_light);
			Invoice_button.setFont(new Font("Verdana", Font.BOLD, 12));
			Invoice_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
			Invoice_button.setVerticalTextPosition(SwingConstants.CENTER); 
			Invoice_button.setBounds(22, 310, 353, 41);
			add(Invoice_button);
			
			  Image my_counterParty = new ImageIcon("Assets/counterParty.png").getImage();
				Image counterParty_pic=my_counterParty.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
				ImageIcon counterParty_icon=new ImageIcon(counterParty_pic);
				
				JButton counterParty_button = new JButton("Counter Party",counterParty_icon);
			
				counterParty_button.setBackground(purple_light);
				counterParty_button.setFont(new Font("Verdana", Font.BOLD, 12));
				counterParty_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
				counterParty_button.setVerticalTextPosition(SwingConstants.CENTER); 
				counterParty_button.setBounds(22, 373,  353, 41);
				add(counterParty_button);

			    Image my_staff = new ImageIcon("Assets/Icon/staff.png").getImage();
				Image staff_pic=my_staff.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
				ImageIcon staff_icon=new ImageIcon(staff_pic);
				
				JButton staff_button = new JButton("Staff",staff_icon);
			
				staff_button.setBackground(purple_light);
				staff_button.setFont(new Font("Verdana", Font.BOLD, 12));
				staff_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
				staff_button.setVerticalTextPosition(SwingConstants.CENTER); 
				staff_button.setBounds(22, 436,  353, 41);
				add(staff_button);

			    Image my_salary = new ImageIcon("Assets/Icon/salary.png").getImage();
				Image salary_pic=my_salary.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
				ImageIcon salary_icon=new ImageIcon(salary_pic);
				
				JButton salary_button = new JButton("Salary",salary_icon);
			
				salary_button.setBackground(purple_light);
				salary_button.setFont(new Font("Verdana", Font.BOLD, 12));
				salary_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
				salary_button.setVerticalTextPosition(SwingConstants.CENTER); 
				salary_button.setBounds(22, 499,  353, 41);
				add(salary_button);

			    Image my_warantty = new ImageIcon("Assets/Icon/warrenty.png").getImage();
				Image warantty_pic=my_warantty.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
				ImageIcon warranty_icon=new ImageIcon(warantty_pic);
				
				JButton warantty_button = new JButton("Warranty",warranty_icon);
			
				warantty_button.setBackground(purple_light);
				warantty_button.setFont(new Font("Verdana", Font.BOLD, 12));
				salary_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
				salary_button.setVerticalTextPosition(SwingConstants.CENTER);
				warantty_button.setBounds(22, 565,  353, 41);
				add(warantty_button);

			    Image my_products = new ImageIcon("Assets/Icon/phone.jpeg").getImage();

				Image products_pic=my_products.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
				ImageIcon products_icon=new ImageIcon(products_pic);
				
				JButton products_button = new JButton("Products",products_icon);
			
				products_button.setBackground(purple_light);
				products_button.setFont(new Font("Tahoma", Font.BOLD, 12));
				products_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
				products_button.setVerticalTextPosition(SwingConstants.CENTER);
				products_button.setBounds(22, 627,  353, 41);
				add(products_button);
				
				

			    Image my_statistics = new ImageIcon("Assets/Icon/Statistics.png").getImage();
				Image statistics_pic=my_statistics.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
				ImageIcon statistics_icon=new ImageIcon(statistics_pic);
				
				JButton statistics_button = new JButton("Statistics", statistics_icon);
				
				statistics_button.setBackground(purple_light);
				statistics_button.setFont(new Font("Tahoma", Font.BOLD, 12));
				statistics_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
				statistics_button.setVerticalTextPosition(SwingConstants.CENTER);
				statistics_button.setBounds(22, 693,  353, 41);
				add(statistics_button);

			    Image my_director = new ImageIcon("Assets/Icon/director.png").getImage();
				Image director_pic=my_director.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
				ImageIcon director_icon=new ImageIcon(director_pic);

				
				JButton director_button = new JButton("Director",director_icon);
			
				director_button.setBackground(purple_light);
				director_button.setFont(new Font("Verdana", Font.BOLD, 12));
				director_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
				director_button.setVerticalTextPosition(SwingConstants.CENTER);
				director_button.setBounds(22, 760,  353, 41);
				add(director_button);
	}

}
