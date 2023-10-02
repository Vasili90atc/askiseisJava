// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ListaArithmwn.java

package askiseis_me_methodous;

import java.io.*;
import java.util.ArrayList;

public class ListaArithmwn
{
    public class listaarithmwn
    {

        public int[] lista(String pinakas[])
        {
            int pin[] = new int[pinakas.length];
            for(int i = 0; i < pinakas.length; i++)
                pin[i] = Integer.parseInt(pinakas[i]);

            return pin;
        }

        private String toString(String pinakas[])
        {
            return null;
        }

        public int[] listataxinomisis(int list[])
        {
            int temp = 0;
            for(int i = 0; i < list.length - 1; i++)
            {
                for(int j = i + 1; j < list.length; j++)
                    if(list[i] > list[j])
                    {
                        temp = list[j];
                        list[j] = list[i];
                        list[i] = temp;
                    }

            }

            return list;
        }

        public int numbers;
        public String line;
        public ArrayList ListOfString;
        final ListaArithmwn this$0;

        public listaarithmwn()
        {
            this$0 = ListaArithmwn.this;
            super();
            String f = " ";
            try
            {
                BufferedReader reader = new BufferedReader(new FileReader(f));
                ListOfString = new ArrayList();
                String line;
                while((line = reader.readLine()) != null) 
                {
                    ListOfString.add(line);
                    System.out.println(line);
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }


    public ListaArithmwn()
    {
    }
}
