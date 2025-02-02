package app;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Infobar extends JPanel 
{
    private JLabel belegteFelder = new JLabel("Belegte Felder: ");  //hier fehlt noch variable
    private JLabel züge = new JLabel("Züge: ");                     //hier auch
    
    public Infobar() 
    {
        setLayout(new BorderLayout()); 
        this.add(belegteFelder, BorderLayout.WEST);
        this.add(züge, BorderLayout.EAST);

        setVisible(true);
    }
}
