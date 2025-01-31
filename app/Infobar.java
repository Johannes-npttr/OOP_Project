package app;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Infobar extends JPanel 
{
    JLabel info1 = new JLabel("Belegte Felder: ");
    JLabel info2 = new JLabel("Züge: ");
    public Infobar() 
    {
        setLayout(new BorderLayout()); 
        this.add(info1, BorderLayout.WEST);
        this.add(info2, BorderLayout.EAST);

        setVisible(true);
    }
}
