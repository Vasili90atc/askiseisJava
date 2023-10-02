// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProstesiSum.java

package askiseis_me_prostesi_afairesi;

import java.io.PrintStream;

public class ProstesiSum
{

    public ProstesiSum()
    {
    }

    public static void main(String args[])
    {
        int x = 5;
        int y = 10;
        System.out.println((new StringBuilder("sum=")).append(x + y).toString());
        System.out.println((new StringBuilder("product=")).append(x * y).toString());
        System.out.println((new StringBuilder("difference=")).append(x - y).toString());
    }
}
