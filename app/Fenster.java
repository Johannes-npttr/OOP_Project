package app;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Fenster extends JFrame
{
    //private int width = size().width;
    //private int height = size().height;
    private int width = 650;
    private int height = 400;

    Spielfeld spielfeld_west = new Spielfeld((int)(width-20)/9);
    Spielfeld spielfeld_east = new Spielfeld((int)(width-20)/9);
    




    public Fenster()
    {
        //----------Standartparameter---------
        setTitle("Spiele-Projekt");
        setSize(width,height);
        getContentPane().setLayout(new BorderLayout());

        //----------Infobar-------------------
        getContentPane().add(new Infobar(), BorderLayout.NORTH);
        
        //----------Spielfeld-----------------
        spielfeld_west.setPreferredSize(new Dimension((int)((width-10)/9)*4,(int)((width-10)/9)*4));
        spielfeld_east.setPreferredSize(new Dimension((int)((width-10)/9)*4,(int)((width-10)/9)*4));
        getContentPane().add(spielfeld_west, BorderLayout.WEST);
        getContentPane().add(spielfeld_east, BorderLayout.EAST);

        //----------Balance-------------------
        getContentPane().add(new Centerblocker((int)(width/9)+10),BorderLayout.CENTER);
        getContentPane().add(new Centerblocker((int)(height/4)-50),BorderLayout.SOUTH);

        //----------Schluss-------------------
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
