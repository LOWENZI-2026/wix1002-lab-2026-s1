/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zi.l2q5;

/**
 *
 * @author LOWENZI
 */
import java.util.Random;
public class L2Q5 {
      public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10001);
          System.out.println(" The number is " + num);
          
          int digit1 = num%10;
          int digit2 = (num/10)%10;
          int digit3 = (num/100)%10;
          int digit4 = (num/1000)%10;
          int digit5 = (num/10000)%10; 
          
          int sum = digit1 + digit2 + digit3 + digit4 + digit5;
          System.out.println(" The sum of all the digits in the number is " + sum);
                         
    }
}
