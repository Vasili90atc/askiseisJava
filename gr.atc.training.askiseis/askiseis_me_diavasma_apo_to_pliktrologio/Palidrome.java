// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Palidrome.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.PrintStream;
import java.util.Scanner;

public class Palidrome
{

    public Palidrome()
    {
    }

    public static void main(String args[])
    {
        String b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string you want to check: ");
        String a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
            b = (new StringBuilder(String.valueOf(b))).append(a.charAt(i)).toString();

        if(a.equalsIgnoreCase(b))
            System.out.println("The string is palindrome.");
        else
            System.out.println("The string is not palindrome.");
    }
}
