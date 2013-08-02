package swing;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author sajjadg
 */
public class Tester {

    private JFrame frame;
    private FButton fb;

    public void createAndShowGUI() {

        frame = new JFrame();
//        frame.setLayout(new MigLayout("fill"));
//        frame.setLayout(new GridLayout());
//        frame.getContentPane().setLayout(new java.awt.GridLayout(2, 2, 10, 10));
//        frame.add(new FButton("Fadable button"));
//        frame.add(new LnfButton(frame));

        frame.add(new MigLayoutTest());
        frame.setContentPane(new MigLayoutTest());

        frame.setSize(700, 300);
        frame.setLocation(150, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        swing.JEnhancedOptionPane.showInputDialog(this, new Object[]{"aa", "ss"});
//        JEnhancedOptionPane.showConfirmDialog(this, new Object[]{"aa", "ss"});
        Object[] options = {"بله", "خیر"};
        JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);

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
