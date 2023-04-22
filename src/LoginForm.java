import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class LoginForm extends JFrame implements ActionListener
{

    JLabel userLabel, passLabel, emailLabel, statusLabel;
    JTextField userTextField, userEmailField;
    JPasswordField passTextField;
    JButton loginButton, signUpButton;

    String user;

    public LoginForm() 
    {
        JPanel panel = new JPanel();

        userLabel = new JLabel("Username:");
        userTextField = new JTextField();
        
        emailLabel = new JLabel("Email:");
        userEmailField = new JTextField();

        passLabel = new JLabel("Password:");
        passTextField = new JPasswordField();

        signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(this);
        
        
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        
        statusLabel = new JLabel("");
        
        
        panel.add(userLabel);
        panel.add(userTextField);

        panel.add(emailLabel);
        panel.add(userEmailField);

        panel.add(passLabel);
        panel.add(passTextField);

        panel.add(signUpButton);

        panel.add(loginButton);

        panel.add(statusLabel);
        

        panel.setLayout(new GridLayout(5, 2));
        
        setTitle("Login Form");
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(panel);
    }

    private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private String DB_URL = "jdbc:mysql://localhost/choulong_company";
    private String USER = "root";
    private String PASS = "123456789";

    public void actionPerformed(ActionEvent ae) 
    {

        if (ae.getSource() == loginButton) 
        {

            user = userTextField.getText();
            String email = userEmailField.getText();
            String pass = new String(passTextField.getPassword());

            try 
            {

                Class.forName(JDBC_DRIVER);
                Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE user_name='" + user + "' AND user_password='" + pass + "' AND user_email='" + email + "'");

                userTextField.setText(user);

                if (rs.next()) 
                {
                    statusLabel.setText("Login successful");
                    UserPage userPage = new UserPage();
                    userPage.UserPage_Login(user);
                    dispose();
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

        if (ae.getSource() == signUpButton) 
        {
            dispose();
            new SignUpForm();
        }
    }
}


