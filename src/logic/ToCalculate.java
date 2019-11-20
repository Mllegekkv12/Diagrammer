package logic;

import java.util.ArrayList;

public interface ToCalculate {
    ArrayList<Double> sectors = new ArrayList<>();
    ArrayList<Double> proc = new ArrayList<>();
    default double count(ArrayList<Double> list, double sum, double sector) {
        double tm;
        int j = 0;
        for (Double eDouble : list) {
            sum += eDouble;
        }
        for (Double sDouble : list) {
            tm = sDouble / sum;
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
}