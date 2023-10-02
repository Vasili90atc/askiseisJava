// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FactorialOfNumber.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.PrintStream;
import java.util.Scanner;

public class FactorialOfNumber
{

    public FactorialOfNumber()
    {
    }

    public static void main(String args[])
    {
        System.out.println("Enter an integer:  ");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int result = fact(a);
        System.out.println((new StringBuilder("The factorial of")).append(a).append(" is: ").append(result).toString());
    }

    public static int fact(int n)
    {
        int f;
        if(n == 1)
            f = 1;
        else
            f = n * fact(n - 1);
        return f;
    }
}
