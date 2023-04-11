import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Created by ChildishWu
 * just some testing
 */
public class Main extends JFrame{

    public static void main(String[] args) {
        
        System.out.println("fork example");
      
        JFrame mainframe = new JFrame("EXAMPLE");
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TestPanel mainpanel = new TestPanel();
        
        mainframe.add(mainpanel);

        mainframe.pack();
        mainframe.setVisible(true);
    }

}
