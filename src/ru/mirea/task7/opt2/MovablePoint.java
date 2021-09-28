package ru.mirea.task7.opt2;

public class MovablePoint implements Movable
{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString()
    {
        return "X: " + this.x + ", Y: " + this.y + ", X speed: " + this.xSpeed + ", Y speed: " + this.ySpeed;
    }

    public void moveUp()
    {
        this.y++;
    }

    public void moveDown()
    {
        this.y--;
    }

    public void moveLeft()
    {
        this.x--;
    }

    public void moveRight()
    {
        this.x++;
    }
}
