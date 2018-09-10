import java.awt.*;
import java.applet.*;

public class H4O6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.gray);
        g.fillRoundRect(160, 15, 80, 180, 10, 10);
        g.setColor(Color.red);
        g.fillRoundRect(180, 25, 40, 40, 360, 360);
        g.setColor(Color.orange);
        g.fillRoundRect(180, 75, 40, 40, 360, 360);
        g.setColor(Color.green);
        g.fillRoundRect(180, 125, 40, 40, 360, 360);
        g.setColor(Color.gray);
        g.fillRoundRect(185, 170, 30, 130, 10,10);
    }
}
