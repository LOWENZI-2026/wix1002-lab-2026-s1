/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zi.l3q6;

/**
 *
 * @author LOWENZI
 */
import java.util.Scanner;
public class L3Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        System.out.println("Enter the coordinate point x : ");
        double x = input.nextDouble();
        System.out.println("Enter the coordinate point y : ");
        double y = input.nextDouble();

        double distance = Math.sqrt((x * x) + (y * y));

        if (distance <= radius) {
            System.out.println("The point is inside the circle centered at (0, 0).");
        } else {
            System.out.println("The point is outside the circle centered at (0, 0).");
        }
    }
} 
