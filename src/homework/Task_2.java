package homework;

import java.util.Scanner;

public class Task_2 {
    public static void main(String args[]) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        // Calculating Maximum two numbers in Java
        System.out.println("Please enter two numbers to find maximum of two");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.printf("Between %d and %d, maximum is %d %n", a, b, a);
        } else {
            System.out.printf("Between %d and %d, maximum number is %d %n", a, b, b);
        }
        int max = Math.max(a, b);
        System.out.printf("Maximum value of %d and %d is %d %n", a, b, max);
        // Calculating Minimum between two numbers in Java
        System.out.println("Please enter two numbers to find minimum of two");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x < y) {
            System.out.printf("Between %d and %d, Minimum Number is %d %n", x, y, x);
        } else {
            System.out.printf("Between %d and %d, Minimum is %d %n", x, y, y);
        }
        int min = Math.min(x, y);
        System.out.printf("Maximum value of %d and %d is %d %n", x, y, min);
    }
}

