import javax.swing.*;

public class SimpleForm {

    private JPanel mainFrame;
    private JLabel DemoSwing;
    private JLabel firstLabel;

    public static void main(String[] args) {
        JFrame frame=new JFrame("SimpleForm");
        frame.setContentPane(new SimpleForm().mainFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
