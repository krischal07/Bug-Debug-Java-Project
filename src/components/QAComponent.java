package components;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QAComponent {
    private JPanel mainPanel;
    private JTextArea[] answerFields;
    private JButton submitButton;

    public QAComponent() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Create a panel to hold questions and answers
        JPanel questionsPanel = new JPanel();
        questionsPanel.setLayout(new GridLayout(0, 1, 10, 10)); // One column with gaps for spacing

        // Get questions from QuestionProvider
        java.util.List<String> questions = QuestionProvider.getQuestions();

        // Array to hold JTextAreas for answers
        answerFields = new JTextArea[questions.size()];

        // Add each question and answer field to the panel
        for (int i = 0; i < questions.size(); i++) {
            JPanel questionPanel = new JPanel();
            questionPanel.setLayout(new BorderLayout());

            JLabel questionLabel = new JLabel(questions.get(i));
            questionLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10)); // Padding

            JTextArea answerField = new JTextArea(3, 30);
            answerField.setLineWrap(true);
            answerField.setWrapStyleWord(true);
            answerField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            answerField.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    updateSubmitButtonState();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    updateSubmitButtonState();
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    updateSubmitButtonState();
                }
            });
            answerFields[i] = answerField;

            JScrollPane scrollPane = new JScrollPane(answerField);

            questionPanel.add(questionLabel, BorderLayout.NORTH);
            questionPanel.add(scrollPane, BorderLayout.CENTER);

            questionsPanel.add(questionPanel);
        }

        // Add a submit button
        submitButton = new JButton("Submit");
        submitButton.setEnabled(false); // Initially disable the button
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

    private void updateSubmitButtonState() {
        boolean allAnswered = true;
        for (JTextArea answerField : answerFields) {
            // Debugging information
            System.out.println("Checking field: '" + answerField.getText().trim() + "'");
            if (answerField.getText().trim().isEmpty()) {
                allAnswered = false;
                break;
            }
        }
        submitButton.setEnabled(allAnswered);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
