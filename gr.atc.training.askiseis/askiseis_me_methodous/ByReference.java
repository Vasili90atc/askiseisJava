// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ByReference.java

package askiseis_me_methodous;

import java.io.PrintStream;

public class ByReference
{

    public ByReference()
    {
    }

    public static void main(String args[])
    {
        int array[] = {
            1, 2, 3, 4, 5
        };
        System.out.print("Before calling boo: ");
        int ai[];
        int k = (ai = array).length;
        for(int i = 0; i < k; i++)
        {
            int element = ai[i];
            System.out.print((new StringBuilder(String.valueOf(element))).append(" ").toString());
        }

        System.out.print("\n");
        boo(array);
        System.out.print("After calling boo: ");
        k = (ai = array).length;
        for(int j = 0; j < k; j++)
        {
            int element = ai[j];
            System.out.print((new StringBuilder(String.valueOf(element))).append(" ").toString());
        }

        System.out.print("\n");
    }

    public static void boo(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
            arr[i] = 2 * i + 2;

    }
}
