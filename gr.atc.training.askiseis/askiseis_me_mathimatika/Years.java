// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Years.java

package askiseis_me_mathimatika;

import java.io.PrintStream;
import java.util.Scanner;

public class Years
{

    public Years()
    {
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year you want to check: ");
        int year = Integer.parseInt(sc.nextLine());
        boolean leap = false;
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
            {
                leap = true;
            }
        } else
        {
            leap = false;
        }
        if(leap)
            System.out.println((new StringBuilder(String.valueOf(year))).append(" is a leap year.").toString());
        else
            System.out.println((new StringBuilder(String.valueOf(year))).append(" is not a leap year.").toString());
    }
}
