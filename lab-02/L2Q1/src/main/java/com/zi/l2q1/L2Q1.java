/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zi.l2q1;

/**
 *
 * @author LOWENZI
 */
import java.util.Scanner;
public class L2Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in degree Fahrenheit ");
        double fahrenheit = input.nextDouble();
        double celsius =  (fahrenheit -32)/1.8; 
        System.out.printf("The temperature in degree Fahrenheit to degree Celsius is %.2f\n ", celsius );
          
    }
}
