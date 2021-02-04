package pacmanUpg;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class CanvasPacman extends JComponent implements KeyListener {

	Figur pM = new Figur();

	public CanvasPacman() {
		
		addKeyListener(this);
		this.setPreferredSize(new Dimension(400, 400));

		Timer t = new Timer(1000, e -> {

			pM.changeMouth();
			repaint();

		});
		t.start();

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(pM.getColor());
		g.fillOval(pM.getX(), pM.getY(), pM.getR() * 2, pM.getR() * 2);
		if (pM.ifMouth()) {
			g.setColor(getBackground());
			g.fillPolygon(pM.getXarr(30), pM.getYarr(30), 3);
		}

	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new CanvasPacman());
		f.pack();

	}

	@Override
	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();
		int x = pM.getX();
		int y = pM.getY();

		switch (key) {
		
		case KeyEvent.VK_UP:
			System.out.println("HEJ");
			
			pM.setY(y--);
			
			break;
		case KeyEvent.VK_DOWN:
			
			pM.setY(y++);
			
			break;
		case KeyEvent.VK_LEFT:

			pM.setX(x--);
			
			break;
		case KeyEvent.VK_RIGHT:

			pM.setX(x++);
			
			break;

		default:
			break;
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
	@Override
	public boolean isFocusTraversable() {
		// TODO Auto-generated method stub
		return true;
	}
}
