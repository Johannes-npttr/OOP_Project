package app;

import java.awt.GridLayout;
import javax.swing.JPanel;

public class Spielfeld extends JPanel
{
    private Spielstein[][] Spielsteine;
    private int size;

    public Spielfeld(int size) 
    {
        setLayout(new GridLayout(4, 4, 5, 5));
        this.size = size/4;
        
    }

    //------------

    public void update(Spielstein[][] m)
    {
        this.Spielsteine = m;

        for (int row = 0; row < 4; row++) 
        {
            for (int col = 0; col < 4; col++) 
            {
                Spielstein current = Spielsteine[row][col];
                if(current == null)
                {
                    add(new LeeresFeld(size));
                }else
                {
                    add(current);
                }
            }
            repaint();
        }
    }
}
