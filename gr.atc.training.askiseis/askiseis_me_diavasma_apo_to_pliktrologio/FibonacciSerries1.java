// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FibonacciSerries1.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.PrintStream;
import java.util.Scanner;

public class FibonacciSerries1
{

    public FibonacciSerries1()
    {
    }

    public static void main(String args[])
    {
        int n1 = 0;
        int n2 = 1;
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter the number of terms in the sequence: ");
        int count = cs.nextInt();
        System.out.print((new StringBuilder(String.valueOf(n1))).append(" ").append(n2).toString());
        for(int i = 2; i < count; i++)
        {
            int n3 = n1 + n2;
            System.out.print((new StringBuilder(" ")).append(n3).toString());
            n1 = n2;
            n2 = n3;
        }

    }
}
