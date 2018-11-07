package h010;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H10O3 extends Applet {
   TextField tekstvak;
   Label label;
   String s, tekst;
   int maand;

    public void init() {
        tekstvak = new TextField("",20);
        label = new Label("Type het getal van de maand in");
        tekst = "";

        add(tekstvak);
        add(label);

        tekstvak.addActionListener(new TekstvakListener());

    }


    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }
class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt(s);
            switch(maand) {
                case 1:
                    tekst = "januari heeft 31 dagen";
                    break;
                case 2:
                    tekst = "februari heeft 29 dagen";
                    break;
                case 3:
                    tekst = "maart heeft 31 dagen";
                    break;
                case 4:
                    tekst = "april heeft 30 dagen";
                    break;
                case 5:
                    tekst = "mei heeft 31 dagen";
                    break;
                case 6:
                    tekst = "juni heeft 30 dagen";
                    break;
                case 7:
                    tekst = "juli heeft 31 dagen";
                    break;
                case 8:
                    tekst = "augustus heeft 31 dagen";
                    break;
                case 9:
                    tekst = "september heeft 30 dagen";
                    break;
                case 10:
                    tekst = "oktober heeft 31 dagen";
                    break;
                case 11:
                    tekst = "november heeft 30 dagen";
                    break;
                case 12:
                    tekst = "december heeft 31 dagen";
                    break;
                default:
                    tekst = "U heeft het verkeerde nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
}

}
