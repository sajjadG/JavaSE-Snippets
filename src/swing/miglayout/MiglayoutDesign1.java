package swing.miglayout;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author sajjad
 */
public class MiglayoutDesign1 extends JPanel {

    public MiglayoutDesign1() {
        this.setLayout(new MigLayout("fill", // Layout Constraints
                "[grow][grow][grow]", // Column constraints
                "[][shrink 1]")); // Row constraints

        for (int i = 0; i < 15; i++) {
            JPanel pnl = new JPanel();
            pnl.setBackground(Color.white);
            pnl.add(new JLabel(i + ""));
            pnl.setSize(200, 200);
            if (i == 14) {
                this.add(pnl, "span, grow");
            } else {
                this.add(pnl, "grow");
            }
        }

        JPanel pnl11 = new JPanel();
        pnl11.setBackground(Color.red);
        this.add(pnl11, ", span 2 2, wrap, grow");

        JPanel pnl1 = new JPanel();
        pnl1.setBackground(Color.pink);
        this.add(pnl1, "cell 7 2, span 2, wrap, grow");

        JPanel pnl10 = new JPanel();
        pnl10.setBackground(Color.cyan);
        this.add(pnl10, "cell 6 1, span 6, wrap, grow");

        for (int i = 0; i < 15; i++) {
            JPanel pnl = new JPanel();
            pnl.setBackground(Color.gray);
            if (i == 14) {
                this.add(pnl, "span, grow");
            } else {
                this.add(pnl, "grow");
            }
        }
        for (int i = 0; i < 10; i++) {
            JPanel pnl = new JPanel();
            pnl.setBackground(Color.black);
            if (i == 14) {
                this.add(pnl, "span");
            } else {
                this.add(pnl, "grow");
            }
        }
    }
}
