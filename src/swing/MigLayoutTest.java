package swing;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author sajjadG
 */
public class MigLayoutTest extends JPanel {

    public MigLayoutTest() {
        this.setLayout(new MigLayout(
                "", // Layout Constraints
                "[center][right][left][c]", // Column constraints with default align
                "[top][center][b]" // Row constraints with default align
                ));
        this.add(new JButton("btn1"), "width 100:400:4000");
        this.add(new JButton("btn2"), "wrap");
        this.add(new JButton("btn3"), "width 100:400:4000");
        this.add(new JButton("btn4"), "width 100:400:4000");

        JButton btnExit = new JButton("exit");
        btnExit.setContentAreaFilled(false);
        btnExit.setText(null);

        btnExit.setIcon(new ImageIcon(getClass().getResource("/resources/Exit.png")));
        JButton btnSetting = new JButton("setting");
//        btnSetting.setContentAreaFilled(false);
        btnSetting.setRolloverIcon(new ImageIcon(getClass().getResource("/resources/Exit.png")));
        btnSetting.setText(null);

        Image img = (new ImageIcon(getClass().getResource("/resources/Exit.png"))).getImage();
        Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        JLabel lblIcon = new JLabel(new ImageIcon(newimg));
        btnSetting.setIcon(new ImageIcon(newimg));


        this.add(btnExit, "width 30:40:60");
        this.add(btnSetting, "width 30:40:60");
        this.add(new JButton("<html><img src="
                + getClass().getResource("/resources/add.png")
                + "><\\html>"), "width 40:40:40");
    }
}
