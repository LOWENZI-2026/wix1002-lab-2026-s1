/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zi.l3q5;

/**
 *
 * @author LOWENZI
 */
import java.util.Scanner;
public class L3Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a ");
        int a = input.nextInt();
        System.out.println(" Enter b ");
        int b = input.nextInt();
        System.out.println(" Enter c ");
        int c = input.nextInt();
        System.out.println(" Enter d ");
        int d = input.nextInt();
        System.out.println(" Enter e ");
        int e = input.nextInt();
        System.out.println(" Enter f ");
        int f = input.nextInt();
        
        if ((a*d-b*c)!=0){
            double x = (double)(e*d-b*f)/(a*d-b*c);
            double y = (double)(a*f-e*c)/(a*d-b*c);
            System.out.println(" x is " + x + " and y is " + y);
        }
        else{
            System.out.println(" The equation has not solution ");
        }
    }
} 
