package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TeacherPanel extends JPanel {
    private String teacherName;
    private String teacherImagePath;

    public TeacherPanel(String teacherName, String teacherImagePath) {
        this.teacherName = teacherName;
        this.teacherImagePath = teacherImagePath;
        initUI();
    }

    private void initUI() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        setBackground(Color.WHITE);

        // Add teacher image
        JLabel imageLabel = new JLabel(new ImageIcon(getClass().getResource(teacherImagePath)));
        imageLabel.setAlignmentX(CENTER_ALIGNMENT);
        add(imageLabel);

        // Add teacher name
        JLabel nameLabel = new JLabel(teacherName);
        nameLabel.setAlignmentX(CENTER_ALIGNMENT);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(nameLabel);

        // Add click listener
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Display questions or perform an action
                JOptionPane.showMessageDialog(null, "Questions for " + teacherName);
            }
        });
    }
}
