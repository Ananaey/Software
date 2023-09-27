package software;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;

class RoundButton1 extends JButton {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public RoundButton1(String label) {
        super(label);
        Dimension size = getPreferredSize();
        size.width = size.height = Math.max(size.width,size.height);
        setPreferredSize(size);

        setContentAreaFilled(false);
    }

    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(new Color(0, 0, 128));
        } else {
            g.setColor(getBackground());
        }
        g.fillRoundRect(0, 0, 130, 32, 40,40);
        super.paintComponent(g);
    }

    Shape shape;
    public boolean contains(int x, int y) {
        if (shape == null || 
                !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, 130, 32, 40,40);
        }
        return shape.contains(x, y);
    }

}