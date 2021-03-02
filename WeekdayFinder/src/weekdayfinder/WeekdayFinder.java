/**
 *This program will determine the day of the week of a date also whether or not it occurs in a leap year
 * @Erin Phillips
 *@since 02/19/2017
 * Course: CSC 1350<br>
 * Section: 1
 * PAWS ID: ephil23
 * project #: 1 <br>
 * Instructor: Dr. Duncan <br>
 */
package weekdayfinder;

import java.io.*;
import java.util.*;

public class WeekdayFinder 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int month , day , year, leapyear;
        System.out.printf("Enter numeric values for month, day and year of a date> ");
        month = scan.nextInt();
        day = scan.nextInt();
        year = scan.nextInt();
        leapyear = 0; 
        String acceptordeny = new String("");
        if (year <= 1582 )
        {
            System.out.println("the date is invalid");
        }
        else if (month <=0 && month >= 13)
        {
            System.out.println("the date is invalid");
        }
        else if (day <=0 && day >=32)
        {
            System.out.println("the date is invalid");
        }
        else if (month ==4 || month == 6 || month == 9 || month == 11)
        {
            if(day <= 0 && day >= 32)
            {
                    System.out.println("the date is invalid");
            }
        }   
        if (leapyear == 1 && month == 2 && day > 29 )
        {
            System.out.println(month + "/" + day + "/" + year + " is not a valid date");
        }
            else if ( leapyear == 0 && month == 2 && day > 28 )
            {
                System.out.println(month + "/" + day + "/" + year + " is not a valid date");        
            }
        if ((year %4 ==0 && year % 100 !=0 ) || year % 400 ==0)
        { 
          leapyear = 1;
          acceptordeny = ("occured in a leap year.");
        }
          else
           {
               leapyear = 0;
               acceptordeny = ("does not occur in a leap year");
           }
        int mon = month - 2;
        if (mon <= 0 )
        {
            mon = month + 12;
        }
        int century = (year / 100);
        int secondTwoDigits = (year % 100);
        int answer = day + ((13 * mon - 1) / 5) + secondTwoDigits + (secondTwoDigits / 4 ) + (century / 4) - (2 * century);
        int stuff = answer % 7;
        String d = new String("");
        if (stuff == 0)
        {
            d += "Sunday";
        }
        if (stuff == 1)
        {
            d += "Monday";
        }
        if (stuff == 2)
        {
            d += "Tuesday";
        }
        if (stuff == 3)
        {
            d += "Wednesday";
        }
        if (stuff == 4)
        {
            d += "Thursday";
        }
        if (stuff == 5)
        {
            d += "Friday";
        }
        if (stuff == 6)
        {
            d += "Saturday";
        }
        System.out.println(d + ", " + month + "/" + day + "/" + year + " " + acceptordeny);
    }
}