package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main {
    public static void main(String[] args) 
    {

        Fenster fenster = new Fenster();

        //----------Menüband----------------
        JMenuBar menue = new JMenuBar();
        fenster.setJMenuBar(menue);

        JMenu menueDatei = new JMenu("Datei");
        menue.add(menueDatei);

        //----------MenüItems----------------
        JMenuItem menueHilfe = new JMenuItem("Hilfe");
        JMenuItem menueNewGame = new JMenuItem("Neues Spiel");
        JMenuItem menueESC = new JMenuItem("Beenden");
        menueDatei.add(menueHilfe);
        menueDatei.add(menueNewGame);
        menueDatei.add(menueESC);
        
        //----------Menüfunktionen-----------
        menueESC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });

        menueNewGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                //Inhalt fehlt noch
            }
        });

        menueHilfe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                Hilfefenster hilfefenster = new Hilfefenster();
            }
        });

    }
}
