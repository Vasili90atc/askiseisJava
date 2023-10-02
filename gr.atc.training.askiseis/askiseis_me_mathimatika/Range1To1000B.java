// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Range1To1000B.java

package askiseis_me_mathimatika;

import java.io.*;

public class Range1To1000B
{

    public Range1To1000B()
    {
    }

    public static void main(String args[])
        throws Exception
    {
        Object number = Integer.valueOf(0);
        FileWriter file = new FileWriter("numbers.txt");
        for(int i = 0; i < 1000; i++)
        {
            if(i % 3 == 0 && i % 5 != 0)
                System.out.println(i);
            System.exit(0);
        }

        printWriter.close();
    }

    private static Closeable printWriter;
}
