import java.text.DecimalFormat;
import java.util.Random;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to the Testing area!\n");

        Random gen = new Random();

        // counters
        int it = 0;
        int m = 6000;
        int[] ct = new int[7];
        while (it < m) {
            // System.out.println(gen.nextInt(6) + 1);
            switch (gen.nextInt(6) + 1) {
                case 1:
                    ct[1]++;
                    break;
                case 2:
                    ct[2]++;
                    break;
                case 3:
                    ct[3]++;
                    break;
                case 4:
                    ct[4]++;
                    break;
                case 5:
                    ct[5]++;
                    break;
                case 6:
                    ct[6]++;
                    break;
            }
            it++;
        }

        double t = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.println("Number of " + i + ": " + ct[i]);
            double p = (double) ct[i] / (double) m * 100;
            if (p == (double) 0) {
                System.out.println("The percentage of " + i + " is 0%\n");
            } else {
                DecimalFormat nf = new DecimalFormat("#.00");
                System.out.println("The percentage of " + i + " is " + nf.format(p) + "%\n");
            }
        }
    }
}
