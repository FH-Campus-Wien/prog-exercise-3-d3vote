package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void oneMonthCalendar(int days, int start) {
        System.out.println(days);
        System.out.println(start);
        int []numbers = {2, 3, 5, 6};
        int []numbers2 = new int[10];
        numbers2[0] = 6;
        numbers2[1] = 4;

        numbers2[9] = 9;
        for (int i = 0; i < numbers2.length; i++){
            System.out.println(numbers2[i]);
        }
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