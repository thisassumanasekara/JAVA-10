package com.mycompany.lab10;
import java.util.Scanner;
public class Lab10 
{

    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();
        
        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();
        
        try
        {
            int result =(numerator/denominator);
            System.out.println("Result: "+result);
        }
        catch (ArithmeticException e)
                {
                    System.out.println("Error: Division by zero is not allowed!");
                }
    }
}
