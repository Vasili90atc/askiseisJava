// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Zip.java

package askiseis_me_methodo_me_file;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip
{
    public class ZipTest
    {

        public static void main(String args[])
        {
            System.out.println((new StringBuilder("args.length=")).append(args.length).toString());
            for(int n = 0; n < args.length; n++)
                System.out.println((new StringBuilder("args[")).append(n).append("]=").append(args[n]).toString());

            try
            {
                String sourceFile = args[0];
                FileOutputStream fos = new FileOutputStream("compressed.zip");
                ZipOutputStream zipOut = new ZipOutputStream(fos);
                File fileToZip = new File(sourceFile);
                FileInputStream fis = new FileInputStream(fileToZip);
                ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
                zipOut.putNextEntry(zipEntry);
                byte bytes[] = new byte[1024];
                int length;
                while((length = fis.read(bytes)) >= 0) 
                    zipOut.write(bytes, 0, length);
                fis.close();
                zipOut.close();
                fos.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }

        final Zip this$0;

        public ZipTest()
        {
            this$0 = Zip.this;
            super();
        }
    }


    public Zip()
    {
    }
}
