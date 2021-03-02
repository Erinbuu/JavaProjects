package outputdemo;

/**
 * This program is written to experiment with the use of the <br>
 * 'print' and 'println' methods, variables declaration, concatenation, <br>
 * diving two integers and diving doubles or mixed operands<br>.
 * CSC 1350 Lab #1 <br>
 * @author ephil23
 *@since 1/23/2017
 */
public class OutputDemo
{
    public static void main(String[] args) 
    {
        System.out.print("first name: ");
        System.out.println("John");
        System.out.println(" last name: Tyler");
        int first = 3, second = 8;
        System.out.println("first = " + first + ", second = "+second);
        double average = (first + second) / 2.0;
        System.out.println("Average = " + average);
        String firstName = "John";
        System.out.println("first name: " + firstName);
        String name = "John Tyler";
        System.out.println("name: " + name);
        double price = 3.5;
        int quantity = 15;
        double amount = price * quantity;
  
    }
}
