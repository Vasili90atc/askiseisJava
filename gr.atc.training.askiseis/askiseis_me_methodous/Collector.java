// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Collector.java

package askiseis_me_methodous;


// Referenced classes of package askiseis_me_methodous:
//            WaterTank

public class Collector extends WaterTank
{

    public Collector(String threadName, WaterTank wt, double vol)
    {
        super(threadName, wt);
        collectorVolume = vol;
    }

    public void run()
    {
        do
            try
            {
                getTank().addWater(collectorVolume);
                Thread.sleep(300L);
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
        while(true);
    }

    private WaterTank getTank()
    {
        return null;
    }

    private double collectorVolume;
}
