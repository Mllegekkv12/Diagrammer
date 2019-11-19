package Graphics;

import abstraction.WindowFrame;
import logic.ToCalculate;

import java.util.Scanner;

public class Diagram_Window extends WindowFrame implements ToCalculate {
    public Diagram_Window(int width, int height) {
        super(width, height);
    }

    public void count(double nextDouble, double nextDouble1, int i, int i1) {

    }

    public  double count(double x, double y, double sum, double sector) {
        sum = x + y;
        sector = x / sum;
        System.out.println(sector);
        return sector;
    }
}
