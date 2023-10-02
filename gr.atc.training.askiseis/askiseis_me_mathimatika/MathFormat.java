// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MathFormat.java

package askiseis_me_mathimatika;

import java.io.PrintStream;
import java.util.*;

public class MathFormat
{

    public MathFormat()
    {
    }

    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder();
        Formatter fmt = new Formatter(sb, Locale.getDefault());
        fmt.format("To \u03C0 \u03B5\u03AF\u03BD\u03B1\u03B9 \u03C0\u03B5\u03C1\u03AF\u03C0\u03BF\u03C5 %.5f \u03BA\u03B1\u03B9 \u03C4\u03BF e \u03C0\u03B5\u03C1\u03AF\u03C0\u03BF\u03C5 %.5f", new Object[] {
            Double.valueOf(3.1415926535897931D), Double.valueOf(2.7182818284590451D)
        });
        System.out.println(sb);
        System.out.printf("%8d%n", new Object[] {
            Integer.valueOf(555)
        });
        Calendar cal = Calendar.getInstance();
        System.out.printf("%10tR", new Object[] {
            cal
        });
    }
}
