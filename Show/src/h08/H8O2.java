package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class H8O2 extends Applet {

    int man;
    int vrouw;
    int pman;
    int pvrouw;
    int totaal;

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    public void init(){
        setSize(1600, 900);
        button1 = new Button();
        button1.setLabel("Mannen");
        button1.addActionListener(new manListener());
        button2 = new Button();
        button2.setLabel("Vrouwen");
        button2.addActionListener(new vrouwListener());
        button3 = new Button();
        button3.setLabel("Potentiële mannen");
        button3.addActionListener(new pmanListener());
        button4 = new Button();
        button4.setLabel("Potentiële vrouwen");
        button4.addActionListener(new pvrouwListener());
        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }

    class manListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            man = man + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    class vrouwListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            vrouw = vrouw + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    class pmanListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            pman = pman + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    class pvrouwListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            pvrouw = pvrouw + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString("Aantal mannen aanwezig: = " + man, 50, 80);
        g.drawString("Aantal vrouwen aanwezeig: = " + vrouw, 50, 100);
        g.drawString("Aantal mannen aanwezeig: = " + pman, 50, 120);
        g.drawString("Aantal vrouwen aanwezeig: = " + pvrouw, 50, 140);
        g.drawString("Totaal aantal mensen aanwezeig: = " + totaal, 50, 160);


    }
}