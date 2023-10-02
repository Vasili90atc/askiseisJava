// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AskiseisMeNumber.java

package askiseis_me_prostesi_afairesi;

import java.io.PrintStream;

public class AskiseisMeNumber
{

    public AskiseisMeNumber()
    {
    }

    public static void main(String args[])
    {
        int numbers[] = {
            8, 3, 1, 6, 2, 4, 5, 9
        };
        int count = 0;
        for(int i = 0; i < numbers.length; i++)
            if(numbers[i] % 2 != 0)
                count++;

        System.out.println((new StringBuilder("The number of odd numbers in the list are: ")).append(count).toString());
    }
}
