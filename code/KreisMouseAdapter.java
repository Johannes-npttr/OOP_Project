package code;

public class KreisMouseAdapter extends java.awt.event.MouseAdapter 
{
    private int x1, x2, y1, y2;
    private static boolean click1 = true;
    private ZeichnenPanel panel;
    private boolean kreiszeichnen = ZeichnenFrame.isKreis;
    
    public KreisMouseAdapter(ZeichnenPanel zPanel)
    {
        panel = zPanel;
    }

    public void mousePressed(java.awt.event.MouseEvent event)
    {
        if( javax.swing.SwingUtilities.isLeftMouseButton(event) && event.getClickCount() == 1)
        {
            //...
            if (click1)
            {
                x1 = event.getX();
                y1 = event.getY();
                click1 = false;
            }
            else
            {
                x2 = event.getX();
                y2 = event.getY();
                int zx = x1;
                int zy = y1;
                double r = Math.sqrt( (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
                int h = x2 - x1;
                int w = y2 - y1;
                
                //für rechtecke mit negativen w und h werten
                if(!ZeichnenFrame.isKreis)
                {
                if(h<0)
                {
                    h = x1 -x2;
                    zx = x2;
                }
                if(w<0)
                    {
                    w *= -1;
                    zy = y2;
                }
                }
                
                
                
                if(ZeichnenFrame.isKreis)
                {
                    panel.saveObjektkreis(y1,x1,(int) r);
                } else
                {
                    panel.saveObjektrec(zy,zx,w,h);
                }
                
            
                click1 = true;
            }
        }
    }

    public void mouseMoved(java.awt.event.MouseEvent event)
    {
        if(!click1)
        {
            x2 = event.getX();
            y2 = event.getY();
            int zx = x1;
            int zy = y1;
            int h = x2 - x1;
            int w = y2 - y1;
            //umwandlung damit man auch mit negativen w und h werten rechnen kann;
            
            if(!ZeichnenFrame.isKreis)
            {
                if(h<0)
                {
                    h = x1 -x2;
                    zx = x2;
                }
                if(w<0)
                    {
                    w *= -1;
                    zy = y2;
                }
            }
            
            
            
            double r = Math.sqrt( (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

            panel.zeichneObj(zx, zy, (int) r,ZeichnenFrame.isKreis,w,h);
        }
        
    }
}