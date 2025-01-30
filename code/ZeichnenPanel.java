package code;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ZeichnenPanel extends JPanel
{
    private JFrame frame;
    int x, y, r, w, h;
    boolean kreiszeichnen;
    int maxanzahl=5;
    GezeichnetesObjekt[] array = new GezeichnetesObjekt[maxanzahl];
    int anzahl=0;
    
    public ZeichnenPanel(JFrame frame)
    {
        this.frame = frame;
        KreisMouseAdapter mouseLstnr = new KreisMouseAdapter(this);
        addMouseListener(mouseLstnr);
        addMouseMotionListener(mouseLstnr);
    }

    public void zeichneObj(int x, int y, int r, boolean kreis, int w, int h)
    {        
        this.x = x;
        this.y = y;
        this.r = r;
        this.kreiszeichnen = kreis;
        this.w = w;
        this.h = h;
        repaint();
        
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(int i = 0; i<array.length;++i)
        {
            if(array[i] != null)
            {
                array[i].paint(g);
            }
        }
        g.setColor(Color.BLACK);
        if(kreiszeichnen)
        {
            g.drawOval(x-r, y-r, 2*r, 2*r);
        }else
        {
            new Rechteck(x,y,w,h).paint(g);
        }
    }
    
    public void saveObjektrec(int y, int x , int w, int h)
    {
        Rechteck obj = new Rechteck(x,y,w,h);
        
        
        array[anzahl] = obj;
        if(anzahl<maxanzahl-1)
        {
            anzahl++;
        } else
        {
            anzahl = 0;
        }
        
    }
    
    public void saveObjektkreis(int y, int x , int r)
    {
        Kreis obj = new Kreis(x,y,r);
        
        
        array[anzahl] = obj;
        if(anzahl<maxanzahl-1)
        {
            anzahl++;
        } else
        {
            anzahl = 0;
        }
        
    }
}

