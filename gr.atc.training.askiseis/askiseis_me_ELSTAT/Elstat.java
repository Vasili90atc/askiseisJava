

package askiseis_me_ELSTAT;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Elstat
{

    public Elstat()
    {
        grammi = new Scanner(System.in);
    }

    public void diavazw_apo_arxeio(String onoma_arxeiou)
    {
        kodikosArithmos = new ArrayList();
        onomataKoinotitas = new ArrayList();
        System.out.println(onoma_arxeiou);
        try
        {
            File f = new File(onoma_arxeiou);
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"));
            for(String line = reader.readLine(); line != null; line = reader.readLine())
            {
                String diairesi[] = line.split("\t");
                System.out.println(diairesi[0]);
                System.out.println(diairesi[1]);
                kodikosArithmos.add(diairesi[0]);
                onomataKoinotitas.add(diairesi[1]);
            }

            reader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Could not find file");
        }
        catch(IOException e)
        {
            System.out.println("error");
        }
    }

    public String dwse_arithmous()
    {
        System.out.println("-----------------------------------------------------");
        System.out.print("Dwse arithmo ");
        Scanner grammi = new Scanner(System.in);
        String arithmos = grammi.nextLine();
        return arithmos;
    }

    public void emfanisi_koinotitas(String arithmos)
    {
        for(int i = 0; i < kodikosArithmos.size(); i++)
            if(((String)kodikosArithmos.get(i)).equals(arithmos))
                System.out.println((String)onomataKoinotitas.get(i));

    }

    public void closeScanner()
    {
        grammi.close();
    }

    private ArrayList kodikosArithmos;
    private ArrayList onomataKoinotitas;
    Scanner grammi;
}
