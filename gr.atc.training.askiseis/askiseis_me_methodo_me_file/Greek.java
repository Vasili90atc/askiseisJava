// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Greek.java

package askiseis_me_methodo_me_file;

import java.io.*;

public class Greek
{

    public Greek()
    {
    }

    public static void main(String args[])
        throws Exception
    {
        File myFile = new File("C:\\Users\\ivasili\\eclipse-workspace\\douleia\\\u0395\u03BB\u03BB\u03AC\u03B4\u03B1.txt");
        BufferedReader reader = new BufferedReader(new FileReader(myFile));
        for(String line = reader.readLine(); line != null; line = reader.readLine())
            System.out.println(line.toUpperCase());

    }
}
