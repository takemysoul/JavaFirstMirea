package ru.mirea.task10.opt3;
import java.util.Scanner;

public class Var14
{
    public void rec(int number)
    {
        if (number != 0)
        {
            rec(number / 10);
            System.out.println(number % 10);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int scanned =  scanner.nextInt();
        Var14 obj = new Var14();
        obj.rec( scanned );
    }
}
