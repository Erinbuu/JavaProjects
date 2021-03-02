/**
 * This program prints "Hello, World!" the specified
 * number of times entered by the user. The program
 * illustrates the use of a loop in solving a counter-
 * control problem.
 * @author Duncan
 * @since 99/99/99
 */
 
import java.util.Scanner;

public class HelloPrinter
{
   public static void main(String[] args)
   {
      Scanner cin = new Scanner(System.in);
      System.out.print("Enter the number of time to print 'Hello, World!' -> ");
      int numTimes = cin.nextInt();
      int count = 1;
      while (count <= numTimes)
      {
         System.out.println("Hello, World!");
         count++;
      }
   }
}