package software;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;

class CircleButton extends JButton {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CircleButton(String label) {
        super(label);
        Dimension size = getPreferredSize();
        size.width = size.height = Math.max(size.width,size.height);
        setPreferredSize(size);

        setContentAreaFilled(false);
    }

    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.blue);
        } else {
            g.setColor(getBackground());
        }
        g.fillRoundRect(0, 0, 36, 32, 150, 150);
        super.paintComponent(g);
    }

    Shape shape;
    public boolean contains(int x, int y) {
        if (shape == null || 
                !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, 36, 32, 150, 150);
        }
        return shape.contains(x, y);
    }

}