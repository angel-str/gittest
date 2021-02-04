package pacmanUpg;

import java.awt.Color;

public class Figur {
	
	private int r = 50;
	private int x = 0;
	private int y = 0;
	private int v=30;
	private Color c = Color.YELLOW;
	private boolean mouth = true;
	
	int[] shapeX = new int[3];
	int[] shapeY = new int[3];
	
	public int[] getXarr(int v){
		
		this.v=v;
		
		shapeX[0]= (int) (x+2*r);
		shapeX[1]=x+r;
		shapeX[2]=shapeX[0];
		
		return shapeX;
	}
	public int[] getYarr(int v){
		
		this.v=v;
		
		shapeY[0] = (int) (y+r-Math.tan(Math.toRadians(v))*r);
		shapeY[1] = y+r;
		shapeY[2] = (int) (y+r+Math.tan(Math.toRadians(v))*r);
		
		return shapeY;
	}

	public boolean ifMouth() {
		return mouth;
	}
	public void changeMouth() {
		if(mouth) {
			mouth=false;
		}else {
			mouth=true;
		}
	}

	public int getR() {
		return r;
	}
	
	public int getV() {
		return v;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return c;
	}
}
