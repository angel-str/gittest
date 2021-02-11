package pacmanUpg;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JComponent;

public abstract class Figur {
	
	
	//Instansvaribabler
	Game g = new Game();
	
	
	protected int x = 0;
	protected int y = 0;
	int height=25;
	int width=25;

	protected int xDir=0;
	protected int yDir=0;
	protected int velocity=4;

	protected Color color = Color.BLACK;
	protected boolean visible = true;
	
	
	//Konstruktor
	public Figur(int x) {
		this.x=x;
		
	}

	
	//Move
	public void updPos() {
		
		int x = getX();
		int y = getY();
		
		setY(y+getVelocity()*getyDir());
		setX(x+getVelocity()*getxDir());
		
		
		g.inBounds(x, y, x, y);
		
		
//		if(!Game.inBounds(getX(), getY(),height, width)) {
//			
//			setY(y);
//			setX(x);
//		}
	}
	
	
	//Getters / Setters
	public int getxDir() {
		return xDir;
	}
	public void setxDir(int xDir) {
		this.xDir = xDir;
		yDir=0;
	}
	public int getyDir() {
		return yDir;
	}
	public void setyDir(int yDir) {
		this.yDir = yDir;
		xDir=0;
	}
	
	public int getVelocity() {
		return velocity;
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
		return color;
	}
}
