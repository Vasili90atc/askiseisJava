// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CharacterStreams.java

package askiseis_me_grapsimo_apo_to_arxeio;

import java.io.*;

public class CharacterStreams
{

    public CharacterStreams()
    {
    }

    public static void main(String args[])
    {
        BufferedReader br;
        PrintWriter pw;
        FileReader fr = null;
        br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        pw = null;
        FileReader fr = new FileReader("input.txt");
        br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("output.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        pw = new PrintWriter(bw, true);
        for(String str = br.readLine(); str != null; str = br.readLine())
            pw.println(str);

        break MISSING_BLOCK_LABEL_202;
        FileNotFoundException fnfe;
        fnfe;
        fnfe.printStackTrace();
        pw.flush();
        pw.close();
        if(br != null)
            try
            {
                br.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        break MISSING_BLOCK_LABEL_230;
        IOException ioe;
        ioe;
        ioe.printStackTrace();
        pw.flush();
        pw.close();
        if(br != null)
            try
            {
                br.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        break MISSING_BLOCK_LABEL_230;
        Exception exception;
        exception;
        pw.flush();
        pw.close();
        if(br != null)
            try
            {
                br.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        throw exception;
        pw.flush();
        pw.close();
        if(br != null)
            try
            {
                br.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
    }
}
