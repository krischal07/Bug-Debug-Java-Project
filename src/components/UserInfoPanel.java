package components;

import javax.swing.*;
import java.awt.*;

public class UserInfoPanel {
    private JPanel userInfoPanel;

    public UserInfoPanel() {
        userInfoPanel = createUserInfoPanel();
    }

    private JPanel createUserInfoPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(200, 120));
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        ImageIcon userIconImage = ImageUtil.loadAndResizeImageIcon("/assets/user.png", 60, 60);
        JLabel userIcon = new JLabel(userIconImage);
        JLabel userName = new JLabel("Nysa Rai");

        userIcon.setAlignmentX(Component.CENTER_ALIGNMENT);
        userName.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(userIcon);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(userName);

        return panel;
    }

    public JPanel getUserInfoPanel() {
        return userInfoPanel;
    }
}
