// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Client.java

package askiseis_me_for;

import askiseis_me_methodous.ThreadA;
import java.io.PrintStream;

public class Client
{

    public Client()
    {
    }

    public static void main(String args[])
    {
        ThreadA t = new ThreadA();
        t.start();
        try
        {
            for(int x = 1; x <= 10; x++)
            {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(500L);
            }

        }
        catch(InterruptedException e)
        {
            System.err.println("Main thread interrupted");
        }
    }
}
