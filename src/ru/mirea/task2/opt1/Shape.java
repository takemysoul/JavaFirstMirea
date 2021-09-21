package ru.mirea.task2.opt1;

public class Shape
{
    private int width;
    private int height;
    private String type;

    public Shape (String t, int a, int b)
    {
        type = t;
        width = a;
        height = b;
    }

    public Shape()
    {
        type = "dot";
        width = 0;
        height = 0;
    }

    public String getType()
    {
        return type;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public String toString()
    {
        return this.type + ", in space of " + this.width + "x" + this.height;
    }
}
