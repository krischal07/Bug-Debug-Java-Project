package utils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageUtil {
    public static ImageIcon loadAndResizeImageIcon(String path, int width, int height) {
        try {
            java.net.URL imgURL = ImageUtil.class.getResource(path);
            if (imgURL != null) {
                BufferedImage img = ImageIO.read(imgURL);
                Image scaledImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                return new ImageIcon(scaledImage);
            } else {
                System.err.println("Couldn't find file: " + path);
                return null;
            }
        } catch (IOException ex) {
            System.err.println("Error loading image: " + path);
            return null;
        }
    }

    public static ImageIcon loadImageIcon(String path) {
        java.net.URL imgURL = ImageUtil.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    public static JLabel createLogoLabel() {
        ImageIcon logoIcon = loadAndResizeImageIcon("/assets/kist 1.png", 80, 80);
        JLabel logoLabel = new JLabel(logoIcon);
        logoLabel.setHorizontalAlignment(JLabel.LEFT);
        logoLabel.setVerticalAlignment(JLabel.TOP);
        logoLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        return logoLabel;
    }
}
