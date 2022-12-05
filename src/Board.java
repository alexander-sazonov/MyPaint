import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Board extends JPanel {

    public Board() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D rect = new Rectangle2D.Double(0,0,100,100);
        g2d.setColor(Color.PINK);
        g2d.fill(rect);
        g2d.setStroke(new BasicStroke(5));
        g2d.draw(rect);
    }
}
