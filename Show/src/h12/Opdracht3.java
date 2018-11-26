package h12;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

    public class Opdracht3 extends Applet {
        TextField[] salaris;
        Button knop;
        int[] volgorde;

        public void init() {
            setSize(100, 250);
            salaris = new TextField[5];
            volgorde = new int[5];

            for (int teller = 0; teller < 5; teller++) {
                TextField henk = new TextField("", 8);
                salaris[teller] = henk;
                add(henk);
            }
            knop = new Button("Oké");
            knop.addActionListener(new Knop());
            add(knop);
        }

        class Knop implements ActionListener {
            public void actionPerformed(ActionEvent ex) {
                for (int teller = 0; teller < salaris.length; teller++) {
                    String input = salaris[teller].getText();
                    volgorde[teller] = Integer.parseInt(input);
                }

                Arrays.sort(volgorde);

                for (int teller = 0; teller < volgorde.length; teller++) {
                    salaris[teller].setText(String.valueOf(volgorde[teller]));
                }
            }
        }
    }