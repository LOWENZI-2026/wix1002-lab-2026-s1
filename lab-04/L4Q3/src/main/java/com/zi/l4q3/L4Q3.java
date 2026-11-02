/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zi.l4q3;

/**
 *
 * @author LOWENZI
 */
import java.util.Scanner;
public class L4Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = 0;
        int sum = 0;
        int count = 0;
        double sumsqrt = 0 ; 
        int max = 0; 
        int min = 0;
        
        while ( num >=0 ){
        System.out.println(" Enter a score [ negative score to close ] ");  //75 34 58 12 96 -1
        num = input.nextInt();
        sum += num;
           if ( num < 0 ){
               sum-= num;
            }
             else{
                 sumsqrt += num*num ;
                 count++;
                 }
           if ( count ==1 ){
               max = num;
               min = num;
               }
           else if (num > max) {
                   max = num; 
               }
           
           else if (num < min && num > -1) {
                   min = num;
           }               
        }   
    
        System.out.println("Maximum score : "+ max);
        System.out.println("Minimum score : "+ min);
        
        
        double average =  (double) sum  / count; 
            System.out.printf("Average Score : %.2f\n ",average);
                  
        double numerator = sumsqrt-(Math.pow(sum,2)/count);
        double denominator = count - 1;
        double standardDeviation = Math.sqrt(numerator/denominator);
        System.out.printf("Standard Deviation : %.2f\n" , standardDeviation);
        
        double variance = Math.pow(standardDeviation,2);
        System.out.println(variance);
        
    }
}
