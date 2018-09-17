package h08;

import java.awt.*;
import java.applet.*;

public class H8O3 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;


    public void init() {
        tekstvak = new TextField("$200 - 21% belasting", 20);
        label = new Label("BTW ");
        add(label);
        add(tekstvak);
        knop = new Button();
        knop.setLabel( "Ok");
        add(knop);

    }

    public void paint(Graphics g) {
        repaint();
        tekstvak = new TextField("$158");


    }
}
