package ru.mirea.task5.opt2;

public class Pug extends Dog
{
    private String face;

    public Pug (String tail, String fur, String name, int age, int length, String face)
    {
        super(tail, fur, name, age, length);
        this.face = face;
    }

    public String GetFace ()
    {
        return face;
    }

    public void DisplayInfo()
    {
        System.out.println(super.GetAge() + " year old, " + super.GetLength() + "sm in length pug-dog " + super.GetName() + " with " + GetFace() + " face, " + super.GetFur() + " fur, and with " + super.GetTail() + " tail.");
    }
}
