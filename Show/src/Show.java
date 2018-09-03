import java.applet.*;
import java.awt.*;


public class Show extends Applet {
    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(new Color(248, 255, 247));
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(new Color(10, 7, 255));
        g.drawString("Sang", 50, 70 );
        g.setColor(new Color(255, 11, 0));
        g.drawString("Nguyen", 50, 80);

    }
}
