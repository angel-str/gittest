package cirkelAvLinjer;

public class DrawLines {
	
	DrawLines(int a, int t){
		
		Main m = new Main();
		
		m.point1[0]=10;
		m.point1[1]=10;
		m.point2[0]=20;
		m.point2[1]=20;
		
		m.repaint();
		
		m.point1[0]=30;
		m.point1[1]=30;
		m.point2[0]=200;
		m.point2[1]=200;
		
		m.repaint();
		
		
		
	}
}
