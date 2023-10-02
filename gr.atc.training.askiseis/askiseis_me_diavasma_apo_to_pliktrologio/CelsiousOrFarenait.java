// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CelsiousOrFarenait.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.PrintStream;
import java.util.Scanner;

public class CelsiousOrFarenait
{

    public CelsiousOrFarenait()
    {
    }

    public static void main(String args[])
    {
        double faren = 0.0D;
        Scanner input = new Scanner(System.in);
        faren = input.nextDouble();
        if(faren < 0.0D)
        {
            System.out.println("Den einai sosto");
        } else
        {
            double cels = (5D * (faren - 32D)) / 9D;
            System.out.println((new StringBuilder(String.valueOf(faren))).append(" ").append(cels).toString());
        }
    }
}
