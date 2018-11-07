package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10O5 extends Applet {
    TextField tekstvak, tekstvak1, tekstvak2, tekstvak3;
    String gemiddeld;
    Button knop;
    double a, b, c, d, e, antwoord;
    Color color;

    public void init() {
        gemiddeld = "";
        e=4;

        tekstvak = new TextField("", 5);
        add(tekstvak);

        tekstvak1 = new TextField("", 5);
        add(tekstvak1);

        tekstvak2 = new TextField("", 5);
        add(tekstvak2);

        tekstvak3 = new TextField("", 5);
        add(tekstvak3);

        knop = new Button("Bereken");
        knop.addActionListener(new Uitkomst());
        add(knop);
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.drawString(""+gemiddeld, 50, 60);
    }

    class Uitkomst implements ActionListener {
        public void actionPerformed(ActionEvent ex) {
            if (tekstvak.getText() == "") {
                a = 0;
                e--;
            } else {
                String input0 = tekstvak.getText();
                a = Integer.parseInt(input0);
            }
            if (tekstvak1.getText() == "") {
                b = 0;
                e--;
            }else {
                String input1 = tekstvak1.getText();
                b = Integer.parseInt(input1);
            }
            if (tekstvak2.getText() == "") {
                c = 0;
                e--;
            } else {
                String input2 = tekstvak2.getText();
                c = Integer.parseInt(input2);
            }
            if (tekstvak3.getText() == "") {
                d = 0;
                e--;
            } else {
                String input3 = tekstvak3.getText();
                d = Integer.parseInt(input3);
            }
            antwoord = (a+b+c+d)/e;
            gemiddeld = "Het gemiddelde is "+antwoord;
            if (antwoord <= 5.5) {
                color = Color.RED;
            } else {
                color = Color.GREEN;
            }
            repaint();
        }
    }
}
