// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Animals.java

package askiseis_me_methodous;


public class Animals
{
    public static interface IAnimals
    {

        public abstract void eat();

        public abstract String getName();
    }

    class Mammals
        implements IAnimals
    {
        class Birds
            implements IAnimals
        {

            public void eat()
            {
            }

            public String getName()
            {
                return null;
            }

            final Mammals this$1;

            Birds()
            {
                this$1 = Mammals.this;
                super();
            }
        }

        class Fish
            implements IAnimals
        {

            public void eat()
            {
            }

            public String getName()
            {
                return null;
            }

            final Mammals this$1;

            Fish()
            {
                this$1 = Mammals.this;
                super();
            }
        }


        public void eat()
        {
        }

        public void getName1()
        {
        }

        public String getName()
        {
            return null;
        }

        final Animals this$0;

        Mammals()
        {
            this$0 = Animals.this;
            super();
        }
    }


    public Animals()
    {
    }
}
