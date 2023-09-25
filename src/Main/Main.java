package Syntax;
import java.util.Scanner;
public class Main {
    static int array;
    static int neededValue;
    static int count;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = inputArray(in, 5);
        System.out.println("Here is your array: ");
        printArray(array, 0);
        System.out.println("Here is sum of Your array: ");
        System.out.println(arraySum(array, array.length));
        System.out.println();
        System.out.println("Please, input value for finding:");
        neededValue = in.nextInt();
        count = 0;
        int result = findValue(array,0, neededValue, count);
        if (result < 0) {
            System.out.println(neededValue + " is not found");
        }
        else {
            System.out.println(neededValue + " is found, " + count + " times");
        }
    }

    //1
    public static void printArray(int[] array, int i) {
        if (i == array.length) return;

        System.out.println(array[i]);
        printArray(array, i + 1);
    }

    //2
    static int arraySum(int[] array, int i) {
        if (i <= 0)
            return 0;
        return (arraySum(array, i - 1) + array[i - 1]);
    }

    //3
    static int findValue(int[] array, int i, int neededValue, int c) {
        if (i >= array.length)
            return -1;
        if (array[i] == neededValue)
        return i; count ++;
    return findValue(array, i+1, neededValue, c);
    }



    public static int[] inputArray(Scanner in, int length) {
        int[] array = new int[length];
        System.out.println("Input value: " + length + " elements for array");
        for (int i = 0; i < length; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }
}