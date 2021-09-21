package ru.mirea.task3.opt1;

public class Circle
{
    private double radius;

    public Circle(double r)
    {
        radius = r;
    }

    public Circle()
    {
        radius = 1;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getLength()
    {
        return (2 * 3.14 * radius);
    }

    public double getSquare()
    {
        return (3.14 * radius * radius);
    }
}
