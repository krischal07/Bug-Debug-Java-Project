import components.ChartPanelComponent;
import components.QAComponent;
import components.Sidebar;
import components.UserInfoPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard {
    private JFrame frame;
    private JPanel mainContentPanel;
    private QAComponent qaComponent;
    private JPanel qaPanel;

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
        mainContentPanel = new JPanel();
        mainContentPanel.setLayout(new BorderLayout());
        frame.add(mainContentPanel, BorderLayout.CENTER);

        frame.setVisible(true);

        // Show default content
        showDashboardContent();
    }

    private class MenuItemClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch (command) {
                case "Dashboard":
                    showDashboardContent();
                    break;
                case "Q&A":
                    showQnAContent();
                    break;
                case "Review":
                    showReviewContent();
                    break;
                case "Settings":
                    showSettingsContent();
                    break;
                case "Log out":
                    showLogoutContent();
                    break;
            }
        }
    }

    private void showDashboardContent() {
        mainContentPanel.removeAll();

        ChartPanelComponent chartPanelComponent = new ChartPanelComponent();
        JPanel chartPanel = chartPanelComponent.createChartPanel();

        mainContentPanel.setLayout(new BorderLayout());
        mainContentPanel.add(new JLabel("Welcome to Dashboard", JLabel.CENTER), BorderLayout.NORTH);
        mainContentPanel.add(chartPanel, BorderLayout.CENTER);

        mainContentPanel.revalidate();
        mainContentPanel.repaint();
    }

    private void showQnAContent() {
        mainContentPanel.removeAll();

        qaComponent = new QAComponent();
        qaPanel = qaComponent.createQAPanel(teacherName -> {
            showTeacherQuestionsContent(teacherName);
        });

        mainContentPanel.setLayout(new BorderLayout());
        mainContentPanel.add(qaPanel, BorderLayout.CENTER);

        mainContentPanel.revalidate();
        mainContentPanel.repaint();
    }

    private void showTeacherQuestionsContent(String teacherName) {
        mainContentPanel.removeAll();

        JPanel questionsPanel = qaComponent.createTeacherQuestionsPanel(teacherName, e -> {
            showQnAContent();
        });

        mainContentPanel.add(questionsPanel, BorderLayout.CENTER);

        mainContentPanel.revalidate();
        mainContentPanel.repaint();
    }

    private void showReviewContent() {
        mainContentPanel.removeAll();
        mainContentPanel.add(new JLabel("Review Section", JLabel.CENTER), BorderLayout.CENTER);
        mainContentPanel.revalidate();
        mainContentPanel.repaint();
    }

    private void showSettingsContent() {
        mainContentPanel.removeAll();
        mainContentPanel.add(new JLabel("Settings Section", JLabel.CENTER), BorderLayout.CENTER);
        mainContentPanel.revalidate();
        mainContentPanel.repaint();
    }

    private void showLogoutContent() {
        mainContentPanel.removeAll();
        mainContentPanel.add(new JLabel("Log out", JLabel.CENTER), BorderLayout.CENTER);
        mainContentPanel.revalidate();
        mainContentPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Dashboard dashboard = new Dashboard();
            dashboard.createAndShowGUI();
        });
    }
}
