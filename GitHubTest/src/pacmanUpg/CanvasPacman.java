package pacmanUpg;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class CanvasPacman extends JComponent implements KeyListener {

	
	//Instansvariabler
	static CanvasPacman c = new CanvasPacman();
	Pacman pM = new Pacman(c);
	
	
	
	private final int updFrequecy = 10;
	private final int ff = pM.getMouthSpeed()/updFrequecy;
	private int counter=0;

	
	//Constructor, timer
	public CanvasPacman() {
		
		this.setPreferredSize(new Dimension(600, 600));

		Timer t = new Timer(updFrequecy, e -> {

			update();
			counter++;
		});
		t.start();
		
		addKeyListener(this);
		setFocusable(true);

	}
	
	
	//Update method
	public void update() {
		
		
		if (ff==counter) {
			pM.changeMouth();
			counter=0;
		}
		pM.updPos();
		
		
		repaint();
	}

	
	//Paint
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		pM.paintPacman(g, getBackground());

	}

	
	//Main
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		
		f.setContentPane(c);	//Sätt först
		f.setVisible(true);
		f.pack();
		Game g = new Game(c);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	
	//Key actionlistener
	@Override
	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		int x = pM.getX();
		int y = pM.getY();

		switch (key) {
		
		case KeyEvent.VK_UP:
			System.out.println("Upp");
			
			pM.setyDir(-1);
			repaint();
			
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("Ner");
			
			pM.setyDir(1);
			repaint();
			
			break;
		case KeyEvent.VK_LEFT:
			System.out.println("Vänster");

			pM.setxDir(-1);
			repaint();
			
			break;
		case KeyEvent.VK_RIGHT:
			System.out.println("Höger");

			pM.setxDir(1);
			repaint();
			
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
		return true;
	}
}
