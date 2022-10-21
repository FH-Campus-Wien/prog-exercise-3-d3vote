package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void oneMonthCalendar(int days, int start) {
        int n = 1;
        for (int i = 1; start > i && start != 1; i++) {
            System.out.print("   ");
            n++;
        }
        for (int j = 1; j <= days; j++) {
            if (j < 10){
                System.out.print(" " + j + " ");
            } else {
                System.out.print(j + " ");
            }
            n++;
            if (n == 8){
                System.out.println();
                n = 1;
            }
        }
        System.out.println();
    }

    public static long[] lcg(long seed){
        long[] randomNumbers;
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int start = sc.nextInt();
        oneMonthCalendar(days, start);
        long[] randomNumbers = lcg(0);
    }
}