// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Bicycle.java

package askiseis_me_diaforetiki_klasi;


public class Bicycle
{

    public Bicycle(int startCadence, int startSpeed, int startGear)
    {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public void setCadence(int newValue)
    {
        cadence = newValue;
    }

    public void setGear(int newValue)
    {
        gear = newValue;
    }

    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    public int cadence;
    public int gear;
    public int speed;
}
