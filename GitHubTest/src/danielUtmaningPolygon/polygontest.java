package danielUtmaningPolygon;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class polygontest extends JComponent {


    public polygontest() {

    repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        g.setColor(Color.pink);
        int xPoints [] = {10,100,10};
        int yPoints [] = {30,20,100} ;


        g.fillPolygon(xPoints, yPoints, 3);
    }


    public static void main(String[] args) {

        JFrame f = new JFrame();

        f.setContentPane(new polygontest());
        f.setSize(500, 500);
        f.setVisible(true);


    }


}