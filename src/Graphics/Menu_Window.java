package Graphics;

import abstraction.WindowFrame;
import logic.ToCalculate;

import javax.swing.*;
import java.awt.*;

//import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
public class Menu_Window extends WindowFrame {
    public Menu_Window(int width, int height) {
        super(width, height);
//        JLabel
        JButton button1 = new JButton("Calculate");
        button1.setBorderPainted(true);
        button1.setFocusPainted(false);
        button1.setContentAreaFilled(false);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,1,1,10));
        Box box = Box.createVerticalBox();
        box.add(Box.createVerticalStrut(250));
        setContentPane(box);
        panel.add(button1);
        add(panel);
    }
    public class Action{}


}

