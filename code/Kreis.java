package code;

import java.awt.*;


public class Kreis extends GezeichnetesObjekt
{
    private int xm;
    private int ym;
    private int r;
    Kreis(int xm, int ym, int r)
    {
        this.xm = xm;
        this.ym = ym;
        this.r = r;
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.drawOval(xm-r, ym-r, 2*r, 2*r);
    }
}
