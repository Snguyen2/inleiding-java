package h08;

import java.awt.*;
import java.applet.*;

public class H8O1 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;


    public void init() {
        tekstvak = new TextField("Klik op mij", 20);
        label = new Label("Type iets in het tekstvak");
        add(label);
        add(tekstvak);
        knop = new Button();
        knop.setLabel( "Ok");
        add(knop);
        knop = new Button();
        knop.setLabel( "Reset");
        add(knop);
    }

    public void paint(Graphics g) {


    }
}
