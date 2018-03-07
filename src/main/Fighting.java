import java.text.DecimalFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Fighting {

    public static void main(String[] args) throws InterruptedException {
        // Welcome message
        System.out.println("Welcome to the Fighting ground! \n");

        long prev = System.currentTimeMillis();
        int fightsNumber = 10000;
        int monsterVictory = 0;
        int fighterVictory = 0;

        for (int i = 0; i < fightsNumber; i++) {
            // Monster
            int monsterAttack = 8;
            // System.out.println("Attack points of Monster: " + monsterAttack);
            int monsterDefense = 15;
            // System.out.println("Defense points of Monster: " + monsterDefense);
            int monsterDamage = 8;
            // System.out.println("Damage of Monster: ");
            int monsterLife = 150;
            // System.out.println("Life points of Monster: " + monsterLife);
            // System.out.println();

            // Fighter
            int fighterAttack = 12;
            // System.out.println("Attack points of Fighter: " + fighterAttack);
            int fighterDefense = 12;
            // System.out.println("Defense points of Fighter: " + fighterDefense);
            int fighterDamage = 12;
            // System.out.println("Damage of Fighter: " + fighterDamage);
            int fighterLife = 100;
            // System.out.println("Life points of Fighter: " + fighterLife);
            // System.out.println("\n");

            // Fighting ground
            int round = 1;
            Random gen = new Random();
            while (monsterLife > 0 && fighterLife > 0) {
                // System.out.println("Round " + round);
                if (gen.nextBoolean()) {
                    // System.out.println("Fighter attacks");
                    int dice = gen.nextInt(6) + gen.nextInt(6) + 2;
                    int attackValue = fighterAttack + dice;
                    // System.out.println("Rolled values = " + dice);
                    // System.out.println("Attack value of Fighter = " + attackValue);
                    if (attackValue > monsterDefense) {
                        // System.out.println("Fighter's attack was successful!");
                        monsterLife = monsterLife - fighterDamage;
                        if (monsterLife <= 0) {
                            // System.out.println();
                            break;
                        }
                        // System.out.println("Monster's remaining Life points = " + monsterLife + "\n");
                    } else {
                        // System.out.println("Fighter's attack was not successful!\n");
                    }
                } else {
                    // System.out.println("Monster attacks");
                    int dice = gen.nextInt(6) + gen.nextInt(6) + 2;
                    int attackValue = monsterAttack + dice;
                    // System.out.println("Rolled values = " + dice);
                    // System.out.println("Attack value of Monster = " + attackValue);
                    if (attackValue > fighterDefense) {
                        // System.out.println("Monster's attack was successful!");
                        fighterLife = fighterLife - monsterDamage;
                        if (fighterLife <= 0) {
                            // System.out.println();
                            break;
                        }
                        // System.out.println("Fighter's remaining Life points = " + fighterLife + "\n");
                    } else {
                        // System.out.println("Monster's attack was not successful!\n");
                    }
                }
                round++;
            }
            if (monsterLife > 0) {
                // System.out.println("Monster wins with " + monsterLife + " Life points");
                monsterVictory++;
            } else {
                // System.out.println("Fighter wins with " + fighterLife + " Life points");
                fighterVictory++;
            }
        }
        DecimalFormat nf = new DecimalFormat("#.00");
        System.out.println("The victory percentage of the Monster is " + nf.format((double) monsterVictory / (double) fightsNumber * 100) + "%\n");
        System.out.println("The victory percentage of the Fighter is " + nf.format((double) fighterVictory / (double) fightsNumber * 100) + "%\n");

        long timeDelta = System.currentTimeMillis() - prev;
        System.out.println("Time spent : " + timeDelta + " ms");
    }
}
