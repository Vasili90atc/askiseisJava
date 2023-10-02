// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Car.java

package askiseis_me_methodous;

import java.io.PrintStream;

public class Car
{

    public Car(String string, String string2, int i, int j, String string3, int k)
    {
    }

    public static void main(String args[])
    {
        Car c1 = new Car("Model S", "Tesla", 2021, 0x1730e, "White", 5);
        String result = c1.toString();
        System.out.println(result);
        c1.sell();
        System.out.println("\n1 car is sold.\n");
        System.out.println(c1.getModel());
        System.out.println(c1.getBrand());
        System.out.println(c1.getYear());
        System.out.println(c1.getPrice());
        System.out.println(c1.getColor());
        System.out.println(c1.getQuantity());
        c1.setYear(2022);
        c1.setPrice(0x1adb0);
        c1.setColor("Black");
        c1.setQuantity(10);
        System.out.println("\nUpdated some values for the car.\n");
        result = c1.toString();
        System.out.println(result);
    }

    private void setQuantity(int j)
    {
    }

    private void setColor(String s)
    {
    }

    private void setPrice(int j)
    {
    }

    private void setYear(int j)
    {
    }

    private char[] getQuantity()
    {
        return null;
    }

    private char[] getColor()
    {
        return null;
    }

    private char[] getPrice()
    {
        return null;
    }

    private char[] getYear()
    {
        return null;
    }

    private char[] getBrand()
    {
        return null;
    }

    private char[] getModel()
    {
        return null;
    }

    private void sell()
    {
    }
}
