// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Numbers.java

package askiseis_me_mathimatika;

import java.io.PrintStream;
import java.util.Scanner;

public class Numbers
{

    public Numbers()
    {
    }

    public static void main(String args[])
    {
        int c = 0;
        double p = 1.0D;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int count;
        for(count = Integer.parseInt(sc.nextLine()); c < count;)
        {
            System.out.println("Enter a real number: ");
            double x = Double.parseDouble(sc.nextLine());
            c++;
            p *= x;
        }

        double gm = Math.pow(p, 1.0D / (double)count);
        System.out.println((new StringBuilder("The geometric mean is: ")).append(gm).toString());
    }
}
