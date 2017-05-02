import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by TimeStoper on 2/5/2560.
 */
public class Converter extends JFrame {
    JButton out;
    JLabel dis;
    JTextField in,ans;

    public Converter(){
        JPanel p = new JPanel();
        JPanel p1=new JPanel();
        JPanel p2= new JPanel();

        p.setLayout(new BorderLayout());
        p1.setLayout(new BorderLayout());
        p.add(p1,BorderLayout.NORTH);
        p.add(p2,BorderLayout.CENTER);
        dis = new JLabel("Distance in miles:");
        p1.add(dis,BorderLayout.WEST);
        in=new JTextField(5);
        p1.add(in,BorderLayout.CENTER);
        out = new JButton("Convert!");
        out.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ea){
                                Convert();
           }
        });
        p1.add(out,BorderLayout.EAST);
        ans = new JTextField(100);
        p.add(ans);
        add(p);
    }
    class numberException extends Exception{
        public void check(Double x) throws numberException {
            if (x < 0) {
                throw new numberException();
            }
        }
    }
    public void Convert(){
        try {
            double km = 1.609344;
            double s1 = Double.parseDouble(in.getText());
            numberException check = new numberException();
            check.check(s1);
            double sum = s1 * km;
            ans.setText(String.valueOf(sum + "Kilometers"));
        }catch(numberException e){
            JOptionPane.showMessageDialog(null,"negative number is not a valid input:");
        }

    }
    public static void main(String args[]){
        Converter f = new Converter();
        f.setTitle("Converter");
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
