package app;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hilfefenster extends JFrame 
{

    public Hilfefenster()
    {
        setTitle("Hilfe");
        setSize(900,150);
        getContentPane().setLayout(new FlowLayout());

        JLabel text = new JLabel("Legen Sie die Steine so vom rechten Feld ins Linke Feld, dass keine Form und keine Farbe doppelt in einer Zeile und Spalte vorkommt.");
        getContentPane().add(text);

        JButton ok = new JButton("0k");
        getContentPane().add(ok);

        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                setVisible(false);
            }
        });


        setVisible(true);
    }
    
}
