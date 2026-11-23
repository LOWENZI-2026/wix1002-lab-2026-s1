/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l6q1;

/**
 *
 * @author LOWENZI
 */
public class L6Q1 {
public static void main(String[] args) {
        System.out.println("First 20 triangular numbers:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(triangularNumber(i) + " ");
        }
        System.out.println();
    }

    public static int triangularNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

