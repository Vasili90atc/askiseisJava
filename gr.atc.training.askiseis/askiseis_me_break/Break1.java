// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Break1.java

package askiseis_me_break;

import java.io.PrintStream;

public class Break1
{

    public Break1()
    {
    }

    public static void main(String args[])
    {
        for(int x = 1; x <= 10; x++)
        {
            if(x == 5)
                break;
            System.out.print((new StringBuilder(String.valueOf(x))).append(" ").toString());
        }

    }
}
