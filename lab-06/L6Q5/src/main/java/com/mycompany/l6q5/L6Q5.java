/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l6q5;

/**
 *
 * @author LOWENZI
 */
import java.util.Random;
import java.util.Scanner;

public class L6Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;

        while (true) {
            int num1 = rand.nextInt(13); // 0 to 12 inclusive
            int num2 = rand.nextInt(13); // 0 to 12 inclusive

            System.out.println("Enter negative number to quit.");
            System.out.print(num1 + " x " + num2 + " = ");
            int answer = scanner.nextInt();

            if (answer < 0) {
                break;
            }

            if (checkMultiplication(num1, num2, answer)) {
                score++;
            }
        }

        System.out.println("Your Score is " + score);
        scanner.close();
    }

    public static boolean checkMultiplication(int a, int b, int result) {
        return (a * b) == result;
    }
}
 