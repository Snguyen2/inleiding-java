import java.applet.*;
import java.awt.*;


public class Show extends Applet {
    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(new Color(248, 255, 247));
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(new Color(14, 16, 128));
        g.drawString("Mijn eerste Applet", 50, 70 );

    }
}
