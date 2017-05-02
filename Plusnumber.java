import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by TimeStoper on 2/5/2560.
 */
public class Plusnumber extends JFrame implements ActionListener {
    JButton output;
    JLabel num1,num2;
    JTextField inp1,inp2,ans;
    public Plusnumber(){
        JPanel j1 = new JPanel();

        num1 = new JLabel("num1");
        j1.add(num1);
        inp1 = new JTextField(3);
        j1.add(inp1);
        num2 = new JLabel("num2");
        j1.add(num2);
        inp2=new JTextField(3);
        j1.add(inp2);
        output = new JButton("Les Click");
        output.addActionListener(this);
        j1.add(output);
        ans = new JTextField(5);
        j1.add(ans);
        add(j1);


    }

    public void actionPerformed(ActionEvent e){

        if (e.getSource() == output) {
            try {
                int a = Integer.parseInt(inp1.getText());
                int b = Integer.parseInt(inp2.getText());
                int c = a + b;
                ans.setText(String.valueOf(c));
            }

            catch (ArithmeticException e1){
                JOptionPane.showMessageDialog(null,"can't devide by 0");
            }
            catch (Exception e2){
                JOptionPane.showMessageDialog(null,"Plz input number");
            }
        }
    }
    public static void main(String args[]){
        Plusnumber f = new Plusnumber();
        f.setTitle("Plus Number");
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
