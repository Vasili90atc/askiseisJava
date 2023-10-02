// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Point.java

package askiseis_me_methodous;


public class Point
{

    public Point()
    {
    }

    public Point(int p_x, int p_y)
    {
        x = p_x;
        y = p_y;
    }

    public Point(Point p)
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

    private int x;
    private int y;
}
