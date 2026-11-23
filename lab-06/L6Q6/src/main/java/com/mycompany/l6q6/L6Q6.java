/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l6q6;

/**
 *
 * @author LOWENZI
 */
public class L6Q6 {
    public static void main(String[] args) {
        System.out.println("First 20 Palindromic Primes:");
        int count = 0;
        int num = 2;
        while (count < 20) {
            if (isPalindromicPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }

        System.out.println("\n\nFirst 20 Emirps:");
        count = 0;
        num = 2;
        while (count < 20) {
            if (isEmirp(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    public static boolean isPalindromicPrime(int n) {
        return isPrime(n) && (n == reverseNumber(n));
    }

    public static boolean isEmirp(int n) {
        int reversed = reverseNumber(n);
        return isPrime(n) && isPrime(reversed) && !isPalindromicPrime(n);
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        return reversed;
    }
}
