package swing.miglayout;

import java.awt.Color;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author sajjad
 */
public class MiglayoutDesign2 extends JPanel {

    public MiglayoutDesign2() {
        this.setLayout(new MigLayout(
                "fill", // Layout Constraints
                "[grow][grow][grow]", // Column constraints
                "[][shrink 0]")); // Row constraints

        //grid
        for (int i = 0; i < 20; i++) {
            JPanel pnl = new JPanel();
            pnl.setBackground(Color.gray);
            this.add(pnl, "cell " + i + " 22, grow");
        }
        for (int i = 0; i < 17; i++) {
            JPanel pnl = new JPanel();
            pnl.setBackground(Color.gray);
            this.add(pnl, "cell 20 " + i + ", grow");
        }

        JPanel pnlOrange = new JPanel();
        pnlOrange.setBackground(Color.orange);
        this.add(pnlOrange, "cell 8 0, span 4 3, grow");

        JPanel pnlGreen1 = new JPanel();
        pnlGreen1.setBackground(Color.green);
        this.add(pnlGreen1, "cell 5 3, span 3 2, grow");

        JPanel pnlGreen2 = new JPanel();
        pnlGreen2.setBackground(Color.green);
        this.add(pnlGreen2, "cell 12 3, span 3 2, grow");

        JPanel pnlBlue1 = new JPanel();
        pnlBlue1.setBackground(Color.BLUE);
        this.add(pnlBlue1, "cell 0 5, span 8 3, grow");

        JPanel pnlBlue2 = new JPanel();
        pnlBlue2.setBackground(Color.BLUE);
        this.add(pnlBlue2, "cell 12 5, span 8 3, grow");

        JPanel pnlGreen3 = new JPanel();
        pnlGreen3.setBackground(Color.green);
        this.add(pnlGreen3, "cell 5 8, span 3 2, grow");

        JPanel pnlGreen4 = new JPanel();
        pnlGreen4.setBackground(Color.green);
        this.add(pnlGreen4, "cell 12 8, span 3 2, grow");

        JPanel pnlBlue3 = new JPanel();
        pnlBlue3.setBackground(Color.BLUE);
        this.add(pnlBlue3, "cell 6 10, span 8 3, grow");

        JPanel pnlGreen5 = new JPanel();
        pnlGreen5.setBackground(Color.green);
        this.add(pnlGreen5, "cell 3 11, span 3 2, grow");

        JPanel pnlGreen6 = new JPanel();
        pnlGreen6.setBackground(Color.green);
        this.add(pnlGreen6, "cell 14 11, span 3 2, grow");

        JPanel pnlBlue4 = new JPanel();
        pnlBlue4.setBackground(Color.BLUE);
        this.add(pnlBlue4, "cell 0 14, span 8 3, grow");

        JPanel pnlBlue5 = new JPanel();
        pnlBlue5.setBackground(Color.BLUE);
        this.add(pnlBlue5, "cell 12 14, span 8 3, grow");

        JPanel pnlBlack = new JPanel();
        pnlBlack.setBackground(Color.BLACK);
        this.add(pnlBlack, "cell 9 4, span 2 5, grow");


    }
}
