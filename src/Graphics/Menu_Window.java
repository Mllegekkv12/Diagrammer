package Graphics;

import abstraction.WindowFrame;
import javax.swing.*;
public class Menu_Window extends WindowFrame {
    public Menu_Window(int width, int height) {
        super(width, height);
        JButton button1 = new JButton("Button 1");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        button1.setAlignmentX(JComponent.RIGHT_ALIGNMENT);

        panel.add(button1);

        add(panel);


    }



}

