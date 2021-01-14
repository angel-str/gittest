package danielUtmaningPolygon;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class MovingPolygon extends JComponent {
	
	static final int xPos = 150;
	static final int yPos = 150;
	static int[] xPoints = {xPos,200,200};
    static int[] yPoints = {yPos,100,150};
    
    
    static double v = Math.toDegrees(Math.atan((yPos - yPoints[1])/(xPos - xPoints[1])));
    static double r = Math.sqrt(Math.pow(Math.abs(xPos-xPoints[1]), 2) + Math.pow(Math.abs(yPos-yPoints[1]), 2));
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.fillPolygon(xPoints, yPoints, 3);
		
		g.setColor(Color.BLACK);
		g.fillOval(xPoints[0]-3, yPoints[0]-3, 4, 4);
		g.setColor(Color.PINK);
		g.fillOval(xPoints[1]-3, yPoints[1]-3, 4, 4);
		g.setColor(Color.BLUE);
		g.fillOval(xPoints[2]-3, yPoints[2]-3, 4, 4);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		JFrame f = new JFrame();
		
		f.setSize(1000,1000);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		
		f.setContentPane(new MovingPolygon());
		
		while(true) {
			
			move();
			f.repaint();
			
			Thread.sleep(100);
			
			System.out.println(v+", "+r);
			System.out.println("("+xPoints[1]+","+yPoints[1]+")");
		}
		
	}
	static void move() {
		
		v++;
		
		System.out.println(calcX()+" "+calcY());
		
		xPoints[1]=calcX();
		yPoints[1]=calcY();
		
	}
	
	
	static int calcX() {
		return (int) (Math.toDegrees(Math.cos(Math.toRadians(v)))*r);
	}
	static int calcY() {
		return (int) (Math.sin(Math.toRadians(v))*r);
	}
}
