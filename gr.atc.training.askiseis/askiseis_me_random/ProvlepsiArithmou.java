// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProvlepsiArithmou.java

package Random;

import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class ProvlepsiArithmou
{

    public ProvlepsiArithmou()
    {
    }

    public static void main(String args[])
        throws IOException
    {
        int numbersugkrisis;
        int arithmos = 0;
        Random rand = new Random();
        numbersugkrisis = rand.nextInt(100);
_L2:
        Scanner sc;
        System.out.println("Dwse arithmo");
        sc = new Scanner(System.in);
        int arithmos = sc.nextInt();
        if(arithmos == numbersugkrisis)
        {
            System.out.println("To vrikes mpravo ");
            break; /* Loop/switch isn't completed */
        }
        try
        {
            if(arithmos > numbersugkrisis)
                System.out.println("O arithmos einai megaluteros, prospathise xana ");
            else
                System.out.println("O arithmos einai mikroteros, prospathise xana ");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Den einai arithmos, prospathise xana ");
        }
        if(true) goto _L2; else goto _L1
_L1:
    }
}
