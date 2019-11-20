package Graphics;

import abstraction.WindowFrame;
import logic.ToCalculate;
import org.jetbrains.annotations.NotNull;
import javax.swing.*;
import java.awt.*;

public class Diagram_Window extends WindowFrame implements ToCalculate {
    Diagram_Window(int width, int height) {
        super(width, height);
    }

    static class Drawable extends JFrame implements ToCalculate {
        public void paint(@NotNull Graphics g) {
            super.paint(g);
            int ty = 0;
            for (Integer integer : Grad) {
                g.setColor(Color.blue);
                g.fillArc(100, 100, 300, 300, ty, integer - 1);
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