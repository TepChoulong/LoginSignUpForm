import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class UserPage extends JFrame {

    private javax.swing.JPanel Experiences_Panel;
    private javax.swing.JLabel Welcome_lb;
    private javax.swing.JPanel container;
    private javax.swing.JButton description_btn;
    private javax.swing.JLabel description_lb;
    private javax.swing.JScrollPane description_scrollpanel;
    private javax.swing.JTextArea description_txtarea;
    private javax.swing.JLabel email_lb;
    private javax.swing.JButton experiences_btn;
    private javax.swing.JLabel experiences_lb;
    private javax.swing.JScrollPane experiences_scrollpanel;
    private javax.swing.JTextArea experiences_txtarea;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton logout_btn;
    private javax.swing.JButton opinions_btn;
    private javax.swing.JLabel opinions_lb;
    private javax.swing.JScrollPane opinions_scrollpanel;
    private javax.swing.JTextArea opinions_txtarea;
    private javax.swing.JPanel personal_info_panel;
    private javax.swing.JLabel position_lb;
    private javax.swing.JPanel profile_picture;
    private javax.swing.JButton skills_btn;
    private javax.swing.JLabel skills_lb;
    private javax.swing.JScrollPane skills_scrollpanel;
    private javax.swing.JTextArea skills_txtarea;
    private javax.swing.JButton studying_btn;
    private javax.swing.JLabel studying_lb;
    private javax.swing.JScrollPane studying_scrollpanel;
    private javax.swing.JTextArea studying_txtarea;
    private javax.swing.JLabel username_lb;

    UserPage() {
        initComponents();
    }

    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        personal_info_panel = new javax.swing.JPanel();
        username_lb = new javax.swing.JLabel();
        profile_picture = new javax.swing.JPanel();
        email_lb = new javax.swing.JLabel();
        position_lb = new javax.swing.JLabel();
        description_scrollpanel = new javax.swing.JScrollPane();
        description_txtarea = new javax.swing.JTextArea();
        description_lb = new javax.swing.JLabel();
        logout_btn = new javax.swing.JButton();
        description_btn = new javax.swing.JButton();
        Welcome_lb = new javax.swing.JLabel();
        Experiences_Panel = new javax.swing.JPanel();
        experiences_lb = new javax.swing.JLabel();
        experiences_scrollpanel = new javax.swing.JScrollPane();
        experiences_txtarea = new javax.swing.JTextArea();
        experiences_btn = new javax.swing.JButton();
        studying_lb = new javax.swing.JLabel();
        studying_scrollpanel = new javax.swing.JScrollPane();
        studying_txtarea = new javax.swing.JTextArea();
        studying_btn = new javax.swing.JButton();
        skills_lb = new javax.swing.JLabel();
        skills_scrollpanel = new javax.swing.JScrollPane();
        skills_txtarea = new javax.swing.JTextArea();
        skills_btn = new javax.swing.JButton();
        opinions_lb = new javax.swing.JLabel();
        opinions_scrollpanel = new javax.swing.JScrollPane();
        opinions_txtarea = new javax.swing.JTextArea();
        opinions_btn = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Experiences");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(720, 480));
        setSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        container.setBackground(new java.awt.Color(0, 204, 255));

        personal_info_panel.setPreferredSize(new java.awt.Dimension(300, 489));

        username_lb.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        username_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username_lb.setText("Username");
        username_lb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        profile_picture.setBackground(new java.awt.Color(204, 204, 204));
        profile_picture.setMinimumSize(new java.awt.Dimension(110, 110));

        javax.swing.GroupLayout profile_pictureLayout = new javax.swing.GroupLayout(profile_picture);
        profile_picture.setLayout(profile_pictureLayout);
        profile_pictureLayout.setHorizontalGroup(
            profile_pictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        profile_pictureLayout.setVerticalGroup(
            profile_pictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        email_lb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_lb.setText("tepchoulong@gmail.com");

        position_lb.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        position_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        position_lb.setText("SOFTWARE ENGINEER");

        description_txtarea.setColumns(20);
        description_txtarea.setRows(5);
        description_scrollpanel.setViewportView(description_txtarea);

        description_lb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        description_lb.setText("Descriptions");

        logout_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logout_btn.setText("Log Out");
        logout_btn.setBorderPainted(false);
        logout_btn.setContentAreaFilled(false);
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });

        description_btn.setText("Save");

        javax.swing.GroupLayout personal_info_panelLayout = new javax.swing.GroupLayout(personal_info_panel);
        personal_info_panel.setLayout(personal_info_panelLayout);
        personal_info_panelLayout.setHorizontalGroup(
            personal_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personal_info_panelLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(logout_btn))
            .addGroup(personal_info_panelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(profile_picture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(personal_info_panelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(username_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(personal_info_panelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(email_lb))
            .addGroup(personal_info_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(position_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(personal_info_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(description_lb))
            .addGroup(personal_info_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(description_scrollpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(personal_info_panelLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(description_btn))
        );
        personal_info_panelLayout.setVerticalGroup(
            personal_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personal_info_panelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(logout_btn)
                .addGap(27, 27, 27)
                .addComponent(profile_picture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(username_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(email_lb)
                .addGap(20, 20, 20)
                .addComponent(position_lb)
                .addGap(58, 58, 58)
                .addComponent(description_lb)
                .addGap(5, 5, 5)
                .addComponent(description_scrollpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(description_btn))
        );

        Welcome_lb.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Welcome_lb.setForeground(new java.awt.Color(255, 255, 255));
        Welcome_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome_lb.setText("Welcome");
        Welcome_lb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        experiences_lb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        experiences_lb.setText("Experiences");

        experiences_txtarea.setColumns(20);
        experiences_txtarea.setRows(5);
        experiences_scrollpanel.setViewportView(experiences_txtarea);

        experiences_btn.setText("Save");

        studying_lb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        studying_lb.setText("Studying");

        studying_txtarea.setColumns(20);
        studying_txtarea.setRows(5);
        studying_scrollpanel.setViewportView(studying_txtarea);

        studying_btn.setText("Save");

        skills_lb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        skills_lb.setText("Skills");

        skills_txtarea.setColumns(20);
        skills_txtarea.setRows(5);
        skills_scrollpanel.setViewportView(skills_txtarea);

        skills_btn.setText("Save");

        opinions_lb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opinions_lb.setText("Opinions");

        opinions_txtarea.setColumns(20);
        opinions_txtarea.setRows(5);
        opinions_scrollpanel.setViewportView(opinions_txtarea);

        opinions_btn.setText("Save");

        javax.swing.GroupLayout Experiences_PanelLayout = new javax.swing.GroupLayout(Experiences_Panel);
        Experiences_Panel.setLayout(Experiences_PanelLayout);
        Experiences_PanelLayout.setHorizontalGroup(
            Experiences_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Experiences_PanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(Experiences_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Experiences_PanelLayout.createSequentialGroup()
                        .addComponent(experiences_lb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Experiences_PanelLayout.createSequentialGroup()
                        .addGroup(Experiences_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(skills_scrollpanel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(experiences_scrollpanel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Experiences_PanelLayout.createSequentialGroup()
                                .addComponent(skills_lb)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Experiences_PanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(Experiences_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(skills_btn)
                                    .addComponent(experiences_btn))))
                        .addGap(150, 150, 150)))
                .addGroup(Experiences_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studying_scrollpanel)
                    .addComponent(opinions_scrollpanel)
                    .addGroup(Experiences_PanelLayout.createSequentialGroup()
                        .addGroup(Experiences_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opinions_lb)
                            .addComponent(studying_lb))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Experiences_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(opinions_btn)
                        .addComponent(studying_btn, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(50, 50, 50))
        );
        Experiences_PanelLayout.setVerticalGroup(
            Experiences_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Experiences_PanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(Experiences_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studying_lb)
                    .addComponent(experiences_lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Experiences_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(experiences_scrollpanel)
                    .addComponent(studying_scrollpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Experiences_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(experiences_btn)
                    .addComponent(studying_btn))
                .addGap(22, 22, 22)
                .addGroup(Experiences_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opinions_lb)
                    .addComponent(skills_lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Experiences_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(skills_scrollpanel)
                    .addComponent(opinions_scrollpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Experiences_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skills_btn)
                    .addComponent(opinions_btn))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Welcome_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Experiences_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addComponent(personal_info_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Welcome_lb)
                .addGap(60, 60, 60)
                .addComponent(Experiences_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addComponent(personal_info_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );

        getContentPane().add(container);
        setVisible(true);
        pack();
    }

    private void logout_btnActionPerformed(ActionEvent evt) {
        new LoginForm().setVisible(true);
        dispose();
    }


    public void UserPage_SignUp(String User_name, String User_email) {
        username_lb.setText(User_name);
        email_lb.setText(User_email);
    }

    public void UserPage_Login(String User_name, String User_email) {
        username_lb.setText(User_name);
        email_lb.setText(User_email);
    }
}
