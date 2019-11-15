import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

public class OlympicRingComponent extends JComponent {
    /*
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        final int RING_X = getWidth()/5;
        final int RING_Y = getHeight()/5;
        final int RING_DIAMETER = 100;
        Ellipse2D.Double ring = new Ellipse2D.Double(RING_X, RING_Y, RING_DIAMETER, RING_DIAMETER);
        g2.setColor(Color.blue);
        g2.drawOval(100, 100, RING_DIAMETER, RING_DIAMETER);
        g2.fill(ring);
        g2.setColor(Color.black);
        g2.translate(RING_DIAMETER, 0);
        g2.draw(ring);
        g2.fill(ring);
        g2.setColor(Color.RED);
        g2.translate(RING_DIAMETER, 0);
        g2.draw(ring);
        g2.fill(ring);
        g2.setColor(Color.GREEN);
        g2.translate(-(RING_DIAMETER/2), RING_DIAMETER/2);
        g2.draw(ring);
        g2.fill(ring);

    }
     */

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        final int RING_RADIUS = 50;
        final int RING_X = getWidth()/5 + RING_RADIUS;
        final int RING_Y = getHeight()/5 + RING_RADIUS * 2;
        Shape ring = createRingShape(RING_X, RING_Y, RING_RADIUS, 6);
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

    private static Shape createRingShape(
            double centerX, double centerY, double outerRadius, double thickness)
    {
        Ellipse2D outer = new Ellipse2D.Double(
                centerX - outerRadius,
                centerY - outerRadius,
                outerRadius + outerRadius,
                outerRadius + outerRadius);
        Ellipse2D inner = new Ellipse2D.Double(
                centerX - outerRadius + thickness,
                centerY - outerRadius + thickness,
                outerRadius + outerRadius - thickness - thickness,
                outerRadius + outerRadius - thickness - thickness);
        Area area = new Area(outer);
        area.subtract(new Area(inner));
        return area;
    }



}



