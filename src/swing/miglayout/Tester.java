package swing.miglayout;

import swing.utils.FButton;
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
//        frame.add(new MiglayoutDesign1());
        frame.add(new MiglayoutDesign2());
        //frame.setContentPane(new MigLayoutTest());

        frame.setSize(1000, 600);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        swing.JEnhancedOptionPane.showInputDialog(this, new Object[]{"aa", "ss"});
//        JEnhancedOptionPane.showConfirmDialog(this, new Object[]{"aa", "ss"});
//        Object[] options = {"بله", "خیر"};
//        JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
//                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
//                null, options, options[0]);

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
