package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static int checkDigit(int[] arr){
        int checkDigit = 0;
        int sum = 0;

        for (int i = 0; i <= arr.length-1; i++){
            sum += (i+2) * arr[i];
            checkDigit = 11 - (sum % 11);
        }
        switch (checkDigit){
            case 10:
                checkDigit = 0;
                break;
            case 11:
                checkDigit = 5;
                break;
        }
        return checkDigit;
    }


    public static boolean swapArrays(int[] array1, int[] array2){
        int[] tempArray = new int[array1.length];
        if(array1.length == array2.length){
            for (int i = 0; i < array1.length; i++){
                tempArray[i] = array1[i];
                array1[i] = array2[i];
                array2[i] = tempArray[i];
            }
            return true;
        } else {
            return false;
        }
    }

    public static int randomNumberBetweenOneAndHundred(){
        Random num = new Random();
        return num.nextInt(100) + 1;
    }

    public static void guessingGame(int numberToGuess){
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++){
            System.out.print("Guess number "+ i + ": ");
            int guess = sc.nextInt();
            if (guess > numberToGuess && i < 10){
                System.out.println("The number AI picked is lower than your guess.");
            } else if (guess < numberToGuess && i < 10){
                System.out.println("The number AI picked is higher than your guess.");
            } else if (guess == numberToGuess && i < 10){
                System.out.println("You won wisenheimer!");
                break;
            } else if (guess != numberToGuess) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                break;
            }
        }
    }

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
        int row = 1;
        int count = 0;
        for (int i = 1; start > i; i++) {
            System.out.print("   ");
            n++;
        }
        for (int j = 1; j <= days; j++) {
            if (j < 10){
                System.out.print(" " + j + " ");
            } else {
                System.out.print(j + " ");
            }
            count++;
            n++;
            if (n == 8){
                row++;
                n = 1;
                System.out.println();
            }
            if (row == 5 && count == days) {
                System.out.println();
            }
        }
   }

    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 5, 8};
        checkDigit(arr);
    }
}