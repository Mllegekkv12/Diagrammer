package Graphics;
import abstraction.WindowFrame;
import logic.ToCalculate;

public class Diagram_Window extends WindowFrame implements ToCalculate {
    public Diagram_Window(int width, int height) {
        super(width, height);
    }

    @Override
    public double count(double x, double y, double sum, double sector) {
            sum = x + y;
            sector = x / sum;
            System.out.println(sector);
            return sector;
        }
    }
