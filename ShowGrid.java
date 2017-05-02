import javax.swing.*;
import java.awt.*;

/**
 * Created by TimeStoper on 1/5/2560.
 */
public class ShowGrid extends JFrame{
    public ShowGrid(){
        setLayout(new GridLayout(3,4,2,5));
                add(new JLabel("name"));
        add(new JTextField(8));
        add(new JLabel("last name"));
        add(new JTextField(8));
        add(new JButton("LOGIN"),BorderLayout.CENTER);
    }
    public static void main(String args[]){
       ShowGrid frame =new ShowGrid();
        frame.setTitle("Show_Grid");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
