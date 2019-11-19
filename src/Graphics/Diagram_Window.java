package Graphics;

import abstraction.WindowFrame;
import logic.ToCalculate;
import logic.ToDraw;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.Arc2D;
import java.util.Scanner;

public class Diagram_Window extends WindowFrame implements ToCalculate {
    public Diagram_Window(int width, int height) {
        super(width, height);
    }

    public  double count(double x, double y, double sum, double sector) {
        sum = x + y;
        sector = x / sum;
        System.out.println(sector);
        return sector;
    }
    Draws DR = new Draws();
    //Draws.Drawing();
}

class MyApp extends JFrame {
    public void paint(Graphics g) {
        setForeground(Color.red);
        g.drawArc(200, 200, 100, 100, 0, 90);//объект g создается автоматически
        g.fillArc(100, 100, 100, 100, 0, 90);
    }
}
class Draws {
    public static void Drawing() {

        //TODO ЭТА ЗАЛУПА РАБОТАЕТ? ДА. НО НАДО ДОПИЛИТЬ
        javax.swing.SwingUtilities.invokeLater(() -> {
            MyApp ap = new MyApp();
            ap.setSize(500, 500);
            ap.setVisible(true);
            ap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}