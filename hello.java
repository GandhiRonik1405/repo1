import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

<<<<<< HEAD
public class LoginForm extends JFrame implements ActionListener {

    private Container container;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginForm() {
        setTitle("Login Form");
        setBounds(300, 90, 400, 300);
=======
public class LogoutForm extends JFrame implements ActionListener {

    private Container container;
    private JButton logoutButton;

    public LogoutForm() {
        setTitle("Logout Form");
        setBounds(300, 90, 400, 200);
>>>>>>> second
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

<<<<<<< HEAD
        userLabel = new JLabel("Username");
        userLabel.setBounds(50, 50, 100, 30);
        container.add(userLabel);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50, 100, 100, 30);
        container.add(passwordLabel);

        userTextField = new JTextField();
        userTextField.setBounds(150, 50, 150, 30);
        container.add(userTextField);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 150, 30);
        container.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);
        loginButton.addActionListener(this);
        container.add(loginButton);
=======
        logoutButton = new JButton("Logout");
        logoutButton.setBounds(150, 70, 100, 30);
        logoutButton.addActionListener(this);
        container.add(logoutButton);
>>>>>>> second

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
        String username = userTextField.getText();
        String password = new String(passwordField.getPassword());

        if (username.equals("admin") && password.equals("admin")) {
            JOptionPane.showMessageDialog(this, "Login Successful");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password");
=======
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Confirm Logout", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Successfully logged out.");
            dispose(); // Close the form
            // Additional logout logic can be added here, e.g., redirecting to the login page
>>>>>>> second
        }
    }

    public static void main(String[] args) {
<<<<<<< HEAD
        new LoginForm();
=======
        new LogoutForm();
>>>>>>> second
    }
}

