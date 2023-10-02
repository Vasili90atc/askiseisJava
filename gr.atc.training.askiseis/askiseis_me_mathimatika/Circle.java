// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Circle.java

package askiseis_me_mathimatika;


public class Circle
{

    public Circle()
    {
        radius = 1.0D;
    }

    public Circle(double newRadius)
    {
        radius = newRadius;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return radius * radius * _fld03C0;
    }

    private double radius;
    private double _fld03C0;
}
