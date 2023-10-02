// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Bank.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.PrintStream;
import java.util.Scanner;

class BankAccount
{

    BankAccount(String customerName, String customerId)
    {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    void deposit(double amount)
    {
        if(amount != 0.0D)
        {
            bal += amount;
            prevTrans = amount;
        }
    }

    void withdraw(double amt)
    {
        if(amt != 0.0D && bal >= amt)
        {
            bal -= amt;
            prevTrans = -amt;
        } else
        if(bal < amt)
            System.out.println("Bank balance insufficient");
    }

    void getPreviousTrans()
    {
        if(prevTrans > 0.0D)
            System.out.println((new StringBuilder("Deposited: ")).append(prevTrans).toString());
        else
        if(prevTrans < 0.0D)
            System.out.println((new StringBuilder("Withdrawn: ")).append(Math.abs(prevTrans)).toString());
        else
            System.out.println("No transaction occured");
    }

    void menu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println((new StringBuilder("Welcome ")).append(customerName).toString());
        System.out.println((new StringBuilder("Your ID:")).append(customerId).toString());
        System.out.println("\n");
        System.out.println("a) Check Balance");
        System.out.println("b) Deposit Amount");
        System.out.println("c) Withdraw Amount");
        System.out.println("d) Previous Transaction");
        System.out.println("e) Exit");
        char option;
        do
        {
            System.out.println("********************************************");
            System.out.println("Choose an option");
            option = sc.next().charAt(0);
            System.out.println("\n");
            switch(option)
            {
            case 97: // 'a'
                System.out.println("......................");
                System.out.println((new StringBuilder("Balance =")).append(bal).toString());
                System.out.println("......................");
                System.out.println("\n");
                break;

            case 98: // 'b'
                System.out.println("......................");
                System.out.println("Enter a amount to deposit :");
                System.out.println("......................");
                double amt = sc.nextDouble();
                deposit(amt);
                System.out.println("\n");
                break;

            case 99: // 'c'
                System.out.println("......................");
                System.out.println("Enter a amount to Withdraw :");
                System.out.println("......................");
                double amtW = sc.nextDouble();
                withdraw(amtW);
                System.out.println("\n");
                break;

            case 100: // 'd'
                System.out.println("......................");
                System.out.println("Previous Transaction:");
                getPreviousTrans();
                System.out.println("......................");
                System.out.println("\n");
                break;

            case 101: // 'e'
                System.out.println("......................");
                break;

            default:
                System.out.println("Choose a correct option to proceed");
                break;
            }
        } while(option != 'e');
        System.out.println("Thank you for using our banking services");
    }

    double bal;
    double prevTrans;
    String customerName;
    String customerId;
}
