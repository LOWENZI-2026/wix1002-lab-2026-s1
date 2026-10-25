/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zi.l3q3;

/**
 *
 * @author LOWENZI
 */
import java.util.Scanner;
public class L3Q3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println(" Enter sales volume ");
        int salesVolume = input.nextInt();
        if (salesVolume > 1000){
            double comm = salesVolume * 0.125;
                 System.out.printf(" The commission is %.2f " , comm);   
        }
        else if (salesVolume > 500 && salesVolume <= 1000 ){
            double comm = salesVolume * 0.1;
                 System.out.printf(" The commission is %.2f " , comm);  
        }   
        else if (salesVolume > 100 && salesVolume <= 500 ){
            double comm = salesVolume * 0.075;
                 System.out.printf(" The commission is %.2f " , comm);  
        } 
        else if (salesVolume <= 100 ){
            double comm = salesVolume * 0.05;
                 System.out.printf(" The commission is %.2f " , comm);  
        } 
    } 
}
