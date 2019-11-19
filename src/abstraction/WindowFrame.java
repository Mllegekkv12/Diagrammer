package abstraction;

import javax.swing.*;
import java.awt.*;

public abstract class WindowFrame extends JFrame {

    protected WindowFrame(int x, int y) {
        new Frame().setVisible(true);
        initPanel(x, y);
        initFrame();
    }

    private void initPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(width, height));
        add(panel);
    }

    private void initFrame() {
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diagrammer");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(false);
    }
}
