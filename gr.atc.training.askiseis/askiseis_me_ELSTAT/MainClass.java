// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MainClass.java

package askiseis_me_lista;

import java.io.IOException;

// Referenced classes of package askiseis_me_lista:
//            ListaArithmwn

public class MainClass
{

    public MainClass()
    {
    }

    public static void main(String args[])
        throws IOException
    {
        ListaArithmwn mylist = new ListaArithmwn();
        mylist.lista();
        mylist.listataxinomisis();
    }
}
