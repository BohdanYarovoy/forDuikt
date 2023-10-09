package org.yaroviy;

import java.util.Arrays;
import java.util.Scanner;

/*
    Bogdan Yarovyi
    CS-22
    Sprint-2
*/

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter count of numbers: ");
        int[] numbers = new int[scanner.nextInt()];
        System.out.print("Enter k-number: ");
        int k = scanner.nextInt();
        fillArrayFromConsole(numbers);
        // 1-task
        System.out.println("1: " + lastIndexOf(numbers, k));
        // 2-task
        System.out.println("2: " + Arrays.toString(allIndexesOf(numbers,k)));
        // 3-task
        System.out.println("3: " + isSorted(numbers));
        // 4-task
        System.out.println("4: " + mode(numbers));
        // 5-task
        evenBeforeOdd(numbers);
        System.out.println("5: " + Arrays.toString(numbers));
    }

    public static void fillArrayFromConsole(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + " number: ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }

    public static int lastIndexOf(int[] array, int k){
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                result = i;
            }
        }
        return result;
    }

    public static int[] allIndexesOf(int[] array, int k){
        int[] result = null;
        int resultArrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k ) {
                resultArrayLength++;
            }
        }
        if (resultArrayLength > 0) {
            result = new int[resultArrayLength];
        }else{
            return result;
        }
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k ) {
                result[counter] = i;
                counter++;
            }
        }
        return result;
    }

    public static boolean isSorted(int[] array){
        if (array.length == 1) {
            return true;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1] ) {
                return false;
            }
        }
        return true;
    }

    public static int mode(int[] array){
        if (array.length == 1) {
            return array[0];
        }else if (array.length == 0) {
            return -1;
        }
        int[][] counter = new int[101][1];
        for (int i = 0; i < array.length; i++) {
            counter[array[i]][0] += 1;
        }
        int numberMeetings = 0;
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (numberMeetings < counter[array[i]][0]) {
                numberMeetings = counter[array[i]][0];
                number = array[i];
            }else if (numberMeetings == counter[array[i]][0]) {
                if (number > array[i]) {
                    numberMeetings = counter[array[i]][0];
                    number = array[i];
                }
            }
        }
        return number;
    }

    public static void evenBeforeOdd(int[] array){
        int lastBeforeOdd = -1;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                ++lastBeforeOdd;
                temp = array[lastBeforeOdd];
                array[lastBeforeOdd] = array[i];
                array[i] = temp;
            }
        }
    }
}