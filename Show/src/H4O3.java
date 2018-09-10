import java.awt.*;
import java.applet.*;

public class H4O3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.fillRect(100, 100, 200, 33);
        g.setColor(Color.white);
        g.fillRect(100, 133, 200, 33);
        g.setColor(Color.blue);
        g.fillRect(100, 166, 200, 33);
        g.setColor(Color.gray);
        g.fillRect(100, 100, 20, 200);
        g.setColor(Color.orange);
        g.fillRoundRect(98, 90, 25, 15, 90, 90);
    }
}