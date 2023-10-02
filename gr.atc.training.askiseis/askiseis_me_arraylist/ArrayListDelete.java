// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ArrayListDelete.java

package askiseis_me_arraylist;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDelete
{

    public ArrayListDelete()
    {
    }

    public static void main(String args[])
    {
        ArrayList numbers = new ArrayList(5);
        numbers.add(Integer.valueOf(3));
        numbers.add(Integer.valueOf(7));
        numbers.add(Integer.valueOf(1));
        numbers.add(Integer.valueOf(4));
        System.out.println(numbers);
        System.out.println("Enter the position of the element to be deleted: ");
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        numbers.remove(x);
        System.out.println(numbers);
    }
}
