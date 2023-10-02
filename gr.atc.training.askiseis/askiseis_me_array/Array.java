// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Array.java

package askiseis_me_array;

import java.io.PrintStream;

public class Array
{

    public Array()
    {
    }

    public static void main(String args[])
    {
        int array[] = new int[5];
        for(int i = 0; i < array.length; i++)
            array[i] = i + 1;

        int ai[];
        int k = (ai = array).length;
        for(int j = 0; j < k; j++)
        {
            int element = ai[j];
            System.out.print((new StringBuilder(String.valueOf(element))).append(" ").toString());
        }

    }
}
