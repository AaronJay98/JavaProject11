import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

public class OlympicRingComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        final int RING_THICKNESS = 6;
        final int RING_RADIUS = 50;
        final int RING_X = getWidth()/2 - 2 * RING_RADIUS;
        final int RING_Y = getHeight()/2 - RING_RADIUS/2 ;
        Shape ring = OlympicRing.createOlympicRing(RING_X, RING_Y, RING_RADIUS, RING_THICKNESS);
        g2.setColor(Color.BLUE);
        g2.fill(ring);
        g2.draw(ring);

        g2.translate(RING_RADIUS * 2, 0);
        g2.setColor(Color.BLACK);
        g2.fill(ring);
        g2.draw(ring);

        g2.translate(RING_RADIUS * 2, 0);
        g2.setColor(Color.RED);
        g2.fill(ring);
        g2.draw(ring);

        g2.translate(-RING_RADIUS, RING_RADIUS);
        g2.setColor(Color.GREEN);
        g2.fill(ring);
        g2.draw(ring);

        g2.translate(- 2* RING_RADIUS, 0);
        g2.setColor(Color.YELLOW);
        g2.fill(ring);
        g2.draw(ring);
    }





}



