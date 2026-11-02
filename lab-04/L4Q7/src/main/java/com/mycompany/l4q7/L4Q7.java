/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l4q7;

/**
 *
 * @author LOWENZI
 */
import java.util.Scanner;
public class L4Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double P = input.nextDouble();
        System.out.print("Enter interest in %: ");
        double i = input.nextDouble(); 
        System.out.print("Enter total number of month(s): ");
        int N = input.nextInt();
        
        double r = i / (12 * 100);        
        double M = (P * r) / (1 - Math.pow(1 + r, -N));
        
        System.out.printf("%-10s %-20s %-15s %-15s %-20s %-20s\n", 
        "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");
        
        double totalInterest = 0.0;
        
        for (int n = 1; n <= N; n++) {
            double C = M * Math.pow(1 + r, -(1 + N - n));
            double L = M - C;
            double R = (L / r) - C;           
            totalInterest = totalInterest + L;
            if (n == N) {
                R = 0.00;
            }
            
        System.out.printf("%-10d %-20.2f %-15.2f %-15.2f %-20.2f %.2f\n", 
                    n, M, C, L, R, totalInterest);
    }
}
} 
