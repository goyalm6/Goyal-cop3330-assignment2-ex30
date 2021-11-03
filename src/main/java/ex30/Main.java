/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 30
 *  Copyright 2021 Mayank Goyal
 */

package ex30;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        for(int n1 = 1;n1 <= 12;n1++)
        {
            for(int n2 = 1;n2 <= 12;n2++)
            {

                System.out.print((n1*n2)+"\t");

            }
            System.out.println();
        }
    }
}
