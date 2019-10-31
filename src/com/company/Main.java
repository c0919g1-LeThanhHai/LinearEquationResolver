package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("Đưa ra phương trình dạng 'a * x + b = 0', hãy nhập các hằng số: ");
        Scanner scanner = new Scanner(System.in);
        double a, b, answer;
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();

        if (a != 0) {
            answer = -b / a;
            System.out.printf("Phương trình có 1 nhiệm là " + answer);
        } else {
            if (b == 0) {
                System.out.println("Phương trình vô số nhiệm");
            } else {
                System.out.println("Phương trình vô nhiệm");
            }
        }
    }
}
