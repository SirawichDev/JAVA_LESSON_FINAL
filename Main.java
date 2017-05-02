import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
    JFrame f = new JFrame();
        JPanel p = new JPanel();
        JButton btn1;
        JLabel uname,pass;
        JTextField inp1,inp2;

        uname = new JLabel("name");
        p.add(uname);
        inp1 = new JTextField(8);
        p.add(inp1);
        pass=new JLabel("password");
        p.add(pass);
        inp2 = new JTextField(8);
        p.add(inp2);
        btn1 = new JButton("Login");
        p.add(btn1);
        f.setTitle("Normally Layout");
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(p);
        f.setVisible(true);

    }
}
