import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.*;

public class LearningGui{
    public LearningGui(){
        JFrame f = new JFrame("Learning GUI");
        f.setSize(400,300);
        f.setLocationRelativeTo(null);  //method to align frame to centre screen
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cont = f.getContentPane();
        cont.setLayout(null);
        ImageIcon icon = new ImageIcon("C:\\Users\\Noman Traders\\OneDrive\\Pictures\\Saved Pictures\\linkdin-cover.png");
        f.setIconImage(icon.getImage());
        Font font = new Font("Sans Serif", Font.ITALIC,25);
        JLabel header = new JLabel("Admin Panel",JLabel.CENTER);
        header.setBounds(100,10,200,20);
        header.setFont(font);
        cont.add(header);
        f.setResizable(false);
        cont.setBackground(Color.pink);


    }
}
