package ru.mirea.task7.opt1;

public class Rectangle extends Shape
{
    private double width;
    private double length;

    public Rectangle()
    {
        width = 0;
        length = 0;
    }

    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getArea()
    {
        return ( width * length);
    }

    public double getPerimeter ()
    {
        return ( 2 * (length + width) );
    }

    public String toString ()
    {
        if(super.isFilled())
            return super.getColor() + " filled rectangle with: width - " + getWidth() + ", length - " + getLength();
        else
            return super.getColor() + " not filled rectangle with: width - " + getWidth() + ", length - " + getLength();
    }
}
