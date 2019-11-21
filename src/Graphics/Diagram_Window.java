package Graphics;

import abstraction.WindowFrame;
import logic.ToCalculate;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;


class Diagram_Window extends WindowFrame implements ToCalculate {
    Diagram_Window(int width, int height) {
        super(width, height);
    }

    static class Drawable extends JFrame implements ToCalculate {
        public void paint(@NotNull Graphics g) {
            int ty = 0;
            g.drawArc(100, 100, 300, 300, ty, 360);
            g.setColor(Color.blue);
            if (Grad.size() < 2) {
                g.drawArc(100, 100, 300, 300, ty, 360);
            } else
                for (Integer integer : Grad) {
                    double fi = ty;
                    double radians = Math.toRadians(fi);
                    int x = (int) (250 + (150 * Math.cos(radians)));
                    int y = (int) (250 + (150 * Math.sin(radians)));
                    System.out.println(x + " x" + y + " y");
                    ty += integer;
                    g.drawLine(250, 250, x, y);
                }
        }
    }

    static class Draws {
        void Drawing() {
            javax.swing.SwingUtilities.invokeLater(() -> {
                Drawable Dia = new Drawable();
                Dia.setSize(500, 500);
                Dia.setVisible(true);
                Dia.setLocationRelativeTo(null);
                Dia.setResizable(true);
            });
        }
    }
}
