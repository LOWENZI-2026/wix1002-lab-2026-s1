/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zi.l2q3;

/**
 *
 * @author LOWENZI
 */
import java.util.Random;
public class L2Q3 {
    public static void main(String[] args) {
         Random random = new Random() ; 
         
         int num1 = random.nextInt(41)+10;
         int num2 = random.nextInt(41)+10;
         int num3 = random.nextInt(41)+10;
         
         System.out.println(num1);
         System.out.println(num2);
         System.out.println(num3);
         
         int sum = num1 + num2 + num3 ;
         System.out.println("The sum of the numbers is " + sum);
         
         double average = sum/3.0; 
         System.out.printf(" The average of the numbers is %.2f \n " , average );
          
    }
}
