// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   labelBreak1.java

package askiseis_me_break;

import java.io.PrintStream;

public class LabelBreak1
{

    public LabelBreak1()
    {
    }

    public static void main(String args[])
    {
        for(int i = 0; i < 10; i++)
        {
            if(i < 4)
            {
                System.out.println("Entered inner loop");
                break;
            }
            System.out.println("Outer loop");
        }

        System.out.println("outside loop");
    }
}
