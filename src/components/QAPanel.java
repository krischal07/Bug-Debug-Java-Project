package components;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class QAPanel extends JPanel {
    private List<TeacherPanel> teacherPanels;

    public QAPanel() {
        this.teacherPanels = new ArrayList<>();
        initUI();
    }

    private void initUI() {
        setLayout(new GridLayout(0, 3, 10, 10)); // 3 columns, dynamic rows

        // Example teacher data
        addTeacher("Teacher 1", "/assets/teacher1.png");
        addTeacher("Teacher 2", "/assets/teacher2.png");
        addTeacher("Teacher 3", "/assets/teacher3.png");
        addTeacher("Teacher 4", "/assets/teacher4.png");
        addTeacher("Teacher 5", "/assets/teacher5.png");
        addTeacher("Teacher 6", "/assets/teacher6.png");
    }

    public void addTeacher(String name, String imagePath) {
        ImageIcon teacherIcon = new ImageIcon(getClass().getResource(imagePath));
        TeacherPanel teacherPanel = new TeacherPanel(name, teacherIcon);
        teacherPanels.add(teacherPanel);
        add(teacherPanel);
        revalidate();
        repaint();
    }
}
