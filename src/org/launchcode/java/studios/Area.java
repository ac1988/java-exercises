package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the radius:");
        double r = s.nextDouble();

        /*Validating program for a negative number using conditional syntax*/
        if (r < 0){
            System.out.println("This is an invalid number");
        } else {
            double area = (3.14 * r * r);
            System.out.println("The area of the circle is " + area);
        }
    }
}