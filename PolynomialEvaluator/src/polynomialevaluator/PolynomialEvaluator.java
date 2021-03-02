/**
* Polynomial Evaluator
* CSC 1350 Project # 3
* @author Erin Phillips
* @since 03/26/2017
*/
package polynomialevaluator;
import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
public class PolynomialEvaluator
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the degree of the polynomial (deg p) -> ");
        int degree = in.nextInt();
        double[] co= new double[degree + 1];
        System.out.print("Enter the coeffecients of p(x) in descending powers -> ");     
            for (int i = 0;i < co.length ;i++)// fills values of co.length
            {
                co[i] = in.nextInt();
            }
            System.out.print("Enter x to compute p(x) -> ");
            int x = in.nextInt();
            System.out.print("Enter the output file name -> ");
            File file = new File(in.next());
            PrintWriter fileOut = new PrintWriter(file);
            System.out.print("p(x) = " + polyToString(co)  + "\np(" + x + ") = " + hornerEval(co,x) + "\n");
            fileOut.print("p(x) = " + polyToString(co)  + "\np(" + x + ") = " + hornerEval(co,x) + "\n");
            fileOut.close();
    }
    public static double hornerEval(double[] coeffs, double x)
    {
        double solution = 0;
        for (int i = 0;i< coeffs.length -1; i++)
        {
            solution += coeffs[i];
            solution = solution * x;
        }
        solution += coeffs[coeffs.length - 1];
        return solution;
    }
    public static String polyToString(double[] coeffs)
    {
        String function = "";
        function += coeffs[0] + "x^" + (coeffs.length-1);           
        if (coeffs.length > 1)
        {
            for (int i = 1 ;i < coeffs.length - 2;i++)
            {
                if (coeffs[i] == 0){}
                   
                else if (coeffs[i] == 1 && i == (coeffs.length - 1))
                    function += " + x^" + (coeffs.length - (i + 1));
                else if (coeffs[i] > 1)
                    function += " + " + coeffs[i] + "x^" + (coeffs.length - (i + 1));
                    else
                        function += " - " + (coeffs[i] * -1) + "x^" + (coeffs.length - (i+ 1));
            }
            if (coeffs[coeffs.length - 1] > 1)
                function += " + " + coeffs[coeffs.length - 2] + "x" ;
                else
                    function += " - " + (coeffs[coeffs.length - 2] * -1) + "x";
            if (coeffs[coeffs.length - 1] > 1)
                function += " + " + coeffs[coeffs.length - 1 ];
                else
                    function += " - " + (coeffs[coeffs.length - 1 ] * -1);
         }
        return function;
    }
}
 
