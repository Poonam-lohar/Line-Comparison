package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {

        System.out.println("Welcome to line comparison program");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point x1 and y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter point x2 and y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        Double length1 = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println("Length of first line: " + length1);
        System.out.println("Enter point x3 and y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.println("Enter point x4 and y4: ");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        Double length2 = Math.sqrt((Math.pow((x4 - x3), 2)) + (Math.pow((y4 - y3), 2)));
        System.out.println("Length of second line is: " + length2);

        boolean result = length2.equals(length1);

        if (result == true) {
            System.out.println("Lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }
    }
}
