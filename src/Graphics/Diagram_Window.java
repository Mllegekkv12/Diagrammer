package Graphics;

import abstraction.WindowFrame;
import logic.ToCalculate;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

public class Diagram_Window extends WindowFrame implements ToCalculate {
    Diagram_Window(int width, int height) {
        super(width, height);
    }

    /* private ArrayList<Double> sectors = new ArrayList<>();
     private ArrayList<Double> proc = new ArrayList<>();
     @Override
     public double count(ArrayList<Double> list, double sum, double sector) {
         double tm ;
         int j = 0 ;
         for (Double eDouble: list){
               sum+=eDouble;
           }
         for (Double sDouble : list){
             tm = sDouble/sum;
             sectors.add(tm);
             j++;
         }
 //        System.out.println(sectors.size() + " size sector");
 //        System.out.println(j + " j");
 //        System.out.println(sectors + " sector");
 //        System.out.println(sectors.size() - j + " size - j");
         for (int i = sectors.size() - j; i < sectors.size(); i++) {
             proc.add(sectors.get(i));
 //            System.out.println(sectors.get(i) + " new sector");
         }
 //        System.out.println(sum + " summ");
         System.out.println(proc + " Основной");
         proc.clear();
         return sector;
     }
 */

    static class Drawable extends JFrame implements ToCalculate {
        public void paint(@NotNull Graphics g) {
            setForeground(Color.black);
            int ty=0;

            for (Integer integer : Grad) {
                System.out.println(ty + " ty");
                System.out.println(integer + " aInt");
                g.fillArc(100, 100, 300, 300, ty, integer);
                ty = integer;
            }
//            g.fillArc(100, 105, 300, 300, 0, 34);
//            System.out.println(" idi naxui");
//            g.fillArc(100, 105, 300, 300, 109, 145);
            //  setForeground(Color.blue);
            //  g.fillArc(100, 100, 100, 100, 240, 360);
            //объект g создается автоматически
        }
    }

    static class Draws {
        void Drawing() {

            //TODO ЭТА ЗАЛУПА РАБОТАЕТ? ДА. НО НАДО ДОПИЛИТЬ
            javax.swing.SwingUtilities.invokeLater(() -> {
                Drawable Dia = new Drawable();
                Dia.setSize(800, 800);
                Dia.setVisible(true);
                Dia.setLocationRelativeTo(null);
                Dia.setResizable(false);
            });
        }
    }
}