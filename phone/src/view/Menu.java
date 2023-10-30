package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import tester.GridButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
public class Menu extends JFrame {
	private static boolean zoomedIn = false;
	private JPanel contentPane;
	 private static final int MIN_WINDOW_WIDTH = 1450;
	    private static final int MIN_WINDOW_HEIGHT = 900;
	public Menu() {
		
		this.setTitle("Trang chủ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1450,900);
		
		this.setVisible(true);
		
		this.setLocationRelativeTo(null);	
		getContentPane().setLayout(null);
	
		 
		 
		 
		 

	    
		/*===== Color =====*/
		Color woodColor = new Color(210, 180, 140);
        Color darkGreen = new Color(0, 100, 0);
        Color buttonGreen = new Color(0, 150, 0);
        Color purple_light=new Color(202,207,255);
        /*===== Color =====*/
        
        
        
        /*===== Sidebar =====*/		
    	JPanel navbar_panel = new JPanel();
		navbar_panel.setBounds(0, 0, 400, 845);
		getContentPane().add(navbar_panel);
		navbar_panel.setLayout(null);
		

		navbar_panel.setBackground(Color.WHITE);
        
		JLabel picture_navbar = new JLabel("");
		picture_navbar.setBounds(22, 10, 353, 208);
     
	    Image my_email = new ImageIcon("Assets/planet.jpg").getImage();
		my_email=my_email.getScaledInstance(353, 208, Image.SCALE_SMOOTH);
		picture_navbar.setIcon(new ImageIcon(my_email));
		navbar_panel.add(picture_navbar);
		

	    Image my_customer = new ImageIcon("Assets/Icon/customer_picture.png").getImage();
		Image customer_pic=my_customer.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		ImageIcon customer_icon=new ImageIcon(customer_pic);
		
		JButton Customer_button = new JButton("Customer",customer_icon);	
	

		Customer_button.setBackground(purple_light);
		Customer_button.setFont(new Font("Verdana", Font.BOLD, 12));
		Customer_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
	    Customer_button.setVerticalTextPosition(SwingConstants.CENTER); 
		Customer_button.setBounds(22, 249,  353, 41);
		navbar_panel.add(Customer_button);
		

	    Image my_invoice = new ImageIcon("Assets/Icon/invoice.png").getImage();

		Image invoice_pic=my_invoice.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
		ImageIcon invoice_icon=new ImageIcon(invoice_pic);
		JButton Invoice_button = new JButton("Invoice",invoice_icon);
	
		
		Invoice_button.setBackground(purple_light);
		Invoice_button.setFont(new Font("Verdana", Font.BOLD, 12));
		Invoice_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
		Invoice_button.setVerticalTextPosition(SwingConstants.CENTER); 
		Invoice_button.setBounds(22, 310, 353, 41);
		navbar_panel.add(Invoice_button);
		
		  Image my_counterParty = new ImageIcon("Assets/counterParty.png").getImage();
			Image counterParty_pic=my_counterParty.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon counterParty_icon=new ImageIcon(counterParty_pic);
			
			JButton counterParty_button = new JButton("Counter Party",counterParty_icon);
		
			counterParty_button.setBackground(purple_light);
			counterParty_button.setFont(new Font("Verdana", Font.BOLD, 12));
			counterParty_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
			counterParty_button.setVerticalTextPosition(SwingConstants.CENTER); 
			counterParty_button.setBounds(22, 373,  353, 41);
			navbar_panel.add(counterParty_button);

		    Image my_staff = new ImageIcon("Assets/Icon/staff.png").getImage();
			Image staff_pic=my_staff.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon staff_icon=new ImageIcon(staff_pic);
			
			JButton staff_button = new JButton("Staff",staff_icon);
		
			staff_button.setBackground(purple_light);
			staff_button.setFont(new Font("Verdana", Font.BOLD, 12));
			staff_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
			staff_button.setVerticalTextPosition(SwingConstants.CENTER); 
			staff_button.setBounds(22, 436,  353, 41);
			navbar_panel.add(staff_button);

		    Image my_salary = new ImageIcon("Assets/Icon/salary.png").getImage();
			Image salary_pic=my_salary.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon salary_icon=new ImageIcon(salary_pic);
			
			JButton salary_button = new JButton("Salary",salary_icon);
		
			salary_button.setBackground(purple_light);
			salary_button.setFont(new Font("Verdana", Font.BOLD, 12));
			salary_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
			salary_button.setVerticalTextPosition(SwingConstants.CENTER); 
			salary_button.setBounds(22, 499,  353, 41);
			navbar_panel.add(salary_button);

		    Image my_warantty = new ImageIcon("Assets/Icon/warrenty.png").getImage();
			Image warantty_pic=my_warantty.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon warranty_icon=new ImageIcon(warantty_pic);
			
			JButton warantty_button = new JButton("Warranty",warranty_icon);
		
			warantty_button.setBackground(purple_light);
			warantty_button.setFont(new Font("Verdana", Font.BOLD, 12));
			salary_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
			salary_button.setVerticalTextPosition(SwingConstants.CENTER);
			warantty_button.setBounds(22, 565,  353, 41);
			navbar_panel.add(warantty_button);

		    Image my_products = new ImageIcon("Assets/Icon/phone.jpeg").getImage();

			Image products_pic=my_products.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon products_icon=new ImageIcon(products_pic);
			
			JButton products_button = new JButton("Products",products_icon);
		
			products_button.setBackground(purple_light);
			products_button.setFont(new Font("Tahoma", Font.BOLD, 12));
			products_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
			products_button.setVerticalTextPosition(SwingConstants.CENTER);
			products_button.setBounds(22, 627,  353, 41);
			navbar_panel.add(products_button);
			
			

		    Image my_statistics = new ImageIcon("Assets/Icon/Statistics.png").getImage();
			Image statistics_pic=my_statistics.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon statistics_icon=new ImageIcon(statistics_pic);
			
			JButton statistics_button = new JButton("Statistics", statistics_icon);
			
			statistics_button.setBackground(purple_light);
			statistics_button.setFont(new Font("Tahoma", Font.BOLD, 12));
			statistics_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
			statistics_button.setVerticalTextPosition(SwingConstants.CENTER);
			statistics_button.setBounds(22, 693,  353, 41);
			navbar_panel.add(statistics_button);

		    Image my_director = new ImageIcon("Assets/Icon/director.png").getImage();
			Image director_pic=my_director.getScaledInstance(45, 36, Image.SCALE_SMOOTH);
			ImageIcon director_icon=new ImageIcon(director_pic);

			
			JButton director_button = new JButton("Director",director_icon);
		
			director_button.setBackground(purple_light);
			director_button.setFont(new Font("Verdana", Font.BOLD, 12));
			director_button.setHorizontalTextPosition(SwingConstants.RIGHT); 
			director_button.setVerticalTextPosition(SwingConstants.CENTER);
			director_button.setBounds(22, 760,  353, 41);
			navbar_panel.add(director_button);
			
			
			/*===== Sidebar =====*/			
			
			JPanel contentPanel = new JPanel();
			contentPanel.setBounds(401, 0, 1050, 852);
			contentPanel.setBorder(null);
		getContentPane().add(contentPanel);
			contentPanel.setLayout(null);
		
			
			/*===== Button =====*/	
	   
			Customer_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Customer CustomerFrame = new Customer();
					CustomerFrame.setSize(1450, 900);
					contentPanel.removeAll();
					contentPanel.add(CustomerFrame);
					
					contentPanel.revalidate();
					contentPanel.repaint();
				}
			});
			
			Invoice_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					GridButton GridFrame=new GridButton();
