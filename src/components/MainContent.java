package components;

import javax.swing.*;
import java.awt.*;

public class MainContent extends JPanel {
    private CardLayout cardLayout;
    private JPanel contentPanel;

    public MainContent() {
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);
        setLayout(new BorderLayout());
        add(contentPanel, BorderLayout.CENTER);

        // Default panel
        JPanel defaultPanel = new JPanel();
        defaultPanel.add(new JLabel("Select an option from the sidebar"));
        contentPanel.add(defaultPanel, "default");

        // Initialize and add QA panel
        QAPanel qaPanel = new QAPanel();
        contentPanel.add(qaPanel, "qa");

        // Other panels can be added here similarly...
    }

    public void showQAPanel() {
        cardLayout.show(contentPanel, "qa");
    }

    public void showDefaultPanel() {
        cardLayout.show(contentPanel, "default");
    }

    // Add methods to show other panels if needed
}
