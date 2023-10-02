// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Thermokrasies.java

package askiseis_me_temperature;

import java.io.*;
import java.util.ArrayList;

public class Thermokrasies
{

    public Thermokrasies()
    {
    }

    public void thermokrasies()
    {
        morning = new ArrayList();
        noon = new ArrayList();
        night = new ArrayList();
    }

    public void fileread()
    {
        try
        {
            File f = new File("C:\\Users\\ivasili\\eclipse-workspace//temp.txt");
            BufferedReader reader = new BufferedReader(new FileReader(f));
            for(String line = reader.readLine(); line != null; line = reader.readLine())
            {
                System.out.println(line);
                String parts[] = line.split("\t");
                int t = Integer.parseInt(parts[1]);
                if(parts[0].equals("morning"))
                    morning.add(Integer.valueOf(t));
                else
                if(parts[0].equals("noon"))
                    noon.add(Integer.valueOf(t));
                else
                    night.add(Integer.valueOf(t));
            }

            reader.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public void sortPopulation()
    {
        morning.sort(null);
        for(int i = 0; i < morning.size(); i++)
            System.out.println(morning.get(i));

    }

    ArrayList morning;
    ArrayList noon;
    ArrayList night;
}
