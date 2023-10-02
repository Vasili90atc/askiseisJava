// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Strings.java

package askiseis_me_methodous;

import java.io.PrintStream;

public class Strings
{

    public Strings()
    {
    }

    public static void main(String args[])
    {
        String s1 = "\u0391\u03C5\u03C4\u03CC \u03B5\u03AF\u03BD\u03B1\u03B9 \u03C4\u03BF \u03B1\u03C1\u03C7\u03B9\u03BA\u03CC String";
        System.out.println(s1.toUpperCase());
        System.out.println(s1);
        String s2 = s1.substring(0, 11);
        String s3 = s2.concat("\u03C4\u03BF \u03C4\u03C1\u03BF\u03C0\u03BF\u03C0\u03BF\u03B9\u03B7\265\u03AD\u03BD\u03BF String");
        System.out.println(s3);
        StringBuilder sb = new StringBuilder("\u0391\u03C5\u03C4\u03CC \u03B5\u03AF\u03BD\u03B1\u03B9 \u03C4\u03BF \u03B1\u03C1\u03C7\u03B9\u03BA\u03CC StringBuilder");
        sb.setLength(11);
        sb.append("\u03C4\u03BF \u03C4\u03C1\u03BF\u03C0\u03BF\u03C0\u03BF\u03B9\u03B7\265\u03AD\u03BD\u03BF StringBuilder").reverse();
        System.out.println(sb);
    }
}
