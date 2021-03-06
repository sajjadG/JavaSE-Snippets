package swing.utils;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.Timer;

/**
 *
 * @author sajjad
 */
public class FButton extends JButton {

    private static final JButton lafDeterminer = new JButton();
    private static final long serialVersionUID = 1L;
    private boolean rectangularLAF;
    private float alpha = 1f;
    private float minAlpha = 0.1f;
    private float maxAlpha = 1f;
    private Timer alphaChanger;
    private int fadingSpeed = 30;
    private volatile boolean fading = false;

    public FButton() {
        this(null);
    }

    FButton(String text) {
        this(text, 30);
    }

    FButton(String text, int fadingSpeed) {
        this(text, fadingSpeed, null);
    }

    FButton(String text, int fadingSpeed, Icon icon) {
        super(text, icon);
        this.fadingSpeed = fadingSpeed;
        setOpaque(false);
        setFocusPainted(false);
        this.addActionListener(new FButton.ActionPerformed());
//        this.addMouseListener(new MouseOver());
        initFading();
    }

    public void initFading() {
        new Runnable() {
            @Override
            public void run() {

//                while (fading) {

                alphaChanger = new Timer(fadingSpeed, new ActionListener() {
                    private float incrementer = -.03f;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        float newAlpha = alpha + incrementer;

                        if (newAlpha < minAlpha) {
                            newAlpha = minAlpha;
                            incrementer = -incrementer;
                        } else if (newAlpha > maxAlpha) {
                            newAlpha = maxAlpha;
                            incrementer = -incrementer;
                        }
                        alpha = newAlpha;
                        repaint();
                    }
                });

//                alphaChanger.start();
            }
//            }
        }.run();
    }

    public void stopFading() {
        fading = false;
        alpha = maxAlpha;
        alphaChanger.stop();
    }

    public void startFading() {
        fading = true;
        alphaChanger.start();
    }

    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public int getFadingSpeed() {
        return fadingSpeed;
    }

    public void setFadingSpeed(int fadingSpeed) {
        this.fadingSpeed = fadingSpeed;
    }

    @Override
    public void paintComponent(java.awt.Graphics g) {
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        if (rectangularLAF && isBackgroundSet()) {
            Color c = getBackground();
            g2.setColor(c);
            g.fillRect(0, 0, getWidth(), getHeight());
        }
        super.paintComponent(g2);
    }

    @Override
    public void updateUI() {
        super.updateUI();
        lafDeterminer.updateUI();
        rectangularLAF = lafDeterminer.isOpaque();
    }

    public class ActionPerformed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (fading) {
                stopFading();
            } else {
                startFading();
            }
        }
    }

    public class MouseOver implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            alphaChanger.start();
        }

        @Override
        public void mouseExited(MouseEvent e) {
            alphaChanger.stop();

        }
    }
}
