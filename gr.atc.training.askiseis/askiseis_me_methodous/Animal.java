// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Animal.java

package askiseis_me_methodous;

import java.io.PrintStream;

public interface Animal
{
    public static class Cat
        implements Animal
    {

        public void eat()
        {
            System.out.println("Cat eating");
        }

        public void drink()
        {
            System.out.println("Cat drinking");
        }

        public Cat()
        {
        }
    }

    public static class Dog
        implements Animal
    {

        public void eat()
        {
            System.out.println("Dog eating");
        }

        public void drink()
        {
            System.out.println("Dog drinking");
        }

        public Dog()
        {
        }
    }

    public static class Main
    {

        public static void main(String args[])
        {
            Pig myPig = new Pig();
            myPig.animalSound();
            myPig.sleep();
            Cat myCat = new Cat();
            myCat.eat();
            myCat.drink();
            Dog myDog = new Dog();
            myDog.eat();
            myDog.drink();
        }

        public Main()
        {
        }
    }

    public static class Pig
        implements Animal
    {

        public void animalSound()
        {
            System.out.println("The pig says: wee wee");
        }

        public void sleep()
        {
            System.out.println("Zzz");
        }

        public Pig()
        {
        }
    }


    public static void animalSound()
    {
        System.out.println("The animal music");
    }

    public static void sleep()
    {
        System.out.println("The animal sleeping");
    }

    public static void eat()
    {
        System.out.println("The Cat eating");
    }

    public static void drink()
    {
        System.out.println("The Cat drinking");
    }
}
