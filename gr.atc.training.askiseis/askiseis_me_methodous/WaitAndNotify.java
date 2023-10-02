// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WaitAndNotify.java

package askiseis_me_methodous;

import java.io.PrintStream;

// Referenced classes of package askiseis_me_methodous:
//            WaterTank, Collector, Consumer

public class WaitAndNotify
{

    public WaitAndNotify()
    {
    }

    public static void main(String args[])
    {
        WaterTank tank = new WaterTank(1000D);
        new Collector("Collector 150lt", tank, 150D);
        new Collector("Collector 250lt", tank, 250D);
        new Consumer("Consumer 400lt", tank, 400D);
        System.out.println("Main Thread sleeping");
        try
        {
            Thread.sleep(2L);
        }
        catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }
        System.out.println("Exit from Main Thread");
    }
}
