package app;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Spielstein extends JPanel
{
    private Color farbe;
    private String form;
    private int size;

    //---------Konstruktor------------

    Spielstein(Color farbe, String form, int size)
    {
        this.farbe = farbe;
        this.form = form;
        this.size = size;


        switch(form)    //Errorcheck
        {
            case "Kreis":
            case "Dreieck":
            case "Quadrat":
            case "Stern":
            break;
            default:
            System.out.println("Falsche Formbezeichnung für Spielstein genutzt!! Farbe: " + farbe + "Frombezeichnung: "+ form);
        }
    }    

    //---------PaintMethode-überschreiben--
    //wird aufgerufen bei repaint wenn das Objekt gepaintet werden soll

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0,0,size,size);
        g.setColor(this.farbe);
        switch (form) {
            case "Quadrat":
            g.fillRect((size/4),(size/4),(int)(size/4)*2,(int)(size/4)*2);
                break;

/*          case: "Kreis":
                
                break;
            
            case: "Dreieck":
            
                break;

            case: "Stern":

                break;
*/
            default:
                break;
        }
        this.setBorder(new LineBorder(Color.BLACK));
    }
}
