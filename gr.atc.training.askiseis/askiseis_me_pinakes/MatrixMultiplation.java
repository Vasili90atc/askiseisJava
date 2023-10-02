// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MatrixMultiplation.java

package askiseis_me_pinakes;

import java.io.PrintStream;

public class MatrixMultiplation
{

    public MatrixMultiplation()
    {
    }

    public static void main(String args[])
    {
        int a[][] = {
            {
                8, 5, 1
            }, {
                9, 3, 2
            }, {
                4, 6, 3
            }
        };
        int b[][] = {
            {
                8, 5, 3
            }, {
                9, 5, 7
            }, {
                9, 4, 1
            }
        };
        int c[][] = new int[3][3];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                c[i][j] = 0;
                for(int k = 0; k < 3; k++)
                    c[i][j] += a[i][k] * b[k][j];

                System.out.print((new StringBuilder(String.valueOf(c[i][j]))).append(" ").toString());
            }

            System.out.print("\n");
        }

    }
}
