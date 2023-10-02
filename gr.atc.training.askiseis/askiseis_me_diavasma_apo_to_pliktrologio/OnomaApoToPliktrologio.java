// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OnomaApoToPliktrologio.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

// Referenced classes of package askiseis_me_diavasma_apo_to_pliktrologio:
//            WordCounter

public class OnomaApoToPliktrologio
{

    public OnomaApoToPliktrologio()
    {
    }

    public static void main(String args[])
        throws FileNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fileName: ");
        String fileName = sc.next();
        sc.close();
        System.out.println(fileName);
        WordCounter wc = new WordCounter();
        wc.setFileName(fileName);
        wc.count();
    }
}
