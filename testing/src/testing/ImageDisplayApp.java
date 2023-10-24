package testing;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.UIManager.LookAndFeelInfo;

public class ImageDisplayApp extends JFrame {
    private JLabel imageLabel;

    public ImageDisplayApp() {
        setTitle("Image Display App");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        imageLabel = new JLabel();
        add(imageLabel, BorderLayout.CENTER);
    }

    public void loadImage(String imagePath) {
        try {
            File file = new File(imagePath);
            BufferedImage originalImage = ImageIO.read(file);
            int width = 600;
            int height = 400;
            Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING);
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = bufferedImage.createGraphics();
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            g2d.drawImage(scaledImage, 0, 0, null);
            g2d.dispose();
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            imageLabel.setIcon(imageIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        // Set Nimbus Look and Feel
    	System.setProperty("sun.java2d.uiScale", "1.0");

        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            ImageDisplayApp app = new ImageDisplayApp();
            app.setVisible(true);
            // Thay đổi đường dẫn tới file hình ảnh tại đây
            String imagePath = "D:\\Esclipse\\testing\\src\\testing\\planet.jpg";
            app.loadImage(imagePath);
        });
    }
}
//D:\\Esclipse\\testing\\src\\testing\\planet.jpg

