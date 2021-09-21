package ru.mirea.task3.opt2;

public class Hand
{
    private int fingers;
    private int length;

    public Hand(int f, int l)
    {
        fingers = f;
        length = l;
    }

    public Hand()
    {
        fingers = 5;
        length = 80;
    }

    public void setLength (int length)
    {
        this.length = length;
    }

    public void setFingers (int fingers)
    {
        this.fingers = fingers;
    }

    public int getLength ()
    {
        return length;
    }

    public int getFingers ()
    {
        return fingers;
    }

    public String toString()
    {
        return this.length + " sm in length, with " + this.fingers + " fingers. ";
    }
}
