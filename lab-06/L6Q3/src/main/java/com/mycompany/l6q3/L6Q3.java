/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l6q3;

/**
 *
 * @author LOWENZI
 */
import java.util.Scanner;
public class L6Q3 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        reverseArrayIntegers(numbers);

        System.out.println("Reversed integers in the array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static void reverseArrayIntegers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int reversed = 0;
            while (num != 0) {
                reversed = reversed * 10 + (num % 10);
                num /= 10;
            }
            arr[i] = reversed;
        }
    }
} 
