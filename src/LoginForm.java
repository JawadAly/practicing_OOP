import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;

public class LoginForm extends JFrame implements ActionListener{
    //decalring test fields
    private JTextField userName;
    private JPasswordField userPass;
    private JLabel formLabel,userNameLabel,userPassLabel,resultLabel;
    private JButton loginBtn;
    private JRadioButton genderM,genderFm;
    Container loginContainer;
    public LoginForm(){
        setTitle("Login Form");
        setSize(400,500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setting content pane
        loginContainer = this.getContentPane();
        //setting form icon image
        ImageIcon formIcon = new ImageIcon("src\\images\\login-icon-img.jpg");
        setIconImage(formIcon.getImage());
        //setting form label
        formLabel = new JLabel("Admin Panel",JLabel.CENTER);
        formLabel.setBounds(130,10,160,40);
        formLabel.setFont(new Font("Arial",Font.ITALIC,25));
        //setting textFieldsLabels
        //userName label
        userNameLabel = new JLabel("User Name");
        userNameLabel.setBounds(15,80,120,30);
        userNameLabel.setFont(new Font("Arial",Font.PLAIN,16));
        //password label
        userPassLabel = new JLabel("User Password");
        userPassLabel.setBounds(15,200,140,30);
        userPassLabel.setFont(new Font("Arial",Font.PLAIN,16));
        //userName textFiled
        userName = new JTextField();
        userName.setBounds(15,120,160,30);
        userName.setFont(new Font("Arial",Font.PLAIN,16));
        //password textFiled
        userPass = new JPasswordField();
        userPass.setBounds(15,240,160,30);
        userPass.setFont(new Font("Arial",Font.PLAIN,16));
        //adding gender radioButtons
        genderM = new JRadioButton("Male");
        genderM.setBounds(15,300,80,30);
        genderFm = new JRadioButton("Female");
        genderFm.setBounds(80,300,80,30);
        //adding radio buttons to group so one can be selected at a time
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(genderM);
        genderGroup.add(genderFm);
        //adding submit button
        loginBtn = new JButton("login");
        loginBtn.setBounds(15,360,90,30);
        loginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        //adding event listener to loginBtn
        loginBtn.addActionListener(this);
        //login result label
        resultLabel = new JLabel();
        resultLabel.setBounds(15,350,360,40);
        resultLabel.setFont(new Font("Arial",Font.ITALIC,20));
        //adding components to form container
        loginContainer.add(formLabel);
        loginContainer.add(userNameLabel);
        loginContainer.add(userName);
        loginContainer.add(userPassLabel);
        loginContainer.add(userPass);
        loginContainer.add(genderM);
        loginContainer.add(genderFm);
        loginContainer.add(loginBtn);
        loginContainer.add(resultLabel);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String myUsername = "Jawad Saleem";
        String userPassword = "jawad123";
        if(!userName.getText().isEmpty() && !(userPass.getPassword().length == 0)){
            if(userName.getText().equals(myUsername) && String.valueOf(userPass.getPassword()).equals(userPassword)){
                resultLabel.setText("You are successfuly logged in");
            }
            else{
                resultLabel.setText("Invalid credentials");
            }

        }
        else {
            resultLabel.setText("Please fill out the required fields.");
        }
    }
}
