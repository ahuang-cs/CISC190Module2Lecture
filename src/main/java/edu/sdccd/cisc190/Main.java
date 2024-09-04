package edu.sdccd.cisc190;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a double value: ");
        Scanner input = new Scanner(System.in);
        double d = input.nextDouble();

        System.out.println("You've entered " + d);

        System.out.println(ComputeArea.PI);

        System.out.println("The current time in milliseconds is: " + System.currentTimeMillis());

        //Math.sqrt(4);

        // int x = 1234567891011121314;

        float tempF = 59;
        System.out.println("The temperature in C is: " + ((5f/9)*(tempF - 32)));

        int i = 10;
        int newNumPost = i++;   // i == 11 afterwards
        int newNumPre = ++i;
        System.out.println("Post: " + newNumPost);
        System.out.println("Pre: " + newNumPre);
    }
}
