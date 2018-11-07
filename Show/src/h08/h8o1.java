package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h8o1 extends Applet {
    TextField tekstvak;
    Label label;
    Button OK;
    Button Reset;
    String zin;


    public void init() {
        OK = new Button("OK");
        Reset = new Button("Reset");
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new OKListener());
        label = new Label();


        add(tekstvak);
        add(label);
        add(OK);
        add(Reset);


        OKListener ok = new OKListener();
        OK.addActionListener(ok);
        ResetListener re = new ResetListener();
        Reset.addActionListener(re);
    }

    public void paint(Graphics g) {
        g.drawString(zin, 50, 60);
    }


    class OKListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            zin = (tekstvak.getText());
            repaint();
        }
    }


    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }
}





