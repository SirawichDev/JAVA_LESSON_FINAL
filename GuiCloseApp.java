import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
/**
 * Created by TimeStoper on 1/5/2560.
 */
public class GuiCloseApp extends JFrame{
    public GuiCloseApp(){
        JButton a,b;
        JLabel test = new JLabel("Hello");
        a = new JButton("Click to Out!");
       // a.addActionListener(new BasicOptionPaneUI.ButtonActionListener());

    }
    public static void main(String args[]){
        GuiCloseApp f = new GuiCloseApp();
        f.setTitle("Closing");
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
