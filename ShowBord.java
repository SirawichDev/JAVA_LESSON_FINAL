import javax.swing.*;
import java.awt.*;

/**
 * Created by TimeStoper on 1/5/2560.
 */
public class ShowBord extends JFrame {
    public ShowBord(){
        JButton a,b,c,d,e;
        JPanel p = new JPanel();
        JPanel p1 =new JPanel();
        p.setLayout(new BorderLayout());
        p1.setLayout(new BorderLayout());
        p.add(p1,BorderLayout.NORTH);
        a = new JButton("1");
        b = new JButton("2");
        c = new JButton("3");
        d = new JButton("4");
        e = new JButton("5");
        p1.add(a,BorderLayout.WEST);
        p1.add(b, BorderLayout.CENTER);
        p1.add(c,BorderLayout.EAST);
        add(p);




    }
    public static void main(String args[]){
        ShowBord f =new ShowBord();
        f.setTitle("Border_Layout");
        f.setLocationRelativeTo(null);
        f.setSize(200,180);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
