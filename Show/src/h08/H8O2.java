package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H8O2 extends Applet {
    Button Mannen;
    Button Vrouwen;
    Button PotentieleMannen;
    Button PotentieleVrouwen;

    double a;
    double b;
    double c;
    double d;


    public void init() {
        a= 30;
        b= 30;
        c= 15;
        d= 15;

        Mannen = new Button("Mannen");
        Vrouwen = new Button("Vrouwen");
        PotentieleMannen = new Button("Potentiële Mannen");
        PotentieleMannen = new Button("Potentiële Mannen");



        add(Mannen);
        add(Vrouwen);
        add(PotentieleMannen);
        add(PotentieleVrouwen);


        MannenListener Ma = new MannenListener();
        Mannen.addActionListener(Ma);
        VrouwenListener Vr = new VrouwenListener();
        Vrouwen.addActionListener(Vr);
        PotentieleMannenListener PM = new PotentieleMannenListener();
        PotentieleMannen.addActionListener(PM);
        PotentieleVrouwenListener PV = new  PotentieleVrouwenListener();
        PotentieleVrouwen.addActionListener(PV);
    }


    public void paint(Graphics g) {
        g.drawString("" + a/b/c/d, 50, 60 );
    }
}


class MannenListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        a = Double.parseDouble(b.getText());
        repaint();
    }
}
class VrouwenListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        b = Double.parseDouble(c.getText());
        repaint();
    }
}
class PotentieleMannenListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        c = Double.parseDouble(d.getText());
        repaint();
    }
}
class PotentieleVrouwenListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        a = Double.parseDouble(d.getText());
        repaint();
    }
}