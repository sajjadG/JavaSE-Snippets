package swing.miglayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author sajjadg
 */
public class Tester {

    private JFrame frame;

    public void createAndShowGUI() {

        frame = new JFrame();
//        frame.add(new MiglayoutDesign1());
        frame.add(new MiglayoutDesign2());
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
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
