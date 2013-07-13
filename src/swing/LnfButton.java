package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author sajjadg
 */
public class LnfButton extends JButton {

    private final UIManager.LookAndFeelInfo[] laf;
    private int index = 1;
    private JFrame frame;

    //------------------------Constructors------------------------
    public LnfButton(JFrame frame) {
        this.frame = frame;
        laf = UIManager.getInstalledLookAndFeels();
        this.addActionListener(new ActionPerformed());
    }

    public LnfButton(JFrame frame, int lnfIndex) {
        this(frame);
        this.index = lnfIndex;
    }

    //------------------------Methods------------------------
    public void nextLookAndFeel() {
        index = (index + 1) % laf.length;
        changeLookAndFeel();
    }

    public void prevLookAndFeel() {
        index = (index - 1) % laf.length;
        changeLookAndFeel();
    }

    public void changeLookAndFeel() {
        try {
            UIManager.setLookAndFeel(laf[index].getClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LnfButton.class.getName()).log(Level.SEVERE, null, ex);
        }
        SwingUtilities.updateComponentTreeUI(frame);
        this.setText(laf[index].getName());
    }

    //------------------------Actions------------------------
    public class ActionPerformed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nextLookAndFeel();
        }
    }
}
