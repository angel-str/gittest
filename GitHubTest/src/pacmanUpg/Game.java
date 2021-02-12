package pacmanUpg;

import java.awt.Container;

import javax.swing.JComponent;

public class Game {
	
	Container canvas;
	
	public Game(Container canvas) {
		this.canvas=canvas;
		
		System.out.println(canvas.getComponentAt(100,100));
		
	}
	
	boolean inBounds(int x, int y, int height, int width) {
		
		
		return true;
	}	
}
