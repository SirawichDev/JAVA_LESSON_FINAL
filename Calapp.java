import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by TimeStoper on 1/5/2560.
 */
public class Calapp extends JFrame  {
JButton x;
    public Calapp(){
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3));
        for(int i =0;i<=9;i++){
            p1.add(new JButton(""+i));
        }
        x= new JButton("Start");
p1.add(x);

        p1.add(new JButton("Stop"));
p.add(new JTextField("show number"),BorderLayout.NORTH);
        p.add(p1,BorderLayout.CENTER);

        add(p,BorderLayout.EAST);
        add(new JButton("here"),BorderLayout.CENTER);
    }
    public static void main(String args[]){
        Calapp f =new Calapp();
        f.setLocationRelativeTo(null);
        f.setTitle("CAL_APP");
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
