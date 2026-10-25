/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zi.l3q4;

/**
 *
 * @author LOWENZI
 */
import java.util.Random;
public class L3Q4 {
    public static void main(String[] args) {
        Random random = new Random();
        int player1R1 = random.nextInt(6)+1;
        int player1R2 = random.nextInt(6)+1;
        int sumPlayer1 = player1R1 + player1R2;
        
        System.out.println("Player 1");
        System.out.println(player1R1);
        System.out.println(player1R2);
        System.out.println( "SUM : " + sumPlayer1);
        
        int player2R1 = random.nextInt(6)+1;
        int player2R2 = random.nextInt(6)+1;
        int sumPlayer2 = player2R1 + player2R2;
        
        System.out.println("Player 2");
        System.out.println(player2R1);
        System.out.println(player2R2);
        System.out.println( "SUM : " + sumPlayer2);
        
        if (sumPlayer1 > sumPlayer2){
            System.out.println("Player 1 win");
        }
        else if (sumPlayer2 > sumPlayer1){
            System.out.println("Player 2 win");
        }
        else{
            System.out.println(" IT IS DRAW ! ");
        } 
    }
}
