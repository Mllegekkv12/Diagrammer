
package Graphics;

import abstraction.WindowFrame;
import logic.ToCalculate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Menu_Window extends WindowFrame implements ToCalculate {
    public Menu_Window(int width, int height) {
        super(width, height);
        final Frame f = new Frame("Diagrammer");
        JTextField textField = new JTextField(20);
        AbstractAction action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(""); //TODO ДОБАВИТЬ ЦИКЛ ВВОДА ЗНАЧЕНИЙ В МАССИВ ПО НАЖАТИЮ ENTER
                repaint();
                revalidate();
                System.out.println("some action");
                // double inputX = textField;
                count(5, 3, 0, 0); //TODO ПЕРЕПИСАТЬ ЛОГИКУ ДЛЯ ДИНАМИЧЕСКОГО МАССИВА (С ЦИКЛОМ)
            }
        };

        textField.addActionListener( action );
        JButton button = new JButton("Calculate");
        button.addActionListener( action );
        f.setSize(width, height);
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.add(new Label("Введите данные:"));
        f.add(textField);
        f.add(button);
        f.setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public double count(double x, double y, double sum, double sector) {
        sum = x + y;
        sector = x / sum;
        System.out.println(sector);
        return sector;
    }
}

