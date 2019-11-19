package Graphics;


import abstraction.WindowFrame;

import javax.swing.*;
import java.awt.*;

public class Diagram_Window extends WindowFrame {
    public Diagram_Window(int width, int height) {
        super(width, height);
    }


    @Override
    public void initPanel() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(1920, 1080));
        add(panel);
    }
    //WindowFrame W_F = new WindowFrame(500, 600);
    //W_F.initFrame();
}
