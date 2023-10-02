// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EvenNumber.java

package askiseis_me_prostesi_afairesi;

import java.io.PrintStream;

public class EvenNumber
{

    public EvenNumber()
    {
    }

    public static void main(String args[])
    {
        int sum = 0;
        for(int i = 1; i <= 100; i++)
            if(i % 2 == 0)
                sum += i;

        System.out.println((new StringBuilder("The sum of even numbers from 1-100 is: ")).append(sum).toString());
    }
}
