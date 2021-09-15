package ru.mirea.task4.opt2;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball b = new Ball(5.0, 7.6);
        System.out.println(b);
        b.setX(8.89);
        System.out.println(b);
        b.setY(40.03);
        System.out.println(b);
        b.setXY(3.5, 5.4);
        System.out.println(b);
        b.move(-2.3, 2.3);
        System.out.println(b);
    }
}
