package app;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class LeeresFeld extends JLabel
{
    LeeresFeld(int size)
    {
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setBorder(new LineBorder(Color.BLACK));
        this.setPreferredSize(new Dimension(size, size));
    }
}
