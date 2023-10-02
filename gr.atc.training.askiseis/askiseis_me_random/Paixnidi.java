// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Paixnidi.java

package Random;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Paixnidi
{

    public Paixnidi()
    {
    }

    public static void main(String args[])
    {
        Random rand = new Random();
        int x = rand.nextInt(20);
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Dwse arithmo");
            int num = sc.nextInt();
            if(num == x)
            {
                System.out.println("Kerdises");
                break;
            }
            if(x > num)
                System.out.println("O arithmos pou psaxneis einai megaluteros");
            else
                System.out.println("o arithmos pou psaxneis einai mikroteros");
        } while(true);
    }
}
