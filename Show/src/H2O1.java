import java.applet.*;
import java.awt.*;


public class H2O1 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Mijn eerste Applet", 50, 70);
    }
}

