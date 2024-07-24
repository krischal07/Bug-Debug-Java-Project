package components;

import javax.swing.*;
import java.awt.*;

public class Sidebar {
    private JPanel sidebar;

    public Sidebar() {
        sidebar = createSidebar();
    }

    private JPanel createSidebar() {
        JPanel sidebar = new JPanel();
        sidebar.setBackground(Color.LIGHT_GRAY);
        sidebar.setLayout(new BorderLayout());
        sidebar.setPreferredSize(new Dimension(200, 700));
        sidebar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        JLabel logoLabel = ImageUtil.createLogoLabel();
        UserInfoPanel userInfoPanel = new UserInfoPanel();

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.setBackground(Color.LIGHT_GRAY);

        topPanel.add(logoLabel, BorderLayout.NORTH);
        topPanel.add(userInfoPanel.getUserInfoPanel(), BorderLayout.CENTER);

        sidebar.add(topPanel, BorderLayout.NORTH);
        sidebar.add(Box.createVerticalGlue());

        JPanel menuItems = new JPanel();
        menuItems.setLayout(new BoxLayout(menuItems, BoxLayout.Y_AXIS));
        menuItems.setBackground(Color.LIGHT_GRAY);
        menuItems.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 0));

        menuItems.add(new MenuItem("Dashboard", "/assets/dashboard.png").getPanel());
        menuItems.add(new MenuItem("Q&A", "/assets/qa.png").getPanel());
        menuItems.add(new MenuItem("Review", "/assets/review.png").getPanel());
        menuItems.add(new MenuItem("Settings", "/assets/settings.png").getPanel());
        menuItems.add(new MenuItem("Log out", "/assets/log-out.png").getPanel());

        sidebar.add(menuItems, BorderLayout.CENTER);

        return sidebar;
    }

    public JPanel getSidebarPanel() {
        return sidebar;
    }
}
