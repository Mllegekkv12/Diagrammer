package abstraction;

import javax.swing.*;
import java.awt.*;

public abstract class WindowFrame extends JFrame {
    private int width;
    private int height;

    public WindowFrame(int x, int y) {
        new Frame().setVisible(true);
        this.width = x;
        this.height = y;
        initPanel(x, y);
        initFrame();
    }

    public void initPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(width, height));
        add(panel);
    }

    public void initFrame() {
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diagrammer");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
