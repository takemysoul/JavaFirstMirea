package ru.mirea.task8.opt1;
import java.awt.*;

public class Triangle extends Shape
{
    public Triangle (int x, int y, Color colour)
    {
        super(x, y, colour);
    }

    public void Print(Graphics g)
    {
        g.setColor(getColor());
        g.fillPolygon(new int[] {getX(), (getX() + 10) + (int) (Math.random() * (getX() + 50)), (getX() + 10) + (int) (Math.random() * (getX() + 50))}, new int[] {getY(), (getY() + 10) + (int) (Math.random() * (getY() + 50)), (getY() + 10) + (int) (Math.random() * (getY() + 50))}, 3);
    }
}