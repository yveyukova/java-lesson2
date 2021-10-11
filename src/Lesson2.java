/**
 * Java 1. Homework 2
 *
 * @author Juliya Veyukova
 * @version 11.10.2021
 */
public class Lesson2 {

    public static void main(String[] args) {
        System.out.println(checkSum(6, 3));
        isPositiveOrNegative(-1);
        System.out.println(isNegative(3));
        printStringNTimes("Привет!", 3);
        System.out.println(isLeapYear(2020));
    }

    static boolean checkSum(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    public static void isPositiveOrNegative(int a) {
        System.out.println(a >= 0 ? "Положительное" : "Отрицательное");
    }

    public static boolean isNegative(int a) {
        return (a < 0);
    }

    public static void printStringNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || year % 100 != 0) && (year % 4 == 0);
    }
}


