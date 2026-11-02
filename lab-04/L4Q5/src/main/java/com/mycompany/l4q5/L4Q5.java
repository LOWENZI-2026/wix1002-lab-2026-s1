/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l4q5;

/**
 *
 * @author LOWENZI
 */
import java.util.Random;
public class L4Q5 {
    public static void main(String[] args) {
        Random r = new Random();
        int player1 = 0;
        int player2 = 0;
        int sumP1 = 0;
        int sumP2 = 0;
        for (player1 = 0 ; player1 <= 100 ; player1 ++){
            player1 = r.nextInt(6)+1;
            sumP1 += player1;
            if (player1 == 6){
               System.out.println("Roll again");
               player1 = r.nextInt(6)+1;
               sumP1 += player1; 
            }
        //    System.out.println(" SUMP1 : " + sumP1);
        //    sumP1 += player1;
            if ( sumP1 > 100){
                System.out.println(" SUMP1 : " + sumP1);
                for (player2 = 0 ; player2 <= 100 ; player2 ++){
                player2 = r.nextInt(6)+1;
                sumP2 += player2;
               if (player2 ==6){
                    System.out.println("Roll again");
                   player2 = r.nextInt(6)+1;
                   sumP2 += player2; 
            }
        //        System.out.println(" SUMP2 : " + sumP2 );
                if ( sumP2 > 100 ){
                    System.out.println(" SUMP2 : " + sumP2 );
                    if ( sumP1 > sumP2 ){
                        System.out.println("Player 1 win ");
                    }
                    else if (sumP1 < sumP2) {
                          System.out.println("Player 2 win ");
                    }
                    else{
                         System.out.println("DRAW!");
                        }
                    return;   
                   } 
                }
               }
            }           
        System.out.println();                            
    }
}
