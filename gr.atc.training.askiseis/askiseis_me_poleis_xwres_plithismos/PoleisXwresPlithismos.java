// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PoleisXwresPlithismos.java

package askiseis_me_poleis_xwres_plithismos;

import java.io.*;
import java.util.ArrayList;

public class PoleisXwresPlithismos
{
	ArrayList<Integer> population;

    public PoleisXwresPlithismos()
    {
        population = new ArrayList<>();
    }


    public void diavazw_apo_arxeio()
    {
        try
        {
            File f = new File("C:\\Users\\ivasili\\eclipse-workspace\\cities1.csv");
            BufferedReader reader = new BufferedReader(new FileReader(f));
            for(String line = reader.readLine(); line != null; line = reader.readLine())
            {
                String parts[] = line.split("\t");
                System.out.println(parts[2]);
                try
                {
                    int p = Integer.parseInt(parts[2].replace(".", "").replace("\"", ""));
                    population.add(Integer.valueOf(p));
                }
                catch(NumberFormatException numberformatexception) { }
            }

            System.out.println("----------------------------------------------------");
            System.out.println(population.size());
            reader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Could not find file");
        }
        catch(IOException e)
        {
            System.out.println("error");
        }
    }

    public void sortPopulation()
    {
        population.sort(null);
        for(int i = 0; i < population.size(); i++)
            System.out.println(population.get(i));

    }

    ArrayList population;
}
