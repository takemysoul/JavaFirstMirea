package ru.mirea.task1.opt5;

public class Main
{
    public static int Factorial (int number)
    {
        int result = 1;
        for (int i = 1; i <= number; i++)
        {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args)
    {
        int number = 5;
        System.out.println ( "5! = " + Factorial ( number ) );
    }
}
