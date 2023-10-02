// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Circle1.java

package askiseis_me_mathimatika;

import java.io.PrintStream;
import java.util.Scanner;

public class Circle1
{

    public Circle1()
    {
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");
        double radius = Float.parseFloat(sc.nextLine());
        double c = 6.2831853071795862D * radius;
        double area = 3.1415926535897931D * radius * radius;
        System.out.println((new StringBuilder("The circumference of the circle is: ")).append(c).toString());
        System.out.println((new StringBuilder("The area of the circle is: ")).append(area).toString());
    }
}
