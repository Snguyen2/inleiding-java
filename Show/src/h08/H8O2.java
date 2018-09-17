package h08;

import java.awt.*;
import java.applet.*;


public class H8O2 extends Applet {
    Button knop;

    public void init() {
        knop = new Button();
        knop.setLabel( "Man" );
        add(knop);
        knop = new Button();
        knop.setLabel( "Vrouw" );
        add(knop);
        knop = new Button();
        knop.setLabel( "Jongen" );
        add(knop);
        knop = new Button();
        knop.setLabel( "Meisje" );
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Klik op 1 knop?", 165, 60 );
    }
}
