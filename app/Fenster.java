package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Fenster extends JFrame
{
    final private int width = 650;  //bitte nur Vielfache nehmen!!
    final private int height = 350; //             "

    final private int Spielsteinsize = (int)((width-40)/9);
    final private int Spielfeldsize = Spielsteinsize*4;
    

    private Spielfeld spielfeld = new Spielfeld(width-40); //-40 wegen platz zwischen feldern
    private Spielstein[][] links = new Spielstein[4][4];
    private Spielstein[][] rechts = new Spielstein[4][4];


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
        spielfeld.setPreferredSize(new Dimension(width,Spielfeldsize));
        getContentPane().add(spielfeld,BorderLayout.CENTER);
        
        links[0][1]= new Spielstein(Color.red, "Quadrat", Spielsteinsize);
        rechts[0][1]= new Spielstein(Color.red, "Quadrat", Spielsteinsize);
        spielfeld.update(mergem(links,rechts));
        

        //----------Schluss-------------------
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }



    private Spielstein[][] mergem(Spielstein links[][], Spielstein rechts[][])
    {
        Spielstein[][] erg = new Spielstein[4][9];

        //----------Linkes-Feld---------------
        for(int row = 0; row<4;++row)
        {
            for(int col = 0; col <4; ++col)
            {
                erg[row][col] = links[row][col];
            }
        }

        //----------Rechtes-Feld--------------
        for(int row = 0; row<4;++row)
        {
            for(int col = 0; col <4; ++col)
            {
                erg[row][col+5] = rechts[row][col];
            }
        }


        return erg;
    }
}
