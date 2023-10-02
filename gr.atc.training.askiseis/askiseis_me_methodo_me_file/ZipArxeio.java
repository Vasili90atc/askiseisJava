// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ZipArxeio.java

package askiseis_me_methodo_me_file;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipArxeio
{

    public ZipArxeio()
    {
    }

    public void Zip(File path)
        throws IOException
    {
        File files[] = path.listFiles();
        if(files.length == 0)
            throw new IllegalArgumentException((new StringBuilder("No files in path")).append(path.getAbsolutePath()).toString());
        FileOutputStream fos = new FileOutputStream("C:\\Users\\ivasili\\fakelos.zip");
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        File afile[];
        int j = (afile = files).length;
        for(int i = 0; i < j; i++)
        {
            File zipThis = afile[i];
            FileInputStream fis = new FileInputStream(zipThis);
            ZipEntry zipEntry = new ZipEntry(zipThis.getName());
            zipOut.putNextEntry(zipEntry);
            byte bytes[] = new byte[2048];
            int length;
            while((length = fis.read(bytes)) >= 0) 
                zipOut.write(bytes, 0, length);
            fis.close();
        }

        zipOut.close();
        fos.close();
    }
}
