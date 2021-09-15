package ru.mirea.task8.opt1;
import java.awt.*;

public class Rectangle extends Shape
{
    public Rectangle (int x, int y, Color colour)
    {
        super(x, y, colour);
    }

    public void Print(Graphics g)
    {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), 10 + (int) (Math.random() * 100), 10 + (int) (Math.random() * 100));
    }
}