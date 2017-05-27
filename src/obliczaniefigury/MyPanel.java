/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obliczaniefigury;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author ANKRED-PC
 */
public class MyPanel extends JPanel {
    
    @Override
    public void paint(Graphics g)
    {
            
        super.paint(g);
        
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0,0,getWidth(),getHeight());
        
        g.setColor(Color.ORANGE);
        g.drawLine (0,0,0,500);//Y
        g.drawLine (0,0,600,0);//X
                       
        g.setColor(Color.CYAN);
        g.drawLine(0,100,600,100);
        g.drawLine(0,200,600,200);
        g.drawLine(0,300,600,300);
        g.drawLine(0,400,600,400);
        g.drawLine(0,500,600,500);
        g.drawLine(100,0,100,500);
        g.drawLine(200,0,200,500);
        g.drawLine(300,0,300,500);
        g.drawLine(400,0,400,500);
        g.drawLine(500,0,500,500);
        g.drawLine(600,0,600,500);
        
        g.setColor(Color.ORANGE);
        g.drawString("0", 0,10);
        g.drawString("Y", 0, 510);
        g.drawString("X", 600,10);
        
        g.drawString("100", 600,100);
        g.drawString("100", 100,510);
        g.drawString("200", 200,510);
        g.drawString("200", 600,200);
        g.drawString("300", 300,510);
        g.drawString("300", 600,300);
        g.drawString("400", 400,510);
        g.drawString("400", 600,400);
        g.drawString("500", 500,510);
        g.drawString("500", 600,500);
        g.drawString("600", 600,510);

    }
    
}
