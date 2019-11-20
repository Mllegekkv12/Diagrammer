package Graphics;

import abstraction.WindowFrame;
import logic.ToCalculate;
import org.jetbrains.annotations.NotNull;
import java.awt.geom.Arc2D;
import javax.swing.*;
import java.awt.*;

public class Diagram_Window extends WindowFrame implements ToCalculate {
    Diagram_Window(int width, int height) {
        super(width, height);
    }

    static class Drawable extends JFrame implements ToCalculate {
        public void paint(@NotNull Graphics g) {
            int ty = 0;
            for (Integer integer : Grad) {
                setForeground(Color.red);
                g.fillArc(100, 100, 300, 300, ty, integer - 2);
//                g.drawLine(70, 250, 250, 250);
//                g.drawLine(100, Grad.get(i), 250, 250);
                ty += integer;
            }
        }
    }

    static class Draws {
        void Drawing() {
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