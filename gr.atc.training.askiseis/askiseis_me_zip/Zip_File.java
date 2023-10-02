// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Zip_File.java

package askiseis_me_methodo_me_file;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip_File
{

    public Zip_File()
    {
    }

    public static void main(String args[])
    {
        try
        {
            System.out.println(args[0]);
            for(int i = 0; i < args.length; i++)
            {
                System.out.println((new StringBuilder("zip File")).append(args[i]).toString());
                File rootFolder = null;
                ZipOutputStream zos = null;
                File afile[];
                int k = (afile = rootFolder.listFiles()).length;
                for(int j = 0; j < k; j++)
                {
                    File file = afile[j];
                    writeToZip(file, zos);
                    System.out.println((new StringBuilder("Zipping: ")).append(file.getName()).toString());
                }

                zos.close();
            }

        }
        catch(Exception exception) { }
    }

    private static void writeToZip(File file, ZipOutputStream zos)
        throws IOException
    {
        FileInputStream fis = new FileInputStream(file);
        ZipEntry zipEntry = new ZipEntry(file.getName());
        zos.putNextEntry(zipEntry);
        byte bytes[] = new byte[1024];
        int length;
        while((length = fis.read(bytes)) >= 0) 
            zos.write(bytes, 0, length);
        zos.closeEntry();
        fis.close();
    }
}
