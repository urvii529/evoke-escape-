import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TravelHomePage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Evoke Escape - Travel Agency");
        frame.setSize(1000, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Header Panel with Logo and Title
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(51, 153, 255));
        headerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon("logo.png")); // Ensure logo.png is in the project folder
        headerPanel.add(logo);

        JLabel title = new JLabel("Evoke Escape");
        title.setFont(new Font("Arial", Font.BOLD, 32));
        title.setForeground(Color.WHITE);
        headerPanel.add(title);

        frame.add(headerPanel, BorderLayout.NORTH);

        // Navigation Panel
        JPanel navPanel = new JPanel();
        navPanel.setLayout(new GridLayout(1, 4));
        navPanel.setBackground(new Color(230, 230, 250));

        String[] navItems = {"Home", "Tours", "About Us", "Contact"};
        for (String item : navItems) {
            JButton btn = new JButton(item);
            btn.setFont(new Font("Arial", Font.PLAIN, 18));
            navPanel.add(btn);
        }

        frame.add(navPanel, BorderLayout.SOUTH);

        // Main Content Panel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBackground(Color.WHITE);

        JLabel welcome = new JLabel("Welcome to Evoke Escape - Explore the World with Us!");
        welcome.setFont(new Font("SansSerif", Font.BOLD, 24));
        welcome.setAlignmentX(Component.CENTER_ALIGNMENT);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        contentPanel.add(welcome);

        JTextArea intro = new JTextArea("Discover amazing destinations, exclusive packages, and unforgettable adventures. Whether you're looking for a peaceful retreat or an exciting expedition, we have it all for you.");
        intro.setWrapStyleWord(true);
        intro.setLineWrap(true);
        intro.setEditable(false);
        intro.setFont(new Font("SansSerif", Font.PLAIN, 18));
        intro.setMaximumSize(new Dimension(800, 120));
        intro.setBackground(contentPanel.getBackground());
        intro.setAlignmentX(Component.CENTER_ALIGNMENT);

        contentPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        contentPanel.add(intro);

        // Tour Sample Section
        JLabel toursLabel = new JLabel("Popular Tours:");
        toursLabel.setFont(new Font("SansSerif", Font.BOLD, 22));
        toursLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        contentPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        contentPanel.add(toursLabel);

        String[] tours = {"\u2022 Goa Beaches Getaway", "\u2022 Manali Adventure Trip", "\u2022 Kerala Backwaters Cruise", "\u2022 Rajasthan Heritage Tour"};
        for (String tour : tours) {
            JLabel tourLabel = new JLabel(tour);
            tourLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
            tourLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            contentPanel.add(Box.createRigidArea(new Dimension(0, 10)));
            contentPanel.add(tourLabel);
        }

        frame.add(new JScrollPane(contentPanel), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
