// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PackageRice.java

package askiseis_me_boolean;


public class PackageRice
{

    public PackageRice()
    {
    }

    public Boolean packageRice(Integer big, Integer small, Integer goal)
    {
        boolean result = false;
        if(big.intValue() * 5 >= goal.intValue())
        {
            if(small.intValue() >= goal.intValue() % 5)
                result = true;
        } else
        if(small.intValue() >= goal.intValue() - big.intValue() * 5)
            result = true;
        return Boolean.valueOf(result);
    }
}
