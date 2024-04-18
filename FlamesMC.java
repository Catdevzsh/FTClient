import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlamesMC extends JFrame {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 500;

    public FlamesMC() {
        super("Flames MC Launcher");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Create the header panel
        JPanel headerPanel = new JPanel(new GridBagLayout());
        headerPanel.setBackground(new Color(30, 30, 30));
        JLabel titleLabel = new JLabel("Flames MC Launcher");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(titleLabel, new GridBagConstraints());

        // Create the main panel
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(new Color(40, 40, 40));

        // Create the game launch button
        JButton launchButton = new JButton();
        launchButton.setPreferredSize(new Dimension(200, 50));
        launchButton.setFont(new Font("Arial", Font.BOLD, 16));
        launchButton.setForeground(Color.WHITE);
        launchButton.setBackground(new Color(100, 100, 100));
        launchButton.setBorderPainted(false);
        launchButton.setContentAreaFilled(false);
        launchButton.setOpaque(true);
        JLabel playLabel = new JLabel("Play");
        playLabel.setForeground(Color.WHITE);
        playLabel.setFont(new Font("Arial", Font.BOLD, 16));
        launchButton.add(playLabel);
        launchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                launchGame();
            }
        });

        // Create the options panel
        JPanel optionsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        optionsPanel.setBackground(new Color(40, 40, 40));
        JButton settingsButton = new JButton();
        settingsButton.setPreferredSize(new Dimension(100, 30));
        settingsButton.setFont(new Font("Arial", Font.BOLD, 12));
        settingsButton.setForeground(Color.WHITE);
        settingsButton.setBackground(new Color(70, 70, 70));
        settingsButton.setBorderPainted(false);
        settingsButton.setContentAreaFilled(false);
        settingsButton.setOpaque(true);
        JLabel settingsLabel = new JLabel("Settings");
        settingsLabel.setForeground(Color.WHITE);
        settingsLabel.setFont(new Font("Arial", Font.BOLD, 12));
        settingsButton.add(settingsLabel);
        settingsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showOptions();
            }
        });
        JButton exitButton = new JButton();
        exitButton.setPreferredSize(new Dimension(100, 30));
        exitButton.setFont(new Font("Arial", Font.BOLD, 12));
        exitButton.setForeground(Color.WHITE);
        exitButton.setBackground(new Color(70, 70, 70));
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setOpaque(true);
        JLabel exitLabel = new JLabel("Quit");
        exitLabel.setForeground(Color.WHITE);
        exitLabel.setFont(new Font("Arial", Font.BOLD, 12));
        exitButton.add(exitLabel);
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        optionsPanel.add(settingsButton);
        optionsPanel.add(exitButton);

        // Add the components to the main panel
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 20, 20, 20);
        mainPanel.add(launchButton, gbc);
        gbc.gridy = 1;
        mainPanel.add(optionsPanel, gbc);

        // Add the panels to the frame
        add(headerPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
    }

    private void launchGame() {
        System.out.println("Launching the game...");
        // Add your game launch logic here
    }

    private void showOptions() {
        JOptionPane.showMessageDialog(this, "This is where you would add your game options.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FlamesMC().setVisible(true);
            }
        });
    }
}
