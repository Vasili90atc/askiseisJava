// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ThreadB.java

package askiseis_me_methodous;

import java.io.PrintStream;

public class ThreadB
    implements Runnable
{

    public ThreadB()
    {
    }

    public synchronized void doSomething()
    {
    }

    public void run()
    {
        try
        {
            for(int x = 1; x <= 10; x++)
            {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(250L);
            }

        }
        catch(InterruptedException e)
        {
            System.err.println("ThreadB interrupted");
        }
    }
}
