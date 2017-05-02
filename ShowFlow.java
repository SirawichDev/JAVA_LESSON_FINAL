import javax.swing.*;
import java.awt.*;
/**
 * Created by TimeStoper on 1/5/2560.
 */
public class ShowFlow extends JFrame{
    public ShowFlow(){
        setLayout(new FlowLayout(FlowLayout.LEFT,3,3));
        JPanel p = new JPanel();
        add(new JLabel("name"));
        p.add(new JLabel("FOO"));
        add(new JTextField(8));
        add(new JLabel("Lastname"));
        add(new JTextField(8));
        add(new JButton("Click!"));
        add(p);
    }
    public static void main(String args[]){
        ShowFlow f = new ShowFlow();
        f.setTitle("Flow_Layout");
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
