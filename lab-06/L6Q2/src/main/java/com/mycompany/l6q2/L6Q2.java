/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l6q2;

/**
 *
 * @author LOWENZI
 */
public class L6Q2 {
public static void main(String[] args) {
        int rows = 5;

        System.out.println("Triangle:");
        for (int i = 1; i <= rows; i++) {
            multiPrint(rows - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }

        System.out.println("\nDiamond:");
        for (int i = 1; i <= rows; i++) {
            multiPrint(rows - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
 
        for (int i = rows - 1; i >= 1; i--) {
            multiPrint(rows - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
    }

    public static void multiPrint(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
}
