/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forcecalculator;

/**
 *
 * @author erinb
 */
public class ForceCalculator 
{


    public static void main(String[] args) 
    {
        final double GRAVITY = 6.67E-11;
        double student1Weight, student2Weight, distance;
        
        student1Weight = 70;
        student2Weight = 90;
        distance = 1.2;
        
        double force = (GRAVITY * student1Weight * student2Weight) / (distance * distance);
        
        System.out.println("The force of attraction between two students who");
        System.out.println("weigh 70 and 90 kg, respective, and 1.2m apart");
        System.out.println("is "+force+"N.");
        
       
    }
    
}
