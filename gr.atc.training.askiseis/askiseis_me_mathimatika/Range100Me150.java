// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Range100Me150.java

package askiseis_me_mathimatika;

import java.io.PrintStream;

public class Range100Me150
{

    public Range100Me150()
    {
    }

    public static void main(String args[])
    {
        for(int i = 100; i < 150; i++)
        {
            int num = i;
            int sum = 0;
            for(; num != 0; num /= 10)
            {
                int digit = num % 10;
                sum += digit;
            }

            if(sum % 2 == 0)
                System.out.println(i);
        }

    }
}
