// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ThreadStates.java

package askiseis_me_methodous;

import java.io.PrintStream;

public class ThreadStates
{

    public ThreadStates()
    {
    }

    public static void main(String args[])
    {
        t.start();
        Thread.State state;
        do
        {
            state = t.getState();
            System.out.println(state);
        } while(state != Thread.State.TERMINATED);
    }

    private static Thread t = new Thread("T") {

        public void run()
        {
            try
            {
                sleep(5L);
                for(int i = 10000; i > 0; i--);
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }

    }
;

}
