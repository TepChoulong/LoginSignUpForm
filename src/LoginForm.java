import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class LoginForm extends JFrame implements ActionListener
{

    JLabel userLabel, passLabel, emailLabel, statusLabel;
    JTextField userTextField, userEmailField;
    JPasswordField passTextField;
    JButton loginButton, signupButton;

    public LoginForm() 
    {
        setTitle("Login Form");
        setSize(300, 200);
        setLayout(new GridLayout(5, 2));

        userLabel = new JLabel("Username:");
        add(userLabel);
        userTextField = new JTextField();
        add(userTextField);

        emailLabel = new JLabel("Email:");
        add(emailLabel);
        userEmailField = new JTextField();
        add(userEmailField);

        passLabel = new JLabel("Password:");
        add(passLabel);
        passTextField = new JPasswordField();
        add(passTextField);

        loginButton = new JButton("Login");
        add(loginButton);
        loginButton.addActionListener(this);

        signupButton = new JButton("Sign Up");
        add(signupButton);
        signupButton.addActionListener(this);

        statusLabel = new JLabel("");
        add(statusLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private String DB_URL = "jdbc:mysql://localhost/choulong_company";
    private String USER = "root";
    private String PASS = "123456789";

    public void actionPerformed(ActionEvent ae) 
    {

        if (ae.getSource() == loginButton) 
        {

            String user = userTextField.getText();
            String email = userEmailField.getText();
            String pass = new String(passTextField.getPassword());

            try 
            {

                Class.forName(JDBC_DRIVER);
                Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE user_name='" + user + "' AND user_password='" + pass + "' AND user_email='" + email + "'");

                if (rs.next()) 
                {
                    statusLabel.setText("Login successful");
                } 
                else 
                {
                    statusLabel.setText("Invalid username or password");
                }
                con.close();
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }

        }

        if (ae.getSource() == signupButton) 
        {
            dispose();
            SignUpForm signUpForm = new SignUpForm();
        }
    }
}


