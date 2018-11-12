package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijk extends Applet {
    Button k;
    int x;
    TextField tekst;

    public void init() {
        tekst = new TextField("", 10);
        add(tekst);

        k = new Button();
        k.setLabel("OK");
        k.addActionListener(new ta());
        add(k);
    }

    class ta implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input1 = tekst.getText();
            x = Integer.parseInt(input1);
            repaint();
        }
    }

    public void paint(Graphics g) {
        int tel =1;
        int y=0;
        while (tel < 11) {
            y += 20;
            g.drawString(tel+" x "+x+ " = " +tel*x, 10, y);
            tel++;
        }
    }
}
