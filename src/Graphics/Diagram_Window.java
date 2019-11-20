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

    @Override
    public double count(double x, double y, double sum, double sector) {
        sum = x + y;
        sector = x / sum;
        System.out.println(sector);
        return sector;
    }

    class Drawable extends JFrame {

        public void paint(Graphics g) {
            setForeground(Color.green);

            g.fillArc(100, 100, 300, 300, 0, 120);

            g.fillArc(95, 103, 300, 300, 120, 120);

            g.fillArc(100, 105, 300, 300, 240, 120);

            //  setForeground(Color.blue);
            //  g.fillArc(100, 100, 100, 100, 240, 360);
            //объект g создается автоматически
        }
    }

    class Draws {
        public void Drawing() {

            //TODO ЭТА ЗАЛУПА РАБОТАЕТ? ДА. НО НАДО ДОПИЛИТЬ
            javax.swing.SwingUtilities.invokeLater(() -> {
                Drawable Dia = new Drawable();
                Dia.setSize(800, 800);
                Dia.setVisible(true);
                Dia.setLocationRelativeTo(null);
                Dia.setResizable(false);
            });
        }
    }
}