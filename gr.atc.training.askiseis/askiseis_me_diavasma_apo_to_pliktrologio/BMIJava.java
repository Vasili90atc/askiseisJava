// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BMIJava.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.PrintStream;
import java.util.Scanner;

public class BMIJava
{

    public BMIJava()
    {
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the height (in inches): ");
        float height = s.nextFloat();
        System.out.println("Enter the weight (in pounds): ");
        float weight = s.nextFloat();
        float bmi = (float)(((double)weight / Math.pow(height, 2D)) * 703D);
        System.out.println((new StringBuilder("The BMI is: ")).append(bmi).toString());
        if((double)bmi < 16D)
            System.out.println("starvation");
        else
        if((double)bmi >= 16D && (double)bmi <= 16.989999999999998D)
            System.out.println("emaciation");
        else
        if((double)bmi >= 17D && (double)bmi <= 18.489999999999998D)
            System.out.println("underweight");
        else
        if((double)bmi >= 18.5D && (double)bmi <= 22.989999999999998D)
            System.out.println("normal, low range");
        else
        if((double)bmi >= 23D && (double)bmi <= 24.989999999999998D)
            System.out.println("normal, high range");
        else
        if((double)bmi >= 25D && (double)bmi <= 27.489999999999998D)
            System.out.println("overweight, low range");
        else
        if((double)bmi >= 27.5D && (double)bmi <= 29.989999999999998D)
            System.out.println("overweight, high range");
        else
        if((double)bmi >= 30D && (double)bmi <= 34.899999999999999D)
            System.out.println("1st degree obesity");
        else
        if((double)bmi >= 35D && (double)bmi <= 39.899999999999999D)
            System.out.println("2nd degree obesity");
        else
            System.out.println("3rd degree obesity");
    }
}
