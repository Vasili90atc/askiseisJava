// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Arxeio.java

package diavasma_apo_arxeio;

import java.io.*;
import java.util.Scanner;

public class Arxeio
{

    public Arxeio()
    {
    }

    public void input(String Filename)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Dose to onoma tou arxeiou ");
        String filename = input.next();
        input.close();
        File file = new File(filename);
        try
        {
            input = new Scanner(file);
            int count = 0;
            while(input.hasNext()) ;
        }
        catch(IOException e)
        {
            String sc = null;
            System.out.println(sc);
        }
    }

    private int getWordCount(Object line2)
    {
        return 0;
    }

    public static int main(String args[])
    {
        return 0;
    }

    private static Object line;
}
