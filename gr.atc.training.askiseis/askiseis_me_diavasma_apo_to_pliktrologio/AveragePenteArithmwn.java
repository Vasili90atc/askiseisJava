// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AveragePenteArithmwn.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.PrintStream;
import java.util.Scanner;

public class AveragePenteArithmwn
{

    public AveragePenteArithmwn()
    {
    }

    public static void main(String args[])
    {
        int count = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(; count < 5; count++)
        {
            System.out.println("Enter an integer: ");
            int number = Integer.parseInt(sc.nextLine());
            sum += number;
        }

        double avg = (double)sum / 5D;
        System.out.println((new StringBuilder("Average is :")).append(avg).toString());
    }
}
