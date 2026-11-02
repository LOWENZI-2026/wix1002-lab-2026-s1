/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zi.l4q2;

/**
 *
 * @author LOWENZI
 */
import java.util.Scanner ;
public class L4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter an integer ");
         int n = input.nextInt();
         int sum = 0;
         int totalSum = 0;
         for( int i = 1 ; i<=n ; i++){
             sum += i ;
             totalSum += sum ; 
             System.out.println(" The sum of " + i + " value " + " is " + sum);
             
         }
        System.out.println("The total sum is "+totalSum);
        
    }
}
 