// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PosthesiTouX.java

package askiseis_me_prostesi_afairesi;

import java.io.PrintStream;
import java.util.Scanner;

public class PosthesiTouX
{

    public PosthesiTouX()
    {
    }

    public static void main(String args[])
    {
        System.out.println("How many numbers: ");
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int numbers[] = new int[num];
        int sum = 0;
        for(int n = 0; n < num; n++)
        {
            System.out.println("Enter number: ");
            int x = Integer.parseInt(sc.nextLine());
            numbers[n] = x;
        }

        for(int i = 0; i < numbers.length; i++)
            sum += numbers[i];

        System.out.println((new StringBuilder("Sum of all the elements of the array: ")).append(sum).toString());
    }
}
