// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FibonacciSerries.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.PrintStream;
import java.util.Scanner;

public class FibonacciSerries
{

    public FibonacciSerries()
    {
    }

    public static void main(String args[])
    {
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter the position(N): ");
        int n = cs.nextInt();
        System.out.print((new StringBuilder("Nth Fibonacci Number is: ")).append(NthFibonacciNumber(n)).toString());
    }

    static int NthFibonacciNumber(int n)
    {
        if(n == 1)
            return 0;
        if(n == 2)
            return 1;
        else
            return NthFibonacciNumber(n - 1) + NthFibonacciNumber(n - 2);
    }
}
