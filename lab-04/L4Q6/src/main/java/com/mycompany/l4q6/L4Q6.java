/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l4q6;

/**
 *
 * @author LOWENZI
 */
import java.util.Random;
public class L4Q6 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(Integer.MAX_VALUE);
        
        System.out.println("Generated number: " + num);
        
        int count = 0;
        int temp = num;
         if (temp == 0) {
            count = 1; 
        } else {
            while (temp > 0) {
                count++;           
                temp = temp / 10;  
            }
        }
        System.out.println("Number of digits: " + count);
    }
}
