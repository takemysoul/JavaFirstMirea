package ru.mirea.task8.opt1;
import java.awt.*;

public abstract class Shape
{
    private int x;
    private int y;
    private Color colour;

    public Shape (int x, int y, Color colour)
    {
        this.x = x;
        this.y = y;
        this.colour = colour;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public Color getColor()
    {
        return colour;
    }
}
