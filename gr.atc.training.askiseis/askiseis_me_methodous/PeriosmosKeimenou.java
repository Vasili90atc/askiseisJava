// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PeriosmosKeimenou.java

package askiseis_me_methodous;

import java.io.PrintStream;

public class PeriosmosKeimenou
{

    public PeriosmosKeimenou()
    {
    }

    public static void main(String args[])
    {
        String onoma = "asdfghjklpoiuytrewqzxcvbnmlkjhgfdsaqwertyuioplkjhgfdsazx";
        System.out.println(onoma);
        System.out.println(doJob(onoma));
    }

    public static String doJob(String str)
    {
        String value = null;
        if(str.length() <= 50)
        {
            return str;
        } else
        {
            value = str.substring(0, 46);
            value = (new StringBuilder(String.valueOf(value))).append("...").toString();
            return value;
        }
    }
}
