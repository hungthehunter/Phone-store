package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
public class Menu extends JFrame {
	private JPanel contentPanel;
    private Map<String, JButton> buttonMap = new HashMap<>();
	private Color myColor = new Color(34, 33, 75);

	public Menu() {
		//b567b4 tim dep
		// 996ad3 xanh dep
		this.setTitle("Trang chủ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1377,750);
		setMinimumSize(new java.awt.Dimension(700, 650));
		
		this.setVisible(true);
		
		this.setLocationRelativeTo(null);
	
		 
		 
		 
		 

	    
		/*==================== Begin: Color ====================*/
		Color woodColor = new Color(210, 180, 140);
        Color darkGreen = new Color(0, 100, 0);
        Color buttonGreen = new Color(0, 150, 0);
        Color purple_light=new Color(202,207,255);
        /*==================== End: Color ====================*/
        
        
        
        /* ==================== Begin: Sidebar  ====================*/		
    	getContentPane().setLayout(new BorderLayout(0, 0));
    	JPanel navbar_panel = new JPanel();
    	navbar_panel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
    	navbar_panel.setPreferredSize(new Dimension(250, 400));
    	getContentPane().add(navbar_panel, BorderLayout.WEST);


		navbar_panel.setBackground(myColor);
        
		JLabel picture_navbar = new JLabel("");
		picture_navbar.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(72, 61, 139)));
     
	    Image my_email = new ImageIcon("Assets/phone.jpg").getImage();
		my_email=my_email.getScaledInstance(250, 200, Image.SCALE_SMOOTH);
		picture_navbar.setIcon(new ImageIcon(my_email));
		navbar_panel.add(picture_navbar);
		
        createMenuButton(navbar_panel, "Invoice");
        createMenuButton(navbar_panel, "Products");
        createMenuButton(navbar_panel, "Staff");
        createMenuButton(navbar_panel, "Customer");
        createMenuButton(navbar_panel, "Warranty");
        createMenuButton(navbar_panel, "Statistics");



			
			
			/* ==================== End: Sidebar  ====================*/			
			
		
		
			
			/* ==================== Begin: Button  ====================*/	
		contentPanel = new JPanel();
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setPreferredSize(new Dimension(1110, 856));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));


	}
    public void createMenuButton(JPanel panel, String text) {
        Image iconImage = new ImageIcon("Assets/Icon/" + text.toLowerCase() + ".png").getImage();
        Image scaledImage = iconImage.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImage);

        JButton button = new JButton(text, icon);
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.setForeground(Color.white);
        button.setBackground(myColor);
        button.setFont(new Font("Verdana", Font.BOLD, 16));
        button.setBorder(null);
        button.setOpaque(true); 
        button.setFocusPainted(false);
        button.setPreferredSize(new Dimension(250, 60));
        
		/* ==================== Begin: Hover  ====================*/			
        button.addMouseListener(new MouseAdapter() {
            private boolean clicked = false;
            @Override
            public void mouseClicked(MouseEvent e) {
                clicked = !clicked;
                if (clicked) {
                    button.setBackground(Color.decode("#d1d1ef")); 
                    buttonMap.values().stream()
                    .filter(b -> b != button)
                    .forEach(b -> b.setBackground(myColor));
                } 
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (!clicked) {
                    button.setBackground(myColor.brighter()); 
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (!clicked) {
                    button.setBackground(myColor); 
                }
            }
        });

		/* ==================== End: Hover  ====================*/			

        buttonMap.put(text, button);
        button.addActionListener(e -> handleButtonClick(text));
        
        panel.add(button);
    }
    
    public void handleButtonClick(String text) {
        JButton button = buttonMap.get(text);
        if (button != null) {
            System.out.println("Button123 '" + text + "' clicked");
            contentPanel.removeAll();
            switch (text) {
            case "Products": {
            	menuProduct menuProduct = new menuProduct();
            	contentPanel.add(menuProduct);
            	contentPanel.revalidate();
            	contentPanel.repaint();
            	break;      	
            }
            
            case "Customer":{
//            	testPanel customer = new testPanel();
//            	contentPanel.add(customer);
//            	contentPanel.revalidate();
//            	contentPanel.repaint();
            	break;
            }
            
            case "Invoice":{
//            	Invoice invoice = new Invoice();
//            	contentPanel.add(invoice);
//            	contentPanel.revalidate();
//            	contentPanel.repaint();
            	break;
            }

            case "Staff":{
//            	Staff staff = new Staff();
//            	contentPanel.add(staff);
//            	contentPanel.revalidate();
//            	contentPanel.repaint();
            	break;
            }

			case "Warranty":{
				Supplier warranty = new Supplier();
	            contentPanel.add(warranty);
	        	contentPanel.revalidate();
	        	contentPanel.repaint();
	        	break;
			}
			
			case "Statistics":{
//				Statistics statistics = new Statistics();
//	            contentPanel.add(statistics);
//	        	contentPanel.revalidate();
//	        	contentPanel.repaint();
	        	break;
			}
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + text);
			}


        }
    }
	
	public static void main(String[] args) {
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
