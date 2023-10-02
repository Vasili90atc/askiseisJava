// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NumbersApo1MexriN.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.PrintStream;
import java.util.Scanner;

public class NumbersApo1MexriN
{

    public NumbersApo1MexriN()
    {
    }

    public static void main(String args[])
    {
        System.out.println("Enter the range: ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        for(int num = 2; num <= number; num++)
        {
            boolean isPrime = true;
            for(int i = 2; i <= num / 2; i++)
            {
                if(num % i != 0)
                    continue;
                isPrime = false;
                break;
            }

            if(isPrime)
                System.out.println(num);
        }

    }
}
