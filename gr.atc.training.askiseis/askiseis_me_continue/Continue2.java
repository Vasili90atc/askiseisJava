// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Continue2.java

package askiseis_me_Continue;

import java.io.PrintStream;

public class Continue2
{

    public Continue2()
    {
    }

    public static void main(String args[])
    {
label0:
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.println("Entered inner loop");
                if(j < 5)
                    continue label0;
            }

            System.out.println("Outer loop");
        }

        System.out.println("outside loop");
    }
}
