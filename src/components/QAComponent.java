package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.function.Consumer;
import javax.imageio.ImageIO;

public class QAComponent {

    public JPanel createQAPanel(Consumer<String> teacherClickListener) {
        JPanel qaPanel = new JPanel();
        qaPanel.setLayout(new BoxLayout(qaPanel, BoxLayout.Y_AXIS));
        qaPanel.add(new JLabel("Q&A Section", JLabel.CENTER));

        JPanel teacherPanel = new JPanel();
        teacherPanel.setLayout(new GridLayout(0, 3)); // 0 rows, 3 columns

        // Create sample teacher panels
        for (int i = 0; i < 6; i++) {
            teacherPanel.add(createTeacherPanel("Teacher " + (i + 1), "/assets/user.png", teacherClickListener));
        }

        qaPanel.add(teacherPanel);

        return qaPanel;
    }

    private JPanel createTeacherPanel(String teacherName, String photoPath, Consumer<String> teacherClickListener) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Resize the image to 100x100 pixels
        ImageIcon photo = resizeImageIcon(photoPath, 100, 100);
        JLabel photoLabel = new JLabel(photo);
        photoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel nameLabel = new JLabel(teacherName);
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(photoLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 5))); // Add space between photo and name
        panel.add(nameLabel);

        // Add click listener for photo and name
        MouseAdapter clickListener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                teacherClickListener.accept(teacherName);
            }
        };
        photoLabel.addMouseListener(clickListener);
        nameLabel.addMouseListener(clickListener);

        return panel;
    }

    private ImageIcon resizeImageIcon(String path, int width, int height) {
        try {
            BufferedImage img = ImageIO.read(getClass().getResource(path));
            Image scaledImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            return new ImageIcon(scaledImg);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public JPanel createTeacherQuestionsPanel(String teacherName, ActionListener backListener) {
        JPanel questionsPanel = new JPanel();
        questionsPanel.setLayout(new BorderLayout());

        // Top panel for back button and title
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton backButton = new JButton("Back");
        backButton.addActionListener(backListener);
        topPanel.add(backButton);

        JLabel titleLabel = new JLabel("Questions for " + teacherName, JLabel.LEFT);
        topPanel.add(titleLabel);

        questionsPanel.add(topPanel, BorderLayout.NORTH);

        // Placeholder for questions
        JPanel questionsListPanel = new JPanel();
        questionsListPanel.setLayout(new BoxLayout(questionsListPanel, BoxLayout.Y_AXIS));
        for (int i = 1; i <= 5; i++) {
            questionsListPanel.add(new JLabel("Question " + i));
        }
        questionsPanel.add(new JScrollPane(questionsListPanel), BorderLayout.CENTER);

        return questionsPanel;
    }
}
