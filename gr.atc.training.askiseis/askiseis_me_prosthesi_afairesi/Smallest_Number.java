// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Smallest_Number.java

package askiseis_me_prostesi_afairesi;

import java.io.PrintStream;
import java.util.Random;

public class Smallest_Number
{

    public Smallest_Number()
    {
    }

    public static void main(String args[])
    {
        int min = 1;
        int max = 100;
        int largest = 0;
        int smallest = 100;
        int numbers[] = new int[10];
        for(int i = 0; i < numbers.length; i++)
        {
            Random r = new Random();
            int randomNumber = min + r.nextInt(max);
            numbers[i] = randomNumber;
        }

        int ai[];
        int k = (ai = numbers).length;
        for(int j = 0; j < k; j++)
        {
            int i = ai[j];
            System.out.println(i);
            if(i > largest)
                largest = i;
            if(i < smallest)
                smallest = i;
        }

        System.out.println((new StringBuilder("The largest number is: ")).append(largest).toString());
        System.out.println((new StringBuilder("The smallest number is: ")).append(smallest).toString());
    }
}
