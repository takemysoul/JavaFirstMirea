package ru.mirea.task5.opt2;

public abstract class Dog
{
    private String tail;
    private String fur;
    private String name;
    private int age;
    private int length;


    public Dog (String tail, String fur, String name, int age, int length)
    {
        this.tail = tail;
        this.fur= fur;
        this.name = name;
        this.age = age;
        this.length = length;
    }

    public String GetTail ()
    {
        return tail;
    }

    public String GetFur ()
    {
        return fur;
    }

    public String GetName ()
    {
        return name;
    }

    public int GetAge ()
    {
        return age;
    }

    public int GetLength ()
    {
        return length;
    }
}
