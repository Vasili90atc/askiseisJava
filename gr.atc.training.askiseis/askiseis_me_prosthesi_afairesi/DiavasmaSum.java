// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DiavasmaSum.java

package askiseis_me_prostesi_afairesi;

import java.io.PrintStream;
import java.util.Scanner;

public class DiavasmaSum
{

    public DiavasmaSum()
    {
    }

    public static void main(String args[])
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        for(int number = Integer.parseInt(sc.nextLine()); number != 0; number /= 10)
        {
            int digit = number % 10;
            sum += digit;
        }

        System.out.println((new StringBuilder("Sum of digits is: ")).append(sum).toString());
    }
}
