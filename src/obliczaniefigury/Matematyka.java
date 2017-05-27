/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obliczaniefigury;

import java.math.BigDecimal;

/**
 *
 * @author ANKRED-PC
 */
public class Matematyka {
     double wynikP=0;   
     double wynikO=0; 
     double odlAB=0;
     double odlBC=0;
     double odlDC=0;
     double odlAD=0;
     
    public Matematyka(int x1,int x2,int x3,int x4,int y1,int y2,int y3,int y4)
    {
    
    int wzórP = (x1*y2 - x2*y1 + x2*y3 - x3*y2 + x3*y4 - x4*y3 + x4*y1 - x1*y4);
    
    wynikP = Math.abs(0.5 * wzórP);
   
    odlAB=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    odlBC=Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
    odlDC=Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
    odlAD=Math.sqrt((x4-x1)*(x4-x1)+(y4-y1)*(y4-y1));
    
    wynikO=(odlAB+odlBC+odlDC+odlAD);
    int miejscapp=2;
    BigDecimal bd = new BigDecimal(wynikO);
    bd = bd.setScale(miejscapp,BigDecimal.ROUND_HALF_UP);
    wynikO = bd.doubleValue();
  
    }
}
