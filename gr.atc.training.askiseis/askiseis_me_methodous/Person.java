// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Person.java

package askiseis_me_methodous;

import java.io.Serializable;

// Referenced classes of package askiseis_me_methodous:
//            House

public class Person
    implements Serializable
{

    public Person(String firstname, String lastname, House home)
    {
    }

    public Person(String n, String s)
    {
        name = n;
        surname = s;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String s)
    {
        surname = s;
    }

    private static final long serialVersionUID = 1L;
    private String name;
    private String surname;
}
