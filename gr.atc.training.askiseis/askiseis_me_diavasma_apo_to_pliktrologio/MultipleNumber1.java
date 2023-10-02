// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MultipleNumber1.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.PrintStream;
import java.util.Scanner;

public class MultipleNumber1
{

    public MultipleNumber1()
    {
    }

    public static void main(String args[])
    {
        System.out.println("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        if(number % 5 == 0 && number % 7 == 0)
            System.out.println((new StringBuilder(String.valueOf(number))).append(" is a multiple of both 5 and 7").toString());
        else
            System.out.println((new StringBuilder(String.valueOf(number))).append(" is not a multiple of both 5 and 7").toString());
    }
}
