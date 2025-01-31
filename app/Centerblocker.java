package app;

import java.awt.Dimension;
import javax.swing.JPanel;

public class Centerblocker extends JPanel
{
    Centerblocker(int size)
    {
        this.setPreferredSize(new Dimension(size, size));
    }
}
