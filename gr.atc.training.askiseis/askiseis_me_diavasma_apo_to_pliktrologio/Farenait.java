// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Farenait.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.PrintStream;
import java.util.Scanner;

public class Farenait
{

    public Farenait()
    {
    }

    public static void main(String args[])
    {
        System.out.println("Enter temperature in Centigrade: ");
        Scanner sc = new Scanner(System.in);
        int c = Integer.parseInt(sc.nextLine());
        float f = (9 * c) / 5 + 32;
        System.out.println((new StringBuilder("Temperature in Fahrenheit is: ")).append(f).toString());
    }
}
