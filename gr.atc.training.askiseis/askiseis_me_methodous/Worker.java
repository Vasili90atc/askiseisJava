// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Worker.java

package askiseis_me_methodous;

import java.io.PrintStream;

// Referenced classes of package askiseis_me_methodous:
//            Person, House

public class Worker extends Person
{

    public Worker(String firstname, String lastname, House home, int salary)
    {
        super(firstname, lastname, home);
        this.salary = salary;
    }

    public static void main(String args[])
    {
        House home = new House(5, "Xaina 5, Chalkida");
        Worker worker = new Worker("Dimitris", "Papadopoulos", home, 1000);
        System.out.println(worker.getFirstname());
        System.out.println(worker.getLastname());
        System.out.println(worker.getSalary());
        System.out.println(worker.getClass());
    }

    private char[] getLastname()
    {
        return null;
    }

    private char[] getFirstname()
    {
        return null;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    private static final String House = null;
    private int salary;

}
