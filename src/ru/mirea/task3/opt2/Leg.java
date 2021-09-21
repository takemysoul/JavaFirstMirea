package ru.mirea.task3.opt2;

public class Leg
{
    private int fingers;
    private int length;
    private int size;

    public Leg(int f, int l, int s)
    {
        fingers = f;
        length = l;
        size = s;
    }

    public Leg()
    {
        fingers = 5;
        length = 80;
        size = 40;
    }

    public void setLength (int length)
    {
        this.length = length;
    }

    public void setFingers (int fingers)
    {
        this.fingers = fingers;
    }

    public void setSize (int size)
    {
        this.size = size;
    }

    public int getLength ()
    {
        return length;
    }

    public int getFingers ()
    {
        return fingers;
    }

    public int getSize ()
    {
        return size;
    }

    public String toString()
    {
        return this.length + " sm in length, with " + this.fingers + " fingers and " + this.size + " foot size. ";
    }
}