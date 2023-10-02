// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Website.java

package askiseis_me_methodous;


public class Website
{

    public Website(String n, String u, String d)
    {
        name = n;
        url = u;
        description = d;
    }

    public Website()
    {
        name = "";
        url = "";
        description = "";
    }

    public String toString()
    {
        return (new StringBuilder(String.valueOf(name))).append(" at ").append(url).append(" is ").append(description).toString();
    }

    String name;
    String url;
    String description;
}
