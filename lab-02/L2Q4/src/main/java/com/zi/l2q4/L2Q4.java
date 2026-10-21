/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zi.l2q4;

/**
 *
 * @author LOWENZI
 */
import java.util.Scanner ;
public class L2Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the seconds ");
        int second = input.nextInt();
        int hour = second/3600;
        int minute = (second%3600)/60;
        int sec = second%60;
        
        System.out.printf("%d seconds is %d hour , %d minutes and %d sec",second,hour,minute,sec);
          
    }
}
