/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?");
        double euros = scan.nextDouble();
        System.out.println("What is the exchange rate?");
        double rate = scan.nextDouble();
        System.out.println(euros + " euros at an exchange rate of " + rate + " is");
        double dollars = euros*rate;
        System.out.println(dollars + " U.S. dollars.");
    }
}