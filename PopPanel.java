import java.awt.Color;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PopPanel extends JFrame{
    
    //conclusion - panels make customization easier

    public PopPanel()
    {
        setTitle("something another");
        getContentPane().setBackground(Color.CYAN);
        setBounds(350, 40, 900, 600); //where it appears and its size
       

        JPanel panel = new JPanel();
        panel.setLayout(null); //negates any defauly layout it has and allows free reign on positioning of components

        JLabel tLabel = new JLabel("TESTING");
        Dimension size = tLabel.getPreferredSize();
        tLabel.setBounds(350,400,size.width,size.height);//moves the label around but not neccesarily the size
        

        panel.add(tLabel);

        panel.setBackground(Color.green);

        getContentPane().add(panel);
            

        
        setVisible(true);
    }
    
}
