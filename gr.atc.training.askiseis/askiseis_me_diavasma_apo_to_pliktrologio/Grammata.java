// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Grammata.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.PrintStream;
import java.util.Scanner;

public class Grammata
{

    public Grammata()
    {
    }

    public void StringToLetters1(String gramma)
    {
        char cj[] = gramma.toCharArray();
        for(int i = 0; i < cj.length; i++)
            System.out.print((new StringBuilder(String.valueOf(cj[i]))).append("\n").toString());

    }

    public static void main(String args[])
    {
        try
        {
            Grammata cj = new Grammata();
            Scanner sc = new Scanner(System.in);
            String String = sc.next();
            System.out.println(String);
            cj.StringToLetters1(String);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
