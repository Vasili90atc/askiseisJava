// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Anagrammatismos.java

package askiseis_me_boolean;

import java.io.PrintStream;

public class Anagrammatismos
{

    public Anagrammatismos()
    {
    }

    public static void main(String args[])
    {
        String onoma = "asdfg ";
        System.out.println(onoma);
        for(int i = onoma.length() - 1; i >= 0; i--)
            System.out.print(onoma.charAt(i));

        System.out.println("\n");
        System.out.println(checkAnagr("asdfg ", "gfdsa "));
    }

    public static boolean checkAnagr(String a, String b)
    {
        if(a.length() != b.length())
            return false;
        for(int i = 0; i < a.length(); i++)
            if(a.charAt(i) != b.charAt(b.length() - 1 - i))
                return false;

        return true;
    }
}
