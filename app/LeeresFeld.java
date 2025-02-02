package app;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class LeeresFeld extends JLabel      //Ist das Objekt das angezeigt wird wenn Kein Spielstein vorhanden
{
    LeeresFeld(int size)
    {
        this.setBorder(new LineBorder(Color.BLACK));
        this.setPreferredSize(new Dimension(size, size));
    }

    public void setInvisible()              //Mitte des Spielfeldes muss etwas hineingesetzt werden das Unsichtbar ist
    {
        this.setBorder(null);
    }
}
