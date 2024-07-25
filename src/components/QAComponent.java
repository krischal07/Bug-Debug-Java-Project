package components;

import javax.swing.*;
import java.awt.*;

public class QAComponent {
    private JPanel mainPanel;
    private JTextArea[] answerFields;

    public QAComponent() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Create a panel to hold questions and answers
        JPanel questionsPanel = new JPanel();
        questionsPanel.setLayout(new GridLayout(0, 1, 10, 10)); // One column with gaps for spacing

        // Hardcoded questions
        String[] questions = {
                "1. How effective is the teacher in explaining concepts?",
                "2. How well does the teacher engage with the students during class?",
                "3. How approachable is the teacher for questions and help?",
                "4. Has the teacher contributed to your personal growth or interest in the subject?",
                "5. How would you describe the classroom environment created by the teacher?"
        };

        // Array to hold JTextAreas for answers
        answerFields = new JTextArea[questions.length];

        // Add each question and answer field to the panel
        for (int i = 0; i < questions.length; i++) {
            JPanel questionPanel = new JPanel();
            questionPanel.setLayout(new BorderLayout());

            JLabel questionLabel = new JLabel(questions[i]);
            questionLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10)); // Padding

            JTextArea answerField = new JTextArea(3, 30);
            answerField.setLineWrap(true);
            answerField.setWrapStyleWord(true);
            answerField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            answerFields[i] = answerField;

            JScrollPane scrollPane = new JScrollPane(answerField);

            questionPanel.add(questionLabel, BorderLayout.NORTH);
            questionPanel.add(scrollPane, BorderLayout.CENTER);

            questionsPanel.add(questionPanel);
        }

        // Add a submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> handleSubmit());

        // Add components to the main panel
        mainPanel.add(new JLabel("Please answer the following questions:", JLabel.CENTER), BorderLayout.NORTH);
        mainPanel.add(questionsPanel, BorderLayout.CENTER);
        mainPanel.add(submitButton, BorderLayout.SOUTH);
    }

    private void handleSubmit() {
        // Handle submission logic here
        JOptionPane.showMessageDialog(mainPanel, "Answers submitted successfully!");
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
