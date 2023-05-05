import javax.swing.*;
import java.awt.*;
public class LoginForm extends JFrame{
    //decalring test fields
    private JTextField userName;
    private JPasswordField userPass;
    Container loginContainer;
    public LoginForm(){
        setTitle("Login Form");
        setSize(400,300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setting content pane
        loginContainer = this.getContentPane();
        //setting form icon image
        ImageIcon formIcon = new ImageIcon("src\\images\\login-icon-img.jpg");
        setIconImage(formIcon.getImage());
        //setting form label
        JLabel formLabel = new JLabel("Admin Panel",JLabel.CENTER);
        formLabel.setBounds(130,10,160,40);
        formLabel.setFont(new Font("Arial",Font.ITALIC,25));
        //setting textFieldsLabels
        //userName label
        JLabel userNameLabel = new JLabel("User Name");
        userNameLabel.setBounds(5,80,120,30);
        userNameLabel.setFont(new Font("Arial",Font.PLAIN,16));
        //password label
        JLabel userPassLabel = new JLabel("User Password");
        userPassLabel.setBounds(5,140,140,30);
        userPassLabel.setFont(new Font("Arial",Font.PLAIN,16));
        //userName textFiled
        userName = new JTextField();
        userName.setBounds(5,90,160,30);
        userName.setFont(new Font("Arial",Font.PLAIN,18));
        //password textFiled
        userPass = new JPasswordField();
        userPass.setBounds(5,150,160,30);
        userPass.setFont(new Font("Arial",Font.PLAIN,18));
        //adding submit button
        JButton loginBtn = new JButton("login");
        loginBtn.setBounds(5,220,90,30);
        loginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        //adding components to form container
        loginContainer.add(formLabel);
        loginContainer.add(userNameLabel); 
        loginContainer.add(userName);
        loginContainer.add(userPassLabel);
        loginContainer.add(userPass);
        loginContainer.add(loginBtn);

        setVisible(true);
    }
}
