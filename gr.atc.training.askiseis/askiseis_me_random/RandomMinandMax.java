// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RandomMinandMax.java

package Random;

import java.io.PrintStream;
import java.util.Random;

public class RandomMinandMax
{

    public RandomMinandMax()
    {
    }

    public static void main(String args[])
    {
        int min = 1;
        int max = 100;
        int largest = 0;
        int smallest = 100;
        for(int i = 1; i <= 10; i++)
        {
            Random r = new Random();
            int randomNumber = min + r.nextInt(max);
            System.out.println((new StringBuilder("Generated random number is: ")).append(randomNumber).toString());
            if(randomNumber > largest)
                largest = randomNumber;
            if(randomNumber < smallest)
                smallest = randomNumber;
        }

        System.out.println("\n");
        System.out.println((new StringBuilder("The smallest number is: ")).append(smallest).toString());
        System.out.println((new StringBuilder("The largest number is: ")).append(largest).toString());
    }
}
