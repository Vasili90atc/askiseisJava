// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DiavasmaNumber.java

package askiseis_me_mathimatika;

import java.io.PrintStream;
import java.util.Scanner;

public class DiavasmaNumber
{

    public DiavasmaNumber()
    {
    }

    public static void main(String args[])
    {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int x = number % 2;
        if(x == 0)
            System.out.println("The number is Even");
        else
            System.out.println("The number is Odd");
    }
}
