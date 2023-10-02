// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NumberFloat.java

package askiseis_me_mathimatika;

import java.io.PrintStream;
import java.util.Scanner;

public class NumberFloat
{

    public NumberFloat()
    {
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of real numbers: ");
        int count = Integer.parseInt(sc.nextLine());
        int i = 0;
        float product = 1.0F;
        for(i = 0; i < count; i++)
        {
            System.out.println("Enter a real number: ");
            float x = Float.parseFloat(sc.nextLine());
            product *= x;
        }

        System.out.println((new StringBuilder("The product of the numbers is: ")).append(product).toString());
    }
}
