// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Outer2.java

package askiseis_me_methodous;

import java.io.PrintStream;

public class Outer2
{

    public Outer2()
    {
        x = "Outer2";
    }

    public void doStuff()
    {
        class _cls1Inner2
        {

            public void seeOuter()
            {
                System.out.println(x);
            }

            final Outer2 this$0;

            _cls1Inner2()
            {
                this$0 = Outer2.this;
                super();
            }
        }

        _cls1Inner2 i = new _cls1Inner2();
        i.seeOuter();
    }

    public static void main(String args[])
    {
        Outer2 ref = new Outer2();
        ref.doStuff();
    }

    private String x;
}
