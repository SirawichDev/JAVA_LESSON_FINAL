import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMessages_ca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by TimeStoper on 2/5/2560.
 */
public class PlusnumberAnoclass extends JFrame {
    JButton output;
    JLabel num1,num2,result;
    JTextField inp1,inp2,ans;

    public PlusnumberAnoclass(){
           JPanel p =new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.CENTER,2,2));
        num1 = new JLabel("First Number");
        p.add(num1);
        inp1=new JTextField(4);
        p.add(inp1);
        num2= new JLabel("Second Number");
        p.add(num2);
        inp2=new JTextField(4);
        p.add(inp2);
        result =new JLabel("Result");
        p.add(result);
        ans =new JTextField(3);
        p.add(ans);
        output = new JButton("calculate");
        output.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
               doit();
           }
        });
      p.add(output);
add(p);
        }

    public void doit(){
        try {
            int s1 = Integer.parseInt(inp1.getText());
            int s2 = Integer.parseInt(inp2.getText());
            int sum = s1 % s2;
            ans.setText(String.valueOf(sum));
        }catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null,"CAN'T DIVIDE 0");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Enter only number!");
        }
    }

    public static void main(String args[]){
            PlusnumberAnoclass f = new PlusnumberAnoclass();
        f.setTitle("Anoclass");
        f.setLocationRelativeTo(null);
        f.setSize(500,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }


}
