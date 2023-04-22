import javax.swing.*;

class UserPage extends JFrame {

    private JLabel welcome_txt;

    public void UserPage_SignUp(String User_name) {

        welcome_txt = new JLabel("Welcome! " + User_name);

        add(welcome_txt);

        setTitle("User Page");
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void UserPage_Login(String User_name) {

        welcome_txt = new JLabel("Welcome! " + User_name);

        add(welcome_txt);

        setTitle("User Page");
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
