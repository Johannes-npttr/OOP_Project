package app;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class Spielfeld extends JPanel
{
    private Spielstein[][] Spielsteine;
    private final int Spielsteinsize;

    //-----------Konstruktor--------------

    public Spielfeld(int size) 
    {
        setLayout(new GridLayout(4, 9, 5, 5));
        this.Spielsteinsize = size/9;
        setPreferredSize(new Dimension(Spielsteinsize, Spielsteinsize)); //Größe der Felder wird gesetzt
    }

    //------------Update/Print-------------

    public void update(Spielstein[][] m)
    {
        this.Spielsteine = m;
        removeAll();

        for (int row = 0; row < 4; row++) 
        {
            for (int col = 0; col < 9; col++) 
            {
                if(col != 4)
                {
                    Spielstein current = Spielsteine[row][col];
                    if(current == null) 
                    {
                        add(new LeeresFeld(Spielsteinsize));
                    }else
                    {
                        add(current);
                    }
                }else // Mitte des Spielfeldes brauchen wir nur Platzhalter
                {
                    LeeresFeld platzhalter = new LeeresFeld(Spielsteinsize);
                    platzhalter.setInvisible();
                    add(platzhalter);

                }
            }
            revalidate();
            repaint();
        }
    }
}
