package h12;
import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {
    double salaris[], a;

    public void init() {
        salaris = new double [10];
        salaris[0] = 100;
        salaris[1] = 200;
        salaris[2] = 300;
        salaris[3] = 400;
        salaris[4] = 500;
        salaris[5] = 600;
        salaris[6] = 700;
        salaris[7] = 800;
        salaris[8] = 900;
        salaris[9] = 1000;

        a = (salaris[0]+salaris[1]+salaris[2]+salaris[3]+salaris[4]+salaris[5]+salaris[6]+salaris[7]+salaris[8]+salaris[9]);
    }

    public void paint(Graphics g) {
        g.drawRect(15, 195, 50, 20);
        g.drawRect(15, 15, 50, 200);
        g.drawString(""+a/10, 20, 210);
        g.drawString(""+salaris[1], 20, 30);
        g.drawString(""+salaris[2], 20, 50);
        g.drawString(""+salaris[3], 20, 70);
        g.drawString(""+salaris[4], 20, 90);
        g.drawString(""+salaris[5], 20, 110);
        g.drawString(""+salaris[6], 20, 130);
        g.drawString(""+salaris[7], 20, 150);
        g.drawString(""+salaris[8], 20, 170);
        g.drawString(""+salaris[9], 20, 190);
    }
}