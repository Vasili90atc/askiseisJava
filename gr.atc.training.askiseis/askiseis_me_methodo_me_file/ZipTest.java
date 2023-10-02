// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ZipTest.java

package askiseis_me_zip;

import java.io.File;
import java.io.IOException;

// Referenced classes of package askiseis_me_zip:
//            Zip

public class ZipTest
{

    public ZipTest()
    {
    }

    public void zip()
        throws IOException
    {
        (new Zip()).Zip(new File("filesToZip"));
    }
}
