package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8O3 extends Applet {
    TextField tekstvak;
    Label label;
    Button OK;
    Double bedrag;


    public void init() {
        OK = new Button("OK");
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new OKListener());
        label = new Label("");

        add(label);
        add(tekstvak);
        add(OK);

        OKListener ok = new OKListener();
        OK.addActionListener(ok);
    }

    public void paint(Graphics g) {
        g.drawString("Het bedrag incl. BTW is €" + bedrag, 110, 60 );
    }


    class OKListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bedrag =  Double.parseDouble(tekstvak.getText());
            bedrag = bedrag *1.21;
            repaint();
        }
    }
}
