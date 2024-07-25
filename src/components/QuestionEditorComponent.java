package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class QuestionEditorComponent {
    private JPanel editorPanel;
    private JTextArea questionTextArea;
    private JButton addButton;
    private JButton removeButton;
    private JList<String> questionList;
    private DefaultListModel<String> listModel;
    private List<String> questions;

    public QuestionEditorComponent(List<String> questions) {
        this.questions = questions;
        editorPanel = new JPanel();
        editorPanel.setLayout(new BorderLayout());

        // Initialize components
        listModel = new DefaultListModel<>();
        questionList = new JList<>(listModel);
        questionTextArea = new JTextArea();
        addButton = new JButton("Add Question");
        removeButton = new JButton("Remove Question");

        // Add components to panel
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(2, 1));
        topPanel.add(new JScrollPane(questionList));
        topPanel.add(questionTextArea);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 2));
        bottomPanel.add(addButton);
        bottomPanel.add(removeButton);

        editorPanel.add(topPanel, BorderLayout.CENTER);
        editorPanel.add(bottomPanel, BorderLayout.SOUTH);

        // Set action listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addQuestion();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeQuestion();
            }
        });

        loadQuestions();
    }

    private void loadQuestions() {
        listModel.clear();
        for (String question : questions) {
            listModel.addElement(question);
        }
    }

    private void addQuestion() {
        String question = questionTextArea.getText().trim();
        if (!question.isEmpty()) {
            questions.add(question);
            loadQuestions();
            questionTextArea.setText("");
        }
    }

    private void removeQuestion() {
        String selectedQuestion = questionList.getSelectedValue();
        if (selectedQuestion != null) {
            questions.remove(selectedQuestion);
            loadQuestions();
        }
    }

    public JPanel getEditorPanel() {
        return editorPanel;
    }
}
