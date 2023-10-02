// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Person2.java

package askiseis_me_methodous;

import java.io.PrintStream;

// Referenced classes of package askiseis_me_methodous:
//            House

public class Person2
{

    public Person2(String firstname, String lastname, House home)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.home = home;
    }

    public void express()
    {
        System.out.println("Fun!");
    }

    public String getAddress()
    {
        return home.getAddress();
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public House getHome()
    {
        return home;
    }

    public void setHome(House home)
    {
        this.home = home;
    }

    private String firstname;
    private String lastname;
    private House home;
}
