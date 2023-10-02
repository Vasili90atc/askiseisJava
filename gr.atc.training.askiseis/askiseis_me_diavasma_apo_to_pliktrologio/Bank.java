// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Bank.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.PrintStream;
import java.util.Scanner;

// Referenced classes of package askiseis_me_diavasma_apo_to_pliktrologio:
//            BankAccount

public class Bank
{

    public Bank()
    {
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 'Name' and 'CustomerId' to access your Bank account:");
        String name = sc.nextLine();
        String customerId = sc.nextLine();
        BankAccount obj1 = new BankAccount(name, customerId);
        obj1.menu();
    }
}
