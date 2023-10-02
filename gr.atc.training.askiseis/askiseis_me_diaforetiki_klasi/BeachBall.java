// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BeachBall.java

package askiseis_me_diaforetiki_klasi;

import java.io.PrintStream;

// Referenced classes of package askiseis_me_diaforetiki_klasi:
//            Ball

public class BeachBall
{

    public BeachBall()
    {
        b = new Ball() {

            public void bounce()
            {
                System.out.println("anonymous ball bounces");
            }

            final BeachBall this$0;

            
            {
                this$0 = BeachBall.this;
                super();
            }
        }
;
    }

    public static void main(String args[])
    {
        BeachBall ref = new BeachBall();
        ref.b.bounce();
    }

    Ball b;
}
