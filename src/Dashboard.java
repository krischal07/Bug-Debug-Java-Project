import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import components.Sidebar;
import components.MainContent;

public class Dashboard {
    private JFrame frame;
    private MainContent mainContent;

    public void createAndShowGUI() {
        frame = new JFrame("Teacher Review System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        // Sidebar
        Sidebar sidebar = new Sidebar(new MenuItemClickListener());
        frame.add(sidebar.getPanel(), BorderLayout.WEST);

        // Main content
        mainContent = new MainContent();
        frame.add(mainContent.getPanel(), BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public void updateMainContent(String content) {
        mainContent.updateContent(content);
    }

    private class MenuItemClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            updateMainContent(command);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Dashboard().createAndShowGUI();
        });
    }
}
