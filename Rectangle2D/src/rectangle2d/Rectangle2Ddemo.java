package rectangle2d;

/**
 * Explain the purpose of this project
 *CSC 1350 Project # 4
 * @author Erin Phillips
 * @since 04/17/2017
 */
import java.util.Scanner;
import java.util.*;
public class Rectangle2Ddemo 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter the x- and y-coordinates of the top-left corner -> ");
        Rectangle2D rec1 = new Rectangle2D();
        rec1.xlocation = scan.nextDouble();
        rec1.ylocation = scan.nextDouble();
        rec1.width = scan.nextDouble();
        rec1.height = scan.nextDouble();
        
        Rectangle2D rec2 = new Rectangle2D();
        rec2.xlocation = rec1.xlocation - 15;
        rec2.ylocation = rec1.ylocation - 15;
        rec2.width = rec1. width + 30;
        rec2.height = rec1. height + 30;
        System.out.println(" After creating the two rectangles: ");
        System.out.printf("Big rectangle: [ x = %.2f; y = %.2f; w = %.2f; h = %.2f]%n",rec2.xlocation,rec2.ylocation,rec2.width,rec2.height);
        System.out.printf("Small rectangle: [ x = %.2f; y = %.2f; w = %.2f; h = %.2f]%n",rec1.xlocation,rec1.ylocation,rec1.width, rec1.height);
        System.out.println("The perimeter of the big rectangle is " + (2*(rec2.width+rec2.height)));
        System.out.println("The perimeter of the small rectangle is " + (2*(rec1.width+rec1.height)));
        System.out.println("The area of the shaded region is " + ((rec2.width*rec2.height) - (rec1.width*rec1.height)));
        
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("After moving the small rectangle: ");
        rec1.xlocation-=15;
        rec1.ylocation-=15;
        System.out.printf("Big rectangle: [x = %.2f; y = %.2f; w = %.2f; h = %.2f]%n",rec2.xlocation,rec2.ylocation,rec2.width,rec2.height);
        System.out.printf("Small rectangle: [x = %.2f; y = %.2f; w =%.2f; h = %.2f]%n",rec1.xlocation,rec1.ylocation,rec1.width,rec1.height);
        System.out.println("The perimeter of the big rectangle is " + 2*(rec2.width+rec2.height));
        System.out.println("The perimeter of the small rectangle is " + 2*(rec1.width+rec1.height));
        System.out.println("The area of the big rectangle is " + (rec2.width*rec2.height));
        System.out.println("The area of the small rectangle is " + (rec1.width*rec1.height));
        
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("After resizing the big rectangle: ");
        rec2.width*=2;
        rec2.height/=2;
        System.out.printf("Big rectangle: [x = %.2f; y = %.2f; w = %.2f; h = %.2f]%n", rec2.xlocation,rec2.ylocation,rec2.width,rec2.height);
        System.out.printf("Small rectcangle: [x = %.2f; y = %.2f; w = %.2f; h = %.2f]%n", rec1.xlocation,rec1.ylocation,rec1.width,rec1.height);
        System.out.println("The perimeter of the big rectangle is " + 2*(rec2.width+rec2.height));
        System.out.println("The perimeter of the small rectangle is " + 2*(rec1.width+rec1.height));
        System.out.println("The area of the big rectangle is " + (rec2.width*rec2.height));
        System.out.println("The area of the small rectangle is " + (rec1.width*rec1.height));
        System.out.println("Big rectangle contains (32.0,32.0)"+ rec2.contains(32,32));
        System.out.println("Small rectangle contains (32.0,32.0)" + rec1.contains(32,32));
        
                
             
    }
    
}
