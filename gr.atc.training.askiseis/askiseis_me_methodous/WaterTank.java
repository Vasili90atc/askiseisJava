// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WaterTank.java

package askiseis_me_methodous;

import java.io.PrintStream;

public class WaterTank
{

    public WaterTank(String threadName, WaterTank wt)
    {
        capacity = 1000D;
        volume = 0.0D;
    }

    public WaterTank(double c)
    {
        capacity = c;
        volume = 0.0D;
    }

    public synchronized void addWater(double lt)
    {
        System.out.println((new StringBuilder(String.valueOf(Thread.currentThread().getName()))).append(": adding water").toString());
        while(isFull()) 
            try
            {
                System.out.println((new StringBuilder(String.valueOf(Thread.currentThread().getName()))).append(": waiting to add water").toString());
                wait(500L);
            }
            catch(InterruptedException ie)
            {
                System.out.println((new StringBuilder(String.valueOf(Thread.currentThread().getName()))).append(" interrupted").toString());
            }
        if(volume + lt <= capacity)
            volume += lt;
        else
            volume = capacity;
        System.out.println((new StringBuilder("Volume after ")).append(Thread.currentThread().getName()).append(" addition: ").append(volume).toString());
        System.out.println((new StringBuilder(String.valueOf(Thread.currentThread().getName()))).append(": notifying").append(" after adding").toString());
        notifyAll();
    }

    public synchronized void removeWater(double lt)
    {
        System.out.println((new StringBuilder(String.valueOf(Thread.currentThread().getName()))).append(": removing water").toString());
        while(isEmpty()) 
            try
            {
                System.out.println((new StringBuilder(String.valueOf(Thread.currentThread().getName()))).append(": waiting to remove water").toString());
                wait(1000L);
            }
            catch(InterruptedException ie)
            {
                System.out.println((new StringBuilder(String.valueOf(Thread.currentThread().getName()))).append(" interrupted").toString());
            }
        if(volume - lt >= 0.0D)
            volume -= lt;
        else
            volume = 0.0D;
        System.out.println((new StringBuilder("Volume after ")).append(Thread.currentThread().getName()).append(" removal: ").append(volume).toString());
        System.out.println((new StringBuilder(String.valueOf(Thread.currentThread().getName()))).append(": notifying after removing").toString());
        notifyAll();
    }

    public boolean isEmpty()
    {
        return volume == 0.0D;
    }

    public boolean isFull()
    {
        return volume == capacity;
    }

    public synchronized void empty()
    {
        volume = 0.0D;
    }

    private double capacity;
    private volatile double volume;
}
