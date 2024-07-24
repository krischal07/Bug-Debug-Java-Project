package components;

import javax.swing.*;
import java.awt.*;

public class MainContent {
    private JPanel mainContent;

    public MainContent() {
        mainContent = createMainContent();
    }

    private JPanel createMainContent() {
        JPanel mainContent = new JPanel();
        mainContent.setLayout(new BorderLayout());
        mainContent.setBackground(Color.WHITE);

        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BorderLayout());
        headerPanel.setBackground(Color.LIGHT_GRAY);

        JLabel welcomeLabel = new JLabel("Welcome Back");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setHorizontalAlignment(JLabel.LEFT);
        welcomeLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        JPanel welcomePanel = new JPanel();
        welcomePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        welcomePanel.setBackground(Color.LIGHT_GRAY);

        welcomePanel.add(welcomeLabel);

        headerPanel.add(welcomePanel, BorderLayout.WEST);
        mainContent.add(headerPanel, BorderLayout.NORTH);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(2, 2, 10, 10));

        contentPanel.add(createChartPanel());
        contentPanel.add(createPendingQuestionsPanel());
        contentPanel.add(createPendingReviewsPanel());
        contentPanel.add(createPendingReviewsPanel());

        mainContent.add(contentPanel, BorderLayout.CENTER);

        return mainContent;
    }

    private JPanel createChartPanel() {
        JPanel chartPanel = new JPanel();
        chartPanel.setBackground(new Color(220, 240, 255));
        chartPanel.add(new JLabel("Average Ratings For Each Teacher"));
        return chartPanel;
    }

    private JPanel createPendingQuestionsPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(220, 240, 255));
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel("Pending Questions ..."), BorderLayout.NORTH);
        JLabel remainingLabel = new JLabel("17 Questions remaining");
        remainingLabel.setForeground(Color.ORANGE);
        panel.add(remainingLabel, BorderLayout.SOUTH);
        return panel;
    }

    private JPanel createPendingReviewsPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(220, 240, 255));
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel("Pending Reviews ..."), BorderLayout.NORTH);
        JLabel stars = new JLabel("★★★★★");
        stars.setFont(new Font("Arial", Font.PLAIN, 24));
        panel.add(stars, BorderLayout.CENTER);
        JLabel remainingLabel = new JLabel("17 Questions remaining");
        remainingLabel.setForeground(Color.ORANGE);
        panel.add(remainingLabel, BorderLayout.SOUTH);
        return panel;
    }

    public JPanel getMainContentPanel() {
        return mainContent;
    }
}
