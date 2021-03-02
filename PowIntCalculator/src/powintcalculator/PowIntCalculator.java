package powintcalculator;

/**
 *Describe what your program does
 * @author Erin Phillips
 * @since 03/04/2017
 * Course: CS 1350 <br>
 * Section: 1
 * PAWS ID: 892451186
 * Project: #2 <br>
 * Instructor: Dr. Duncan <br>
 */
import java.util.Scanner;

public class PowIntCalculator 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the base and exponent, an integer, of a power ->");
        int n, even;
        double b;
        b = scan.nextDouble();
        n = scan.nextInt();
         double k = 1/b;
         double result = b;
         String constant = "NaN";
        
        //Decision statements 
        if (b == 0 )
        {   
          if (n <= 0)
          {
              System.out.printf("%f^ %d = %s \n", b ,n,constant);
          }
          else if (n > 0)
          {
              System.out.printf("%f^ %d = 0 \n",b,n);
          }
        }
        
        
        else if (b == 1)
         {
          System.out.printf("%f^ %d = 1 \n",b,n);
         }
        
        
        else if (b ==- 1)
        {
           if (n%2 == 0)
            {
              System.out.printf("%f^ %d = 1 \n",b,n );
            }
            else 
            {
               System.out.printf("%f^ %d = -1 \n ",b,n);
            }
        }
        
        else 
        {
           if (n == 0)
            {
            System.out.printf("%f^ %d = 1 \n", b,n);
            }
           else if (n == 1)
           {
               System.out.printf("%f^ %d = %f \n", b,n, result);
           }
           else if (n == -1)
           {
               System.out.printf( "%f^ %d = %f \n", b,n,k);
           }
           else if (n > 1)
           {
           for (int i =1; i<n; i++)
           {
           result *= b ;
           }
           System.out.printf("%f ^%d = %f\n",b,n,result);
           }
            else  if (n <- 1)
            {
                  for (int i =-1; i>n; i--)
                    {
                    result *= b ;
                    }
                    System.out.printf("%f ^%d = %f\n",b,n,(1/result));     
            }
        }
    }   
}
 
     

     
