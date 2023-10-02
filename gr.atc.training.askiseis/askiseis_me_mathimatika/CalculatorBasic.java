// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CalculatorBasic.java

package askiseis_me_mathimatika;

import java.io.PrintStream;
import java.util.Scanner;

public class CalculatorBasic
{

    public CalculatorBasic()
    {
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = s.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = s.nextInt();
        do
        {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 to Exit");
            int option = s.nextInt();
            switch(option)
            {
            case 1: // '\001'
                int add = firstNumber + secondNumber;
                System.out.println((new StringBuilder("Result:")).append(add).toString());
                break;

            case 2: // '\002'
                int sub = firstNumber - secondNumber;
                System.out.println((new StringBuilder("Result:")).append(sub).toString());
                break;

            case 3: // '\003'
                int mul = firstNumber * secondNumber;
                System.out.println((new StringBuilder("Result:")).append(mul).toString());
                break;

            case 4: // '\004'
                double div = (double)firstNumber / (double)secondNumber;
                System.out.println((new StringBuilder("Result:")).append(div).toString());
                break;

            case 5: // '\005'
                System.exit(0);
                break;
            }
        } while(true);
    }
}
