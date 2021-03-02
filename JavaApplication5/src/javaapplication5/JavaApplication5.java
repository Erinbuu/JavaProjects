#package hypotenusecalculator;

import java.util.Scanner;

/**
 * This program is a classroom demo program that calculates the length of
 * the hypotenuse of a right triangle and its perimeter given the lengths
 * of its legs. The program illustrates basic interactive programming in 
 * Java.<br>
 * CSC 1350<br>
 * @author Duncan
 * @since 99/99/9999
 * @version 1 
 */
 
public class HypotenuseCalculator 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the base and height of a right triangle -> ");
        double base = cin.nextDouble();
        double height = cin.nextDouble();
        System.out.println();
        double hypotenuse = Math.sqrt(Math.pow(base,2)+Math.pow(height,2));
        System.out.println("Hypotenuse = " + hypotenuse);
        System.out.println("Perimeter = " + (base + height + hypotenuse));        
    }    
}