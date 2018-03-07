import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println();
        if (args.length == 0) {
            Main m = new Main();
            m.solveCalculator(0, 5, -43);
        } else {
            System.out.println("arg0 = ".concat(args[0]));
        }
    }

    private void solveCalculator(int startValue, int moves, int goal) {
        String answer = "";
        int m = startValue;
        while (m != goal) {
            answer = "";
            m = startValue;
            int cpt = 0;
            while (cpt < moves) {
                switch ((int) (Math.random() * 4)) {
                    case 0:
                        answer += "+6";
                        m += 6;
                        break;
                    case 1:
                        answer += "-3";
                        m -= 3;
                        break;
                    case 2:
                        answer += "<<";
                        if (Math.abs(m) >= 10) {
                            answer += "Reverse";
                            String[] c = String.valueOf(Math.abs(m)).split("");
                            String k = "";
                            for (int i = c.length - 1; i>=0; i--) {
                                k += c[i];
                            }
                            m = m < 0 ? Integer.valueOf(k) * -1 : Integer.valueOf(k);
                        }
                        break;
                    case 3:
                        if (Math.abs(m) >= 10) {
                            answer += "Reverse";
                            String[] c = String.valueOf(Math.abs(m)).split("");
                            String k = "";
                            for (int i = c.length - 1; i>=0; i--) {
                                k += c[i];
                            }
                            m = m < 0 ? Integer.valueOf(k) * -1 : Integer.valueOf(k);
                        }
                        break;
                }
                cpt++;
                if (cpt < moves) {
                    answer = answer + " ==> ";
                }
            }
        }
        System.out.println(answer);
    }

    private boolean print() {
        try {
            throw new IllegalStateException();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Logic done");
            return true;
        }
    }

    private void squareNumbers(int mI, int mF) {
        for (int i = mI; i <= mF; i++) {
            double s = Math.sqrt(i);
            int k = (int) s;
            if (k == s) {
                System.out.print(i + " ");
            }
        }
    }

    private void displayAndWait(int s) throws InterruptedException {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        int i = 0;
        int m = 5;
        while (i < m) {
            Date date = new Date();
            System.out.println("It's " + dateFormat.format(date.getTime()));
            i++;
            if (i < m) {
                Thread.sleep(s * 1000);
            }
        }
    }

    private void sumSeries(int m) {
        int i = 0;
        double sum = 0;
        while (i < m) {
            sum += Math.pow(0.5, i);
            i++;
        }
        System.out.println(sum);
    }

    private void meanDistLine(int m, double l) {
        // m = number of tries
        // l = lenght of the line
        double x1, x2;
        double meanDistance = 0;
        for (int i = 0; i < m; i++) {
            x1 = Math.random() * l;
            x2 = Math.random() * l;
            meanDistance = meanDistance + Math.abs(x1 - x2);
        }
        meanDistance = meanDistance / m;
        System.out.println("The mean distance is : " + new DecimalFormat(".####").format(meanDistance));
    }

    private void meanDistSquare(int m, double s) {
        // m = number of tries
        // s = side of the square
        double x1, x2, y1, y2;
        double meanDistance = 0;
        for (int i = 0; i < m; i++) {
            x1 = Math.random() * s;
            x2 = Math.random() * s;
            y1 = Math.random() * s;
            y2 = Math.random() * s;
            meanDistance = meanDistance + Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        }
        meanDistance = meanDistance / m;
        System.out.println("The mean distance is : " + new DecimalFormat(".####").format(meanDistance));
    }

    private void displayFibonacci(int m) {
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 0;
        int k = c;
        System.out.print(b + " ");
        while (d < m - 2) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
            d++;
        }
    }

    private List fibonacci(int m) {
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 0;
        int k = c;
        List<Integer> l = new ArrayList();
        while (d < m - 2) {
            l.add(c);
            a = b;
            b = c;
            c = a + b;
            d++;
        }
        return l;
    }

    private void comparePI(double d) {
        double p1 = piSeries1(10000000);
        double p2 = piSeries2(600000);

        if (Math.abs(p1 - Math.PI) < d) {
            System.out.println("Series 1 is good enough");
        } else {
            System.out.println("Series 1 is not good enough");
        }

        if (Math.abs(p2 - Math.PI) < d) {
            System.out.println("Series 2 is good enough");
        } else {
            System.out.println("Series 2 is not good enough");
        }
    }

    public double piSeries1(int m) {
        double s = 1;
        int c = 1;
        for (int i = 3; i <= m; i += 2) {
            int j = (int) Math.pow(-1, c);
            s = s + (double) j * (double) 1 / i;
            c++;
        }
        return 4 * s;
    }

    public double piSeries2(int m) {
        double s = 1;
        for (int i = 2; i <= m; i++) {
            s = s + (double) 1 / (i * i);
        }
        return Math.sqrt(6 * s);
    }

    public void displayPrimeFactors(int n) {
        switch (n) {
            case 0:
                System.out.println("0 is not valid.");
                break;
            case 1:
                System.out.println("1 is not prime.");
                break;
            default:
                List k = new ArrayList();
                List d = new ArrayList();
                Boolean b = false;
                k = getPrimes(n);
                if (k.contains(n)) {
                    System.out.println(n + " is prime.");
                } else {
                    String d1 = n + " is divisible by powers of ";

                    for (int i = 0; i < k.size(); i++) {
                        if (n == k.get(i)) {
                            b = true;
                        }
                        ;
                    }

                    if (b) {
                        System.out.println(n + " is prime !");
                    } else {
                        d = getPrimeFactors(k, n);

                        for (int i = 0; i < d.size(); i++) {
                            d1 = d1 + d.get(i) + ", ";
                        }

                        d1 = d1.substring(0, d1.length() - 2);
                        String d2 = d1.substring(d1.length() - 5, d1.length() - 1);
                        String d3 = d2;
                        d3 = d3.replace(", ", " and ");
                        d1 = d1.replace(d2, d3);
                        System.out.println(d1);
                    }
                }
        }
    }

    private List getPrimeFactors(List k, int n) {
        List d = new ArrayList();

        for (int i = 0; i < k.size(); i++) {
            int m = (int) k.get(i);
            if (n % m == 0) {
                d.add(k.get(i));
            }
        }

        return d;
    }

    public List getPrimes(int n) {
        List listPrimes = new ArrayList();

        for (int i = 1; i <= n; i++) {
            int counter = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    counter = counter + 1;
                }
            }

            if (counter == 2) {
                listPrimes.add(i);
            }
        }

        return listPrimes;
    }

    public void primeList(int n) {
        List listPrimes = new ArrayList();

        for (int i = 1; i <= n; i++) {
            int counter = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    counter = counter + 1;
                }
            }

            if (counter == 2) {
                listPrimes.add(i);
            }
        }

        int s = listPrimes.size();
        for (Object k : listPrimes) {
            if (s > 30) {
                if (listPrimes.indexOf(k) == s - 1) {
                    System.out.print(k);
                } else if (listPrimes.indexOf(k) == s - 2) {
                    System.out.print(k + " & ");
                } else if (listPrimes.indexOf(k) % 20 == 0 && listPrimes.indexOf(k) > 0) {
                    System.out.println(k + ", ");
                } else {
                    System.out.print(k + ", ");
                }
            } else {
                if (listPrimes.indexOf(k) == s - 1) {
                    System.out.print(k);
                } else if (listPrimes.indexOf(k) == s - 2) {
                    System.out.print(k + " & ");
                } else {
                    System.out.print(k + ", ");
                }
            }
        }
    }
}
