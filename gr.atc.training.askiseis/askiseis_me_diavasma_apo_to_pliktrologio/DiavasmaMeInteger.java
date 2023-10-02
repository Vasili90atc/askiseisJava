// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DiavasmaMeInteger.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.PrintStream;
import java.util.Scanner;

public class DiavasmaMeInteger
{

    public DiavasmaMeInteger()
    {
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = Integer.parseInt(sc.nextLine());
        int rev = 0;
        for(; number != 0; number /= 10)
        {
            int digit = number % 10;
            rev = rev * 10 + digit;
        }

        System.out.println(rev);
    }
}
