package swingtest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;

/**
 *
 * @author sajjad
 */
public class Tester {

    private JFrame frame;
    private FButton fb;

    public void changeLookAndFeel() {
        Timer uiChanger = new Timer(3500, new ActionListener() {
            private final UIManager.LookAndFeelInfo[] laf = UIManager.getInstalledLookAndFeels();
            private int index = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel(laf[index].getClassName());
                    SwingUtilities.updateComponentTreeUI(frame);
                    fb.setText(laf[index].getClassName());
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
                index = (index + 1) % laf.length;
            }
        });
        uiChanger.start();
    }

    public void createAndShowGUI() {
        fb = new FButton("fbutton1");

        frame = new JFrame();
        frame.getContentPane().setLayout(new java.awt.GridLayout(2, 2, 10, 10));
        frame.add(fb);
        frame.setSize(700, 300);
        frame.setLocation(150, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        changeLookAndFeel();
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
