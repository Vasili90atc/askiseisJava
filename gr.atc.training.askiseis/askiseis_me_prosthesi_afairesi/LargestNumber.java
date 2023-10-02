// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LargestNumber.java

package askiseis_me_prostesi_afairesi;

import java.io.PrintStream;

public class LargestNumber
{

    public LargestNumber()
    {
    }

    public static void main(String args[])
    {
        int numbers[] = {
            3, 8, 1, 7, 2, 9, 5, 4
        };
        int largest = numbers[0];
        int position = 0;
        for(int i = 0; i < numbers.length; i++)
            if(numbers[i] > largest)
            {
                largest = numbers[i];
                position = i;
            }

        System.out.println((new StringBuilder("The largest element is ")).append(largest).append(" which is found at position ").append(position).toString());
    }
}
