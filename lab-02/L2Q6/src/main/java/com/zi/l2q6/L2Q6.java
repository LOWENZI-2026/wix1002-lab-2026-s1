/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zi.l2q6;

/**
 *
 * @author LOWENZI
 */
import java.util.Scanner;
public class L2Q6 {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the amount of water in gram: ");
        double water = input.nextDouble();
        
        double M = water / 1000.0; 
        
        System.out.println("Enter the initial temperature in Fahrenheit: ");
        double initialF = input.nextDouble();
        
        double initialC = (initialF - 32) / 1.8; 
        
        System.out.println("Enter the final temperature in Fahrenheit: ");
        double finalF = input.nextDouble();
        
        double finalC = (finalF - 32) / 1.8; 
        
        double Q = M * (finalC - initialC) * 4184;
         
        System.out.printf("The energy needed is %e\n", Q);
    }
} 

