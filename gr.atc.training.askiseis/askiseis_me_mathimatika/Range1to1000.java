// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Range1to1000.java

package askiseis_me_mathimatika;

import java.io.FileWriter;
import java.io.PrintStream;

public class Range1to1000
{

    public Range1to1000()
    {
    }

    public static void main(String args[])
        throws Exception
    {
        FileWriter file = new FileWriter("numbers.txt");
        for(int i = 0; i < 1000; i++)
            if(i % 3 == 0 && i % 5 != 0)
            {
                System.out.println(i);
                file.write(i);
            }

        file.close();
    }
}
