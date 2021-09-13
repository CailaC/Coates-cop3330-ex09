package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;
import java.lang.Math;

public class App
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);

        System.out.println( "Length of ceiling?" );
        int length = input.nextInt();

        System.out.println( "Width of ceiling?" );
        int width = input.nextInt();

        int s2 = length*width;
        //amount one gallon of paint covers
        double gCoverage = 350.0;
        //pNeeded = paint needed
        double pNeeded = ((int) Math.ceil(s2/gCoverage));

        System.out.println("You will need " + pNeeded + " gallons of paint to cover " + s2 + " square feet.");



    }
}
