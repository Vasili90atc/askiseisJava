// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Google.java

package askiseis_me_grapsimo;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Google
{

    public Google()
    {
    }

    public static void DownloadWebPage(String webpage)
    {
        try
        {
            URL url = new URL(webpage);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter("Download.html"));
            String line;
            while((line = reader.readLine()) != null) 
                writer.write(line);
            reader.close();
            writer.close();
            System.out.println("Successfully Downloaded.");
        }
        catch(MalformedURLException mue)
        {
            System.out.println("Malformed URL Exception raised");
        }
        catch(IOException ie)
        {
            System.out.println("IOException raised");
        }
    }

    public static void main(String args[])
        throws IOException
    {
        String url = "https://www.google.gr";
        DownloadWebPage(url);
        System.out.println("https://www.google.gr");
    }
}
