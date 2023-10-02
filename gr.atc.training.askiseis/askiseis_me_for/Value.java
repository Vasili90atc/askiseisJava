// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Value.java

package askiseis_me_for;

import java.io.PrintStream;

public class Value
{

    public Value()
    {
    }

    public static void main(String args[])
    {
        int numbers[] = new int[10];
        int value = 9;
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = value;
            value--;
        }

        int ai[];
        int k = (ai = numbers).length;
        for(int j = 0; j < k; j++)
        {
            int i = ai[j];
            System.out.println(i);
        }

    }
}
