
package Graphics;

import logic.ToCalculate;
import logic.ToDraw;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Menu_Window extends Diagram_Window implements ToCalculate, ToDraw {
    public Menu_Window(int width, int height) {
        super(width, height);
        final JFrame f = new JFrame("Diagrammer");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Calculate");
        AbstractAction changewindow = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Тут будет открываться окно с готовой диаграммой; возможно здесь будет функция подсчета");
                JFrame Dia = new JFrame("Diagrammer");
                Diagram_Window DW = new Diagram_Window(width, height);
                //DW.count();
                Draws d = new Draws();
                d.Drawing();
            }
        };
        AbstractAction action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n = Double.parseDouble(textField.getText());
                System.out.println(n);
                textField.setText(""); //TODO ДОБАВИТЬ ЦИКЛ ВВОДА ЗНАЧЕНИЙ В МАССИВ ПО НАЖАТИЮ ENTER
                repaint();
                revalidate();
                count(n, 2, 0, 0); //TODO ПЕРЕПИСАТЬ ЛОГИКУ ДЛЯ ДИНАМИЧЕСКОГО МАССИВА (С ЦИКЛОМ)
            }
        };

        textField.addActionListener(action);
        button.addActionListener(changewindow);
        f.setSize(width, height);
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.add(new Label("Введите данные:"));
        f.add(textField);
        f.add(button);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

