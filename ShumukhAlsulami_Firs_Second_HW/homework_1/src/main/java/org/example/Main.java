/*
*                               SDAIA BOOT CAMP
*                               SHUMUKH ALSULAMI
*                                  28/5/2024
*                                  HOMEWORK 1
*
* QESTION: Write a Java program that prints the numbers from 1 to 100.
* For multiples of 3,print "Fizz" instead of the number,
* for multiples of 5,print "Buzz".
* For numbers which are multiples of both 3 and 5, print "FizzBuzz".
*  Additionally, for multiples of 7, print "Jazz".
* */


package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        // hear I create for loo to count number from 1 to 100
        for (int x = 1; x <=100;  x++) {
            // First condition
            if (x % 3 == 0 && x % 5 == 0 ) {
                System.out.println("FizzBuzz");
            }
            // Second condition
            else if (x % 5 == 0) {
                System.out.println("Buzz");
            }
            // Third condition
           else  if (x % 3 == 0) {
                System.out.println("Fizz");
            }
            // Fourth condition
            else if (x % 7 == 0) {
                System.out.println("Jazz");
            }
            // printing the numbers 
            else System.out.println(x);

        }

    }
}