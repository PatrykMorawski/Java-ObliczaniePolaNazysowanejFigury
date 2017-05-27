package obliczaniefigury;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
/**
 *
 * @author ANKRED-PC
 */
public class ObliczanieFigury extends JFrame implements ActionListener {

    
    MyPanel panelEast = new MyPanel();
    JPanel panelWest = new JPanel();
    JButton wykonaj = new JButton("Wykonaj");
    JLabel pole = new JLabel();
    JLabel obwod = new JLabel();
    JSpinner AX = new JSpinner();
    JSpinner AY = new JSpinner();
    JSpinner BX = new JSpinner();
    JSpinner BY = new JSpinner();
    JSpinner CX = new JSpinner();
    JSpinner CY = new JSpinner();
    JSpinner DX = new JSpinner();
    JSpinner DY = new JSpinner();
    JLabel Z = new JLabel("Współrzędne:");
    JLabel X = new JLabel("Współ. X");
    JLabel Y = new JLabel("Współ. Y");
    JLabel P = new JLabel("Pole Figury:");
    JLabel O = new JLabel("Obwód Figury:");
    
    SpinnerNumberModel OgraniczeniaAX= new SpinnerNumberModel(0,0,600,1);
    SpinnerNumberModel OgraniczeniaBX= new SpinnerNumberModel(0,0,600,1);
    SpinnerNumberModel OgraniczeniaCX= new SpinnerNumberModel(0,0,600,1);
    SpinnerNumberModel OgraniczeniaDX= new SpinnerNumberModel(0,0,600,1);
    SpinnerNumberModel OgraniczeniaAY= new SpinnerNumberModel(0,0,500,1);
    SpinnerNumberModel OgraniczeniaBY= new SpinnerNumberModel(0,0,500,1);
    SpinnerNumberModel OgraniczeniaCY= new SpinnerNumberModel(0,0,500,1);
    SpinnerNumberModel OgraniczeniaDY= new SpinnerNumberModel(0,0,500,1);
    
    public ObliczanieFigury() throws HeadlessException
    {
    
     setTitle("Obliczanie pola i obwodu Figury - Morawski Patryk");
     setResizable(false);
     setSize(795, 545);
     setVisible(true); 
     setDefaultCloseOperation(DISPOSE_ON_CLOSE);
     
     panelEast.setSize(500,600);
     panelWest.setSize(300,600);
   
     getContentPane().setLayout(new BorderLayout());
     getContentPane().add(panelEast,BorderLayout.CENTER);
     getContentPane().add(panelWest,BorderLayout.WEST);
     
     panelWest.setLayout(new GridLayout(8,2));
     panelWest.add(X);
     panelWest.add(Y);
     panelWest.add(AX);
     panelWest.add(AY);
     panelWest.add(BX);
     panelWest.add(BY);
     panelWest.add(CX);
     panelWest.add(CY);
     panelWest.add(DX);
     panelWest.add(DY);
     panelWest.add(P);
     panelWest.add(O);
     panelWest.add(pole);
     panelWest.add(obwod);
     panelWest.add(wykonaj);
     
    
     AX.setModel(OgraniczeniaAX);
     BX.setModel(OgraniczeniaBX);
     CX.setModel(OgraniczeniaCX);
     DX.setModel(OgraniczeniaDX);
     
     AY.setModel(OgraniczeniaAY);
     BY.setModel(OgraniczeniaBY);
     CY.setModel(OgraniczeniaCY);
     DY.setModel(OgraniczeniaDY);
     
     wykonaj.addActionListener(this);      
 }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        int x1= (Integer) AX.getValue();
        int y1= (Integer) AY.getValue();
        int x2= (Integer) BX.getValue();
        int y2= (Integer) BY.getValue();
        int x3= (Integer) CX.getValue();
        int y3= (Integer) CY.getValue();
        int x4= (Integer) DX.getValue();
        int y4= (Integer) DY.getValue();
        int[]Xp={x1,x2,x3,x4};
        int[]Yp={y1,y2,y3,y4};
        Graphics g = panelEast.getGraphics();
       
        if (e.getSource()==wykonaj)
        { 
        
        Matematyka obl = new Matematyka(x1,x2,x3,x4,y1,y2,y3,y4);
        pole.setText(String.valueOf(obl.wynikP));
        obwod.setText(String.valueOf(obl.wynikO));
        
        g.setColor(Color.ORANGE);
        g.drawPolygon(Xp, Yp, 4);
         
        }
    }

    public static void main(String[] args) {
    {
        EventQueue.invokeLater(new Runnable(){
        public void run()
                {
                    new ObliczanieFigury();
                    
                }
        });
             
    }
   
    }
    
}
