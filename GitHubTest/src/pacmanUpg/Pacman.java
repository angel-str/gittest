/* ----Idéer----
 * 
 * Animera munnen?
 * 
 */

package pacmanUpg;

import java.awt.Color;
import java.awt.Graphics;

public class Pacman extends Figur{
	
	
	//Instansvariabler
	private int r = 25;
	
	private final int mouthSpeed=250;
	private boolean mouth = true;
	private int v = 30;
	
	int[] shapeX = new int[3];
	int[] shapeY = new int[3];
	
	
	//Konstruktor
	public Pacman(int xx) {
		super(xx);
		super.color=Color.YELLOW;
		
	}
	
	
	//Paint
	public void paintPacman(Graphics g, Color bg) {
		
		
		g.setColor(color);
		g.fillOval(x, y, r * 2, r * 2);
		g.setColor(bg);
		
		if (mouth) {
			g.fillPolygon(getXarr(), getYarr(), 3);
		}
	}
	
	
	//Metoder
	public int[] getXarr(){
		
		shapeX[0]= (int) (x+2*r);
		shapeX[1]=x+r;
		shapeX[2]=shapeX[0];
		
		
		switch (xDir) {
		case 0:
			
			break;
		case 1:
			
			break;
		case -1:
	
			shapeX[0]= (int) (x);
			shapeX[2]=shapeX[0];
			
			break;

		default:
			break;
		}
		
		
		return shapeX;
	}
	
	public int[] getYarr(){
		
		shapeY[0] = (int) (y+r-Math.tan(Math.toRadians(v))*r);
		shapeY[1] = y+r;
		shapeY[2] = (int) (y+r+Math.tan(Math.toRadians(v))*r);
		
		
		switch (yDir) {
		case 0:
			
			break;
		case 1:
			
			shapeY[0]=y+2*r;
			shapeY[2]=y+2*r;
			
			shapeX[0]= (int) (x+r-Math.tan(Math.toRadians(v))*r);
			shapeX[2]= (int) (x+r+Math.tan(Math.toRadians(v))*r);
			
			break;
		case -1:
			
			shapeY[0]=y;
			shapeY[2]=y;
			
			shapeX[0]= (int) (x+r-Math.tan(Math.toRadians(v))*r);
			shapeX[2]= (int) (x+r+Math.tan(Math.toRadians(v))*r);
	
			break;

		default:
			break;
		}
		
		
		return shapeY;
	}
	public void changeMouth() {
		if(mouth) {
			mouth=false;
		}else {
			mouth=true;
		}
	}
	public int getMouthSpeed() {
		return mouthSpeed;
	}
	
}
