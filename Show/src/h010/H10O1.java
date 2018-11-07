package h010;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10O1 extends Applet {
   Label label;
   TextField tekstvak;
   int getal;
   int getal2;


    public void init() {
       tekstvak = new TextField("", 20);
       label = new Label("Type een cijfer in");

       add(label);
       add(tekstvak);

        tekstvak.addActionListener( new TekstvakListener() );

    }

    public void paint(Graphics g) {
        g.drawString("Getal:                   " + getal, 70, 60 );
        g.drawString("Hoogste getal:     " + getal2, 70,80);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt( s );
            if(getal > getal2)
                getal2 = getal;
            repaint();
        }
    }

}

