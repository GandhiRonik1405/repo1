import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogoutForm extends JFrame implements ActionListener {

    private Container container;
    private JButton logoutButton;

    public LogoutForm() {
        setTitle("Logout Form");
        setBounds(300, 90, 400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        logoutButton = new JButton("Logout");
        logoutButton.setBounds(150, 70, 100, 30);
        logoutButton.addActionListener(this);
        container.add(logoutButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Confirm Logout", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Successfully logged out.");
            dispose(); // Close the form
            // Additional logout logic can be added here, e.g., redirecting to the login page
        }
    }

    public static void main(String[] args) {
        new LogoutForm();
    }
}

