/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zi.l3q1;

/**
 *
 * @author LOWENZI
 */
import java.util.Scanner;
public class L3Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter integer number 1 ");
        int num1 = input.nextInt();
        System.out.println(" Enter integer number 2 ");
        int num2 = input.nextInt();
        System.out.println(" Enter the operand ");
        char operand = input.next().charAt(0);
        
        if (operand == '+'){
            int sum = num1 + num2;
            System.out.println(" The sum of the numbers is " + sum);           
        }
        else if (operand == '-'){
            int diff = num1 - num2;
            System.out.println(" The difference of the numbers is " + diff);
        }
         else if (operand == '*') {
            int multi = num1 * num2 ;
            System.out.println(" The multiplication of the numbers is " + multi);
         }
         else if (operand == '/') {
            int quo = num1 / num2 ;
            System.out.println(" The quotient of the numbers is " + quo);
         }
         else if (operand == '%') {
            int rem = num1 % num2 ;
            System.out.println(" The remainder of the numbers is " + rem);
         }
         else{
             System.out.println(" INVALID ANSWER OR OPERAND !");
         }
    }
}  
