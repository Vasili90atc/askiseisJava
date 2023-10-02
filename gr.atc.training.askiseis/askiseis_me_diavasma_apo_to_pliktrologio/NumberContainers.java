// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NumberContainers.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.PrintStream;
import java.util.Scanner;

public class NumberContainers
{

    public NumberContainers()
    {
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Lego bricks do we have? Choose an odd number between 50 and 100: ");
        int amountOfBricks = Integer.parseInt(sc.nextLine());
        System.out.println("How many Lego blocks fit in one container? Choose an even number between 5 and 10: ");
        int containerCapacity = Integer.parseInt(sc.nextLine());
        int noOfFullContainers = amountOfBricks / containerCapacity;
        int noOfBlocksInNotFullContainers = amountOfBricks % containerCapacity;
        int noOfTotalContainers;
        if(noOfBlocksInNotFullContainers != 0)
            noOfTotalContainers = noOfFullContainers + 1;
        else
            noOfTotalContainers = noOfFullContainers;
        System.out.println((new StringBuilder("No of full containers we have: ")).append(noOfFullContainers).toString());
        System.out.println((new StringBuilder("No of total containers we have: ")).append(noOfTotalContainers).toString());
        System.out.println((new StringBuilder("No of blocks in the container that is not completely full: ")).append(noOfBlocksInNotFullContainers).toString());
    }
}
