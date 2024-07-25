package components;

import javax.swing.*;
import java.awt.*;

public class UserInfoPanel extends JPanel {
    public UserInfoPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.LIGHT_GRAY);
        setPreferredSize(new Dimension(200, 150)); // Adjust height as needed

        // Add a temporary border for visibility
        // setBorder(BorderFactory.createLineBorder(Color.RED));

        // Set fixed size for components
        ImageIcon userIconImage = new ImageIcon(getClass().getResource("/assets/user.png"));
        if (userIconImage != null) {
            userIconImage = new ImageIcon(userIconImage.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        }
        JLabel userIcon = new JLabel(userIconImage);
        JLabel userName = new JLabel("Krischal Sherstha");

        userIcon.setAlignmentX(Component.CENTER_ALIGNMENT);
        userName.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(userIcon);
        // add(Box.createRigidArea(new Dimension(0, 5)));
        add(userName);
    }
}
