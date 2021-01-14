package cirkelAvLinjer;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends JComponent{
	
	int[] point1 = new int[2];
	int[] point2 = new int[2];
	
	public static void main(String[] args) {
		
		//Variables
		JFrame f = new JFrame();
		int antal = Integer.parseInt(JOptionPane.showInputDialog("Antalet sträck:"));
		int tid = Integer.parseInt(JOptionPane.showInputDialog("Tid tills animationen är slut:"));
		//Circle radius?
		
		//JFrame
		f.setVisible(true);
		f.setSize(500, 500);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new Main());
		
		
		new DrawLines(antal, tid);
//		f.repaint();
		
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		
		g.drawLine(point1[0], point1[1], point2[0], point2[1]);
		
	}
}
