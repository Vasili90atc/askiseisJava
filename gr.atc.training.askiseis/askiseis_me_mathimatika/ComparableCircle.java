// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ComparableCircle.java

package askiseis_me_mathimatika;


// Referenced classes of package askiseis_me_mathimatika:
//            Circle

public class ComparableCircle extends Circle
    implements Comparable
{

    public ComparableCircle(double radius)
    {
        super(radius);
    }

    public int compareTo(Object o)
    {
        if(getRadius() > ((ComparableCircle)o).getRadius())
            return 1;
        return getRadius() >= ((ComparableCircle)o).getRadius() ? 0 : -1;
    }
}
