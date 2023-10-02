// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Continue1.java

package askiseis_me_Continue;

import java.io.PrintStream;

public class Continue1
{

    public Continue1()
    {
    }

    public static void main(String args[])
    {
        for(int x = 1; x <= 10; x++)
            if(x != 5)
                System.out.print((new StringBuilder(String.valueOf(x))).append(" ").toString());

    }
}
