package logic;

        import java.util.ArrayList;

public interface ToCalculate {
    ArrayList<Double> sectors = new ArrayList<>();
    ArrayList<Integer> Grad = new ArrayList<>();
    ArrayList<String> Name = new ArrayList<>();
    default void count(ArrayList<Double> list, double sum) {
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
        for (int i = sectors.size() - j; i < sectors.size(); i++) {
            Grad.add((int) (sectors.get(i)*360));
        }
        System.out.println(Grad + " Проценты");
        sectors.clear();

    }
    default void name(ArrayList<String> Tlist) {
        Name.addAll(Tlist);
        System.out.println(Name + " Имя");
    }
}