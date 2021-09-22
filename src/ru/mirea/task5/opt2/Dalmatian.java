package ru.mirea.task5.opt2;

public class Dalmatian extends Dog
{
    private String pattern;

    public Dalmatian (String tail, String fur, String name, int age, int length, String pattern)
    {
        super(tail, fur, name, age, length);
        this.pattern = pattern;
    }

    public String GetPattern ()
    {
        return pattern;
    }

    public void DisplayInfo()
    {
        System.out.println(super.GetAge() + " year old, " + super.GetLength() + "sm in length dalmatian " + super.GetName() + " with " + GetPattern() + " pattern on " + super.GetFur() + " fur, and with " + super.GetTail() + " tail.");
    }
}
