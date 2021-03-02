/**
 * This program classifies a solution based on its pH value or
 * indicates that the pH value is invalid; this is a classroom
 * demo program that illustrate the use of an if..else if...if
 * statement in a program to handle multiple alternatives.
 * Section 3.3.<br>
 * pH >= 0 and < 7 is acidic<br>
 * pH > 7 and <= 14 alkaline (basic)<br>
 * pH = 7 is neutral<br>
 * course: CSC 1350
 * @author Erin
 * @since 99/99/9999
 * @version 2 with comparisons counter
 */
 
package phclassifier;

import java.util.Scanner;
 
public class PHClassifier 
{
    public static void main(String[] args) 
    {
       Scanner keyBd = new Scanner(System.in);
       System.out.print("Enter the pH value of the solution in the range [0-14] -> ");
       double pHValue = keyBd.nextDouble();
       System.out.printf("The solution whose pH value is %.3f is ",pHValue);
       int numComparisons = 1;
       if (pHValue < 7)
           System.out.println("acidic.");
       else
       {  
          numComparisons++;	   
          if (pHValue == 7)
             System.out.println("neutral.");
          
          else
             System.out.println("alkaline.");
   
       }
       System.out.printf("There were/was %d comparison(s) used.%n",numComparisons);
    }	   
}
