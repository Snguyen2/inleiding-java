package h05;

import java.applet.*;
import java.awt.*;

public class H5O1 extends Applet {
    Color fillcolor;
    Color linecolor;
    int width;
    int height;

    public void init() {
        fillcolor = Color.magenta;
        linecolor = Color.black;
        width = 100;
        height = 50;
    }

        public void paint(Graphics g) {
            setBackground(Color.white);
            g.setColor(linecolor);
            g.drawLine(150, 30, 30, 30);
            g.drawRect(40, 70, width, height);
            g.drawRoundRect(40, 170, width, height, 20, 20);
            g.setColor(Color.red);
            g.drawString("Lijn", 80, 45);
            g.drawString("Rechthoek", 60, 140);
            g.drawString("Afgeronde Rechthoek", 40, 240);
            g.setColor(Color.blue);
            g.drawString("Gevulde Ovaal", 190, 240);
            g.drawString("Gevulde rechthoek met ovaal", 140, 140);
            g.setColor(Color.green);
            g.drawString("Cirkel", 335, 240);
            g.drawString("Taartpunt met ovaal eromheen", 300, 140);
            g.setColor(fillcolor);
            g.fillRect(180, 70, width, height);
            g.fillRoundRect(180, 170, width, height, 360, 360);
            g.fillArc(300, 70, width, height, 0, 60);
            g.setColor(linecolor);
            g.drawRoundRect(180, 70, width, height, 360, 360);
            g.drawRoundRect(300, 70, width, height, 360, 360);
            g.drawRoundRect(320, 160, 60, 60, 360, 360);



        }
    }
