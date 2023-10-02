// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ZipDirectory.java

package askiseis_me_methodo_me_file;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipDirectory
{

    public ZipDirectory()
    {
    }

    public static void main(String args[])
        throws IOException
    {
        String sourceFile = "C:\\Users\\ivasili\\zipTest";
        FileOutputStream fos = new FileOutputStream("dirCompressed.zip");
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        File fileToZip = new File(sourceFile);
        zipFile(fileToZip, fileToZip.getName(), zipOut);
        zipOut.close();
        fos.close();
    }

    private static void zipFile(File fileToZip, String fileName, ZipOutputStream zipOut)
        throws IOException
    {
        if(fileToZip.isHidden())
            return;
        if(fileToZip.isDirectory())
        {
            if(fileName.endsWith("/"))
            {
                zipOut.putNextEntry(new ZipEntry(fileName));
                zipOut.closeEntry();
            } else
            {
                zipOut.putNextEntry(new ZipEntry((new StringBuilder(String.valueOf(fileName))).append("/").toString()));
                zipOut.closeEntry();
            }
            File children[] = fileToZip.listFiles();
            File afile[];
            int j = (afile = children).length;
            for(int i = 0; i < j; i++)
            {
                File childFile = afile[i];
                zipFile(childFile, (new StringBuilder(String.valueOf(fileName))).append("/").append(childFile.getName()).toString(), zipOut);
            }

            return;
        }
        FileInputStream fis = new FileInputStream(fileToZip);
        ZipEntry zipEntry = new ZipEntry(fileName);
        zipOut.putNextEntry(zipEntry);
        byte bytes[] = new byte[1024];
        int length;
        while((length = fis.read(bytes)) >= 0) 
            zipOut.write(bytes, 0, length);
        fis.close();
    }
}
