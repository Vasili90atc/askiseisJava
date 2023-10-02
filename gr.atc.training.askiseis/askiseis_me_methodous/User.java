// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   User.java

package askiseis_me_methodous;

import java.io.PrintStream;

public class User
{

    public User(String username, String password, String email, int points)
    {
        this.username = username;
        setPassword(password);
        this.email = email;
        this.points = points;
    }

    public void printInfo()
    {
        System.out.println((new StringBuilder("User ")).append(username).append("(").append(email).append(")").toString());
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    private String username;
    private String password;
    private String email;
    protected int points;
}
