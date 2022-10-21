package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static long[] lcg(long seed){
        long[] randomNumbers = new long[10];
        int m = 2147483647;
        int c = 12345;
        int a = 1103515245;

        for (int i = 0; randomNumbers.length > i; i++){
            seed = (a * seed + c) % (m+1);
            randomNumbers[i] = seed;
        }

        return randomNumbers;
    }

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

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        long[] randomNumbers = lcg(1000);
    }
}