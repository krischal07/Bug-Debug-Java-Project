package components;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;

public class Sidebar {
    private JPanel panel;

    public Sidebar(ActionListener menuItemClickListener) {
        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new BorderLayout());
        panel.setPreferredSize(new Dimension(200, 700));
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        // Create top panel for logo and user info
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.setBackground(Color.LIGHT_GRAY);
        topPanel.setPreferredSize(new Dimension(200, 150)); // Increased height to fit logo and user info

        // Add logo to the top-left
        JLabel logoLabel = createLogoLabel();
        topPanel.add(logoLabel, BorderLayout.WEST); // Place logo at the left of the topPanel

        // Add user info panel below the logo
        UserInfoPanel userInfoPanel = new UserInfoPanel();
        userInfoPanel.setPreferredSize(new Dimension(200, 100)); // Explicit height for user info panel
        topPanel.add(userInfoPanel, BorderLayout.SOUTH); // Place userInfoPanel below the logo

        panel.add(topPanel, BorderLayout.NORTH);

        // Menu items
        JPanel menuItemsPanel = new JPanel();
        menuItemsPanel.setLayout(new BoxLayout(menuItemsPanel, BoxLayout.Y_AXIS));
        menuItemsPanel.setBackground(Color.LIGHT_GRAY);

        menuItemsPanel.add(createMenuItem("Dashboard", "/assets/dashboard.png", menuItemClickListener));
        menuItemsPanel.add(createMenuItem("Q&A", "/assets/qa.png", menuItemClickListener));
        menuItemsPanel.add(createMenuItem("Review", "/assets/review.png", menuItemClickListener));
        menuItemsPanel.add(createMenuItem("Settings", "/assets/settings.png", menuItemClickListener));
        menuItemsPanel.add(createMenuItem("Log out", "/assets/log-out.png", menuItemClickListener));

        panel.add(menuItemsPanel, BorderLayout.CENTER);
    }

    private JLabel createLogoLabel() {
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/assets/kist 1.png"));
        JLabel logoLabel = new JLabel(logoIcon);

        // Set size for logo
        logoLabel.setPreferredSize(new Dimension(80, 100)); // Adjust dimensions if needed

        // Set border for visibility, add top margin
        Border border = BorderFactory.createEmptyBorder(10, 10, 0, 0); // Top margin of 10px
        logoLabel.setBorder(border);

        // Ensure no alignment issues
        logoLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        logoLabel.setAlignmentY(Component.TOP_ALIGNMENT);

        // Align the logo to the left
        logoLabel.setHorizontalAlignment(JLabel.LEFT);

        return logoLabel;
    }

    private JPanel createMenuItem(String title, String iconPath, ActionListener actionListener) {
        JPanel menuItemPanel = new JPanel();
        menuItemPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        menuItemPanel.setBackground(Color.LIGHT_GRAY);

        JButton button = new JButton(title, new ImageIcon(getClass().getResource(iconPath)));
        button.setActionCommand(title);
        button.addActionListener(actionListener);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        menuItemPanel.add(button);

        return menuItemPanel;
    }

    public JPanel getPanel() {
        return panel;
    }
}
