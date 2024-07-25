import components.ChartPanelComponent;
import components.Sidebar;
import components.UserInfoPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard {
    private JFrame frame;
    private JPanel mainContentPanel;

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

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        topPanel.setBackground(Color.LIGHT_GRAY);

        // Back button
        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> showDashboardContent());
        topPanel.add(backButton);

        mainContentPanel.add(topPanel, BorderLayout.NORTH);

        // Create a panel to hold teacher info
        JPanel teacherPanel = new JPanel();
        teacherPanel.setLayout(new GridLayout(0, 3, 10, 10)); // 3 columns with 10px gaps
        teacherPanel.setBackground(Color.WHITE);

        // Sample data for teachers
        String[] teacherNames = {"Teacher 1", "Teacher 2", "Teacher 3", "Teacher 4", "Teacher 5", "Teacher 6"};
        String[] teacherImagePaths = {"/assets/user.png", "/assets/user.png", "/assets/user.png", "/assets/user.png", "/assets/user.png", "/assets/user.png"};

        for (int i = 0; i < teacherNames.length; i++) {
            JPanel teacherPanelItem = new JPanel();
            teacherPanelItem.setLayout(new BorderLayout());
            teacherPanelItem.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            // Resize teacher photo
            ImageIcon originalIcon = new ImageIcon(getClass().getResource(teacherImagePaths[i]));
            Image image = originalIcon.getImage(); // Transform it
            Image resizedImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH); // Adjust size as needed
            ImageIcon resizedIcon = new ImageIcon(resizedImage);

            // Teacher photo
            JLabel photoLabel = new JLabel(resizedIcon);
            photoLabel.setHorizontalAlignment(JLabel.CENTER);
            teacherPanelItem.add(photoLabel, BorderLayout.CENTER);

            // Teacher name
            JLabel nameLabel = new JLabel(teacherNames[i], JLabel.CENTER);
            teacherPanelItem.add(nameLabel, BorderLayout.SOUTH);

            // Add action listener to open questions for teacher
            final String teacherName = teacherNames[i];
            teacherPanelItem.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    showQuestionsForTeacher(teacherName);
                }
            });

            teacherPanel.add(teacherPanelItem);
        }

        mainContentPanel.add(teacherPanel, BorderLayout.CENTER);
        mainContentPanel.revalidate();
        mainContentPanel.repaint();
    }

    private void showQuestionsForTeacher(String teacherName) {
        mainContentPanel.removeAll();

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        topPanel.setBackground(Color.LIGHT_GRAY);

        // Back button
        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> showQnAContent());
        topPanel.add(backButton);

        mainContentPanel.add(topPanel, BorderLayout.NORTH);

        // Questions panel
        JPanel questionsPanel = new JPanel();
        questionsPanel.setLayout(new GridLayout(0, 1, 10, 10)); // 1 column with 10px gaps
        questionsPanel.setBackground(Color.WHITE);

        // Hardcoded questions
        String[] questions = {
                "1. How effective is the teacher in explaining concepts?",
                "2. How well does the teacher engage with the students during class?",
                "3. How approachable is the teacher for questions and help?",
                "4. Has the teacher contributed to your personal growth or interest in the subject?",
                "5. How would you describe the classroom environment created by the teacher?"
        };

        for (String question : questions) {
            JPanel questionPanel = new JPanel();
            questionPanel.setLayout(new BorderLayout());
            questionPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            JLabel questionLabel = new JLabel(question);
            questionPanel.add(questionLabel, BorderLayout.NORTH);

            JTextArea answerArea = new JTextArea(5, 40);
            answerArea.setLineWrap(true);
            answerArea.setWrapStyleWord(true);
            JScrollPane scrollPane = new JScrollPane(answerArea);
            questionPanel.add(scrollPane, BorderLayout.CENTER);

            questionsPanel.add(questionPanel);
        }

        // Submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Responses submitted!"));
        questionsPanel.add(submitButton);

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
