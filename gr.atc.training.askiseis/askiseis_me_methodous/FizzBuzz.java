// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FizzBuzz.java

package askiseis_me_methodous;


public class FizzBuzz
{

    public FizzBuzz()
    {
    }

    public String fizzBuzz(Integer i)
    {
        String result = "";
        if(i.intValue() % 3 == 0)
            result = (new StringBuilder(String.valueOf(result))).append("Fizz").toString();
        if(i.intValue() % 5 == 0)
            result = (new StringBuilder(String.valueOf(result))).append("Buzz").toString();
        if(result.equals(""))
            result = i.toString();
        return result;
    }
}
