import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class SignUpForm extends JFrame 
{

    private JLabel nameLabel, emailLabel, passwordLabel;
    private JTextField nameField, emailField;
    private JPasswordField passwordField;
    private JButton signUpButton;

    public SignUpForm() 
    {
        nameLabel = new JLabel("Enter Your Userame:");
        emailLabel = new JLabel("Enter Your Email:");
        passwordLabel = new JLabel("Enter Your Password:");

        nameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();

        signUpButton = new JButton("Sign Up");

        signUpButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
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

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // spacer
        panel.add(signUpButton);

        setTitle("Sign Up Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        pack();
        setVisible(true);
    }
}