import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TestPanel extends JPanel{

    private JButton test;

    public TestPanel()
    {
        test = new JButton("TEST THIS");
        test.addActionListener(new TestListener());

        add(test);
    
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(350,100));
    }
    

    private class TestListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            PopPanel t = new PopPanel();

            
        }
    }
}
