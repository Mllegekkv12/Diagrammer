package Graphics;

import abstraction.WindowFrame;
import logic.ToCalculate;

//import java.awt.event.ActionListener;

public class Menu_Window extends WindowFrame implements ToCalculate{
    public Menu_Window(int width, int height) {
        super(width, height);
    }

    public static void XXX() {
        System.out.println("SUCCESS2");
        //WindowFrame
    }

    public double count(double x, double y, double sum, double sector) {
        sum = x + y;
        sector = x / sum;
        System.out.println(sector);
        return sector;
    }
}

