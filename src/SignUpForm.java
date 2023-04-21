import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class SignUpForm extends JFrame
{

    private JLabel nameLabel, emailLabel, passwordLabel;
    private JTextField nameField, emailField;
    private JPasswordField passwordField;
    private JButton signUpButton, loginButton;

    public SignUpForm() 
    {
        nameLabel = new JLabel("Enter Your Userame:");
        emailLabel = new JLabel("Enter Your Email:");
        passwordLabel = new JLabel("Enter Your Password:");

        nameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();

        signUpButton = new JButton("Sign Up");
        loginButton = new JButton("Login");

        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(nameLabel);
        panel.add(nameField);

        panel.add(emailLabel);
        panel.add(emailField);

        panel.add(passwordLabel);
        panel.add(passwordField);

        panel.add(loginButton);
        panel.add(signUpButton);
        panel.add(new JLabel()); // spacer

        setTitle("Sign Up Form");
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);

        signUpButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());

                if (name.isEmpty() || email.isEmpty() || password.isEmpty()) 
                {
                    JOptionPane.showMessageDialog(null, "Please fill in all fields.");
                } 
                else 
                {
                    try 
                    {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/choulong_company", "root", "123456789");
                        PreparedStatement pst = con.prepareStatement("INSERT INTO users (user_name, user_email, user_password) VALUES (?, ?, ?)");
                        pst.setString(1, name);
                        pst.setString(2, email);
                        pst.setString(3, password);
                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Sign-up successful!");
                        nameField.setText("");
                        emailField.setText("");
                        passwordField.setText("");
                    } 
                    catch (SQLException ex) 
                    {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                    }
                }
            }
        });

        loginButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                dispose();
                new LoginForm();
            }
        });
    }
}