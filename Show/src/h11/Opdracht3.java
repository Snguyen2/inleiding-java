package h11;
import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int tel=1;
        int y = 0;
        int fibo = 1;
        int antw = fibo;
        boolean x = true;
        if (x = true) {
            antw = fibo + tel;
            x = false;
        } else {
            antw = fibo - tel;
            x = true;
        }



        while(tel < 100) {
            y += 20;
            g.drawString("" + tel, 170, y );
            g.drawString("" + antw, 190, y);
            tel++;
            if (x = true) {
                antw = fibo + tel;
                x = false;
            } else {
                antw = fibo - tel;
                x = true;
            }

        }
    }
}
