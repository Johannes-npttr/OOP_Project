package app;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hilfefenster extends JFrame 
{

    public Hilfefenster()
    {
        //----------Standardkrams-------
        setTitle("Hilfe");
        setSize(900,150);
        getContentPane().setLayout(new FlowLayout());

        //----------Infotext------------
        JLabel text = new JLabel("Legen Sie die Steine so vom rechten Feld ins Linke Feld, dass keine Form und keine Farbe doppelt in einer Zeile und Spalte vorkommt.");
        getContentPane().add(text);


        //----------Button--------------
        JButton ok = new JButton("0k");
        getContentPane().add(ok);

        ok.addActionListener((ActionEvent e) -> {
            setVisible(false);
        });

        //----------Schluss--------------
        setVisible(true);
    }
    
}
