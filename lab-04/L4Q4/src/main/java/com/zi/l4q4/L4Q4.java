/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zi.l4q4;

/**
 *
 * @author LOWENZI
 */
import java.util.Scanner;
public class L4Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = input.nextInt();
        
        System.out.print("Enter the first year of the year (0-6) : ");
        int day = input.nextInt();
         boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        
       
        int daysBeforeMay = 31 + (isLeapYear ? 29 : 28) + 31 + 30;
        int firstDayOfMay = (day + daysBeforeMay) % 7;
        
        
        int daysBeforeAugust = daysBeforeMay + 31 + 30 + 31;
        int firstDayOfAugust = (day + daysBeforeAugust) % 7;
        
        System.out.println("\nCalendar for May " + year);
        printMonth(firstDayOfMay, 31);
        
        System.out.println("\nCalendar for August " + year);
        printMonth(firstDayOfAugust, 31);
        
        input.close();
    }
    
    public static void printMonth(int startDay, int daysInMonth) {
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        for (int i = 0; i < startDay; i++) {
            System.out.print("    "); 
        }

        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("%3d ", i);
            if ((startDay + i) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
 