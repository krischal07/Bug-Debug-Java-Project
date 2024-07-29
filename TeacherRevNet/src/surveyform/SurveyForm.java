package surveyform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SurveyForm extends JFrame {

    private Font customFont;
    private ArrayList<ButtonGroup> buttonGroups = new ArrayList<>();
    private JButton submitButton;

    public SurveyForm() {
        setTitle("Teacher Review Survey");
        setSize(500, 700);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); // Ensure only the SurveyForm closes

//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Load custom font
        try {
            customFont = Font.createFont(Font.TRUETYPE_FONT, new File("Poppins-Medium.ttf")).deriveFont(20f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
            customFont = new Font("Serif", Font.PLAIN, 14); // Fallback font
        }

        // Main panel with BoxLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Array of questions
        String[] questions = {
                "The teacher explains concepts clearly.",
                "The teacher makes the class interesting.",
                "The teacher is approachable for questions and help.",
                "The teacher communicates expectations and instructions clearly.",
                "The teacher provides timely and constructive feedback.",
                "The teacher uses a variety of teaching methods effectively.",
                "The course materials are relevant and up-to-date.",
                "The teacher encourages class participation and questions.",
                "The teacher uses technology effectively in lessons.",
                "The teacher respects different cultures and backgrounds."
        };

        // Loop through the questions and create components for each
        for (String question : questions) {
            mainPanel.add(createQuestionPanel(question));
        }

        // Add submit button
        submitButton = new JButton("SUBMIT");
        submitButton.setFont(customFont);
        submitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        submitButton.setEnabled(false); // Initially disable the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (allQuestionsAnswered()) {
                    JOptionPane.showMessageDialog(SurveyForm.this, "Form submitted successfully!");
                } else {
                    JOptionPane.showMessageDialog(SurveyForm.this, "Please answer all questions before submitting.");
                }
            }
        });

        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(submitButton);

        // Add the main panel to the frame
        add(new JScrollPane(mainPanel));
    }

    private JPanel createQuestionPanel(String question) {
        // Create a panel for each question
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));

        // Add question label
        JLabel questionLabel = new JLabel(question);
        questionLabel.setFont(customFont);
        panel.add(questionLabel, BorderLayout.NORTH);

        // Create a sub-panel for radio buttons
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

        // Add radio buttons to the options panel
        JRadioButton[] options = new JRadioButton[5];
        ButtonGroup group = new ButtonGroup();
        buttonGroups.add(group);
        for (int i = 0; i < options.length; i++) {
            options[i] = new JRadioButton();
            options[i].setFont(customFont);
            group.add(options[i]);
            optionsPanel.add(options[i]);
            options[i].addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    checkSubmitButtonState();
                }
            });
        }

        // Add Agree and Disagree labels
        JLabel agreeLabel = new JLabel("Strongly Agree");
        agreeLabel.setForeground(Color.GREEN);
        agreeLabel.setFont(customFont);
        JLabel disagreeLabel = new JLabel("Strognly Disagree");
        disagreeLabel.setForeground(Color.RED);
        disagreeLabel.setFont(customFont);

        panel.add(agreeLabel, BorderLayout.WEST);
        panel.add(optionsPanel, BorderLayout.CENTER);
        panel.add(disagreeLabel, BorderLayout.EAST);

        return panel;
    }

    private boolean allQuestionsAnswered() {
        for (ButtonGroup group : buttonGroups) {
            if (group.getSelection() == null) {
                return false;
            }
        }
        return true;
    }

    private void checkSubmitButtonState() {
        submitButton.setEnabled(allQuestionsAnswered());
    }

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new SurveyForm().setVisible(true);
//            }
//        });
//    }
}
