package app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Spielfeld extends JPanel
{
    private JLabel[][] fields;

    public Spielfeld(int size) 
    {
        setLayout(new GridLayout(4, 4, 5, 5));
        fields = new JLabel[4][4];

     
        for (int row = 0; row < 4; row++) 
        {
            for (int col = 0; col < 4; col++) 
            {
                JLabel label = new JLabel();
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setVerticalAlignment(JLabel.CENTER);


                label.setBorder(new LineBorder(Color.BLACK));
                label.setPreferredSize(new Dimension(size, size));

                fields[row][col] = label;
                add(label);
            }
        }
    }

    
    public void setField(int row, int col, JLabel newlabel) //vielleicht booelan als rückgabe (ob erfolgreich/möglich war)
    {
        fields[row][col] = newlabel;
                add(newlabel);
    }//kein plan ob das funktioniert
    
}
