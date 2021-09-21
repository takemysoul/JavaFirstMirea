package ru.mirea.task3.opt1;

public class CircleTest
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        System.out.println(c.getRadius());
        System.out.println(c.getLength());
        System.out.println(c.getSquare());
        c.setRadius(4.5);
        System.out.println(c.getRadius());
    }
}
