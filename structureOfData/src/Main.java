import java.util.Arrays;
import java.util.Scanner;

/*
    Sprint-1
    Bohdan Yarovyi
    CS-22
    20.09.2023
 */
public class Main {
    static int[] integers;
    static int minIntegers;
    static int maxIntegers;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter min value of count integers in arrays: ");
        minIntegers = scanner.nextInt();
        System.out.print("\nPlease, enter max value of count integers in arrays: ");
        maxIntegers = scanner.nextInt();

        if (minIntegers > maxIntegers) {
            System.out.println("Error: Min > max");
            System.exit(1);
        }

        integers = new int[maxIntegers - minIntegers];
        fillArray();
        System.out.println("Our array:" + Arrays.toString(integers) + "\n\t array length = " + integers.length + "\n");


        int[] oddIntegers = Arrays.stream(integers.clone()).filter(i -> i % 2 != 0).toArray();
        System.out.println("Our array with ODD integers:" + Arrays.toString(oddIntegers) + "\n\t array length = " + oddIntegers.length + "\n");


        int[] evenIntegers = Arrays.stream(integers.clone()).filter(i -> i % 2 == 0).toArray();
        System.out.println("Our array with EVEN integers:" + Arrays.toString(evenIntegers) + "\n\t array length = " + evenIntegers.length + "\n");


        int[] negativeIntegers = Arrays.stream(integers.clone()).filter(i -> i < 0).toArray();
        if (negativeIntegers.length == 0) {
            System.out.println("The program don`t find a negative numbers\n");
        }else {
            System.out.println("Our array with NEGATIVE integers:" + Arrays.toString(negativeIntegers) + "\n\t array length = " + negativeIntegers.length + "\n");
        }


        int[] positiveIntegers = Arrays.stream(integers.clone()).filter(i -> i > -1).toArray();
        if (positiveIntegers.length == 0) {
            System.out.println("The program don`t find a positive numbers\n");
        }else {
            System.out.println("Our array with POSITIVE integers:" + Arrays.toString(positiveIntegers) + "\n\t array length = " + positiveIntegers.length + "\n");
        }
    }


    public static void fillArray(){
        int counter = 0;
        for (int i = minIntegers; i < maxIntegers; i++) {
            integers[counter] = i;
            counter++;
        }
    }
}

/*
    static int countOfDays;
    static int[] daysTemperature;
        takeData();
        System.out.println("Average temperature: " + average());
        System.out.println("Count of days, that was higher then average temperature: " + countDaysThatHigher(average()));
        showTwoColdestDays();
        showTwoHottestDays();

    }

    public static void showTwoColdestDays(){
        int[] cloneArray = daysTemperature.clone();
        Arrays.sort(cloneArray);
        System.out.println("Two coldest days: " + cloneArray[0] + ", " + cloneArray[1]);
    }

    public static void showTwoHottestDays(){
        int[] cloneArray = daysTemperature.clone();
        Arrays.sort(cloneArray);
        System.out.println("Two hottest days: " + cloneArray[cloneArray.length-1] + ", " + cloneArray[cloneArray.length-2]);
    }



    public static int countDaysThatHigher(float average){
        int counter = 0;
        for (int temperature : daysTemperature) {
            if (temperature > average) {
                counter++;
            }
        }
        return counter;
    }

    public static float average(){
        int sum = 0;
        for (int i = 0; i < countOfDays; i++) {
            sum += daysTemperature[i];
        }
        return (float)sum / countOfDays;
    }

    public static void takeData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of days: ");
        countOfDays = scanner.nextInt();
        daysTemperature = new int[countOfDays];
        System.out.println("*******************************\n" +
                "Please, enter temperature readings for each day");
        takeDaysData(scanner);
    }

    public static void takeDaysData(Scanner scanner){
        for (int i = 0; i < countOfDays; i++) {
            System.out.print(i + 1 + "-day temperature: ");
            daysTemperature[i] = scanner.nextInt();
        }
    }
}

 */