package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Fenster extends JFrame
{
    //private int width = size().width;
    //private int height = size().height;
    final private int width = 650;
    final private int height = 400;
    final private int size = (int)((width-10)/9)*4;
    Spielfeld spielfeld_west = new Spielfeld((int)(width-20)/9);
    Spielfeld spielfeld_east = new Spielfeld((int)(width-20)/9);
    




    public Fenster()
    {
        //----------Standartparameter---------
        setTitle("Spiele-Projekt");
        setSize(width,height);
        setResizable(false); 
        setMaximizedBounds(null); 
        getContentPane().setLayout(new BorderLayout());

        //----------Infobar-------------------
        getContentPane().add(new Infobar(), BorderLayout.NORTH);
        
        //----------Spielfeld-----------------
        spielfeld_west.setPreferredSize(new Dimension(size,size));
        spielfeld_east.setPreferredSize(new Dimension(size,size));
        getContentPane().add(spielfeld_west, BorderLayout.WEST);
        getContentPane().add(spielfeld_east, BorderLayout.EAST);



                //---testausgabe
                Spielstein[][] test = new Spielstein[4][4];
                test[1][1] = new Spielstein(Color.blue, "Quadrat", size/4);
                test[0][3] = new Spielstein(Color.red, "Quadrat", size/4);
                spielfeld_east.update(test);
                Spielstein[][] test2 = new Spielstein[4][4];
                spielfeld_west.update(test2);




        //----------Balance-------------------
        getContentPane().add(new Centerblocker((int)(width/9)+10),BorderLayout.CENTER);
        getContentPane().add(new Centerblocker((int)(height/4)-50),BorderLayout.SOUTH);

        //----------Schluss-------------------
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
