package components;
import javax.swing.*;
import java.awt.*;

public class MenuItem {
    private JPanel panel;

    public MenuItem(String title, String iconPath) {
        panel = createMenuItem(title, iconPath);
    }

    private JPanel createMenuItem(String title, String iconPath) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setAlignmentX(Component.LEFT_ALIGNMENT);

        ImageIcon icon = ImageUtil.loadImageIcon(iconPath);
        JLabel label = new JLabel(title, icon, JLabel.LEFT);
        panel.add(label);

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println(title + " clicked");
            }
        });

        return panel;
    }

    public JPanel getPanel() {
        return panel;
    }
}

