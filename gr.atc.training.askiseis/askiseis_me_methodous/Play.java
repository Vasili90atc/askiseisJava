// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Play.java

package askiseis_me_methodous;

import java.io.PrintStream;

public class Play
{

    public Play()
    {
    }

    public static void main(String args[])
    {
        Play game = new Play();
        game.play("Revenant");
        game.play(1000);
    }

    public void play(String title)
    {
        System.out.println((new StringBuilder("Kane se pantomima thn tainia ")).append(title).append("!").toString());
    }

    public void play(int x)
    {
        System.out.println((new StringBuilder("Bres poleis ")).append(x).append(" xiliometra makria!").toString());
    }
}
