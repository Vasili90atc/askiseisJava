// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WordCounter.java

package askiseis_me_methodous;

import java.io.*;
import java.util.Scanner;

public class WordCounter
{

    public WordCounter()
    {
        counter = 0;
        fileName = fileName;
    }

    public Serializable getFileName()
    {
        return fileName;
    }

    public int count()
        throws FileNotFoundException
    {
        System.out.println(fileName);
        file = new File(fileName);
        Scanner sc = new Scanner(new File(fileName));
        if(fileName != null)
            for(; sc.hasNext(); System.out.println((new StringBuilder("WORD COUNT: ")).append(counter).toString()))
            {
                line = sc.next();
                counter++;
            }

        else
            System.out.println("Not found");
        return counter;
    }

    public void setFileName(String s)
    {
    }

    private String fileName;
    private long word;
    private File file;
    private String line;
    int counter;
}
