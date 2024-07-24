package components;

import javax.swing.*;
import java.awt.*;

public class MainContent {
    private JPanel panel;
    private JLabel contentLabel;

    public MainContent() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.WHITE);

        contentLabel = new JLabel("Welcome", JLabel.CENTER);
        contentLabel.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(contentLabel, BorderLayout.CENTER);
    }

    public void updateContent(String content) {
        contentLabel.setText(content);
    }

    public JPanel getPanel() {
        return panel;
    }
}
