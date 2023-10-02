// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DirectoryListing.java

package askiseis_me_methodo_me_file;

import java.io.*;

public class DirectoryListing
{

    public DirectoryListing()
    {
    }

    public static void main(String args[])
    {
        if(args.length == 0)
        {
            System.err.println("Please specify a directory name");
        } else
        {
            File entry = new File(args[0]);
            listDirectory(entry);
        }
    }

    public static void listDirectory(File dir)
    {
        try
        {
            if(!dir.exists() || dir.isFile())
            {
                System.out.println((new StringBuilder("Directory ")).append(dir.getName()).append(" not found").toString());
            } else
            {
                String structure[] = dir.list();
                File curFile = null;
                String as[];
                int j = (as = structure).length;
                for(int i = 0; i < j; i++)
                {
                    String name = as[i];
                    curFile = new File(dir.getPath(), name);
                    System.out.println(curFile.getCanonicalPath());
                }

            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
