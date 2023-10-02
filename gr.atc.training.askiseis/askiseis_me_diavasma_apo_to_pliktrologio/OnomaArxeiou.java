// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OnomaArxeiou.java

package askiseis_me_diavasma_apo_to_pliktrologio;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class OnomaArxeiou
{

    public OnomaArxeiou()
    {
    }

    public static void main(String args[])
    {
        ArrayList myList = new ArrayList();
        System.out.print("Dose to onoma tou arxeiou ");
        int count = 0;
        int word = 0;
        double sum = 0.0D;
        Scanner input = new Scanner(System.in);
        String filename = input.next();
        System.out.println(filename);
        try
        {
            File file = new File(filename);
            String line;
            Scanner myfile;
            for(myfile = new Scanner(file); myfile.hasNextLine(); System.out.println(line))
            {
                line = myfile.nextLine();
                String k[] = line.split(" ");
                for(int i = 0; i < k.length; i++)
                    try
                    {
                        Integer.parseInt(k[i]);
                        count++;
                    }
                    catch(NumberFormatException ex)
                    {
                        word++;
                    }

            }

            myfile.close();
            System.out.println((new StringBuilder("oi lexeis einai: ")).append(word).toString());
            System.out.println((new StringBuilder("oi arithmoi einai: ")).append(count).toString());
            if(count != 0)
            {
                double mo = sum / (double)count;
                System.out.println((new StringBuilder("o mo einai: ")).append(mo).toString());
            }
            for(int i = 0; i < myList.size(); i++)
                System.out.println((String)myList.get(i));

        }
        catch(FileNotFoundException e)
        {
            System.out.println("Den vrika to arxeio");
        }
    }
}
