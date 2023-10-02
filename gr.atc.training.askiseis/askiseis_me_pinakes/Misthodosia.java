// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Misthodosia.java

package askiseis_me_pinakes;

import java.io.PrintStream;
import java.util.Scanner;

public class Misthodosia
{

    public Misthodosia()
    {
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a = null;
        int pos = 0;
        int max = -1;
        int pin[] = new int[4];
        String pinakas[] = new String[4];
        System.out.println("Dwse tesseris arithmous kai tessera Onomata");
        for(int i = 0; i <= 3; i++)
        {
            System.out.println((new StringBuilder("Dwse to onoma tou ")).append(i).append(" ypalilou").toString());
            pinakas[i] = sc.nextLine();
            System.out.println((new StringBuilder("Dwse to mistho tou ")).append(i).append(" ypalilou").toString());
            pin[i] = Integer.parseInt(sc.nextLine());
        }

        do
        {
            System.out.println("EISAGETE TO ONOMA TOU YPALILOU");
            a = sc.nextLine();
            pos = -1;
            for(int i = 0; i <= 3; i++)
                if(pinakas[i].equals(a))
                    pos = i;

            if(pos == -1)
                System.out.println("Den uparxei upalilos");
            else
                System.out.println((new StringBuilder("o misthos einai")).append(pin[pos]).toString());
        } while(!a.equals("end"));
        for(int i = 0; i <= 3; i++)
            if(pin[i] > max)
            {
                max = pin[i];
                pos = i;
            }

        System.out.println((new StringBuilder("o megistos misthos einai")).append(max).append(" ").append(pinakas[pos]).toString());
        for(int i = 0; i <= 3; i++)
            System.out.println((new StringBuilder("TO APOTELESMA EINAI ")).append(pinakas[i]).append(" ").append(pin[i]).toString());

    }
}
