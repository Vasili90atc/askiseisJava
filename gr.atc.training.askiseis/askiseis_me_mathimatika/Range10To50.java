// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Range10To50.java

package askiseis_me_mathimatika;

import java.io.PrintStream;

public class Range10To50
{

    public Range10To50()
    {
    }

    public static void main(String args[])
    {
        for(int i = 10; i < 50; i++)
            if(i % 3 == 0)
                System.out.println(i);

    }
}
