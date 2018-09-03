import java.applet.*;
import java.awt.*;


public class Show extends Applet {
    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(new Color(23, 20, 255));
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(new Color(254, 255, 10));
        g.drawString("Mijn eerste Applet", 50, 70 );

    }
}
