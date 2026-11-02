/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zi.l4q1;

/**
 *
 * @author LOWENZI
 */
import java.util.Scanner;
public class L4Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" Enter an integer ");
        int integer = input.nextInt();
        System.out.print("The factors of " + integer + " is ");
        for(int i = 1 ; i <= integer ; i++){
            int result = integer % i ;
            int num = integer / i;
            if (result == 0){
                System.out.print(" " + num + " , ");
            }
             
        }
        System.out.println();
    }
}
 