// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ByValue.java

package askiseis_me_diaforetiki_klasi;

import java.io.PrintStream;

public class ByValue
{

    public ByValue()
    {
    }

    public static void main(String args[])
    {
        int a = 2;
        System.out.println((new StringBuilder("Before calling foo: ")).append(a).toString());
        foo(a);
        System.out.println((new StringBuilder("After calling foo: ")).append(a).toString());
    }

    public static void foo(int x)
    {
        x = -8;
    }
}
