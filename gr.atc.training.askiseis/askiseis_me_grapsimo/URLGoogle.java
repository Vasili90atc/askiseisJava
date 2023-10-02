// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   URLGoogle.java

package askiseis_me_grapsimo;

import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLGoogle
{
    public class google1
    {

        public static void main(String args[])
        {
            String content = null;
            URLConnection connection = null;
            try
            {
                connection = (new URL("http://www.google.com")).openConnection();
                Scanner scanner = new Scanner(connection.getInputStream());
                scanner.useDelimiter("\\Z");
                content = scanner.next();
                scanner.close();
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
            System.out.println(content);
        }

        final URLGoogle this$0;

        public google1()
        {
            this$0 = URLGoogle.this;
            super();
        }
    }


    public URLGoogle()
    {
    }
}
