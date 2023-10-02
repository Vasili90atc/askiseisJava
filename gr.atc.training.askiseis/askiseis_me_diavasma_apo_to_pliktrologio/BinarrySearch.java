// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BinarrySearch.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.PrintStream;
import java.util.Scanner;

public class BinarrySearch
{

    public BinarrySearch()
    {
    }

    public static void main(String args[])
    {
        int numbers[] = {
            1, 4, 6, 7, 12, 17, 25
        };
        System.out.println("Enter the number to be found out: ");
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        int result = binarySearch(numbers, 0, numbers.length - 1, x);
        if(result != -1)
            System.out.println((new StringBuilder("Search successful, element found at position ")).append(result).toString());
        else
            System.out.println("The given element is not present in the array");
    }

    public static int binarySearch(int numbers[], int low, int high, int x)
    {
        if(high >= low)
        {
            int mid = low + (high - low) / 2;
            if(numbers[mid] == x)
                return mid;
            if(numbers[mid] > x)
                return binarySearch(numbers, low, mid - 1, x);
            else
                return binarySearch(numbers, mid + 1, high, x);
        } else
        {
            return -1;
        }
    }
}
