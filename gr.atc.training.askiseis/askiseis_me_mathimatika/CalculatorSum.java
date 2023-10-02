// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CalculatorSum.java

package askiseis_me_mathimatika;

import java.io.PrintStream;

public class CalculatorSum
{

    public CalculatorSum()
    {
    }

    public static void main(String args[])
    {
        System.out.println("Hello eclipse!");
        int sum = 0;
        sum = calculateSum(sum);
        System.out.println(sum);
    }

    private static int calculateSum(int sum)
    {
        for(int i = 0; i <= 100; i++)
            sum = i;

        return sum;
    }

    private static final String Hello = "Hello eclipse!";
}
