package code;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class ZeichnenFrame extends JFrame
{
    static boolean isKreis = true;
    JPanel panel;
    JPanel radios = new JPanel();
    public ZeichnenFrame()
    {
        getContentPane().setLayout(new BorderLayout());
        add(radios, BorderLayout.NORTH);
        panel = new ZeichnenPanel(this);
        add(panel, BorderLayout.CENTER);
        
        JRadioButton kreis = new JRadioButton("Kreis");
        kreis.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent e)
            {
                isKreis = true;
            }
        });
        JRadioButton rec = new JRadioButton("Rechteck");
        rec.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent e)
            {
                isKreis = false;
            }
        });
        ButtonGroup group = new ButtonGroup();
        group.add(kreis);
        group.add(rec);
        radios.add(kreis);
        radios.add(rec);
        kreis.setSelected(true);
        
        
        setTitle("ZeichenFenster");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
