// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Meres.java

package askiseis_me_switch;

import java.io.PrintStream;

public class Meres
{
    public static final class Day extends Enum
    {

        public static Day[] values()
        {
            Day aday[];
            int i;
            Day aday1[];
            System.arraycopy(aday = ENUM$VALUES, 0, aday1 = new Day[i = aday.length], 0, i);
            return aday1;
        }

        public static Day valueOf(String s)
        {
            return (Day)Enum.valueOf(askiseis_me_switch/Meres$Day, s);
        }

        public static final Day SUNDAY;
        public static final Day MONDAY;
        public static final Day TUESDAY;
        public static final Day WEDNESDAY;
        public static final Day THURSDAY;
        public static final Day FRIDAY;
        public static final Day SATURDAY;
        private static final Day ENUM$VALUES[];

        static 
        {
            SUNDAY = new Day("SUNDAY", 0);
            MONDAY = new Day("MONDAY", 1);
            TUESDAY = new Day("TUESDAY", 2);
            WEDNESDAY = new Day("WEDNESDAY", 3);
            THURSDAY = new Day("THURSDAY", 4);
            FRIDAY = new Day("FRIDAY", 5);
            SATURDAY = new Day("SATURDAY", 6);
            ENUM$VALUES = (new Day[] {
                SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
            });
        }

        private Day(String s, int i)
        {
            super(s, i);
        }
    }


    public Meres(Day day)
    {
        this.day = day;
    }

    public void tellItLikeItIs()
    {
        switch($SWITCH_TABLE$askiseis_me_switch$Meres$Day()[day.ordinal()])
        {
        case 2: // '\002'
            System.out.println("Mondays are bad.");
            break;

        case 6: // '\006'
            System.out.println("Fridays are better.");
            break;

        case 1: // '\001'
        case 7: // '\007'
            System.out.println("Weekends are best.");
            break;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        default:
            System.out.println("Midweek days are so-so.");
            break;
        }
    }

    public static void main(String args[])
    {
        Meres firstDay = new Meres(Day.MONDAY);
        firstDay.tellItLikeItIs();
        Meres thirdDay = new Meres(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        Meres fifthDay = new Meres(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        Meres sixthDay = new Meres(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        Meres seventhDay = new Meres(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }

    static int[] $SWITCH_TABLE$askiseis_me_switch$Meres$Day()
    {
        $SWITCH_TABLE$askiseis_me_switch$Meres$Day;
        if($SWITCH_TABLE$askiseis_me_switch$Meres$Day == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        JVM INSTR pop ;
        int ai[] = new int[Day.values().length];
        try
        {
            ai[Day.FRIDAY.ordinal()] = 6;
        }
        catch(NoSuchFieldError _ex) { }
        try
        {
            ai[Day.MONDAY.ordinal()] = 2;
        }
        catch(NoSuchFieldError _ex) { }
        try
        {
            ai[Day.SATURDAY.ordinal()] = 7;
        }
        catch(NoSuchFieldError _ex) { }
        try
        {
            ai[Day.SUNDAY.ordinal()] = 1;
        }
        catch(NoSuchFieldError _ex) { }
        try
        {
            ai[Day.THURSDAY.ordinal()] = 5;
        }
        catch(NoSuchFieldError _ex) { }
        try
        {
            ai[Day.TUESDAY.ordinal()] = 3;
        }
        catch(NoSuchFieldError _ex) { }
        try
        {
            ai[Day.WEDNESDAY.ordinal()] = 4;
        }
        catch(NoSuchFieldError _ex) { }
        return $SWITCH_TABLE$askiseis_me_switch$Meres$Day = ai;
    }

    Day day;
    private static volatile int $SWITCH_TABLE$askiseis_me_switch$Meres$Day[];
}
