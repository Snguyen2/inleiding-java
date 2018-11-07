package h010;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10O2 extends Applet {
    Label label;
    TextField tekstvak;
    int getal;
    int getal2;
    int getal3;


    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("type een cijfer in");

        add(label);
        add(tekstvak);

        tekstvak.addActionListener(new TekstvakListener());
    }

    public void paint(Graphics g) {
        g.drawString("Getal:                   " + getal, 70, 60);
        g.drawString("Hoogste getal:     " + getal2, 70, 80);
        g.drawString("Laagste getal:      " + getal3, 70, 100);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);
            if (getal > getal2)
                getal2 = getal;
                if (getal < getal3)
                    getal3 = getal;
                    repaint();
                }
            }
        }