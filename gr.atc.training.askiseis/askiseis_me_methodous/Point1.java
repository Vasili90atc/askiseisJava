// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Point1.java

package askiseis_me_methodous;

import java.io.PrintStream;

public class Point1
{

    public Point1()
    {
    }

    public Point1(int p_x, int p_y)
    {
        x = p_x;
        y = p_y;
    }

    public Point1(Point1 p)
    {
        x = p.getX();
        y = p.getY();
    }

    public void setX(int p_x)
    {
        x = p_x;
    }

    public int getX()
    {
        return x;
    }

    public void setY(int p_y)
    {
        y = p_y;
    }

    public int getY()
    {
        return y;
    }

    public void displayCoords()
    {
        System.out.print((new StringBuilder("x = ")).append(x).toString());
        System.out.println((new StringBuilder(", y = ")).append(y).toString());
    }

    private int x;
    private int y;
}
