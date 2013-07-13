package swing;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author sajjadg
 */
public class Tester {

    private JFrame frame;
    private FButton fb;

    public void createAndShowGUI() {

        frame = new JFrame();
        frame.getContentPane().setLayout(new java.awt.GridLayout(2, 2, 10, 10));
        frame.add(new FButton("Fadable button"));
        frame.add(new LnfButton(frame));
        frame.setSize(700, 300);
        frame.setLocation(150, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tester().createAndShowGUI();
            }
        });
    }
}
