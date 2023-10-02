// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Client2.java

package askiseis_me_for;

import askiseis_me_methodous.ThreadB;
import java.io.PrintStream;

public class Client2
{

    public Client2()
    {
    }

    public static void main(String args[])
    {
        ThreadB thread = new ThreadB();
        Thread t = new Thread("ThreadB");
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
