package abstraction;

import javax.swing.*;
import java.awt.*;

public abstract class WindowFrame extends JFrame {
    private int width;
    private int height;

    public WindowFrame(int width, int height) {
        new Frame().setVisible(true);
        initPanel();
        initFrame();
    }

    public void initPanel() {
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
