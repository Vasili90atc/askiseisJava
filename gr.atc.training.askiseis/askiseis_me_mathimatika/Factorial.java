// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Factorial.java

package askiseis_me_mathimatika;

import java.io.PrintStream;

public class Factorial
{

    public Factorial()
    {
    }

    public static void CheckEvenOdd()
    {
        int num = 10;
        int _tmp = num % 2;
    }

    static int facto(int n)
    {
        if(n == 0)
            return 1;
        else
            return n * facto(n - 1);
    }

    public static void Factorial()
    {
    }

    public static void main(String args[])
    {
        System.out.println(Math.max(5, 19));
        System.out.println(Math.min(5, 19));
        System.out.println(Math.abs(-4));
        System.out.print(Math.random());
    }
}
