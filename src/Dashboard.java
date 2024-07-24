import components.MainContent;
import components.Sidebar;

import javax.swing.*;
import java.awt.*;

public class Dashboard {
    public void createAndShowGUI() {
        JFrame frame = new JFrame("Teacher Review System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        // Sidebar
        Sidebar sidebar = new Sidebar();
        frame.add(sidebar.getSidebarPanel(), BorderLayout.WEST);

        // Main content
        MainContent mainContent = new MainContent();
        frame.add(mainContent.getMainContentPanel(), BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().createAndShowGUI();
            }
        });
    }
}
