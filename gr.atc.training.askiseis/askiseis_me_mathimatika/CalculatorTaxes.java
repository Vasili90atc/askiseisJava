// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CalculatorTaxes.java

package askiseis_me_mathimatika;

import java.io.PrintStream;
import java.math.BigDecimal;

public class CalculatorTaxes
{

    public CalculatorTaxes()
    {
    }

    public static void main(String args[])
    {
        double netValue = 9.9900000000000002D;
        double VAT = 23D;
        double grossValue = netValue + (VAT * netValue) / 100D;
        System.out.println((new StringBuilder("The gross value is: ")).append(grossValue).toString());
        double grossValue10000 = grossValue * 10000D;
        System.out.println((new StringBuilder("The gross value for 10000 units is: ")).append(grossValue10000).toString());
        double excludingVAT = grossValue10000 - (VAT * grossValue10000) / 100D;
        System.out.println((new StringBuilder("The value for 10000 units excluding VAT is: ")).append(excludingVAT).toString());
        System.out.println("\n----Using BigDecimal instead of double----\n");
        BigDecimal netValue_big = new BigDecimal("9.99");
        BigDecimal VAT_big = new BigDecimal("23.0");
        BigDecimal HUNDRED = new BigDecimal("100");
        BigDecimal TenThousand = new BigDecimal("10000");
        BigDecimal grossValue_big = netValue_big.add(VAT_big.multiply(netValue_big.divide(HUNDRED)));
        System.out.println((new StringBuilder("The gross value is: ")).append(grossValue_big).toString());
        BigDecimal grossValue10000_big = grossValue_big.multiply(TenThousand);
        System.out.println((new StringBuilder("The gross value for 10000 units is: ")).append(grossValue10000_big).toString());
        BigDecimal excludingVAT_big = grossValue10000_big.subtract(VAT_big.multiply(grossValue10000_big.divide(HUNDRED)));
        System.out.println((new StringBuilder("The value for 10000 units excluding VAT is: ")).append(excludingVAT_big).toString());
        System.out.println("\nThe accuracy is higher when we use BigDecimal instead of double");
    }
}
