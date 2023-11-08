import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] bub = {5.7, 3.5, -5.6, 7, 5, 3.9, -9.9, 9.9, 5.5, -5.6, 2.4, -2.6, -8.0, 7.7, -5.1};
        double dd = 0;
        int gg = 0;
        boolean d = false;
        for (double dub : bub) {
            if (dub < 0) {
                d = true;
            } else if (d) {
                gg++;
                dd += dub;
            }
        }
        System.out.println(dd / gg);
    }
}