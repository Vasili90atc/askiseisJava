// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Taxinomisi.java

package askiseis_me_methodous;

import java.io.PrintStream;
import java.util.Random;

public class Taxinomisi
{
    public class taxinomisi
    {

        public static void main(String args[])
        {
            int pin[] = new int[20];
            Random rand = new Random();
            for(int i = 0; i < pin.length; i++)
                pin[i] = rand.nextInt(100);

            soArray(pin);
            pin = sortNumbers(pin);
            soArray(pin);
        }

        public static void soArray(int input[])
        {
            for(int i = 0; i < input.length; i++)
                System.out.print((new StringBuilder(String.valueOf(input[i]))).append("  ").toString());

            System.out.println();
        }

        public static int[] sortNumbers(int input[])
        {
            int temp = 0;
            for(int i = 0; i < input.length - 1; i++)
            {
                for(int j = i + 1; j < input.length; j++)
                    if(input[i] > input[j])
                    {
                        temp = input[j];
                        input[j] = input[i];
                        input[i] = temp;
                    }

            }

            return input;
        }

        final Taxinomisi this$0;

        public taxinomisi()
        {
            this$0 = Taxinomisi.this;
            super();
        }
    }


    public Taxinomisi()
    {
    }
}
