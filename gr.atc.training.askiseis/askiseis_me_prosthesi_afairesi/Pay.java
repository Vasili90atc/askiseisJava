// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Pay.java

package askiseis_me_prostesi_afairesi;

import java.io.PrintStream;

public class Pay
{

    public Pay()
    {
    }

    public static void main(String args[])
    {
        int salary = 2500;
        int bonus = 1200;
        int pay = salary + bonus;
        System.out.println((new StringBuilder("Your pay is ")).append(pay).toString());
    }
}
