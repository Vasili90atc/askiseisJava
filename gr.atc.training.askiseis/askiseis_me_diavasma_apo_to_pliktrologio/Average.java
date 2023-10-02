// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Average.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.PrintStream;
import java.util.Scanner;

public class Average
{

    public Average()
    {
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of numbers: ");
        int count = Integer.parseInt(sc.nextLine());
        int i = 0;
        float sum = 0.0F;
        for(i = 0; i < count; i++)
        {
            System.out.println("Enter an integer: ");
            int x = Integer.parseInt(sc.nextLine());
            sum += x;
        }

        float avg = sum / (float)count;
        System.out.println((new StringBuilder("The average is: ")).append(avg).toString());
    }
}
