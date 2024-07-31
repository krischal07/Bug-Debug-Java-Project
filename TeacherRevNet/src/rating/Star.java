package rating;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Star extends JFrame {
    private int rating = 0; // Default rating
    private JLabel[] stars = new JLabel[5]; // Array to hold star labels
    private JLabel ratingDisplay;
    private int selectedRating = 0; // Store the selected rating
    private RatingSubmitListener submitListener;

    public Star() {
        setTitle("Star Rating Example");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        // Create star labels and set their icons
        JPanel starPanel = new JPanel(new FlowLayout());
        for (int i = 0; i < stars.length; i++) {
            stars[i] = new JLabel();
            stars[i].setIcon(loadIcon("emptystar.png")); // Placeholder for empty star
            int index = i;
            stars[i].addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    setRating(index + 1);
                }
            });
            starPanel.add(stars[i]);
        }
        add(starPanel);

        // Initialize star rating display
        ratingDisplay = new JLabel("Rating: " + rating);
        ratingDisplay.setFont(new Font("Arial", Font.PLAIN, 16));
        add(ratingDisplay);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You rated: " + rating + " stars");
                if (submitListener != null) {
                    submitListener.onRatingSubmitted(selectedRating);
                }
                dispose(); // Close the Star window
            }
        });
        add(submitButton);

        updateStars();
    }

    private void updateStars() {
        for (int i = 0; i < stars.length; i++) {
            stars[i].setIcon(loadIcon(rating > i ? "star.png" : "emptystar.png"));
        }
        ratingDisplay.setText("Rating: " + rating);
    }

    private void setRating(int newRating) {
        rating = newRating;
        updateStars();
        selectedRating = newRating; // Store the selected rating
    }

    private ImageIcon loadIcon(String fileName) {
        URL imgURL = getClass().getResource(fileName);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + fileName);
            return null;
        }
    }

    // Method to retrieve the selected rating
    public int getRating() {
        return selectedRating;
    }

    // Method to set the listener for rating submission
    public void setRatingSubmitListener(RatingSubmitListener listener) {
        this.submitListener = listener;
    }

    // Interface for rating submission listener
    public interface RatingSubmitListener {
        void onRatingSubmitted(int rating);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Star starRating = new Star();
            starRating.setVisible(true);
        });
    }
}
