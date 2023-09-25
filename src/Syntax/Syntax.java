package Syntax;
import java.util.Scanner;
public class Syntax {
    static int n;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        printNumbersBackwards(1);
        System.out.println();
        printNumbersUp(9);
        System.out.println();
        //stackOverflowError();
    }

    //1
    public static void printNumbersBackwards(int n) {
        if (n == 10) return;

        printNumbersBackwards(n + 1);
        System.out.println(n);
    }

    //2
    public static void printNumbersUp(int n) {
        if (n == 0) return;

        printNumbersUp(n - 1);
        System.out.println(n);
    }

    //3
    public static void stackOverflowError() {
        n++;
        System.out.println("Number:  " + n);
        stackOverflowError();
    }
}