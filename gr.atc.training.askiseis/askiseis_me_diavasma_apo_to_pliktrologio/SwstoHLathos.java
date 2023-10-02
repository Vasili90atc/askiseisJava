// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SwstoHLathos.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import askiseis_me_methodous.Counter;
import java.io.PrintStream;

public class SwstoHLathos
{

    public SwstoHLathos()
    {
    }

    public static void main(String args[])
    {
        Counter counter = new Counter();
        int result = counter.count(5);
        if(result == 15)
            System.out.println("Correct");
        else
            System.out.println("False");
        try
        {
            counter.count(256);
        }
        catch(RuntimeException e)
        {
            System.out.println("Works as exepected");
        }
    }
}
