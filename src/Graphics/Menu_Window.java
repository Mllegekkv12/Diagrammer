
package Graphics;

import logic.ToCalculate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Menu_Window extends Diagram_Window implements ToCalculate {
    public Menu_Window(int width, int height) {
        super(width, height);

        ArrayList<Double> list = new ArrayList<>();
        ArrayList<String> Tlist = new ArrayList<>();

        final JFrame f = new JFrame("Diagrammer");
        JTextField textField = new JTextField(7);
        JTextField text = new JTextField(10);

        JButton button = new JButton("Calculate");
        AbstractAction changewindow = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Тут будет открываться окно с готовой диаграммой; возможно здесь будет функция подсчета");
                Draws d = new Draws();
                d.Drawing();
            }
        };
        AbstractAction action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                double n = Double.parseDouble(textField.getText());
                list.add(n);
                Grad.clear();
                textField.setText("");
                repaint();
                revalidate();
                count(list, 0);

                String n1 = text.getText();
                Tlist.add(n1);
                text.setText("");
                repaint();
                revalidate();
                name(Tlist);
                Tlist.clear();
            }
        };

        textField.addActionListener(action);
        text.addActionListener(action);
        button.addActionListener(changewindow);
        f.setSize(width, height);
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.add(new Label("Число:"));
        f.add(textField);
        f.add(new Label("Имя:"));
        f.add(text);
        f.add(button);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

