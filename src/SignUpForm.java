import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class SignUpForm extends JFrame
{

    private javax.swing.JPanel container;
    private javax.swing.JLabel email_lb;
    private javax.swing.JTextField email_tf;
    private javax.swing.JButton login_btn;
    private javax.swing.JLabel password_lb;
    private javax.swing.JPasswordField password_tf;
    private javax.swing.JButton sign_up_btn;
    private javax.swing.JPanel sign_up_container;
    private javax.swing.JLabel signup_lb;
    private javax.swing.JLabel username_lb;
    private javax.swing.JTextField username_tf;


    public SignUpForm() 
    {
        initComponents();
    }


    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        container = new javax.swing.JPanel();
        sign_up_container = new javax.swing.JPanel();
        signup_lb = new javax.swing.JLabel();
        username_lb = new javax.swing.JLabel();
        email_lb = new javax.swing.JLabel();
        password_lb = new javax.swing.JLabel();
        username_tf = new javax.swing.JTextField();
        email_tf = new javax.swing.JTextField();
        password_tf = new javax.swing.JPasswordField();
        sign_up_btn = new javax.swing.JButton();
        login_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 480));

        container.setBackground(new java.awt.Color(51, 204, 255));
        container.setLayout(new java.awt.GridBagLayout());

        sign_up_container.setBackground(new java.awt.Color(255, 255, 255));
        sign_up_container.setAlignmentX(0.0F);
        sign_up_container.setAlignmentY(0.0F);
        sign_up_container.setMinimumSize(new java.awt.Dimension(380, 445));
        sign_up_container.setPreferredSize(new java.awt.Dimension(380, 445));

        signup_lb.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        signup_lb.setForeground(new java.awt.Color(255, 0, 0));
        signup_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_lb.setText("Sign Up");
        signup_lb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signup_lb.setPreferredSize(new java.awt.Dimension(90, 32));

        username_lb.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        username_lb.setText("Password");
        username_lb.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        username_lb.setPreferredSize(new java.awt.Dimension(60, 5));

        email_lb.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        email_lb.setText("Email");
        email_lb.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        email_lb.setPreferredSize(new java.awt.Dimension(60, 5));

        password_lb.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        password_lb.setText("Username");
        password_lb.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        password_lb.setPreferredSize(new java.awt.Dimension(60, 5));

        username_tf.setPreferredSize(new java.awt.Dimension(64, 30));

        email_tf.setPreferredSize(new java.awt.Dimension(64, 30));

        password_tf.setPreferredSize(new java.awt.Dimension(90, 30));

        sign_up_btn.setBackground(new java.awt.Color(255, 51, 51));
        sign_up_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sign_up_btn.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_btn.setText("SignUp");
        sign_up_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_up_btnActionPerformed(evt);
            }
        });

        login_btn.setText("Already have an account. Login Here");
        login_btn.setBorderPainted(false);
        login_btn.setContentAreaFilled(false);
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sign_up_containerLayout = new javax.swing.GroupLayout(sign_up_container);
        sign_up_container.setLayout(sign_up_containerLayout);
        sign_up_containerLayout.setHorizontalGroup(
            sign_up_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sign_up_containerLayout.createSequentialGroup()
                .addGroup(sign_up_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sign_up_containerLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(sign_up_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sign_up_containerLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(signup_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sign_up_containerLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(sign_up_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sign_up_containerLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(login_btn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sign_up_containerLayout.setVerticalGroup(
            sign_up_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sign_up_containerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(signup_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(password_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(username_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(email_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(username_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(password_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(sign_up_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_btn)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        container.add(sign_up_container, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }


    private void sign_up_btnActionPerformed(java.awt.event.ActionEvent evt) {                                            

        String DB_URL = "jdbc:mysql://localhost/choulong_company";
        String USER = "root";
        String PASS = "123456789";
        
        String name = username_tf.getText();
        String email = email_tf.getText();
        String password = new String(password_tf.getPassword());


        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.");
        } 
        else 
        {
            try 
            {
                Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
                PreparedStatement pst = con.prepareStatement("INSERT INTO users (user_name, user_email, user_password) VALUES (?, ?, ?)");
                pst.setString(1, name);
                pst.setString(2, email);
                pst.setString(3, password);
                pst.executeUpdate();

                
                username_tf.setText(name);
                email_tf.setText("");
                password_tf.setText("");
                UserPage userPage = new UserPage();
                userPage.UserPage_SignUp(name);
                dispose();
            } 
            catch (SQLException ex) 
            {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }

    }


    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        LoginForm loginForm = new LoginForm();
        loginForm.show();
        dispose();
    }
}