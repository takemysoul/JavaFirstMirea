package ru.mirea.task2.opt2;

public class Ball
{
    private int radius;
    private String color;
    private String material;

    public Ball (int r, String c, String m)
    {
        radius = r;
        color = c;
        material = m;
    }

    public Ball()
    {
        material = "leather";
        color = "white";
        radius = 20;
    }

    public int getRadius()
    {
        return radius;
    }

    public String getColor()
    {
        return color;
    }

    public String getMaterial()
    {
        return material;
    }

    public String toString()
    {
        return this.material + " " + this.color + " ball with " + this.radius;
    }
}
