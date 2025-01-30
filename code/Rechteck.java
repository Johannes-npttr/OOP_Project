package code;

import java.awt.*;


public class Rechteck extends GezeichnetesObjekt
{
    private int xm;
    private int ym;
    private int h;
    private int w;
    Rechteck(int xm, int ym, int h, int w)
    {
        this.xm = xm;
        this.ym = ym;
        this.h = h;
        this.w = w;
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.drawRect(xm, ym, w, h);
    }
}
