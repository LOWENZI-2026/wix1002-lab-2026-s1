/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l4q8;

/**
 *
 * @author LOWENZI
 */
import java.util.Random;
public class L4Q8 {
    public static void main(String[] args) {
        Random r = new Random();
        int num =r.nextInt(101);
        System.out.println(" The random number is : " + num);
        if( num % num ==0 && num % 2 != 0 && num % 3!=0 && num % 5 !=0){
            System.out.println(num + " is a prime number ");
        }
        else{
            System.out.println(num + " is not a prime number ");
        }
        int count = 0;   
        int number = 2;  
        while (count < num) {
            boolean isPrime = true;           
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false; 
                    break;           
                }
            } 
            if (isPrime) {
                System.out.print(number + " ");
                count++; 
            }
            
            number++; 
        }
        System.out.println();
    }  
}
