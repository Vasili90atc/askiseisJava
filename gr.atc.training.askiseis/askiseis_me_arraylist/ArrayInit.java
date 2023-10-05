// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ArrayInit.java

package askiseis_me_arraylist;

import java.io.PrintStream;
import java.util.ArrayList;

public class ArrayInit
{

    public ArrayInit()
    {
    }

    public static void main(String args[])
    {
        int array1[] = {
            3, -5, 0, 8
        };
        int array[]=new int[];
       ArrayList<Integer> array2=new ArrayList<Integer>();
       ArrayList<Integer> array3=new ArrayList<Integer>();

       array2.addAll(array3);
        System.out.println("array1:");
        for(int i = 0; i < array1.length; i++)
            System.out.print((new StringBuilder(String.valueOf(array1[i]))).append(" ").toString());

        System.out.print("\n");
        int array2[] = new int[5];
        System.out.println("array2 after construction:");
        for(int i = 0; i < array2.length; i++)
            System.out.print((new StringBuilder(String.valueOf(array2[i]))).append(" ").toString());

        System.out.print("\n");
        for(int i = 0; i < array2.length; i++)
            array2[i] = i * 2;

    }
}