//					GridFrame.setSize(400,845);
//					contentPanel.removeAll();
//					contentPanel.add(GridFrame);
//					contentPanel.revalidate();
//					contentPanel.repaint();
				}
			});
			
			counterParty_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
       
				}
			});
			staff_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
			salary_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
			warantty_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
			products_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
              Category categoryFrame=new Category();
              categoryFrame.setSize(1110,856);
              contentPanel.removeAll();
             contentPanel.add(categoryFrame);
          	contentPanel.revalidate();
			contentPanel.repaint();
				}
			});
			statistics_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
			director_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
			
			/*===== Button =====*/
			
			
			/*===== Dimension =====*/
			
			 Dimension minimumSize_sidebar_panel = new Dimension(400, 845);
			 Dimension referenceSize_sidebar_panel = new Dimension(400, 2000);
			 this.addComponentListener(new ComponentAdapter() {
		            @Override
		            public void componentResized(ComponentEvent e) {
		            	 int newWidth = getContentPane().getWidth();
		                 int newHeight = getContentPane().getHeight();
		                 
		                 if (newWidth < MIN_WINDOW_WIDTH || newHeight < MIN_WINDOW_HEIGHT) {
		                	 if (zoomedIn) {
		                		 zoomedIn=false;
		                			navbar_panel.setBounds(0, 0, 400, 845);
		                			picture_navbar.setBounds(22, 10, 353, 208);
		                		 Customer_button.setBounds(22, 249,  353, 41);
		                			Invoice_button.setBounds(22, 310, 353, 41);
		                			counterParty_button.setBounds(22, 373,  353, 41);
		                			staff_button.setBounds(22, 436,  353, 41);
		                			salary_button.setBounds(22, 499,  353, 41);
		                			warantty_button.setBounds(22, 565,  353, 41);
		                			products_button.setBounds(22, 627,  353, 41);
		                			statistics_button.setBounds(22, 693,  353, 41);
		                			director_button.setBounds(22, 760,  353, 41);
		                			picture_navbar.removeAll();
		                		    Image my_email = new ImageIcon("Assets/planet.jpg").getImage();
		                			my_email=my_email.getScaledInstance(353, 208, Image.SCALE_SMOOTH);
		                			picture_navbar.setIcon(new ImageIcon(my_email));
		                			navbar_panel.add(picture_navbar);
		                	 }
		                     
		                 } else {             
		                     if (!zoomedIn) {
		                    	 zoomedIn=true;
		                     /*===== Resize Sidebar =====*/
		     		            	
	    		                 int sidebarPanelWidth = (int) (0.28 * newWidth);
	    		                 int sidebarPanelHeight = (int) (1 * newHeight);
	    		                 navbar_panel.setBounds(0,0, sidebarPanelWidth ,sidebarPanelHeight);
	    		             /*===== Resize Sidebar =====*/    
	    		               
	    		                 
	    		             /*===== Resize button =====*/    
	    		                 
	    		             	 int newWidth_sidebar_button = navbar_panel.getRootPane().getWidth();
	    		                 int newHeight_sidebar_button = navbar_panel.getRootPane().getHeight();
	    		                 int sidebarButtonWidth = (int) (0.26 * newWidth_sidebar_button);
	    		                int sidebarButtonPictureHeight=(int)(0.23 * newHeight_sidebar_button);
	    		                 int sidebarButtonHeight = (int) (0.05 * newHeight_sidebar_button);
	    		                 int yPositionButton = 10;
	    		                 picture_navbar.setBounds(22, 10, sidebarButtonWidth,sidebarButtonPictureHeight);
	    		                 Customer_button.setBounds(22,249+yPositionButton*2,sidebarButtonWidth,sidebarButtonHeight);
	    		             	Invoice_button.setBounds(22,310+yPositionButton*3,sidebarButtonWidth,sidebarButtonHeight);
	    		             	counterParty_button.setBounds(22,373+yPositionButton*4,sidebarButtonWidth,sidebarButtonHeight);
	    		            	staff_button.setBounds(22,436+yPositionButton*5,sidebarButtonWidth,sidebarButtonHeight);
	    		            	salary_button.setBounds(22,499+yPositionButton*6,sidebarButtonWidth,sidebarButtonHeight);
	    		            	warantty_button.setBounds(22,565+yPositionButton*7,sidebarButtonWidth,sidebarButtonHeight);
	    		            	products_button.setBounds(22,627+yPositionButton*8,sidebarButtonWidth,sidebarButtonHeight);
	    		            	statistics_button.setBounds(22,693+yPositionButton*9,sidebarButtonWidth,sidebarButtonHeight);
	    		            	director_button.setBounds(22,760+yPositionButton*10,sidebarButtonWidth,sidebarButtonHeight);
	    		            	picture_navbar.removeAll();
	    		            	Image my_email = new ImageIcon("Assets/planet.jpg").getImage();
	    		        		my_email=my_email.getScaledInstance(sidebarButtonWidth,sidebarButtonPictureHeight, Image.SCALE_SMOOTH);
	    		        		picture_navbar.setIcon(new ImageIcon(my_email));
	    		             /*===== Resize button =====*/  
		                     }
		                 }
		             }
		         });
		                 
		                 
		                 
		                 
		               
		            
		             
		        
		         
			
			 /*===== Dimension =====*/

	}
	public static void main(String[] args) {
		System.setProperty("sun.java2d.uiScale", "1.0");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
