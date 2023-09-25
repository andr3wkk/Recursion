package Strings;
import java.util.Scanner;
public class Strings {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please, type Your name: ");
        String name = in.nextLine();
        printString(name);
        System.out.println();
        printReverseString(name);
        System.out.println();
        reverseString(name);
    }

//1
    public static void printString(String name) {
        if (name == null || (name.length() <= 1))
            // without name.lengh code doesn't work
            System.out.println(name);
        else {
            System.out.println(name.charAt(0));
            printString(name.substring(1));
        }
    }

//2.1
    public static void printReverseString(String name) {
        if (name == null || (name.length() <= 1))
            // without name.lengh code doesn't work
            System.out.println(name);
        else {
            System.out.print(name.charAt(name.length()-1));

            printReverseString(name.substring(1, name.length()-1));
        }
    }


//2.2
    public static void reverseString(String name) {
        if (name == null || (name.length() <= 1))
            System.out.println(name);
        else {
            System.out.print(name.charAt(name.length()-1));
            reverseString(name.substring(0, name.length()-1));
        }
    }

}